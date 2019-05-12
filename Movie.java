import java.io.Serializable;


/**
 * @author Claudio Santana nr.2017180
 *
 */
public class Movie extends Title implements Serializable {

	private String director;
	private String actor;

	public Movie() {
		// TODO Auto-generated constructor stub
		director = null;
		actor = null;
	}

	/**
	 * @param titleName
	 * @param genre
	 * @param yearOfRelease
	 * @param mediaFormat
	 * @param available
	 */
	public Movie(String titleName, String genre, int yearOfRelease,MediaFormat mediaFormat, boolean available,
			String director, String actor) {
		super(titleName, genre, yearOfRelease, mediaFormat, available);
		// TODO Auto-generated constructor stub
		this.director = director;
		this.actor = actor;
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "Movie [Name=" + titleName + ", Director=" + director + ", Actor=" + actor + ", Genre=" + genre
				+ ", Year of Release=" + yearOfRelease + ", Media=" + mediaFormat + ", Available=" + available + "]" + "\n";
	}

	
	@Override
	public String getTitleName() {
		// TODO Auto-generated method stub
		return super.getTitleName();
	}
	
	
	

}
