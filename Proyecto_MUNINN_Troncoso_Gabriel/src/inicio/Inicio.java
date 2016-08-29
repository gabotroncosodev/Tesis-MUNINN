package inicio;
public class Inicio {
    public static void main(String[] args) {
       
if( new control().comprobar() )
  {
   try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
        {
        if ("Nimbus".equals(info.getName())) 
            {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            System.out.print("Iniciando el programa...\n");
            java.awt.EventQueue.invokeLater(new Runnable() 
            {
                @Override
                public void run() 
                { 
                    new splash().setVisible(true);
                }
            });
            break;
            }
        }
   } 
   
   catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicioRapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioRapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioRapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioRapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                   
   } 

    
   else
    {
     System.exit(0);
    }
    
    }
  
}
