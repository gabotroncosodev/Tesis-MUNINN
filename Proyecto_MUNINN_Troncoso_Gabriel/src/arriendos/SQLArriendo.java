package arriendos;


import inicio.ModeloTablaDTM;
import clientes.Cliente;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.ConexionBD;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Gabriel
 */
public class SQLArriendo {

ConexionBD conexionbd = new ConexionBD();
Icon iconoAlerta  =  new ImageIcon("src/imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("src/imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("src/imagenes/errorIcono.png");
Icon iconoInfo  =  new ImageIcon("src/imagenes/infoIcono.png");
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError); 
Cliente clienteclase = new Cliente();
Arriendo arriendoclase = new Arriendo();

private Image data;
    
    
public SQLArriendo()
{
//constructor
    conexionbd.conectar();   
    
}

public ArrayList buscarClienteSelecc(String cod){
    
        int rut,id;
        String digitr,nomb,app;
        ArrayList valores=new ArrayList();
        valores.clear();//limpia arrayList
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT idcliente, rutClient, DigitRClient, NombClien, ApClient "
                + "FROM cliente WHERE idcliente ="+cod+";";

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);

            while (resultado.next())
            {            
            
            id=resultado.getInt("idcliente");
            rut=resultado.getInt("rutClient");
            digitr=resultado.getString("DigitRClient");
            nomb=resultado.getString("NombClien");
            app=resultado.getString("ApClient");         
            
            valores.add(rut);//posion 0
            valores.add(digitr);//posicion 1
            valores.add(nomb);//2            
            valores.add(app);//3
            valores.add(id);//4      
            }
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
          return valores;
 }

            
public void buscarProducto (String buscar)
    {
    conexionbd.conectar();
    String detp, marc;
    int COD;
    Statement st=null;
    tablaTodosProd.setNumRows(0);
    
    Object []fila= new Object[2];
    ResultSet resultado=null;
    String sql= "SELECT * FROM producto "
            + "WHERE idproducto like '"+buscar+"%' or DetalleProd like '"+buscar+"%' or Marca like '"+buscar+"%'";
    
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
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
}



        
        
public void buscarProductoConCombobox (String buscar, Object nombrecateg)
    {
    conexionbd.conectar();
    String detp, marc;
    int COD;
    Statement st=null;
    tablaTodosProd.setNumRows(0);
    
    Object []fila= new Object[2];
    ResultSet resultado=null;
    String sql= "SELECT idproducto,DetalleProd, Marca "
            + "FROM PRODUCTO, CATEGORIA "
            + "WHERE NombCateg = '"+nombrecateg+"' "
            + "AND categoria.idcategoria=producto.id_Categoria "
            + "AND CantidadBodega NOT IN ('0') "
            + "AND (idproducto like '"+buscar+"%' or DetalleProd like '"+buscar+"%' or Marca like '"+buscar+"%')";
    
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
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
}

public void buscarProductoCargaForm (Object nombrecateg)
    {
  
    Statement st=null;
    tablaTodosProd.setNumRows(0);
    
    Object []fila= new Object[2];
    ResultSet resultado=null;
    String sql= "SELECT idproducto,DetalleProd, Marca "
            + "FROM PRODUCTO, CATEGORIA "
            + "WHERE NombCateg = '"+nombrecateg+"' "
            + "AND (categoria.idcategoria=producto.id_Categoria) "
            + "AND CantidadBodega NOT IN ('0')";
    
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);           
            

            while (resultado.next())
            {                
            int COD=resultado.getInt("idproducto");
            String detp=resultado.getString("DetalleProd");
            String marc=resultado.getString("Marca");

            String nombrprod = marc +" "+ detp;
            
            fila[0]=COD;
            fila[1]=nombrprod; 
            tablaTodosProd.addRow(fila);                        
            }            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
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
            data = ConvertirImagen(b);            
            i++;
            }
        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
       catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Error2" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
  return data;    
     
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
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
          return valores;
   
 }

