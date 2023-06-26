package edu.igo.enums;

public class Driver {

	Day day;
	public Driver(Day day) {
		this.day=day;
	}
	public static void main(String[] args) {
		Driver driver = new Driver(Day.TUESDAY);
		driver.tellItLikeItIs();
		System.out.println(Day.MONDAY.name());
		for(int i=0;i<Day.values().length;i++)
			System.out.println(i);
		for(Day i2:Day.values()) {
			System.out.println(i2.ordinal());
		}
		
	}
	public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
}
}
