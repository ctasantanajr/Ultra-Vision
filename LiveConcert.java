import java.io.Serializable;

/**
 * 
 */

/**
 * @author Claudio Santana nr.2017180
 *
 */
public class LiveConcert extends Title implements Serializable{

	private String singer;
	private String director;
	
	public LiveConcert() {
		// TODO Auto-generated constructor stub
		singer = null;
		director = null;
	}

	/**
	 * @param titleName
	 * @param genre
	 * @param yearOfRelease
	 * @param mediaFormat
	 * @param available
	 */
	public LiveConcert(String titleName, String genre, int yearOfRelease, MediaFormat mediaFormat, boolean available, String singer, String director) {
		super(titleName, genre, yearOfRelease, mediaFormat, available);
		// TODO Auto-generated constructor stub
		this.singer = singer;
		this.director = director;
	}

	
	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

	
	@Override
	public String getTitleName() {
		// TODO Auto-generated method stub
		return super.getTitleName();
	}

	
	@Override
	public String toString() {
		return "Live Concert [singer=" + singer + ", director=" + director + ", titleName=" + titleName + ", genre="
				+ genre + ", yearOfRelease=" + yearOfRelease + ", mediaFormat=" + mediaFormat + ", available="
				+ available + "]" + "\n";
	}

}
