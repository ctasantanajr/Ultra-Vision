import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Claudio Santana nr.2017180
 *
 */
public class BoxSetList implements Serializable {
	
private List<BoxSet> boxSetCollection;


	
	//default constructor
	public BoxSetList() {
		boxSetCollection = new ArrayList<BoxSet>();
	}
	
	// add a new music item into the array list
	public void addBoxSet(BoxSet boxSet) {
		boxSetCollection.add(boxSet);
	}
	
	// this array list method receive a title as parameter and build up a new list
	// with the found item, returning this item
	public ArrayList<BoxSet> searchByTitle(String title) {
		BoxSetList searchMatches = new BoxSetList();
		for (BoxSet bs : boxSetCollection ) {
			if(bs.getTitleName().contains(title)) {
				searchMatches.addBoxSet(bs);
			}
		}
		return (ArrayList<BoxSet>) searchMatches.boxSetCollection;
	}

	
	// this toString method uses the iterator function that concatenates all music
	// attributes into a variable, returning them as they were only one item
	@Override
	public String toString() {
		String total = "\n";
		Iterator<BoxSet> i = boxSetCollection.iterator();
		while(i.hasNext()) {
			BoxSet boxSet = (BoxSet) i.next();
			total = total + boxSet.toString();
		}
		
		return total;
	}


}
