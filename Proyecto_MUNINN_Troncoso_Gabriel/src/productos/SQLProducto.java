/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import com.mysql.jdbc.PacketTooBigException;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.ConexionBD;
import inicio.ModeloTablaDTM;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import otros.Categoria;
import otros.Proveedor;

/**
 *
 * @author Gabriel
 */
public class SQLProducto {

ConexionBD conexionbd = new ConexionBD();    
Icon iconoAlerta  =  new ImageIcon("src/imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("src/imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("src/imagenes/errorIcono.png");
Icon iconoInfo  =  new ImageIcon("src/imagenes/infoIcono.png");
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);

Producto productoclase = new Producto();
Categoria categoriaclase = new Categoria();
Proveedor proveedorclase = new Proveedor();

private Image imagen;
   
ArrayList <Integer> listaIdCategoria=new ArrayList();    
ArrayList <Integer>listaIdProveedor=new ArrayList();


public SQLProducto() 
{
    //constructor  
    conexionbd.conectar();    
}    
    
public void llenarTablaProducto ()
{
    String detp, marc;
    int COD;
    Statement st=null;
    tablaTodosProd.setNumRows(0);
    
    Object []fila= new Object[2];
    ResultSet resultado=null;
    String sql= "SELECT idproducto, DetalleProd,  Marca "
            + "FROM producto " ; 
    
        try{
            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            

            while (resultado.next())
            {                
            COD=resultado.getInt("idproducto");
            detp=resultado.getString("DetalleProd");
            marc=resultado.getString("Marca");

            String nombrprod = marc +" "+ detp;
            
            fila[0]=COD;
            fila[1]=nombrprod; 
            tablaTodosProd.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificacion", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
    }

public void buscarProducto (String buscar)
{
    String detp, marc;
    int COD;
    Statement st=null;
    tablaTodosProd.setNumRows(0);
    
    Object []fila= new Object[2];
    ResultSet resultado=null;
    String sql= "SELECT idproducto, DetalleProd,  Marca "
            + "FROM producto WHERE idproducto like '"+buscar+"%' "
            + "or DetalleProd like '"+buscar+"%' or Marca like '"+buscar+"%'" ; 
    
        try{
            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            

            while (resultado.next())
            {                
            COD=resultado.getInt("idproducto");
            detp=resultado.getString("DetalleProd");
            marc=resultado.getString("Marca");

            String nombrprod = marc +" "+ detp;
            
            fila[0]=COD;
            fila[1]=nombrprod; 
            tablaTodosProd.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
}

public String buscarProveedorPorProd(String valor)
{
        listaProveedoresProducto.clear();
        String nombP;
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT NombreProv FROM proveedor, proveedor_producto, producto "
                + "WHERE producto.idproducto = proveedor_producto.id_Producto "
                + "AND proveedor.idProveedor= proveedor_producto.id_Proveedor "
                + "AND idproducto = "+valor+"";
        System.out.print("Ejecutando: " + sql+ "\n");

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);

            while (resultado.next())
            {            
            
            nombP=resultado.getString("NombreProv"); 
            listaProveedoresProducto.addElement(nombP); 
            }
           

        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
         return valor;

   
 }  

public Image getfoto(String id){  
     

    Statement st=null;
    ResultSet resultado=null;

    String consulta = " SELECT ImagenProd FROM producto WHERE idProducto = "+id+"";
    try{
            st= (Statement) conexionbd.getconexion().prepareStatement(consulta);
            resultado= st.executeQuery(consulta);
            int i = 0;
            while (resultado.next())
            {
            byte[] b = resultado.getBytes("ImagenProd");
            imagen = ConvertirImagen(b);            
            i++;
            }
        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
       catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Error2" +e.getMessage(),  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
  return imagen;    
     
 }
 
 private Image ConvertirImagen(byte[] bytes) throws IOException {
    ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
    Iterator readers = ImageIO.getImageReadersByFormatName("jpg");
    ImageReader reader = (ImageReader) readers.next();
    Object source = bis; 
    ImageInputStream iis = ImageIO.createImageInputStream(source);
    reader.setInput(iis, true);
    ImageReadParam param = reader.getDefaultReadParam();
    return reader.read(0, param);
 } 

 
public ArrayList buscarProductoSelecc(String cod){
    
        int idp, CantidB, CostUnitA, CostUnitC;
        String detall, Marca;
        
        
        ArrayList valores=new ArrayList();
        valores.clear();//limpia arrayList
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT idproducto, DetalleProd, CantidadBodega, CostUnitArr, Marca,"+
        "CostoProducto FROM producto WHERE idproducto ="+cod+";";

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);

            while (resultado.next())
            {            
            
            idp=resultado.getInt("idproducto");
            detall=resultado.getString("DetalleProd");
            Marca=resultado.getString("Marca");
            CantidB=resultado.getInt("CantidadBodega");
            CostUnitA = resultado.getInt("CostUnitArr");
            CostUnitC = resultado.getInt("CostoProducto");
            
            valores.add(idp);//posicion 0
            valores.add(detall);//posion 1
            valores.add(Marca);//posicion 2
            valores.add(CantidB);//3            
            valores.add(CostUnitA);//4
            valores.add(CostUnitC);//5
            }
           

        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
          return valores;
   
 }

public String existeProducto(String marc, String descrp, int costoarrp, int costUnC)
         {
        String valor="";
        Statement st=null;
        ResultSet resultado=null;

    String consulta = "SELECT Marca FROM Producto WHERE DetalleProd = '"+descrp+"' "
            + "AND Marca = '"+marc+"' AND CostUnitArr = "+costoarrp+" AND CostoProducto = "+costUnC+"";
    try{
            st = (Statement) conexionbd.getconexion().prepareStatement(consulta);
            
            
            resultado= st.executeQuery(consulta);
            while (resultado.next())
            {
            valor=resultado.getString("Marca");
            }
        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error 556" +e.getMessage(),  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
       catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Error 665" +e.getMessage(),  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }

  return valor; 
         } 

public String buscarCategProd(String id)
{
       
        String nombC = null;
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT NombCateg FROM categoria, producto "
                + "WHERE producto.id_Categoria = categoria.idcategoria "
                + "AND producto.idProducto = "+id+"";
        
        System.out.print("Ejecutando: " + sql+ "\n");

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);
            while (resultado.next())
            {       
            nombC=resultado.getString("NombCateg"); 
            
            //JOptionPane.showMessageDialog(null, productoclase.getNombre_categoria());
            } 
         }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error 0055" +e.getMessage(),  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
       
    return nombC;
   
 }
 
public boolean agregarProducto(Producto productoclase, Proveedor proveedorclase)
{
        boolean conexioncorrecta = false;
        try {
            FileInputStream is = new FileInputStream(productoclase.getRuta_foto());
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = "INSERT INTO producto (DetalleProd, CantidadBodega, CostUnitArr, Marca, CostoProducto, ImagenProd, id_Categoria)"
            + "VALUES(?, ?, ?, ?, ?, ?, ?) ";
          try {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                ps.setString(1, productoclase.getDetalle_producto());
                ps.setInt(2, productoclase.getCantidad_bodega());
                ps.setInt(3, productoclase.getCosto_unit_arr_producto());
                ps.setString(4, productoclase.getMarca_producto());
                ps.setInt(5, productoclase.getCosto_Producto());
                ps.setBlob(6, is);
                ps.setInt(7, productoclase.getId_Categoria());
               
                ps.executeUpdate();
                System.out.print("Ejecutando consulta...\n"); 
                
               System.out.print("Producto Agregado\n");
                
                
                int dingr=0 ;
                PreparedStatement ps1 = null;
                PreparedStatement ps2 = null; 
                ResultSet resultado = null;
            
                String sql1 = "SELECT idProducto FROM producto ORDER by idProducto DESC LIMIT 1 ";
                 try {
                    ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
                    resultado= ps1.executeQuery(sql1);
                    while (resultado.next())
                    {
                    dingr=resultado.getInt("idProducto");
                    System.out.print("Valor Obtenido ultimo ingreso sql: "+ dingr);
                    }
                 }
                catch (SQLException ex) {
                Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
                }   
        
                String sql2 = "INSERT INTO proveedor_producto (id_Proveedor, id_Producto)"
                    + "VALUES('"+proveedorclase.getId_proveedor()+"', '"+dingr+"') ";
                System.out.print(sql2);
                    try 
                    {
                        ps2 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql2);
                        ps2.executeUpdate();
                    System.out.print("Ejecutando consulta Proveedor Producto\n");
                    conexioncorrecta =true;
                    
                    }
                catch (SQLException e) 
                {
                JOptionPane.showMessageDialog(null,e.getMessage()+"\n E1326666",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
                catch (Exception e) 
                {
                JOptionPane.showMessageDialog(null,e.getMessage()+"\n ERRORRR",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
            }
          catch (PacketTooBigException e2){
              
            JOptionPane.showMessageDialog(null, "Error 5568: La imagen es muy grande",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            
            //e2.printStackTrace();
            }
           catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" Q1326",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }    
          catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" 4545 ERROR",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            } 
            return conexioncorrecta;
            
              } catch (FileNotFoundException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
         }
        return conexioncorrecta;
}


public int getIdCategoria(String nom) 
{
    
    int id_categ = 0;
    Statement st = null;
    ResultSet rs = null;
    String query = "select idcategoria from categoria where NombCateg = '"+nom+"';";

    try {
        st= (Statement) conexionbd.getconexion().prepareStatement(query);
        rs= st.executeQuery(query);
        while (rs.next())
        {
            id_categ = rs.getInt("idcategoria");
        }

	} catch (SQLException e) {
          System.out.println("Query : " + query);
	  } 
	return id_categ;
        /*
         * @return rol_avaluo
         */
	}

public int getIdProveedor(String valor) 
{
    
    int id_categ = 0;
    Statement st = null;
    ResultSet rs = null;
    String query = "SELECT idProveedor FROM Proveedor WHERE NombreProv = '"+valor+"'";

    try {
        st= (Statement) conexionbd.getconexion().prepareStatement(query);
        rs= st.executeQuery(query);
        while (rs.next())
        {
            id_categ = rs.getInt("idProveedor");
        }

	} catch (SQLException e) {
          System.out.println("Consulta : " + query);
	  } 
	return id_categ;
        /*
         * @return rol_avaluo
         */
	}




public int obtenerIDProveedor(String valor1) 
{
    
    int id_categ = 0;
    Statement st = null;
    ResultSet rs = null;
    String query = "SELECT idProveedor from Proveedor where NombreProv = '"+valor1+"'";

    try {
        st= (Statement) conexionbd.getconexion().prepareStatement(query);
        rs= st.executeQuery(query);
        while (rs.next())
        {
            id_categ = rs.getInt("idProveedor");
        }

	} catch (SQLException e) {
          System.out.println("Query : " + query);
          e.printStackTrace();
	  } 
	return id_categ;
	}


public void buscarCategorias()
{
        //listaIdCategoria.clear();
        listaCategorias.clear();
        String nombP;
        int idP;
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT * FROM categoria;";
        System.out.print("Ejecutando: " + sql+ "\n");

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);

            while (resultado.next())
            {            
            
            nombP=resultado.getString("NombCateg"); 
            idP=resultado.getInt("idCategoria");
            listaCategorias.addElement(nombP);            
            listaIdCategoria.add(idP);
            }
           

        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
 }  

public void buscarProveedor()
{
        //listaIdProveedor.clear();
        listaProveedores.clear();
        String nombP;
        int idP;
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT * FROM proveedor;";
        System.out.print("Ejecutando: " + sql+ "\n");

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);

            while (resultado.next())
            {            
            
            nombP=resultado.getString("NombreProv"); 
            idP=resultado.getInt("idProveedor");
            
            listaProveedores.addElement(nombP);            
            listaIdProveedor.add(idP);
            }
           

        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }

   
 }  

public void agregarProveedorAProd(Categoria categoriaclase, Producto productoclase)
{
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = " UPDATE producto SET id_categoria = ? WHERE idproducto = ?";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
               
                ps.setInt(1, categoriaclase.getId_categoria());
                ps.setInt(2, productoclase.getId_Producto());
                
                ps.executeUpdate();
                System.out.print("Actualizando Categoria:\n" +sql+ "\n" );                
                JOptionPane.showMessageDialog(null,"La información del Categoria se ah actualizado correctamente","Notificación", JOptionPane.PLAIN_MESSAGE, iconoBueno);
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" A1326","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" ERROR 445","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
}

public void agregarProveedorAProd(Proveedor proveedorclase, Producto productoclase)
{
    //int dingr=0 ;
    PreparedStatement ps = null; 
            
    String sql = "INSERT INTO proveedor_producto (id_proveedor,id_producto) VALUES (?,?)";
            
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                ps.setInt(1, proveedorclase.getId_proveedor());
                ps.setInt(2, productoclase.getId_Producto());
                
                System.out.print("Ejecutando consulta:" + sql+ "\n" );
                ps.executeUpdate();
                

                
                JOptionPane.showMessageDialog(null,"El proveedor fue anexado correctamente ","Notificación", JOptionPane.PLAIN_MESSAGE, iconoBueno);
                System.out.print("Producto Agregado\n");
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+"Error SQL 225","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+"Error 225","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
         
    
}

public String existRelacionProvProd(int valor1, int valor2)
{
        String relacion ="";
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT id_proveedor FROM proveedor_producto "
                + "WHERE id_proveedor = "+valor1+" AND id_producto = "+valor2+"";
         try{
             
            System.out.print("Ejecutando: " + sql+ "\n");
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);
            while (resultado.next())
            {       
            relacion=resultado.getString("id_proveedor"); 
            
            } 
         }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
         return relacion;
   
 }

public String mismacategoriaReg(int valor1, int valor2)
{
        String relacion="";
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT id_categoria FROM producto WHERE id_categoria = "+valor1+" AND idproducto = "+valor2+"";
         try{
            
            System.out.print("Ejecutando: " + sql+ "\n");
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);
            while (resultado.next())
            {       
            relacion=resultado.getString("id_categoria"); 
            
            //JOptionPane.showMessageDialog(null, productoclase.getNombre_categoria());
            } 
         }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
         return relacion;
   
 }

