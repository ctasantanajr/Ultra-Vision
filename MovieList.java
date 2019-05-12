import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author Claudio Santana nr.2017180
 *
 */
public class MovieList implements Serializable {
	
private List<Movie> movieCollection;


	
	//default constructor
	public MovieList() {
		movieCollection = new ArrayList<Movie>();
	}
	
	// add a new music item into the array list
	public void addMovie(Movie movie) {
		movieCollection.add(movie);
	}
	
	// this array list method receive a title as parameter and build up a new list
	// with the found item, returning this item
	public ArrayList<Movie> searchByTitle(String title) {
		MovieList searchMatches = new MovieList();
		for (Movie m : movieCollection ) {
			if(m.getTitleName().contains(title)) {
				searchMatches.addMovie(m);
			}
		}
		return (ArrayList<Movie>) searchMatches.movieCollection;
	}

	
	// this toString method uses the iterator function that concatenates all music
	// attributes into a variable, returning them as they were only one item
	@Override
	public String toString() {
		String total = "\n";
		Iterator<Movie> i = movieCollection.iterator();
		while(i.hasNext()) {
			Movie movie = (Movie) i.next();
			total = total + movie.toString();
		}
		
		return total;
	}

}
