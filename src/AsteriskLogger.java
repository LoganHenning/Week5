
public class AsteriskLogger implements Logger {


	
	@Override
		public void Log(String str) {
			System.out.println("***" + str + "***");
		}
	@Override
		public void Error(String str) {
			String error = "Error: " + str;
			System.out.println("***********");
			Log(error);
			System.out.println("**********");
			
		
		
	}

}
