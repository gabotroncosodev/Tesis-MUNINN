package otros;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.ConexionBD;
import inicio.ModeloTablaDTM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SQLCategoria {
    
ConexionBD conexionbd = new ConexionBD();  
Categoria categoriaclase = new Categoria();

Icon iconoAlerta  =  new ImageIcon("src/imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("src/imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("src/imagenes/errorIcono.png");
Icon iconoInfo  =  new ImageIcon("src/imagenes/infoIcono.png");
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);

public SQLCategoria()
{
// constructor
    conexionbd.conectar();
}

/*------------Llenado tabla Categorias-------------------*/
public void llenadolistaCateg ()
{
    String nomb;
    int COD;
    Statement st=null;
    tablaTodasCateg.setNumRows(0);
    
    Object []fila= new Object[2];
    ResultSet resultado=null;
    String sql= "SELECT idcategoria, NombCateg FROM categoria" ; 
    try
    {
        st= (Statement) conexionbd.getconexion().prepareStatement(sql);
        resultado= st.executeQuery(sql);
        while (resultado.next())
        {                
            COD=resultado.getInt("idcategoria");
            nomb=resultado.getString("NombCateg");
            fila[0]=COD;
            fila[1]=nomb; 
            tablaTodasCateg.addRow(fila);
        }
            
    }
    catch(SQLException e)
    {
        JOptionPane.showMessageDialog(null, "Error " +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
    }
}
/*------------Fin Llenado tabla proveedor-------------------*/

/*------------Buscar Categoria-------------------*/

public void buscarCategoria (String buscar)
    {
    String nomb;
    int COD;
    Statement st=null;
    tablaTodasCateg.setNumRows(0);
    
    Object []fila= new Object[2];
    ResultSet resultado=null;
    String sql= "SELECT idcategoria, NombCateg "
            + "FROM categoria "
            + "WHERE idcategoria like '"+buscar+"%' or NombCateg like '"+buscar+"%'" ; 
        try{
            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            

            while (resultado.next())
            {                
            COD=resultado.getInt("idcategoria");
            nomb=resultado.getString("NombCateg"); 

            fila[0]=COD;
            fila[1]=nomb; 
            tablaTodasCateg.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error " +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }


public ArrayList buscarCategoriaSelecc(String cod){
    
        int idc;
        String nomb, descrp;
        ArrayList valoresObtenidosP=new ArrayList();
        valoresObtenidosP.clear();//limpia arrayList
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT idcategoria, NombCateg, DescrpCateg "
                + "FROM categoria "
                + "WHERE idcategoria ="+cod+";";

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);

            while (resultado.next())
            {
           
            idc=resultado.getInt("idcategoria");
            nomb=resultado.getString("NombCateg");
            descrp=resultado.getString("DescrpCateg");
                    
            valoresObtenidosP.add(idc);//posicion 0
            valoresObtenidosP.add(nomb);//posion 1
            valoresObtenidosP.add(descrp);//posicion 2
            
            }
           

        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error " +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
          return valoresObtenidosP;
   
 }

public String existeCategoria(String nombc)
         {
        String valor="";
        Statement st=null;
        ResultSet resultado=null;

    String consulta = " SELECT NombCateg FROM categoria WHERE NombCateg = '"+nombc+"' ;";
    try{
            st= (Statement) conexionbd.getconexion().prepareStatement(consulta);
            resultado= st.executeQuery(consulta);
            while (resultado.next())
            {
            valor=resultado.getString("NombCateg");
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

  return valor; 
         } 



/*------------FIN Comprobador de categoria si existe-------------------*/


/*------------Agregar informacion nueva categoria-------------------*/

public boolean agregarCategoria(Categoria categoriaclase)
{
        boolean valor=false;
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = "INSERT INTO categoria (NombCateg, DescrpCateg)"
            + "VALUES(?, ?) ";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                
                ps.setString(1, categoriaclase.getNombre_categoria());
                ps.setString(2, categoriaclase.getDescripcion_categoria());
                ps.executeUpdate();
                System.out.print("Ejecutando consulta...\n" + sql + "\n");
                System.out.print("Categoria Agregado\n");
                valor=true;
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" 1326","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" ERROR221","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            
            return valor;
            
}  

/*------------FIN Agregar informacion nueva categoria-------------------*/

/*----------- Actualizar datos de una Categoria-------------------*/
public void actualizarCateg(Categoria categoriaclase)
{
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = " UPDATE categoria "
                    + "SET NombCateg = ?, DescrpCateg = ?"
                    + "WHERE idcategoria = ?";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
               
                ps.setString(1, categoriaclase.getNombre_categoria());
                ps.setString(2, categoriaclase.getDescripcion_categoria());
                ps.setInt(3, categoriaclase.getId_categoria());
                        
                ps.executeUpdate();
                System.out.print("Ejecutando consulta...\n" +sql+ "\n" );                
                
                System.out.print("Se actualizo correctamente la información de la categoria\n");
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" 231326","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" ERROR745","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
}




ModeloTablaDTM tablaTodasCateg = new ModeloTablaDTM();
//DefaultTableModel tablaTodasCateg = new DefaultTableModel();
}
