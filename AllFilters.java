import java.util.ArrayList;

/**
 * Class AllFilters
 *
 * @ Tomasz Wiktor Lakomy
 * @ (05.05.2021)
 */

public class AllFilters implements Filter {
    ArrayList<Filter> filters;
    
    public AllFilters() {
        filters = new ArrayList<Filter>();
    }

    public void addFilter(Filter f) {
        filters.add(f);
    }

    
    public boolean satisfies(String id) {
        for(Filter f : filters) {
            if (! f.satisfies(id)) {
                return false;
            }
        }
        
        return true;
    }
}