public void buscarCliente (String buscar)
    {
    String nombCli, apell, digRut;
    int COD, rut;
    Statement st=null;
    tablaTodosCli.setNumRows(0);
    
    Object []fila= new Object[3];
    ResultSet resultado=null;
    String sql= "SELECT idcliente, rutClient, DigitRClient, NombClien, ApClient "
            + "FROM cliente WHERE rutClient like '"+buscar+"%' "
            + "or NombClien like '"+buscar+"%' or ApClient like '"+buscar+"%'" ; 
        try{
            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            

            while (resultado.next())
            {                
            COD=resultado.getInt("idcliente");
            rut=resultado.getInt("rutClient");
            digRut=resultado.getString("DigitRClient");
            nombCli=resultado.getString("NombClien");
            apell=resultado.getString("ApClient");      

            String rutcompl = rut+"-"+digRut;
            String nombrelciente = nombCli +" "+ apell;
            
            fila[0]=COD;
            fila[1]=rutcompl; 
            fila[2]=nombrelciente;
            tablaTodosCli.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
}
public void buscarClienteTabla()
    {
    
    String nombCli, apell, digRut;
    int COD, rut;
    Statement st=null;
    tablaTodosCli.setNumRows(0);
    
    Object []fila= new Object[3];
    ResultSet resultado=null;
    String sql= "SELECT idcliente, rutClient, DigitRClient, NombClien, ApClient "
            + "FROM cliente " ; 
        try{
            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            

            while (resultado.next())
            {                
            COD=resultado.getInt("idcliente");
            rut=resultado.getInt("rutClient");
            digRut=resultado.getString("DigitRClient");
            nombCli=resultado.getString("NombClien");
            apell=resultado.getString("ApClient");      

            String rutcompl = rut+"-"+digRut;
            String nombrelciente = nombCli +" "+ apell;
            
            fila[0]=COD;
            fila[1]=rutcompl; 
            fila[2]=nombrelciente;
            tablaTodosCli.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
}


public void buscaArriendosEnCurso()
{
    //conexionbd.conectar();
    String horinic, diaArr, NombCl, ApellCL, idUsr;
    int idArr, ctdprod;
    Statement st=null;
    tablaArriendosEnCurso.setNumRows(0);
    
    Object []fila= new Object[5];
    ResultSet resultado=null;
    String sql="SELECT idArriendo, CtdadProdInic, FechaInicioArr, NombClien, "
            + "ApClient, id_Usuario "
            + "FROM Arriendo, Cliente, Usuario"
            + " WHERE TotalTotalArriendo is null AND usuario.idUsuario= arriendo.id_Usuario "
            + "AND arriendo.id_Cliente= cliente.idcliente "
            + "ORDER BY Arriendo.idArriendo ASC LIMIT 0 , 100" ; 
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            
            while (resultado.next())
            {                
            idArr=resultado.getInt("idArriendo");
            ctdprod=resultado.getInt("CtdadProdInic");
            diaArr=resultado.getString("FechaInicioArr");
            NombCl=resultado.getString("NombClien");
            ApellCL=resultado.getString("ApClient");
            idUsr=resultado.getString("id_Usuario");

            String nombrec= NombCl+" "+ApellCL;
            
            fila[0]=idArr;
            fila[1]=ctdprod;
            fila[2]=diaArr;
            fila[3]=nombrec;
            fila[4]=idUsr;
            
            tablaArriendosEnCurso.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }

public void buscaArriendosTerminados()
{
    //conexionbd.conectar();
    String horinic, NombCl, ApellCL, idUsr;
    int idArr, totalhrs, totaltarr;
    Statement st=null;
    tablaArriendosTerminados.setNumRows(0);
    
    Object []fila= new Object[6];
    ResultSet resultado=null;
    String sql="SELECT idArriendo, FechaFinArr, TotalHoras, TotalTotalArriendo, NombClien, ApClient, id_Usuario "
            + "FROM Arriendo, Cliente, Usuario "
            + "WHERE TotalTotalArriendo IS NOT NULL "
            + "AND usuario.idUsuario = arriendo.id_Usuario "
            + "AND arriendo.id_Cliente = cliente.idcliente "
            + "ORDER BY idArriendo ASC LIMIT 0 , 1000" ; 
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);  
            while (resultado.next())
            {                
            idArr=resultado.getInt("idArriendo");
            horinic=resultado.getString("FechaFinArr");
            totalhrs=resultado.getInt("TotalHoras");
            totaltarr=resultado.getInt("TotalTotalArriendo");
            NombCl=resultado.getString("NombClien");
            ApellCL=resultado.getString("ApClient");
            idUsr=resultado.getString("id_Usuario");

            String nombrec= NombCl+" "+ApellCL;
            
            fila[0]=idArr;
            fila[1]=horinic; 
            fila[2]=totalhrs;
            fila[3]=totaltarr;
            fila[4]=nombrec;
            fila[5]=idUsr;
            tablaArriendosTerminados.addRow(fila);
            }
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }

public ArrayList buscarDetallArriendoCurso (String buscar)
    {
     //Datos: Rut del Cliente, Nombre y apellido cliente, hora y dia arriendo, 
     //Productos:id, Marca, descripcion, cantidad arrendada, VALOR GARANTIA
        
    String digitC, nombcl, apcl, totalgarantiaInicio, diainic, idusur;
    int RutCl;    
    ArrayList valores=new ArrayList();
    valores.clear();//limpia arrayList
    Statement st=null;
    ResultSet resultado=null;
    
    String sql= "SELECT rutClient, DigitRClient, NombClien, ApClient, "
            + "FechaInicioArr, id_Usuario, TotalGarantiaInicio "
            + "FROM Cliente, Arriendo WHERE idArriendo = "+buscar+" "
            + "AND arriendo.id_cliente = cliente.idcliente" ;
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);  

            while (resultado.next())
            {                
            RutCl=resultado.getInt("rutClient");
            digitC=resultado.getString("DigitRClient");
            nombcl=resultado.getString("NombClien");        
            apcl=resultado.getString("ApClient");       
            diainic=resultado.getString("FechaInicioArr");       
            idusur=resultado.getString("id_Usuario");
            totalgarantiaInicio=resultado.getString("TotalGarantiaInicio");    

            
            valores.add(RutCl);//posicion 0
            valores.add(digitC);//posion 1
            valores.add(nombcl);//posicion 2
            valores.add(apcl);//3 
            valores.add(diainic);//4
            valores.add(idusur);///5
            valores.add(totalgarantiaInicio);///6
            }            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        } 

     return valores;
}

public void buscaProductosArrCurso(String id)
{
    //conexionbd.conectar();
    String marc, detall;
    int idprod, ctdadarr, garantArr, costunit;
    Statement st=null;
    tablaProductosArriendosCurso.setNumRows(0);
    
    Object []fila= new Object[5];
    ResultSet resultado=null;
    String sql="SELECT idproducto, Marca, DetalleProd, CantidadInicioArrP, GarantiaInicioArrP, TotalProdArrInicio "
            + "FROM detalle_arriendo, producto, arriendo "
            + "WHERE idarriendo = "+id+" "
            + "AND arriendo.idarriendo=detalle_arriendo.id_arriendo "
            + "AND detalle_arriendo.id_producto=producto.idproducto";
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            
            while (resultado.next())
            {                
            idprod=resultado.getInt("idproducto");      
            marc=resultado.getString("Marca");   
            detall=resultado.getString("DetalleProd"); 
            ctdadarr=resultado.getInt("CantidadInicioArrP");
            garantArr=resultado.getInt("GarantiaInicioArrP");   
            costunit=resultado.getInt("TotalProdArrInicio"); 

            String prod = marc+" "+detall;
            
            fila[0]=idprod;
            fila[1]=prod; 
            fila[2]=ctdadarr;
            fila[3]=garantArr;
            fila[4]=costunit;
            tablaProductosArriendosCurso.addRow(fila);
            }
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
}

public ArrayList buscarDetallArriendoTermin (String buscar)
    {
     //Datos: Rut del Cliente, Nombre y apellido cliente, hora y dia arriendo, 
     //Productos:id, Marca, descripcion, cantidad arrendada, VALOR GARANTIA
        
    
    ArrayList valores=new ArrayList();
    valores.clear();//limpia arrayList
    Statement st=null;
    ResultSet resultado=null;
    
    String sql= "SELECT rutClient, DigitRClient, NombClien, ApClient,"
            + "FechaInicioArr, FechaFinArr, TotalHoras, TotalArriendo, GarantiaTotal, "
            + "TotalTotalArriendo, id_Usuario "
            + "FROM Cliente, Arriendo WHERE idArriendo = "+buscar+" "
            + "AND arriendo.id_cliente = cliente.idcliente";
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);  

            while (resultado.next())
            {                
            valores.add(resultado.getInt("rutClient"));//posicion 0
            valores.add(resultado.getString("DigitRClient"));//posion 1
            valores.add(resultado.getString("NombClien"));//posicion 2
            valores.add(resultado.getString("ApClient"));//3            
            valores.add(resultado.getString("FechaInicioArr"));//4
            valores.add(resultado.getString("FechaFinArr"));//5
            valores.add(resultado.getString("TotalHoras"));//6
            valores.add(resultado.getInt("TotalArriendo"));//7
            valores.add(resultado.getInt("GarantiaTotal"));//8
            valores.add(resultado.getInt("TotalTotalArriendo"));//9
            valores.add(resultado.getString("id_Usuario"));//10
            }            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        } 

     return valores;
}

