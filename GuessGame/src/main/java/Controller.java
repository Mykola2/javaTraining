import java.util.Scanner;

/**
 * Created by nickoh on 30.10.16.
 */
public class Controller {

	Model model;
	View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void processUser() {
		Scanner sc = new Scanner(System.in);
		boolean isCorrect = false;
		model.setUpperLimit(99);
		model.generateValue();
		int checkingResult;
		while (!isCorrect) {
			checkingResult = model.checkValue(inputIntValueWithScanner(sc));
			if (checkingResult == 1) {
				view.printMessage(view.CORRECT_VALUE + " " + view.BYE_VALUE);
				isCorrect = true;
			} else if (checkingResult == 0)
				view.printMessage(view.INCORRECT_FEWER_VALUE);
			else if (checkingResult == -1)
				view.printMessage(view.INCORRECT_GREATER_VALUE);

		}
		view.printHistory(model.getUserHistory());
	}

	/**
	 * This method takes scanner instance, then checks input value and prints
	 * appropriate message. After all method returns valid value
	 * 
	 * @param sc
	 * @return userIntValue
	 */
	public int inputIntValueWithScanner(Scanner sc) {
		view.printMessage(view.INPUT_USER_VALUE);
		while (!sc.hasNextInt()) {
			view.printMessage(view.INCORRECT_INPUT);
			sc.next();
		}
		int userIntValue = sc.nextInt();
		while (userIntValue > model.getUpperLimit() || userIntValue < model.getLowerLimit()) {
			view.printMessage(view.INCORRECT_VALUE + model.getLowerLimit() + " to " + model.getUpperLimit());
			userIntValue = sc.nextInt();
		}
		return userIntValue;
	}
}
