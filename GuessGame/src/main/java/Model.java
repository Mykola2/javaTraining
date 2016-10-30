import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nickoh on 30.10.16.
 */
	public class Model {
	    private int correctValue;
	    private int upperLimit;
	    private int lowerLimit;
	    private ArrayList<String> userHistory = new ArrayList<String>();

	    /**
	     * This method generates random value from upperLimit to lowerLimit
	     */
	    public void generateValue(){
	    	Random generator = new Random();
	    	this.correctValue = generator.nextInt(upperLimit) + lowerLimit;
	    }
	    
	    /**
		 * This method checks user value and returns: 
		 * 1 when user guessed
		 * 0 when userValue is lesser
		 * -1 when userValue is greater 
		 * @param userValue
		 * @return code of result
		 */
		public int checkValue(int userValue) {
			addStep(userValue);
			if (userValue == getCorrectValue()) {
				return 1;
			} else if (userValue > getCorrectValue()) {
				setUpperLimit(userValue);
				return 0;
			} else{
				setLowerLimit(userValue);
				return -1;
			}
			
		}


	    public int getCorrectValue() {
	        return correctValue;
	    }

	    public void setCorrectValue(int value) {
	        this.correctValue = value;
	    }

		public int getUpperLimit() {
			return upperLimit;
		}

		public void setUpperLimit(int upperLimit) {
			this.upperLimit = upperLimit;
		}

		public int getLowerLimit() {
			return lowerLimit;
		}

		public void setLowerLimit(int lowerLimit) {
			this.lowerLimit = lowerLimit;
		}

		public ArrayList<String> getUserHistory() {
			return userHistory;
		}

		public void setUserHistory(ArrayList<String> userHistory) {
			this.userHistory = userHistory;
		}
		
		public void addStep(int userValue){
			userHistory.add("User value: " + userValue + " (" + lowerLimit + ", " + upperLimit + ")");
		}
		
	    
	}

