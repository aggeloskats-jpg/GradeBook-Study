import java.util.Scanner;
public class GradeBookTest {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		GradeBook myGradeBook = new GradeBook();

		myGradeBook.setCourseName(name);
		
		
		myGradeBook.displayMessage();
	}

}
