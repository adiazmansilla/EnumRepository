package enumpkg;

public enum SeasonsWithHours {
	
	WINTER{
		public void printHours() {
			System.out.println("Day time is 9am to 6pm");
		}
	},
	SUMMER{
		public void printHours() {
			System.out.println("Day time is 6am to 10pm");
		}
	},
	SPRING{
		public void printHours() {
			System.out.println("Day time is 7am to 7pm");
		}
	},
	FALL;
	
	/**
	 * if tehre is an abstract method, every member of enum, must provide an implementation.
	 * if there is an implementation of the method it could be the default implementation. 
	 */
	
	//public abstract void printHours();
	public  void printHours() {
		System.out.println("Default hour");
	}

}
