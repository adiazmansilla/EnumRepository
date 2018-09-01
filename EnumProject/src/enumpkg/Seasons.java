package enumpkg;

public enum Seasons {

	WINTER("win"), SPRING("spring"), SUMMER("sum"), FALL("fall");

	private String superseason;

	private Seasons (String superseason) {
	 this.superseason = superseason;
	}
	
	public void printSuperSeason() {
		System.out.println(superseason);
	}

}
