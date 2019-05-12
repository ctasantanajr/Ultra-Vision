public class MembershipCard {
		
		//both variables are private and just can be accessed by this class
	   private int points; //declare a variable called "points" whose type is integer
	   private boolean freeRentAllowed; //declare a variable called "freeRentAllowed" whose type is boolean
	   
	   
	   public void addPoints(int points){ //this method receives the total of points a member has,
										 //add points to the current total of points
										 //and call the method "setRentAllowed" to verify if the total of accumulate points
										 //is more or equal 100. 
			this.points += points;
			setRentAllowed();
	   }
	   
	   public boolean availFreeRent(){     //this method checks if the member is allowed or not to receive a free rental.
										   //If allowed, the method subtracts 100 points from the current total of points.
										   //So it calls the method "setRentAllowed" to check if the remaining membership points are 
										   //more or equal 100, returning true or false.
			if(this.isfreeRentAllowed()){
				this.points -= 100;
				setRentAllowed();
				return true;
			} else {
				return false;
			}
	   }
	   
	   private void setRentAllowed(){	 //this method verify if the total of accumulate points
										 //is more or equal 100. If true, it sets the variable "freeRentAllowed" as true, 
										 //allowing the customer to get a free rental.
			if (this.points >= 100){
				this.freeRentAllowed = true;
			} else {
				this.freeRentAllowed = false;
			}
	   }
	   
	   public int getPoints() {    //this getter gets the membership point and returns it.
			return  points;
       }
	   
	   public boolean isfreeRentAllowed(){ //this boolean method checks if the variable "isfreeRentAllowed" is set as true
										   //and returns true allowing the member to get a free rental, otherwise it returns false.
			return freeRentAllowed;
	   
	   }
	   
}