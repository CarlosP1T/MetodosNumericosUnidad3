
package metodos;

import javax.swing.table.DefaultTableModel;

public class frmTablaAbs extends DefaultTableModel{
 
    
    
    frmTablaAbs(Double [][] data, String [] columnNames)
    {
    
    super(data, columnNames);
    }
    
    Class[] types= new Class[]
    {
    java.lang.Double.class, java.lang.Double.class
    };
  
}
