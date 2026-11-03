
public class GradeBook {
	
	private String courseName;
	
	public void setCourseName(String name) {
		courseName = name;
	}
//μεθοδος getter που επιστρέφει το όνομα του μαθήματος. Χρησιμοποιείται σε περίπτωση επιλογής other.
	public String getCourseName() {
		return courseName;
	}

	public GradeBook(String name){
    courseName = name;
	}
//Μεθοδος για να εμφανιστούν τα μαθήματα σαν πίνακας. Εμφανίζεται μετά την displayMessage.
	public static void displayCourseMenu(){
		System.out.println("=== Select a Course ===");
        System.out.println("1. CS101 Introduction to Java Programming");
        System.out.println("2. CS102 Data Structures in Java");
        System.out.println("3. CS103 Database Systems");
        System.out.println("4. CS104 Operating Systems");
        System.out.println("5. CS105 Software Engineering");
        System.out.println("6. Other (Type your own)");
        System.out.print("Enter your choice (1-6): ");
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the Grade Book!");
		System.out.println("--**--**--**--**");
	}
	
}
