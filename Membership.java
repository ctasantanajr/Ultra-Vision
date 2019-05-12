

/**
 * @author Claudio Santana nr.2017180
 *
 */
public enum Membership {
	ML ("Music Lovers"),
	VL ("Video Lovers"),
	TV ("TV Lovers"),
	PR ("Premium");
	
	
	private String description;
	
	Membership (String description){
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	

}