public void eliminarProveedorProd(int valor, int valor2, Proveedor proveedorclase, Producto productoclase)
{
    PreparedStatement ps = null; 
    String sql = "DELETE FROM proveedor_producto WHERE id_proveedor = ? AND id_producto= ?";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                ps.setInt(1, proveedorclase.getId_proveedor());
                ps.setInt(2, productoclase.getId_Producto());
                
                System.out.print("Ejecutando consulta:" + sql+ "\n" );
                ps.executeUpdate();
                

                
                JOptionPane.showMessageDialog(null,"El proveedor fue borrado correctamente ","Notificacion", JOptionPane.PLAIN_MESSAGE, iconoBueno);
                System.out.print("proveedor eliminado de la lista\n");
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" Error SQL 226","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" Error 226","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
}

public void actualizarProd(Producto productoclase)
{
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = " UPDATE producto "
                    + "SET Marca = ?, DetalleProd = ?, CantidadBodega = ?, CostoProducto = ?, CostUnitArr =? "
                    + "WHERE idproducto = ?";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
               
                ps.setString(1, productoclase.getMarca_producto());
                ps.setString(2, productoclase.getDetalle_producto());
                ps.setInt(3, productoclase.getCantidad_bodega());
                ps.setInt(4, productoclase.getCosto_Producto());
                ps.setInt(5, productoclase.getCosto_unit_arr_producto());
                ps.setInt(6, productoclase.getId_Producto());
                
                        
                ps.executeUpdate();
                System.out.print("Ejecutando consulta...\n" +sql+ "\n" );                
               // JOptionPane.showMessageDialog(null,"La información del Producto se ah actualizado correctamente","Notificación", JOptionPane.PLAIN_MESSAGE, iconoBueno);
               
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,"J13256 "+e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,"ERROR885 "+e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
}

