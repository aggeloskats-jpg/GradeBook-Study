import java.util.Scanner;
public class GradeBookTest {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		String courseName;
		
		GradeBook.displayCourseMenu();
		choice = sc.nextInt();
		sc.nextLine(); //Καθαρίζει το enter από το buffer.

		if (choice==6){
			System.out.println("Type the subject's : ");
			courseName = sc.nextLine();
		} else {
			switch (choice) {
				case 1:
			        courseName = "CS101 Introduction to Java Programming";
			        break;
			    case 2:
			        courseName = "CS102 Data Structures in Java";
			        break;
			    case 3:
			        courseName = "CS103 Database Systems";
			        break;
			    case 4:
			        courseName = "CS104 Operating Systems";
			        break;
			    case 5:
			        courseName = "CS105 Software Engineering";
			        break;
			    default:
			        courseName = "Unknown Course";
			        System.out.println("Invalid selection!");
			        break;
			}
		}
				
		GradeBook myGradeBook = new GradeBook(courseName);

		myGradeBook.displayMessage();
	sc.close();
	}

}