public void buscaProductosArrTermin(String id)
{
    //conexionbd.conectar();
    
    Statement st=null;
    tablaProductosArriendosTerm.setNumRows(0);
    
    Object []fila= new Object[7];
    ResultSet resultado=null;
    String sql="SELECT idproducto, Marca, DetalleProd, CantidadInicioArrP, CantidadFinArrP, "
            + "TotalArriendoP,GarantiaProductoTotal,TotalFinalArrP "
            + "FROM Producto, detalle_arriendo, arriendo "
            + "WHERE id_arriendo ='"+id+"' AND detalle_arriendo.id_Producto= producto.idproducto "
            + "AND detalle_arriendo.id_Arriendo= arriendo.idarriendo";
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            
            while (resultado.next())
            {                
            int idprod=resultado.getInt("idproducto");      
            String marc=resultado.getString("Marca");   
            String detall=resultado.getString("DetalleProd"); 
            int ctdadarrInicio=resultado.getInt("CantidadInicioArrP");
            int ctdadarrFin=resultado.getInt("CantidadFinArrP"); 
            int totArr=resultado.getInt("TotalArriendoP");   
            int costGarant=resultado.getInt("GarantiaProductoTotal"); 
            int totalGantf=resultado.getInt("TotalFinalArrP"); 

            String prod = marc+" "+detall;
            
            fila[0]=idprod;
            fila[1]=prod; 
            fila[2]=ctdadarrInicio;
            fila[3]=ctdadarrFin;
            fila[4]=totArr;
            fila[5]=costGarant;
            fila[6]=totalGantf;
            
            tablaProductosArriendosTerm.addRow(fila);
            }
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
}


