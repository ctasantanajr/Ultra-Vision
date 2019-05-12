import java.io.Serializable;


/**
 * @author Claudio Santana nr.2017180
 *
 */
public class Music extends Title implements Serializable {

	private String singerName;
	
	
	public Music() {
		singerName = null;
	}
	

	/**
	 * @param singerName
	 */
	public Music(String titleName, String genre, int yearOfRelease, MediaFormat mediaFormat, String singerName, boolean available) {
		super(titleName, genre, yearOfRelease, mediaFormat, available);
		this.singerName = singerName;
	}
	
	
	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public String toString() {
		return "Music [Singer/Band=" + singerName + ", Album=" + titleName + ", Genre="
				+ genre + ", Year of Release=" + yearOfRelease + ", Media=" + mediaFormat + ", Available=" + available +"]" + "\n";
	}


	
	@Override
	public String getTitleName() {
		// TODO Auto-generated method stub
		return super.getTitleName();
	}
	
	
	

}