public String obtenerDescripcionCateg(String id)
{
       
        String nombC = null;
        Statement st=null;
        ResultSet resultado=null;
        String sql= "SELECT DescrpCateg FROM categoria WHERE NombCateg = '"+id+"';";
                 try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);
            System.out.print("Ejecutando consulta: "+ sql);
            while (resultado.next())
            {       
            nombC=resultado.getString("DescrpCateg");
            } 
         }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error 0055" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
       
    return nombC;
   
 }


public boolean actualizarImagenP(Producto productoclase)
{
    boolean actualizacionCorrect = false;
    
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = " UPDATE producto "
                    + "SET ImagenProd = ? "
                    + "WHERE idproducto = ?";
            try 
            {
                FileInputStream is = new FileInputStream(productoclase.getRuta_foto());
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
               
                ps.setBlob(1, is);
                ps.setInt(2, productoclase.getId_Producto());
                
                        
                ps.executeUpdate();
                System.out.print("Ejecutando Actualizacion Imagen Producto\n" +sql+ "\n" );                
               // JOptionPane.showMessageDialog(null,"La imagen del producto se ah actualizado correctamente","Notificación", JOptionPane.PLAIN_MESSAGE, iconoBueno);
                actualizacionCorrect =true;
            }
            catch (PacketTooBigException e2){
              
            JOptionPane.showMessageDialog(null, "Error 5568: La imagen es muy grande",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            
            }
            
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,"R1326 "+e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (java.io.FileNotFoundException ex) 
            {
            JOptionPane.showMessageDialog(null,"Atencion: No se a actualziado el registro ","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,"ERROR "+e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }
            return actualizacionCorrect;
            
}


ModeloTablaDTM tablaTodosProd = new ModeloTablaDTM();

//DefaultTableModel tablaTodosProd = new DefaultTableModel();

DefaultListModel listaProveedoresProducto = new DefaultListModel();
DefaultListModel listaCategorias = new DefaultListModel();
DefaultListModel listaProveedores = new DefaultListModel();
}
