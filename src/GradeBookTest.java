import java.util.Scanner;
public class GradeBookTest {
	
	public static void main(String[] args) 
	{
		System.out.println("Type the subject's name");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		GradeBook myGradeBook = new GradeBook(name);

		myGradeBook.setCourseName(name);
		
		
		myGradeBook.displayMessage();
	}

}
