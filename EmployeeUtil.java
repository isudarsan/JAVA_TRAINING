


// Single Java Source file must contains 1 public class only


 class EmployeeClass {
  
  
  // Non static vars/fields or instance vars/field
   int id;
   String name;
   double salary;
   
   // non static  method or instance method
   double computeNetSalary() {   
      return salary + 1000.00;
   }   
   
   static void printData() {
   	
	   System.out.println("Test Data");
	
   }
 
 }
 
 
 public class EmployeeUtil {
 	
	 public static void main(String args[]) {
	 	
		 //<className> <objectName> = new <className>();
		 EmployeeClass emp = new EmployeeClass();
		 
		 emp.id = 111;
		 emp.name = "AAAA";
		 emp.salary = 4500.50;
		 
		 System.out.println(emp.id);
		 System.out.println(emp.name);
		 System.out.println(emp.salary);
		 
		 // Inorder to call instance method we must need an object.
		 double netSalary = emp.computeNetSalary();
		 System.out.println(netSalary);
		 //emp.printData();
		 // Inorder to call static methods we dont need object, we can call using class name
		 EmployeeClass.printData();
		 
		 EmployeeClass emp1 = new EmployeeClass();
		 emp1.id = 222;
		 emp1.name = "BBB";
		 emp1.salary = 2500;
		 
		 System.out.println(emp1.id);
		 System.out.println(emp1.name);
		 System.out.println(emp1.salary);
		 
		 double netSalary1 = emp1.computeNetSalary();
		 System.out.println(netSalary1);
			 
		
	 }
	
	
 }
 
 