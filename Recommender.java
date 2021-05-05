import java.util.*;

/**
 * Recommender using filtering values suitable for the recommendation of quality 
 * and taste products such as movies or books.
 */
public interface Recommender {
    
    public ArrayList<String> getItemsToRate ();

   
    public void printRecommendationsFor (String webRaterID);
}
