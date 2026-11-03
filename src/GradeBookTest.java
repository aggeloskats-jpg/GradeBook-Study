import java.util.Scanner;
public class GradeBookTest {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		myGradeBook.displayCoyrseMenu();
		String name = sc.nextLine();

		//System.out.println("Type the subject's name");
				
		GradeBook myGradeBook = new GradeBook(name);

		myGradeBook.setCourseName(name);
		
		
		myGradeBook.displayMessage();
	}

}
