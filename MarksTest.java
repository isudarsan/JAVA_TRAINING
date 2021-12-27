
public class MarksTest {

	public static void main(String[] args) {
	
	
		int studentNumber = 111;
		String studentName = "Mahesh";
		int age = 28;
		int subjectOneMarks = 50;
		int subjectTwoMarks = 45;
		char gender = 'M';
		
		int totalMarks = subjectOneMarks + subjectTwoMarks;
		double averageMarks = totalMarks / 2.0;
		
		System.out.println("Student Number : "+ studentNumber);
		System.out.println("Student Name : "+ studentName);
		System.out.println("Gender : "+gender);
		System.out.println("====================================");
		System.out.println("Subject I : "+subjectOneMarks);
		System.out.println("Subject II : "+subjectTwoMarks);
		System.out.println("=====================================");
		System.out.println("Total Marks : "+totalMarks+" Average Marks : "+averageMarks);
		
		
		int x = 10;
		char c = 'x';
		double f = 10.25;
		System.out.printf("%d\n",x);
		System.out.printf("%c\n",c);
		System.out.printf("%.2f\n",f);
		
		// The naming convention of constants are alwys in upper case.
		final int Z = 10;
		final int STUDENT_AGE = 28;
		//z =  z + 2;
		
		/* Multiline comment
			in the code */
		
		
		System.out.println(Z);
		System.out.println(STUDENT_AGE);
		
		System.out.println("Source file changed");
		
		
		
		
		
		
		
	
	
	
	}



}