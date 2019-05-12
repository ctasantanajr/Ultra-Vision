import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Claudio Santana nr.2017180
 *
 */
public class LiveConcertList implements Serializable {
	
	private List<LiveConcert> liveConcertCollection;

	// default constructor
	public LiveConcertList() {
		liveConcertCollection = new ArrayList<LiveConcert>();
	}

	// add a new music item into the array list
	public void addLiveConcert (LiveConcert musicVideo) {
		liveConcertCollection.add(musicVideo);
	}

	// this array list method receive a title as parameter and build up a new list
	// with the found item, returning this item
	public ArrayList<LiveConcert> searchByTitle(String title) {
		LiveConcertList searchMatches = new LiveConcertList();
		for (LiveConcert lc : liveConcertCollection) {
			if (lc.getTitleName().contains(title)) {
				searchMatches.addLiveConcert(lc);
			}
		}
		return (ArrayList<LiveConcert>) searchMatches.liveConcertCollection;
	}

	// this toString method uses the iterator function that concatenates all music
	// attributes into a variable, returning them as they were only one item
	@Override
	public String toString() {
		String total = "\n";
		Iterator<LiveConcert> i = liveConcertCollection.iterator();
		while (i.hasNext()) {
			LiveConcert m = (LiveConcert) i.next();
			total = total + m.toString();
		}

		return total;
	}
	
	
	

}
