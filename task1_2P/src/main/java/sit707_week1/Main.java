package sit707_week1;
public class Main {
	public static void main(String[] args) {

		int choice = 4;

		switch (choice) {
		case 1:
			SeleniumOperations.open_chrome_loadpage_resize_close();
			break;

		case 2:
			SeleniumOperations.open_chrome_loadpage_resize_close();
			break;

		case 3:
			SeleniumOperations.open_chrome_loadpage_resize_close();
			break;

		case 4:
			SeleniumOperations.open_chrome_loadpage_resize_close();
			break;

		default:
			System.out.println("Invalid choice.");
			break;
		}
	}
}
