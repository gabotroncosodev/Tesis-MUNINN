/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package productos;

import clientes.*;
import conexion.ConexionBD;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;

/**
 *
 * @author WinDoctor
 */
public class ReportesProducto 
{
    
ConexionBD conexionbd = new ConexionBD();    


    public ReportesProducto()
    {   conexionbd.conectar();
           
    }
    
    public void runReporte(String id, String nombuser)
    {
        try
        {            
            String master ="C:/Sistema Muninn/Reportes/ReporteProductoSeleccionado.jasper";
            
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del reporte maestro.");
                System.exit(2);
            } 

            JasperReport masterReport = null;
            try 
            {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } 
            catch (JRException e) 
            {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }              
            
            //este es el parámetro, se pueden agregar más parámetros
            //basta con poner mas parametro.put
            Map parametro = new HashMap();
           
            parametro.put("idProd",id); 
            parametro.put("nombreUsuario",nombuser);

            //Reporte diseñado y compilado con iReport
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro,conexionbd.getconexion());

            //Se lanza el Viewer de Jasper, no termina aplicación al salir
            JasperViewer jviewer = new JasperViewer(jasperPrint,false);
            jviewer.setTitle("Informe - Informacion detallada de un Producto");
            jviewer.setVisible(true);
        }

        catch (Exception j)
        {
            System.out.println("Mensaje de Error:"+j.getMessage());
        }
        
    }
  /*  
    public void cerrar()
    {
                try 
                {
                    conexionbd.cierraConexion();
                } 
                catch (SQLException ex) 
                {
                    ex.printStackTrace();
                }
    }*/
}
