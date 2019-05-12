import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */

/**
 * @author Claudio Santana nr. 2017180
 *
 */
public class CustomerList implements Serializable {
	
	private List<Customer> customerCollection;

	// default constructor
	public CustomerList() {
		customerCollection = new ArrayList<Customer>();
	}

	// add a new music item into the array list
	public void addCustomer(Customer customer) {
		customerCollection.add(customer);
	}

	// this array list method receive a title as parameter and build up a new list
	// with the found item, returning this item
	public ArrayList<Customer> searchByFirstName(String name) {
		CustomerList searchMatches = new CustomerList();
		for (Customer c : customerCollection) {
			if (c.getFirstName().contains(name)) {
				searchMatches.addCustomer(c);
			}
		}
		return (ArrayList<Customer>) searchMatches.customerCollection;
	}

	// this toString method uses the iterator function that concatenates all music
	// attributes into a variable, returning them as they were only one item
	@Override
	public String toString() {
		String total = "\n";
		Iterator<Customer> i = customerCollection.iterator();
		while (i.hasNext()) {
			Customer c = (Customer) i.next();
			total = total + c.toString();
		}

		return total;
	}

}
