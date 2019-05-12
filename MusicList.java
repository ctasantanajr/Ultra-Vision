import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Claudio Santana nr.2017180
 *
 */
public class MusicList implements Serializable {

	private List<Music> musicCollection;

	// default constructor
	public MusicList() {
		musicCollection = new ArrayList<Music>();
	}

	// add a new music item into the array list
	public void addMusic(Music music) {
		musicCollection.add(music);
	}

	// this array list method receive a title as parameter and build up a new list
	// with the found item, returning this item
	public ArrayList<Music> searchByTitle(String title) {
		MusicList searchMatches = new MusicList();
		for (Music m : musicCollection) {
			if (m.getTitleName().contains(title)) {
				searchMatches.addMusic(m);
			}
		}
		return (ArrayList<Music>) searchMatches.musicCollection;
	}

	// this toString method uses the iterator function that concatenates all music
	// attributes into a variable, returning them as they were only one item
	@Override
	public String toString() {
		String total = "\n";
		Iterator<Music> i = musicCollection.iterator();
		while (i.hasNext()) {
			Music m = (Music) i.next();
			total = total + m.toString();
		}

		return total;
	}

}