public void ingresoArriendoNuevo(Cliente clienteclase, Arriendo arriendoclase)
{
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = "INSERT INTO arriendo (CtdadProdInic,FechaInicioArr, "
                    + "TotalGarantiaInicio, id_Cliente, id_Usuario) "
                    + "VALUES("
                    + "'"+arriendoclase.getCantidad_productos_inicio_xproducto()+"',"
                    + "'"+arriendoclase.getFecha_inicio_arriendo()
                    + "','"+arriendoclase.getGarantia_total_productos_inicio()+"', "
                    + "'"+clienteclase.getId_cliente()+"', "
                    + "'"+arriendoclase.getCuenta_usuario_arriendo_inicio()+"') ";
            
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                System.out.print(sql+"\n");
                ps.executeUpdate();
                
                System.out.print("Ejecutando consulta...\n");
            }
            catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) 
            {
            JOptionPane.showMessageDialog(null, "Error 55874 \n Error al Anexar datos, contacte con soporte ","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,"Error SQL 55884:"+ e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,"Error 776559: "+e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            
            
}


public void ingresoArriendoFinalizacion(Cliente clienteclase, Arriendo arriendoclase, String idArr)
{       System.out.print("\n\n");
        System.out.print("Actualizar Arriendo Primera parte\n");
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = "UPDATE  arriendo "
                    + "SET  FechaFinArr =  '"+arriendoclase.getFecha_fin_arriendo()+"', "
                    + "TotalHoras =  '"+arriendoclase.getHoras_totales_arriendo()+"',"
                    + " TotalArriendo =  '"+arriendoclase.getArriendo_total_productos_fin()+"', "
                    + "GarantiaTotal  =  '"+arriendoclase.getGarantia_total_productos_fin()+"', "
                    + "TotalTotalArriendo =  '"+arriendoclase.getTotal_total_arriendo()+"',"
                    + "id_usuario = '"+arriendoclase.getCuenta_usuario_arriendo_fin()+"' "
                    + "WHERE idArriendo = "+idArr+"; ";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                System.out.print("Actualizando primera parte arr "+sql+"\n");
                ps.executeUpdate();
                
                System.out.print("Ejecutando consulta...\n");
            }
            catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) 
            {
            JOptionPane.showMessageDialog(null, "Error 55874 \n Error al Anexar datos, contacte con soporte ","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null," Error SQL 55884, Contacte con Soporte","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null," Error 776 Contacte con Soporte","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }
            
            
}

public int obtenerCantidadActual(String idprod)
{
    int cantidadproducto=0;
    PreparedStatement ps1 = null;
    ResultSet resultado = null;
    
    String sql1 = "SELECT CantidadBodega "
            + "FROM producto "
            + "where idProducto='"+idprod+"' ";
    try {
        ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
        resultado= ps1.executeQuery(sql1);
        while (resultado.next())
        {
            cantidadproducto=resultado.getInt("CantidadBodega");
            System.out.print("Valor Obtenido : "+ cantidadproducto+"\n");                    
                    }
                 }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQL: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error 5589: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
              }

return cantidadproducto;
}





