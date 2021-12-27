


 public class EmployeeClass {
  	 
   int id = 111;
   String name = "AAAA";
   double salary = 4500;
   
   static double computeNetSalary() {   
      return salary + 1000.00;
   }   
 
 }
 
 
 public class EmployeeUtil {
 	
	 public static void main(String args[]) {
	 	
		 //<className> <objectName> = new <className>();
		 EmployeeClass emp = new EmployeeClass();
		 System.out.println(emp.id);
		 System.out.println(emp.name);
		 System.out.println(emp.salary);
			 
		
	 }
	
	
 }
 
 