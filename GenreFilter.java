
/**
 * GenreFilter can be used to extract movies in specified genre in the method parameter.
 * 
 * @ author Tomasz Wiktor Lakomy 
 * @ (05.05.2021)
 */

public class GenreFilter implements Filter {
    private String myGenre;
    
    public GenreFilter (String genre) {
        myGenre = genre;
    }
    
    public boolean satisfies(String id) {
        return MovieDatabase.getGenres(id).contains(myGenre);
    }
}
