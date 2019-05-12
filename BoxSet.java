import java.io.Serializable;

/**
 * @author Claudio Santana nr.2017180
 *
 */
public class BoxSet extends Title implements Serializable {

	private String director;
	private String actor;
	private int discs;
	private int series;

	public BoxSet() {
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
	public BoxSet(String titleName, String genre, int yearOfRelease, MediaFormat mediaFormat, boolean available,
			String director, String actor, int discs, int series) {
		super(titleName, genre, yearOfRelease, mediaFormat, available);
		// TODO Auto-generated constructor stub
		this.director = director;
		this.actor = actor;
		this.discs = discs;
		this.series = series;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Title#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see Title#getTitleName()
	 */
	@Override
	public String getTitleName() {
		// TODO Auto-generated method stub
		return super.getTitleName();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BoxSet [director=" + director + ", actor=" + actor + ", discs=" + discs + ", series=" + series
				+ ", titleName=" + titleName + ", genre=" + genre + ", yearOfRelease=" + yearOfRelease
				+ ", mediaFormat=" + mediaFormat + ", available=" + available + "]" + "\n";
	}

}
