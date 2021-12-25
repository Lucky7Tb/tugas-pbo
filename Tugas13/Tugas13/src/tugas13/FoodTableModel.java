package tugas13;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucky
 */
public class FoodTableModel extends AbstractTableModel {
    private final ArrayList<Food> listFood;
     
    private final String[] columnNames = new String[] {
        "Nama makanan", "Rating"
    };
    
    private final Class[] columnClass = new Class[] {
        String.class, Integer.class
    };
    
    public FoodTableModel(ArrayList<Food> listFood) {
        this.listFood = listFood;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
 
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    @Override
    public int getRowCount() {
        return this.listFood.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Food row = listFood.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return row.getName();
            case 1:
                return row.getRating();
            default:
                return null;
        }
    }
}
