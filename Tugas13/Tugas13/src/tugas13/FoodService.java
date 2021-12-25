package tugas13;

/**
 *
 * @author lucky
 */
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FoodService {
    public ArrayList<Food> getAll() {
        try {
            ArrayList<Food> listFood = new ArrayList<>();
            ResultSet result = DbService.get("SELECT * FROM `food`");
            while (result.next()) {
                listFood.add(new Food(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("rating"),
                    result.getString("type"),
                    result.getInt("calories")
                ));
            }
            return listFood;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Internal error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            DbService.closeConnection();
        }

        return null;
    }
    
    public ArrayList<Food> getAll(String searchKey) {
        try {
            ArrayList<Food> listFood = new ArrayList<>();
            ResultSet result = DbService.get("SELECT * FROM `food` WHERE name LIKE '%"+searchKey+"%'");
            while (result.next()) {
                listFood.add(new Food(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("rating"),
                    result.getString("type"),
                    result.getInt("calories")
                ));
            }
            return listFood;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Internal error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            DbService.closeConnection();
        }

        return null;
    }
    
    public void insert(Food food) {
        try {
            String query = "INSERT INTO `food` (`name`, `type`, `rating`, `calories`)"
                    + " VALUES ('%s', '%s', %d, %d)";
            query = String.format(
                query,
                food.getName(),
                food.getType(),
                food.getRating(),
                food.getCalories()
            );
            boolean isError = DbService.query(query);
            if (isError) {
                JOptionPane.showMessageDialog(null, "Error database", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sukses tambah makanan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Internal error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            DbService.closeConnection();
        }
    }
}
