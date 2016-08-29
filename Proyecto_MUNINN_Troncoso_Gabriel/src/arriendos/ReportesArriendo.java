/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arriendos;

import productos.*;
import clientes.*;
import conexion.ConexionBD;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;

/**
 *
 * @author WinDoctor
 */
public class ReportesArriendo 
{
    
ConexionBD conexionbd = new ConexionBD();    


    public ReportesArriendo()
    {   conexionbd.conectar();
           
    }
    
    public void runReporte(String id, String nombrereporte, String parametroid)
    {
        try
        {            
     //       String master = System.getProperty("user.dir") + "/src/reportes/"+nombrereporte+".jasper";
            
            String master = "C:/Sistema Muninn/Reportes/"+nombrereporte+".jasper";
            
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
            
            parametro.put(parametroid,id); //
            
            System.out.print("Reporte: id"+id+"\n");
            
            //Reporte diseñado y compilado con iReport
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro,conexionbd.getconexion());

            //Se lanza el Viewer de Jasper, no termina aplicación al salir
            JasperViewer jviewer = new JasperViewer(jasperPrint,false);
            jviewer.setTitle("Registro Arriendo N° "+id);
            jviewer.setVisible(true);
        }

        catch (Exception j)
        {
            System.out.println("Mensaje de Error:"+j.getMessage());
        }
        
    }
}