public void buscaArriendosEnCursoID()
{
    //conexionbd.conectar();
    String NombCl, ApellCL, idUsr;
    int idArr;
    Statement st=null;
    tablaArriendosEnCurso.setNumRows(0);
    
    Object []fila= new Object[3];
    ResultSet resultado=null;
    String sql="SELECT idArriendo, NombClien, ApClient, id_Usuario "
            + "FROM Arriendo, Cliente, Usuario"
            + " WHERE TotalTotalArriendo is null AND usuario.idUsuario= arriendo.id_Usuario "
            + "AND arriendo.id_Cliente= cliente.idcliente "
            + "ORDER BY Arriendo.idArriendo ASC LIMIT 0 , 100" ; 
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            
            while (resultado.next())
            {                
            idArr=resultado.getInt("idArriendo");
            NombCl=resultado.getString("NombClien");
            ApellCL=resultado.getString("ApClient");
            idUsr=resultado.getString("id_Usuario");

            String nombrec= NombCl+" "+ApellCL;
            
            fila[0]=idArr;
            fila[1]=nombrec;
            fila[2]=idUsr;
            
            tablaArriendosEnCurso.addRow(fila);
            }
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }

public void buscaArriendosEnCursoIDLike(String buscar)
{
    //conexionbd.conectar();
    String NombCl, ApellCL, idUsr;
    int idArr;
    Statement st=null;
    tablaArriendosEnCurso.setNumRows(0);
    
    Object []fila= new Object[3];
    ResultSet resultado=null;
    String sql="SELECT idArriendo, NombClien, ApClient, id_Usuario "
            + "FROM Arriendo, Cliente, Usuario "
            + "WHERE TotalTotalArriendo is null AND usuario.idUsuario= arriendo.id_Usuario"
            + " AND arriendo.id_Cliente= cliente.idcliente AND idArriendo Like '"+buscar+"%'" ; 
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            
            while (resultado.next())
            {                
            idArr=resultado.getInt("idArriendo");
            NombCl=resultado.getString("NombClien");
            ApellCL=resultado.getString("ApClient");
            idUsr=resultado.getString("id_Usuario");

            String nombrec= NombCl+" "+ApellCL;
            
            fila[0]=idArr;
            fila[1]=nombrec;
            fila[2]=idUsr;
            
            tablaArriendosEnCurso.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }


public ArrayList buscarArriendoSelecc(String cod){
    
       
        ArrayList valores=new ArrayList();
        valores.clear();//limpia arrayList
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT idArriendo, FechaInicioArr, idcliente, rutClient,DigitRClient, "
                + "NombClien, ApClient, id_Usuario "
                + "FROM arriendo, cliente "
                + "WHERE idArriendo = '"+cod+"' AND arriendo.id_cliente=cliente.idcliente";

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);

            while (resultado.next())
            {            
                        
            valores.add(resultado.getInt("idArriendo"));//posion 0
            valores.add(resultado.getString("FechaInicioArr"));//posicion 1
            valores.add(resultado.getInt("idcliente"));//2   
            valores.add(resultado.getInt("rutClient"));//3            
            valores.add(resultado.getString("DigitRClient"));//4
            valores.add(resultado.getString("NombClien"));//5 
            valores.add(resultado.getString("ApClient"));//6  
            valores.add(resultado.getString("id_Usuario"));//7  
            }
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error " +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
          return valores;
 }

