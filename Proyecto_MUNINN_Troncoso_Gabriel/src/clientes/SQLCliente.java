package clientes;

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

public class SQLCliente {
    
ConexionBD conexionbd = new ConexionBD();
Cliente clienteclase = new Cliente();



Icon iconoAlerta  =  new ImageIcon("src/imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("src/imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("src/imagenes/errorIcono.png");
Icon iconoInfo  =  new ImageIcon("src/imagenes/infoIcono.png");
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);  

public SQLCliente()
        {
        //Constructor
        conexionbd.conectar();
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
            String nombreCli = nombCli+" "+apell;
            
            fila[0]=COD;
            fila[1]=rutcompl; 
            fila[2]=nombreCli;
            tablaTodosCli.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }

public ArrayList buscarClienteSelecc(String cod)
{
        ArrayList valores=new ArrayList();
        valores.clear();//limpia arrayList
        Statement st=null;
        ResultSet resultado=null;

        
        String sql= "SELECT idcliente, rutClient, DigitRClient, NombClien, "
                + "ApClient, FonoClient, DirClient, ComunClient, "
                + "CiudClient, EmailClient FROM cliente WHERE idcliente ="+cod+";";

         try{
            st= (Statement) conexionbd.getconexion().prepareStatement(sql);

            resultado= st.executeQuery(sql);

            while (resultado.next())
            {            
                        
            valores.add(resultado.getInt("idcliente"));//posicion 0
            valores.add(resultado.getInt("rutClient"));//posion 1
            valores.add(resultado.getString("DigitRClient"));//posicion 2
            valores.add(resultado.getString("NombClien"));//3            
            valores.add(resultado.getString("ApClient"));//4
            valores.add(resultado.getInt("FonoClient"));//5
            valores.add(resultado.getString("DirClient"));///6
            valores.add(resultado.getString("ComunClient"));//7
            valores.add(resultado.getString("CiudClient"));//8
            valores.add(resultado.getString("EmailClient")); //9
            }
           

        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
          return valores;
   
 }

public void llenadotablaCliente()
{
    //conexionbd.conectar();
    String nombCli, apell, digRut;
    int COD, rut;
    Statement st=null;
    tablaTodosCli.setNumRows(0);
    
    Object []fila= new Object[3];
    ResultSet resultado=null;
    String sql= "SELECT idcliente, rutClient, DigitRClient, NombClien, ApClient "
            + "FROM cliente "; 
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
            String nombrec= nombCli+" "+apell;
            
            fila[0]=COD;
            fila[1]=rutcompl; 
            fila[2]=nombrec;
            tablaTodosCli.addRow(fila);
                        
            }
            
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
    }

public void agregarCliente(Cliente clienteclase)
{
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = "INSERT INTO cliente (rutClient, DigitRClient, NombClien, ApClient, "
            + "FonoClient, DirClient, ComunClient, CiudClient, EmailClient) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                ps.setInt(1, clienteclase.getRut_cliente());
                ps.setString(2, clienteclase.getDigito_rut());
                ps.setString(3, clienteclase.getNombre_cliente());
                ps.setString(4, clienteclase.getApellido_cliente());
                ps.setInt(5, clienteclase.getTelefono_cliente());
                ps.setString(6, clienteclase.getDireccion_cliente());
                ps.setString(7, clienteclase.getComuna_cliente());
                ps.setString(8, clienteclase.getCiudad_cliente());
                ps.setString(9, clienteclase.getEmail_cliente());
                ps.executeUpdate();
                System.out.print("Ejecutando consulta...\n");
                
                System.out.print("Cliente Agregado\n");
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" 451326","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+" ERROR 325","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
}



public String existeRutRegistr(String rut, String digito)
         {
        String valor="";
        Statement st=null;
        ResultSet resultado=null;

    String consulta = "SELECT rutClient FROM cliente WHERE rutClient = "+rut+" AND DigitRClient = '"+digito+"'";
    try{
            st= (Statement) conexionbd.getconexion().prepareStatement(consulta);
            resultado= st.executeQuery(consulta);
            while (resultado.next())
            {
            valor=resultado.getString("rutClient");
            }
        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error 55\n" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }
       catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Error 66" +e.getMessage(),"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
        }

  return valor; 
         } 
public void actualizarCliente(Cliente clienteclase)
{
            PreparedStatement ps = null; //definimos el tipo de consulta
               
            String sql = " UPDATE cliente "
                    + "SET rutClient = ?, DigitRClient = ?, NombClien= ?, "
                    + "ApClient = ?, FonoClient = ?, DirClient = ?, ComunClient = ?, "
                    + "CiudClient =?, EmailClient = ? "
                    + "WHERE idcliente = ?";
            try 
            {
                ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(sql);
                ps.setInt(1, clienteclase.getRut_cliente());
                ps.setString(2, clienteclase.getDigito_rut());
                ps.setString(3, clienteclase.getNombre_cliente());
                ps.setString(4, clienteclase.getApellido_cliente());
                ps.setInt(5, clienteclase.getTelefono_cliente());
                ps.setString(6, clienteclase.getDireccion_cliente());
                ps.setString(7, clienteclase.getComuna_cliente());
                ps.setString(8, clienteclase.getCiudad_cliente());
                ps.setString(9, clienteclase.getEmail_cliente());
                ps.setInt(10, clienteclase.getId_cliente());
                        
                ps.executeUpdate();
                System.out.print("Ejecutando consulta...\n" +sql+ " "+ clienteclase.getId_cliente()+"\n" );                
                JOptionPane.showMessageDialog(null,"La información del Cliente se ah actualizado correctamente","Notificacion", JOptionPane.PLAIN_MESSAGE, iconoBueno);
                System.out.print("Información del cliente Actualizada\n");
            }
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+"1326 ","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
            catch (Exception e) 
            {
            JOptionPane.showMessageDialog(null,e.getMessage()+"ERROR ","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
}


public boolean validaRut(String rut, String dv){

    boolean respuesta=true;

   if(!rut.equals("")&&!dv.equals("")){
        int numero=Integer.parseInt(rut);
        char digito=dv.toUpperCase().charAt(0);
             if(!verficarRutValido(numero,digito))
                {
                //erroneo=erroneo+"Rut Invalido, Re ingrese\n";
                respuesta= false;
                }
    }

    return respuesta;

    }    

public boolean verficarRutValido(int rut, char txtDigito)
{
    int m = 0, s = 1;
        for (; rut != 0; rut /= 10)
            {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
return txtDigito == (char) (s != 0 ? s + 47 : 75);
}


ModeloTablaDTM tablaTodosCli = new ModeloTablaDTM();
//DefaultTableModel tablaTodosCli = new DefaultTableModel();
}
