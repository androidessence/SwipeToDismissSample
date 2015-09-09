package androidessence.movielist;

/**
 * Created by adammcneilly on 9/8/15.
 */
public class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