public String obtenercantidadHoras(String horaarrcompl, String idarr)
{ 
    String cantidadhrs = null;
    PreparedStatement ps1 = null;
    ResultSet resultado = null;
    String sql1 = "SELECT EXTRACT(hour from TIMEDIFF('"+horaarrcompl+"', FechaInicioArr)) as horasArriendo FROM arriendo "
            + "WHERE idArriendo= '"+idarr+"' ";
    System.out.print(sql1+"\n");
                 try {
                    ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
                    resultado= ps1.executeQuery(sql1);
                    while (resultado.next())
                    {
                    cantidadhrs=resultado.getString("horasArriendo");                    
                    }
                 }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQL: "+ ex.getMessage());
                }
    return cantidadhrs;
}

public String obtenercantidadProdArrendados(String idarr)
{ 
    String cantidadhrs =null;
    PreparedStatement ps1 = null;
    ResultSet resultado = null;
    String sql1 = "SELECT CtdadProdInic FROM ARRIENDO"
            + " where idarriendo="+idarr+"";
    System.out.print(sql1+"\n");
                 try {
                    ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
                    resultado= ps1.executeQuery(sql1);
                    while (resultado.next())
                    {
                    cantidadhrs=resultado.getString("CtdadProdInic");                    
                    }
                 }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQL: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
                 catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error 11: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
    return cantidadhrs;
}

public String obtenerIDultimoArriendo()
{ 
    System.out.print("Obteniendo ultimo id arriendo\n");
                String idArr = null;
                PreparedStatement ps1 = null;
                ResultSet resultado = null;
            
                String sql1 = "SELECT idArriendo FROM arriendo ORDER by idArriendo DESC LIMIT 1 ";
                 try {
                    ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
                    resultado= ps1.executeQuery(sql1);
                    while (resultado.next())
                    {
                    idArr=resultado.getString("idArriendo");
                    System.out.print("Valor Obtenido ultimo ingreso sql: "+ idArr+"\n");
                    
                    }
                 }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQL: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
                 return idArr;
}

public int ObtenerCantidadactual(String valor1)
{
    int valor=0;
    PreparedStatement ps1 = null;
    ResultSet resultado = null;
    
    String sql1 = "SELECT CantidadBodega "
            + "FROM producto,detalle_arriendo "
            + "WHERE id_producto="+valor1+" "
            + "AND producto.idproducto=detalle_arriendo.id_producto ";
    try {
        ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
        resultado= ps1.executeQuery(sql1);
        while (resultado.next())
        {
            valor=resultado.getInt("CantidadBodega");
            System.out.print("Valor Obtenido : "+ valor+"\n");
                    
                    }
                 }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQL: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
    
    
return valor;
}


public int obtenerCantidadProductoInicio(int idprod, String idproducto)
{
    int valor=0;
    PreparedStatement ps1 = null;
    ResultSet resultado = null;
    
    String sql1 = "SELECT CantidadInicioArrP "
            + "FROM detalle_arriendo "
            + "WHERE id_arriendo="+idprod+" "
            + "AND id_producto="+idproducto+"";
    try {
        ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
        resultado= ps1.executeQuery(sql1);
        while (resultado.next())
        {
            valor=resultado.getInt("CantidadInicioArrP");
                    
                    }
                 }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQL: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
    
    
return valor;
}

public void llenarComboCategorias()
{
   
    PreparedStatement ps1 = null;
    ResultSet resultado = null;
    comboCategoriasFiltro.removeAllElements();
    
    String sql1 = "SELECT NombCateg FROM categoria";
    try {
        ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
        resultado= ps1.executeQuery(sql1);
        while (resultado.next())
        {
            String valor=resultado.getString("NombCateg");
            
            comboCategoriasFiltro.addElement(valor);
                    
                    }
                 }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error 4DE456: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
                catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error 3E34F3: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
}

