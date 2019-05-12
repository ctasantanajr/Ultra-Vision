import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author Claudio Santana nr.217180
 *
 */
public class MainManagementSystem {

	static String fileName = null;
	static MusicList musicList = new MusicList();
	static MovieList movieList = new MovieList();
	static LiveConcertList liveConcertList = new LiveConcertList();
	static BoxSetList boxSetList = new BoxSetList();
	static CustomerList customerList = new CustomerList();
	static Scanner sc = new Scanner(System.in);
	static Boolean run = true;
	static String title = "";
	static String name = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Welcome();

		// this while loop builds up the menu of the system, utilising the I/O class
		// scanner to receive the input from the user
		while (run) {

			System.out.println("**********************************************************************");
			System.out.println("              Please Select From The Following Options:               ");
			System.out.println("**********************************************************************");

			System.out.println("Enter 1 to list titles");
			System.out.println("Enter 2 to add a title");
			System.out.println("Enter 3 to search a title");
			System.out.println("Enter 4 to list customers");
			System.out.println("Enter 5 to add a customer");
			System.out.println("Enter 6 to search a customer");
			System.out.println("Enter 7 to load Ultra-Vision records");
			System.out.println("Enter 8 to save Ultra-Vision records");
			System.out.println("Enter 9 to quit without saving");

			int answer = sc.nextInt();

			// this conditional switch executes blocks of methods in regards to the option
			// typed by the user. After executing the whole block of commands it breaks and
			// print off the option menu again
			switch (answer) {

			case 1:
				MenuListSelect();
				break;

			case 2:
				MenuAddSelect();
				break;

			case 3:
				MenuSearchTitle();
				break;

			case 4:
				System.out.println(customerList.toString());
				break;

			case 5:
				addCustomer();
				break;

			case 6:
				searchCustomer();
				break;

			case 7:
				loadFiles();
				break;

			case 8:
				saveMusicRecord();
				saveLiveConcertRecord();
				saveMovieRecord();
				saveBoxSetRecord();
				System.out.println("Thanks for using Ultra-Vision System!");
				break;

			case 9:
				EndProgram();
				break;

			}
		}
		System.exit(0);

	}

	// --------------------------------------------------------------------
	// METHOD TO WELCOME USER
	// --------------------------------------------------------------------

	private static void Welcome() {
		// TODO Auto-generated method stub
		System.out.println("\nWelcome to Ultra-Vision System!");
		System.out.println();

	}

	// ------------------------------------------------------------------
	// ENDING THE PROGRAM
	// ------------------------------------------------------------------

	public static void EndProgram() {

		System.out.println("Thanks for using Ultra-Vision System!");
		System.exit(0);

	}

	// --------------------------------------------------------------------
	// SELECTING A MENU LIST OPTION
	// --------------------------------------------------------------------

	public static void MenuListSelect() {

		System.out.println("Choose an option to list: ");
		System.out.println("1 - Music");
		System.out.println("2 - Live Concert Video");
		System.out.println("3 - Movie");
		System.out.println("4 - Box Set");

		String input = "";

		try {

			boolean valid = false;

			do {
				System.out.println("Select an option");
				input = sc.next();

				if (input.matches("[0-9]+")) {
					valid = true;
				} else {
					valid = false;
					System.out.println("Invalid option");
				}

			} while (valid == false);

		} catch (Exception e) {
			System.out.println("Error reading input");
		}

		if (input.equals("1")) {
			System.out.println(musicList.toString());
		} else if (input.equals("2")) {
			System.out.println(liveConcertList.toString());
		} else if (input.equals("3")) {
			System.out.println(movieList.toString());
		} else if (input.equals("4")) {
			System.out.println(boxSetList.toString());
		} else {
			System.out.println("Invalid Option!");
			MenuListSelect();
		}

	}

	// --------------------------------------------------------------------
	// SELECTING A MENU ADD OPTION
	// --------------------------------------------------------------------

	public static void MenuAddSelect() {

		System.out.println("Choose an option to add: ");
		System.out.println("1 - Music");
		System.out.println("2 - Live Concert Video");
		System.out.println("3 - Movie");
		System.out.println("4 - Box Set");

		String input = "";

		try {

			boolean valid = false;

			do {
				System.out.println("Select an option");
				input = sc.next();

				if (input.matches("[0-9]+")) {
					valid = true;
				} else {
					valid = false;
					System.out.println("Invalid option");
				}

			} while (valid == false);

		} catch (Exception e) {
			System.out.println("Error reading input");
		}

		if (input.equals("1")) {
			addMusic();
		} else if (input.equals("2")) {
			addLiveConcert();
		} else if (input.equals("3")) {
			addMovie();
		} else if (input.equals("4")) {
			addBoxSet();
		} else {
			System.out.println("Invalid Option!");
			MenuListSelect();
		}

	}

	// --------------------------------------------------------------------
	// SELECTING A MENU SEARCH OPTION
	// --------------------------------------------------------------------

	public static void MenuSearchTitle() {

		System.out.println("Choose an option to search: ");
		System.out.println("1 - Music");
		System.out.println("2 - Live Concert Video");
		System.out.println("3 - Movie");
		System.out.println("4 - Box Set");

		String input = "";

		try {

			boolean valid = false;

			do {
				System.out.println("Select an option");
				input = sc.next();

				if (input.matches("[0-9]+")) {
					valid = true;
				} else {
					valid = false;
					System.out.println("Invalid option");
				}

			} while (valid == false);

		} catch (Exception e) {
			System.out.println("Error reading input");
		}

		if (input.equals("1")) {
			searchMusicByTitle();
		} else if (input.equals("2")) {
			searchLiveConcertByTitle();
		} else if (input.equals("3")) {
			searchMovieByTitle();
		} else if (input.equals("4")) {
			searchBoxSetByTitle();
		} else {
			System.out.println("Invalid Option!");
			MenuSearchTitle();
		}

	}

	// this method load files
	private static void loadFiles() {
		// TODO Auto-generated method stub

		System.out.println("Enter music file name: ");
		loadMusicFile(sc.next());
		System.out.println("Enter live concert file name: ");
		loadLiveConcertFile(sc.next());
		System.out.println("Enter movie file name: ");
		loadMovieFile(sc.next());
		System.out.println("Enter box set file name: ");
		loadBoxSetFile(sc.next());
		System.out.println("Enter customer file name: ");
		loadCustomerFile(sc.next());

	}

	// this method call the function that search an item by its title. Then, all the
	// attributes of the found item are attributed to a collection object. After
	// that, there is a for loop which prints off all the titles from the
	// collection.
	private static void searchCustomer() {
		// TODO Auto-generated method stub

		System.out.println("Enter customer first name: ");
		name = sc.next();

		Collection<Customer> customers = customerList.searchByFirstName(name);

		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}

	}

	// this method call the function that search an item by its title. Then, all the
	// attributes of the found item are attributed to a collection object. After
	// that, there is a for loop which prints off all the titles from the
	// collection.
	private static void searchMovieByTitle() {
		// TODO Auto-generated method stub

		System.out.println("Enter movie title: ");
		title = sc.next();

		Collection<Movie> movieItems = movieList.searchByTitle(title);

		for (Movie movie : movieItems) {
			System.out.println(movie.toString());
		}

	}

	// this method call the function that search an item by its title. Then, all the
	// attributes of the found item are attributed to a collection object. After
	// that, there is a for loop which prints off all the titles from the
	// collection.
	private static void searchBoxSetByTitle() {
		// TODO Auto-generated method stub

		System.out.println("Enter box set title: ");
		title = sc.next();

		Collection<BoxSet> boxSetItems = boxSetList.searchByTitle(title);

		for (BoxSet boxSet : boxSetItems) {
			System.out.println(boxSet.toString());
		}

	}

	// this method call the function that search an item by its title. Then, all the
	// attributes of the found item are attributed to a collection object. After
	// that, there is a for loop which prints off all the titles from the
	// collection.
	private static void searchMusicByTitle() {
		// TODO Auto-generated method stub

		System.out.println("Enter CD album title: ");
		title = sc.next();

		Collection<Music> musicItems = musicList.searchByTitle(title);

		for (Music music : musicItems) {
			System.out.println(music.toString());
		}

	}

	// this method call the function that search an item by its title. Then, all the
	// attributes of the found item are attributed to a collection object. After
	// that, there is a for loop which prints off all the titles from the
	// collection.
	private static void searchLiveConcertByTitle() {
		// TODO Auto-generated method stub

		System.out.println("Enter Live Concert title: ");
		title = sc.next();

		Collection<LiveConcert> liveConcertItems = liveConcertList.searchByTitle(title);

		for (LiveConcert liveConcert : liveConcertItems) {
			System.out.println(liveConcert.toString());
		}

	}

	// this method add a new method to the list of items. Before that, it
	// instantiates a new object with all attributes received from the user
	private static void addCustomer() {
		// TODO Auto-generated method stub

		String firstName, lastName, address;
		int registerNumber, dateOfBirth, phone;
		Membership membership;

		System.out.println("Enter Register Number: ");
		registerNumber = sc.nextInt();

		System.out.println("Enter First Name: ");
		firstName = sc.next();

		System.out.println("Enter Last Name: ");
		lastName = sc.next();

		System.out.println("Enter Address (Use _ between words): ");
		address = sc.next();

		System.out.println("Enter Date of Birth (ddmmyyy): ");
		dateOfBirth = sc.nextInt();

		System.out.println("Enter Phone Number: ");
		phone = sc.nextInt();

		membership = validMembership();

		Customer customer = new Customer(registerNumber, firstName, lastName, dateOfBirth, address, phone, 0, 0,
				membership);
		customerList.addCustomer(customer);

	}

	// this method add a new method to the list of items. Before that, it
	// instantiates a new object with all attributes received from the user
	private static void addLiveConcert() {
		// TODO Auto-generated method stub
		int yearOfRelease;
		String titleName, genre, singer, director;
		MediaFormat media = null;

		System.out.println("Enter Album Name (Use _ between words): ");
		titleName = sc.next();

		System.out.println("Enter Singer/Band Name (Use _ between words): ");
		singer = sc.next();

		System.out.println("Enter Genre: ");
		genre = sc.next();

		System.out.println("Enter Director Name (Use _ between words): ");
		director = sc.next();

		yearOfRelease = Integer.parseInt(validYear());

		media = validMediaFormat();

		LiveConcert liveConcert = new LiveConcert(titleName, genre, yearOfRelease, media, true, singer, director);
		liveConcertList.addLiveConcert(liveConcert);

	}

	// this method add a new method to the list of items. Before that, it
	// instantiates a new object with all attributes received from the user
	private static void addMovie() {
		// TODO Auto-generated method stub
		int yearOfRelease = 0;
		String titleName, genre, director, actor;
		MediaFormat media = null;

		System.out.println("Enter Movie Name (Use _ between words): ");
		titleName = sc.next();

		System.out.println("Enter Genre: ");
		genre = sc.next();

		System.out.println("Enter Director Name (Use _ between words): ");
		director = sc.next();

		System.out.println("Enter Actor Name (Use _ between words): ");
		actor = sc.next();

		yearOfRelease = Integer.parseInt(validYear());

		media = validMediaFormat();

		Movie movie = new Movie(titleName, genre, yearOfRelease, media, true, director, actor);
		movieList.addMovie(movie);

	}

	// this method add a new method to the list of items. Before that, it
	// instantiates a new object with all attributes received from the user
	private static void addBoxSet() {
		// TODO Auto-generated method stub
		int yearOfRelease = 0, discs = 0, series = 0;
		String titleName, genre, director, actor;
		MediaFormat media = null;

		System.out.println("Enter Movie Name (Use _ between words): ");
		titleName = sc.next();

		System.out.println("Enter Genre: ");
		genre = sc.next();

		System.out.println("Enter Director Name (Use _ between words): ");
		director = sc.next();

		System.out.println("Enter Actor Name (Use _ between words): ");
		actor = sc.next();

		System.out.println("Enter Quantity Discs: ");
		discs = validNumber();

		System.out.println("Enter Quantity Series: ");
		series = validNumber();

		yearOfRelease = Integer.parseInt(validYear());

		media = validMediaFormat();

		BoxSet boxSet = new BoxSet(titleName, genre, yearOfRelease, media, true, director, actor, discs, series);
		boxSetList.addBoxSet(boxSet);

	}

	// this method guarantee users will type just numbers
	private static int validNumber() {
		// TODO Auto-generated method stub
		// int number = ;

		String number = "";

		try {

			boolean valid = false;

			do {
				number = sc.next();

				if (number.matches("[0-9]+")) {
					valid = true;

				} else {
					System.out.println("Please digit only numbers!");
					valid = false;
				}

			} while (valid == false);

		} catch (Exception e) {
			System.out.println("Error input number");
		}

		return Integer.parseInt(number);

	}

	// this method validates the attribute year to not accept letters or an year
	// with more than 4 digits
	private static String validYear() {
		// TODO Auto-generated method stub
		String year = "";

		try {

			boolean valid = false;

			do {
				System.out.println("Enter Year of Release (YYYY): ");
				year = sc.next();

				if (year.matches("[0-9]+") && year.length() < 5) {
					valid = true;

				} else {
					valid = false;
				}

			} while (valid == false);

		} catch (Exception e) {
			System.out.println("Error input year");
		}

		return year;

	}

	// this method just consists the option typed by the user with the correct media
	// format created in the enum
	private static MediaFormat validMediaFormat() {
		// TODO Auto-generated method stub

		MediaFormat media = null;

		try {

			boolean valid = false;

			do {
				System.out.println("Enter Media Format Option: (1 - DVD, 2 - Blu_Ray)");
				String option = sc.next();

				if (option.matches("[0-9]+")) {
					if (Integer.parseInt(option) == 1 || Integer.parseInt(option) == 2) {
						valid = true;
						if (option.equals("1")) {
							media = MediaFormat.DVD;
						} else if (option.equals("2")) {
							media = MediaFormat.Blu_Ray;
						} else {
							validMediaFormat();
						}
					} else {
						valid = false;
						System.out.println("Invalid option");
					}
				}

			} while (valid == false);

		} catch (Exception e) {
			System.out.println("Error reading input");
		}

		return media;

	}

	// this method just consists the option typed by the user with the correct
	// membership
	// format created in the enum
	private static Membership validMembership() {
		// TODO Auto-generated method stub

		Membership membership = null;

		try {

			boolean valid = false;

			do {
				System.out.println(
						"Enter Membership Option: (1 - Music Lovers, 2 - Video Lovers, 3 - TV Lovers, 4 - Premium)");
				String option = sc.next();

				if (option.matches("[0-9]+")) {
					if (Integer.parseInt(option) == 1 || Integer.parseInt(option) == 2) {
						valid = true;
						if (option.equals("1")) {
							membership = Membership.ML;
						} else if (option.equals("2")) {
							membership = Membership.VL;
						} else if (option.equals("3")) {
							membership = Membership.TV;
						} else if (option.equals("4")) {
							membership = Membership.PR;
						} else {
							validMediaFormat();
						}
					} else {
						valid = false;
						System.out.println("Invalid option");
					}
				}

			} while (valid == false);

		} catch (Exception e) {
			System.out.println("Error reading input");
		}

		return membership;

	}

	// this method add a new method to the list of items. Before that, it
	// instantiates a new object with all attributes received from the user
	private static void addMusic() {
		// TODO Auto-generated method stub
		int yearOfRelease;
		String titleName, genre, singerName;

		System.out.println("Enter Album Name: ");
		titleName = sc.next();

		System.out.println("Enter Singer/Band Name: ");
		singerName = sc.next();

		System.out.println("Enter Genre: ");
		genre = sc.next();

		// System.out.println("Enter Year Release: ");
		yearOfRelease = Integer.parseInt(validYear());

		Music music = new Music(titleName, genre, yearOfRelease, MediaFormat.CD, singerName, true);
		musicList.addMusic(music);

	}

	// this method generates an external file with all music list content
	private static void saveMusicRecord() {
		// TODO Auto-generated method stub
		System.out.println("Enter music file name: ");
		fileName = sc.next() + ".ser";
		run = false;
		FileOutputStream fos = null;
		ObjectOutputStream output = null;
		try {
			fos = new FileOutputStream(fileName);
			output = new ObjectOutputStream(fos);
			output.writeObject(musicList);
			fos.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// this method generates an external file with all live concert list content
	private static void saveLiveConcertRecord() {
		// TODO Auto-generated method stub
		System.out.println("Enter live concert file name: ");
		fileName = sc.next() + ".ser";
		run = false;
		FileOutputStream fos = null;
		ObjectOutputStream output = null;
		try {
			fos = new FileOutputStream(fileName);
			output = new ObjectOutputStream(fos);
			output.writeObject(liveConcertList);
			fos.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// this method generates an external file with all movie list content
	private static void saveMovieRecord() {
		// TODO Auto-generated method stub
		System.out.println("Enter movie file name: ");
		fileName = sc.next() + ".ser";
		run = false;
		FileOutputStream fos = null;
		ObjectOutputStream output = null;
		try {
			fos = new FileOutputStream(fileName);
			output = new ObjectOutputStream(fos);
			output.writeObject(movieList);
			fos.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// this method generates an external file with all box set list content
	private static void saveBoxSetRecord() {
		// TODO Auto-generated method stub
		System.out.println("Enter box set file name: ");
		fileName = sc.next() + ".ser";
		run = false;
		FileOutputStream fos = null;
		ObjectOutputStream output = null;
		try {
			fos = new FileOutputStream(fileName);
			output = new ObjectOutputStream(fos);
			output.writeObject(boxSetList);
			fos.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// this method generates an external file with all customer list content
	private static void saveCustomerRecord() {
		// TODO Auto-generated method stub
		System.out.println("Enter customer file name: ");
		fileName = sc.next() + ".ser";
		run = false;
		FileOutputStream fos = null;
		ObjectOutputStream output = null;
		try {
			fos = new FileOutputStream(fileName);
			output = new ObjectOutputStream(fos);
			output.writeObject(customerList);
			fos.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// this method loads a file of musics, filling the music list
	private static void loadMusicFile(String name) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		ObjectInputStream input = null;

		File file = new File(name + ".ser");

		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				input = new ObjectInputStream(fis);
				musicList = (MusicList) input.readObject();
				fis.close();
				input.close();
				System.out.println("File loaded successfully!");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("\nThis file does not exist!");

		}

	}

	// this method loads a file of musics, filling the music list
	private static void loadLiveConcertFile(String name) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		ObjectInputStream input = null;

		File file = new File(name + ".ser");

		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				input = new ObjectInputStream(fis);
				liveConcertList = (LiveConcertList) input.readObject();
				fis.close();
				input.close();
				System.out.println("File loaded successfully!");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("\nThis file does not exist!");

		}

	}

	// this method loads a file of box sets, filling the music list
	private static void loadBoxSetFile(String name) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		ObjectInputStream input = null;

		File file = new File(name + ".ser");

		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				input = new ObjectInputStream(fis);
				boxSetList = (BoxSetList) input.readObject();
				fis.close();
				input.close();
				System.out.println("File loaded successfully!");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("\nThis file does not exist!");

		}

	}

	// this method loads a file of customers details, filling the customer list
	private static void loadCustomerFile(String name) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		ObjectInputStream input = null;

		File file = new File(name + ".ser");

		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				input = new ObjectInputStream(fis);
				customerList = (CustomerList) input.readObject();
				fis.close();
				input.close();
				System.out.println("File loaded successfully!");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("\nThis file does not exist!");

		}

	}

	// this method loads a file of movies, filling the movie list
	private static void loadMovieFile(String name) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		ObjectInputStream input = null;

		File file = new File(name + ".ser");

		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				input = new ObjectInputStream(fis);
				movieList = (MovieList) input.readObject();
				fis.close();
				input.close();
				System.out.println("File loaded successfully!");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("\nThis file does not exist!");

		}

	}

}
