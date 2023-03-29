package pet;



//class pet
public class Pet {
	//variables for pet class
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double dueAmount;
		//constructors, should be all the necessary ones set to defaults
		// this says its incorrect on my eclipse but when I put it into the feedback section it works so I'm just gonna leave it.
		public pet (String petType, String petName, int petAge, int daysStay, int dogSpaces, int catSpaces, double dueAmount) {
		petType = "NA";//doesn't matter what these are set to as long as its something so made it obvious
		petName = "None";
		petAge = 0;//set to 0 for defaults
		daysStay = 0; 
		dogSpaces = 0;
		catSpaces = 0;
		dueAmount = 0;
		}
		//setter for pet type will it be a dog or a cat?
		//used this for setters seems to work fine!
		public void setPetType(String petType) {
			this.petType = petType;
		}
			//setter for name, what will the pets name be?	
		public void setPetName(String petName) {
			this.petName = petName;
		}
			//setter for pet age, how old is the pet?	
		public void setPetAge(int petAge) {
			this.petAge = petAge;
		}
		//setter for dog spaces, how many spaces are available for dogs?
		public void setDogSpaces(int dogSpaces) {
			this.dogSpaces = dogSpaces;
		}
		//setter for cat spaces, how many spaces are there for cats?
		public void setCatSpaces(int catSpaces) {
			this.catSpaces = catSpaces;
		}
		//setter for days stayed, how long will they be staying?
		public void setDaysStay(int daysStay) {
			this.daysStay = daysStay;
		}
		//setter for the price, how much will this cost the user?
		public void setAmountDue(double AmountDue) {
			this.dueAmount = AmountDue;
		}
		
		// getter for pet type
		public String getPetType() {
			return petType;
		}
		//getter for pet name
		public String getPetName() {
			return petName;
		}
		//getter for pet age
		public int getPetAge() {
			return petAge;
		}
		//getter for dog spaces
		public int getDogSpaces() {
			return dogSpaces;
		}
		//getter for cat spaces
		public int getCatSpaces() {
			return catSpaces;
		}
		//getter for days that they will be staying
		public int getDaysStay() {
			return daysStay;
		}
		//getter for the price
		public double getdueAmount() {
			return dueAmount;
		}
}