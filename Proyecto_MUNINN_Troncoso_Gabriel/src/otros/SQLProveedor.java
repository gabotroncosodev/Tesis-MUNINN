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

public class SQLProveedor {
    
ConexionBD conexionbd = new ConexionBD();  
Proveedor proveedorclase = new Proveedor();

Icon iconoAlerta  =  new ImageIcon("src/imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("src/imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("src/imagenes/errorIcono.png");
Icon iconoInfo  =  new ImageIcon("src/imagenes/infoIcono.png");
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);


public SQLProveedor()
{
// constructor
    conexionbd.conectar();
}

public void llenadolistaProv() //comentario
{

String nomb; int COD;
Statement st=null;
tablaTodosProv.setNumRows(0);
    
Object []fila= new Object[2];
ResultSet resultado=null;
String sql= "SELECT idProveedor, NombreProv FROM proveedor" ; 

try
{
    st= (Statement) conexionbd.getconexion().prepareStatement(sql);
    resultado= st.executeQuery(sql);            
    while (resultado.next())
    {                
        COD=resultado.getInt("idProveedor");
        nomb=resultado.getString("NombreProv"); 
        
        fila[0]=COD;
        fila[1]=nomb; 
        tablaTodosProv.addRow(fila);
    }
}
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "E66619" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
}

public void buscarProveedor(String buscar) //comentario
{
    String nomb;
    int COD;
    Statement st=null;
    tablaTodosProv.setNumRows(0);
    
    Object []fila= new Object[2];
    ResultSet resultado=null;
    String sql= "SELECT idProveedor, NombreProv "
            + "FROM proveedor "
            + "WHERE idProveedor like '"+buscar+"%' or NombreProv like '"+buscar+"%'" ; 
        try{
            
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);
            resultado= st.executeQuery(sql);            
            

            while (resultado.next())
            {                
            COD=resultado.getInt("idProveedor");
            nomb=resultado.getString("NombreProv"); 

            fila[0]=COD;
            fila[1]=nomb; 
            tablaTodosProv.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "E38619" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }

public ArrayList buscarProvSelecc(String cod) //comentario
{
    
        int idp, tfono;
        String nomb, dir, ciu, email, webs;
        ArrayList valoresObtenidosP=new ArrayList();
        valoresObtenidosP.clear();//limpia arrayList
        Statement st=null;
        ResultSet resultado=null;


        String sql= "SELECT idProveedor, NombreProv, DireccionProv, TelefonoProv, CiudadProv, EmailProveedor, SitioWebProv "
                + "FROM proveedor WHERE idProveedor ="+cod+"";
        System.out.print(sql+"\n");

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);
            System.out.print("Obteniendo datos de Proveedor "+cod+"\n");
            while (resultado.next())
            {
           
            idp=resultado.getInt("idProveedor");
            nomb=resultado.getString("NombreProv");
            dir=resultado.getString("DireccionProv");
            tfono=resultado.getInt("TelefonoProv");
            ciu=resultado.getString("CiudadProv");
            email=resultado.getString("EmailProveedor");
            webs=resultado.getString("SitioWebProv");
                    
            valoresObtenidosP.add(idp);//posicion 0
            valoresObtenidosP.add(nomb);//posion 1
            valoresObtenidosP.add(dir);//posicion 2
            valoresObtenidosP.add(tfono);//3            
            valoresObtenidosP.add(ciu);//4
            valoresObtenidosP.add(email);//5
            valoresObtenidosP.add(webs);///6
            }
           

        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "E11619" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        e.printStackTrace();
        }
          return valoresObtenidosP;
   
 }

public String existeProveedor(String nombp) //comentario
{

String valor="";
Statement st=null;
ResultSet resultado=null;

String consulta = " SELECT NombreProv FROM proveedor WHERE NombreProv = '"+nombp+"' ;";
try
{
    st= (Statement) conexionbd.getconexion().prepareStatement(consulta);
    resultado= st.executeQuery(consulta);
    while (resultado.next())
    {
        valor=resultado.getString("NombreProv");
    }
}
catch(SQLException e)
{
    JOptionPane.showMessageDialog(null, "E31611" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, "E31671" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
}
return valor; 
} 

public void agregarProveedor(Proveedor proveedorclase) //comentario
{
    
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = "INSERT INTO proveedor (NombreProv, DireccionProv, "
                    + "TelefonoProv, CiudadProv, EmailProveedor, SitioWebProv) "
                    + "VALUES(?, ?, ?, ?, ?, ?) ";
            try 
            { 
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                
                ps.setString(1, proveedorclase.getNombre_proveedor());
                ps.setString(2, proveedorclase.getDireccion_proveedor());
                ps.setInt(3, proveedorclase.getTelefono_proveedor());
                ps.setString(4, proveedorclase.getCiudad_proveedor());
                ps.setString(5, proveedorclase.getEmail_proveedor());
                ps.setString(6, proveedorclase.getSitioweb_proveedor());
                ps.executeUpdate();
                  
                System.out.print("Ejecutando consulta \n" + sql +  "\n");
                
                
                System.out.print("Informacion del Proveedor Agregada\n");
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+"E14326","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+"E45677","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
}  

public void actualizarProveedor(Proveedor proveedorclase) //comentario
{
            PreparedStatement ps = null; //definimos el tipo de consulta
            
            String sql = " UPDATE proveedor "
                    + "SET NombreProv = ?, DireccionProv = ?, TelefonoProv= ?, "
                    + "CiudadProv = ?, EmailProveedor = ?, SitioWebProv = ? "
                    + "WHERE idProveedor = ?";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
               
                ps.setString(1, proveedorclase.getNombre_proveedor());
                ps.setString(2, proveedorclase.getDireccion_proveedor());
                ps.setInt(3, proveedorclase.getTelefono_proveedor());
                ps.setString(4, proveedorclase.getCiudad_proveedor());
                ps.setString(5, proveedorclase.getEmail_proveedor());
                ps.setString(6, proveedorclase.getSitioweb_proveedor());
                ps.setInt(7, proveedorclase.getId_proveedor());
                        
                ps.executeUpdate();
                System.out.print("Ejecutando consulta... "+ sql + "\n" );                
                JOptionPane.showMessageDialog(null,"La información del Proveedor se "
                        + "ah actualizado correctamente","Notificación", JOptionPane.PLAIN_MESSAGE, iconoBueno);
                System.out.print("Información del proveedor Actualizada\n");
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" E355677","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" E355698","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
}

ModeloTablaDTM tablaTodosProv = new ModeloTablaDTM();
//DefaultTableModel tablaTodosProv = new DefaultTableModel();

} //fin clase
