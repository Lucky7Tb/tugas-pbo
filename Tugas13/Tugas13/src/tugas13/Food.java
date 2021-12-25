package tugas13;

/**
 *
 * @author lucky
 */
public class Food {
    private int id;
    private String name;
    private int rating;
    private String type;
    private int calories;

    public Food(int id, String name, int rating, String type, int calories) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.type = type;
        this.calories = calories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }
    
    
}
