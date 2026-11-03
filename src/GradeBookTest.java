import java.util.Scanner;
public class GradeBookTest {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		GradeBook.displayCourseMenu();
		choice = sc.nextInt();
		sc.nextLine(); //Καθαρίζει το enter από το buffer.

		if (choice==6){
			System.out.println("Type the subject's : ");
			String name = sc.nextLine();
		} else {
			switch (choice) {
				case 1:
			        subject = "CS101 Introduction to Java Programming";
			        break;
			    case 2:
			        subject = "CS102 Data Structures in Java";
			        break;
			    case 3:
			        subject = "CS103 Database Systems";
			        break;
			    case 4:
			        subject = "CS104 Operating Systems";
			        break;
			    case 5:
			        subject = "CS105 Software Engineering";
			        break;
			    default:
			        subject = "Unknown Course";
			        System.out.println("Invalid selection!");
			        break;
			}
		}
				
		GradeBook myGradeBook = new GradeBook(name);

		myGradeBook.setCourseName(name);
		
		
		myGradeBook.displayMessage();
	}

}
