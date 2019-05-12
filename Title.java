import java.io.Serializable;

/**
 * @author Claudio Santana nr.2017180
 *
 */
public abstract class Title implements Serializable {
	
	
	protected String titleName;
	protected String genre;
	protected int yearOfRelease;
	protected MediaFormat mediaFormat;
	protected boolean available;
	
	
	public Title() {
		titleName = null;
		genre = null;
		yearOfRelease = 0;
		mediaFormat = null;
		available = true;
		
	}


	/**
	 * @param titleName
	 * @param genre
	 * @param yearOfRelease
	 */
	protected Title(String titleName, String genre, int yearOfRelease, MediaFormat mediaFormat, boolean available) {
		this.titleName = titleName;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
		this.mediaFormat = mediaFormat;
		this.available = available;
	}

	
	
	public abstract boolean isAvailable();


	/**
	 * @return the titleName
	 */
	public String getTitleName() {
		return titleName;
	}

}
