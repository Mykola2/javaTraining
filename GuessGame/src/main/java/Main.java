
/**
 * Created by nickoh on 30.10.16.
 */
public class Main {
	public static void main(String[] args) {
		// Initialization
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		// Run
		controller.processUser();
	}
}
