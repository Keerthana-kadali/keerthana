package basicsofjava;

public class SwitchDemo {

	public static void main(String[] args) {
		String day="friday";
		switch(day)
		{
			case"Monday":
			case"monday":
			System.out.println("attend the classes");
			break;
			case"Tuesday":
			case"tuesday":
			System.out.println("complet the notes & assignments");
			break;
			case"Wednesday":
			case"wednesday":
			System.out.println("submit the records");
			break;
			case"Thursday":
			case"thursday":
			System.out.println("submit the assignments");
			break;
			case"Friday":
			case"friday":
			System.out.println("attend the seminar classes");
			break;
			case"Saturday":
			case"saturday":
			case"Sunday":
			case"sunday":	
			System.out.println("enjoy the weekend");
			break;
			default:
			{
				System.out.println("invalid day");
			}
			}
		

	}

}
