package inicio;

import java.awt.Image;


import com.mysql.jdbc.Statement;
import conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class SQLUsuario {

ConexionBD conexionbd = new ConexionBD();    
Icon iconoAlerta  =  new ImageIcon("src/imagenes/alertaIcono.png");

private Image imagen;
   
ArrayList <Integer> listaIdCategoria=new ArrayList();    
ArrayList <Integer>listaIdProveedor=new ArrayList();


public SQLUsuario() 
{
    //constructor  
    conexionbd.conectar();    
}    
   
public String existeCuentaUser(String val1, String val2)
         {
        String valor="";
        Statement st=null;
        ResultSet resultado=null;

    String consulta = " SELECT passusuario FROM usuario WHERE idUsuario= '"+val1+"' AND passUsuario= '"+val2+"'";
    try{
            st= (Statement) conexionbd.getconexion().prepareStatement(consulta);
            resultado= st.executeQuery(consulta);
            while (resultado.next())
            {
            valor=resultado.getString("passusuario");
            }
        }

        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error" +e.getMessage());
        }
       catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Error2" +e.getMessage());
        }

  return valor; 
         }

}
