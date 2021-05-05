import java.util.*;

/**
 * Rater is an interface for PlainRater and EfficientRater classes.
 * 
 * @ author Tomasz Wiktor Lakomy 
 * @ (05.05.2021)
 */

public interface Rater {
    public void addRating(String item, double rating);

    public boolean hasRating(String item);

    public String getID();

    public double getRating(String item);

    public int numRatings();

    public ArrayList<String> getItemsRated();
}