public String obtenerIdProductoDisp()
{
    String valor=null;
    PreparedStatement ps1 = null;
    ResultSet resultado = null;
    
    String sql1 = "SELECT idproducto "
            + "FROM producto "
            + "WHERE idproducto LIMIT 0,1";
    try {
        ps1 = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql1);
        resultado= ps1.executeQuery(sql1);
        while (resultado.next())
        {
            valor=resultado.getString("idproducto");
                    
                    }
                 }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQL: "+ ex.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
                }
    
    
return valor;
}

public void actualizarcantidad(int numeroactualizado, String idprod)
        
{  
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = "UPDATE  producto "
                    + "SET  CantidadBodega =  '"+numeroactualizado+"' "
                    + "WHERE idProducto = "+idprod+"; ";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                System.out.print("Actualizar Cantidad Producto "+sql+"\n");
                ps.executeUpdate();   
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null," Error SQL 55884, Contacte con Soporte","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null," Error 776 Contacte con Soporte","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }
            
            
}


public void buscarArriendoTerminLike(String buscador)
{
    //conexionbd.conectar();
    String horinic, NombCl, ApellCL, idUsr;
    int idArr, totalhrs, totaltarr;
    Statement st=null;
    tablaArriendosTerminados.setNumRows(0);
    
    Object []fila= new Object[6];
    ResultSet resultado=null;
    String sql="SELECT idArriendo, FechaFinArr, TotalHoras, TotalTotalArriendo, NombClien, ApClient, id_Usuario "
            + "FROM Arriendo, Cliente, Usuario "
            + "WHERE TotalTotalArriendo IS NOT NULL "
            + "AND usuario.idUsuario = arriendo.id_Usuario "
            + "AND arriendo.id_Cliente = cliente.idcliente "
            + "AND (idArriendo LIKE '"+buscador+"%' or NombClien LIKE '"+buscador+"%' or ApClient LIKE '"+buscador+"%')  "
            + "ORDER BY idArriendo "
            + "ASC  LIMIT 0 , 1000" ; 
        try{            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);  
            while (resultado.next())
            {                
            idArr=resultado.getInt("idArriendo");
            horinic=resultado.getString("FechaFinArr");
            totalhrs=resultado.getInt("TotalHoras");
            totaltarr=resultado.getInt("TotalTotalArriendo");
            NombCl=resultado.getString("NombClien");
            ApellCL=resultado.getString("ApClient");
            idUsr=resultado.getString("id_Usuario");

            String nombrec= NombCl+" "+ApellCL;
            
            fila[0]=idArr;
            fila[1]=horinic; 
            fila[2]=totalhrs;
            fila[3]=totaltarr;
            fila[4]=nombrec;
            fila[5]=idUsr;
            tablaArriendosTerminados.addRow(fila);
            }
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }

DefaultComboBoxModel comboCategoriasFiltro = new DefaultComboBoxModel();


ModeloTablaDTM tablaProductosArriendosTerm=new ModeloTablaDTM();
ModeloTablaDTM tablaProductosArriendosCurso=new ModeloTablaDTM();
ModeloTablaDTM tablaArriendosTerminados = new ModeloTablaDTM();
ModeloTablaDTM tablaArriendosEnCurso = new ModeloTablaDTM();
ModeloTablaDTM tablaTodosCli = new ModeloTablaDTM();
ModeloTablaDTM tablaTodosProd = new ModeloTablaDTM();
ModeloTablaDTM tablaProdInicioArr = new ModeloTablaDTM();

/*
DefaultTableModel tablaProductosArriendosCurso = new DefaultTableModel();
DefaultTableModel tablaProductArrCurso = new DefaultTableModel();
DefaultTableModel tablaArriendosTerminados = new DefaultTableModel();
DefaultTableModel tablaArriendosEnCurso = new DefaultTableModel();
DefaultTableModel tablaTodosCli = new DefaultTableModel();
DefaultTableModel tablaTodosProd = new DefaultTableModel();
DefaultTableModel tablaProdInicioArr = new DefaultTableModel(); */   





}
