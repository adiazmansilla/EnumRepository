package enumpkg;

public class Main {

	public static void main(String[] args) {
//		System.out.println(Seasons.SPRING); //SPRING
//		System.out.println(Seasons.valueOf("WINTER")); //WINTER
//		System.out.println(Seasons.valueOf("winter")); //RunTimeException
		
//		for(Seasons s : Seasons.values()) {
//			System.out.println(s.name() + " " + s.ordinal());
//		}
		
		
		SeasonsWithHours.SUMMER.printHours();
		
//		Seasons.SUMMER.printSuperSeason();
		
//		switchEnum(Seasons.SUMMER);
		
	}

	private static void switchEnum(Seasons s) {
		
		switch(s){
		case SUMMER : 
			System.out.println("It's summer");
			break;
		case WINTER :
			System.out.println("It's Winter");
			break;
		case FALL :
			System.out.println("It's Fall");
			break;
		case SPRING:
			System.out.println("It's Spring");
			break;
		default: 
			System.out.println("There is no such Season");
			
		}
		
	}
	
}
