
import java.util.Scanner;

public class EmployeeSalaryTest {
	
	public static void main(String[] args) {
		
		int choice = 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("EMPLOYEE ID : ");
			int employeeNumber = scanner.nextInt();
			System.out.print("EMPLOYEE NAME :");
			String employeeName = scanner.next();
			System.out.println("EMPLOYEE SALARY : ");
			double salary = scanner.nextDouble();
			
			double da = (salary * 3) / 100;
			double hra = (salary * 5) / 100;
			double bonus = (salary * 12 ) / 100;
			double pf = (salary * 7 ) / 100;
			double netSalary = salary + da + hra + bonus - pf;
			
			System.out.println("Employee Deatils : ");
			System.out.println("====================");
			System.out.println("EMP ID : "+employeeNumber+"\tNAME : "+employeeName+"\tSALARY : "+salary);
			System.out.println("============================================");
			System.out.println("DA : "+da+"\tHRA : "+hra+"\tBONUS : "+bonus);
			System.out.println("PF : "+pf+"\tNET : "+netSalary); 
			
			System.out.print("Do you want to continue ? : ");
			choice = scanner.nextInt();
			
			
			
		}while(choice == 0);
		
		
		
	}
	
	
	
}