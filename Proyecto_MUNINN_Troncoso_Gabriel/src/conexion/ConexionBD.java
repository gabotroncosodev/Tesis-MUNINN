package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {

    public String db = "bd_munin";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";
    Connection conexion;
    String error;

   public ConexionBD(){
   }//constructor

public void conectar()
  {
  try{
  Class.forName("com.mysql.jdbc.Driver");

  conexion = DriverManager.getConnection(this.url, this.user,this.pass);
  System.out.print("Realizando Conexion con la Base de Datos MUNINN\n");
    }
    catch(ClassNotFoundException e) //si no esncuentra el driver
     {
     error=e.getMessage();
     System.out.print("Error: Importe Driver a biblioteca: "+error+"\n");
     }

     catch(SQLException e) //si la conexion falla
     {       
     System.out.print("Enlace con la Base de datos fallida "+error+"\n");
     error=e.getMessage();

     }

  }

  public  Connection getconexion() //devuelve la conexion
    {
    return conexion;
    }

  public void cierraConexion()
    {
     try{
     conexion.close();
     System.out.print("Conexion a base de datos cerrada\n");
     }

     catch(Exception e)
     {
         System.out.print("ERROR: No se puede cerrar la conexion: \n"+ e.getMessage());
     }

    }
}