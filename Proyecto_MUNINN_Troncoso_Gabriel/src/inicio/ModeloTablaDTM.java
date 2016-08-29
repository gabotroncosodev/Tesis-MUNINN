
package inicio;

import javax.swing.table.DefaultTableModel;

public class ModeloTablaDTM extends DefaultTableModel {
    @Override
    
    public boolean isCellEditable (int row, int column)
   {
      return false;
   }
}
