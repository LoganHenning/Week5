
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("Woo hoo");
		asteriskLogger.Error("Oh no");
		
		System.out.println();
		
		spacedLogger.Log("Woo hoo");
		spacedLogger.Error("Oops");
	}

}
