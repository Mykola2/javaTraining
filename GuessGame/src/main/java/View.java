import java.util.ArrayList;

/**
 * Created by nickoh on 3.
 */
public class View {
	// Text's constants
	public static final String INCORRECT_INPUT = "Wrong input. Try again!";
	public static final String INCORRECT_VALUE = "Wrong value. Must be from ";
	public static final String INPUT_USER_VALUE = "Enter your value = ";
	public static final String INCORRECT_GREATER_VALUE = "Nope, our value is greater";
	public static final String INCORRECT_FEWER_VALUE = "Nope, our value is fewer";
	public static final String CORRECT_VALUE = "Hooray!!!. You guessed!";
	public static final String BYE_VALUE = "Bye.";

	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void printHistory(ArrayList<String> userHistory){
		for(String step : userHistory){
			System.out.println(step);
		}
	}
}
