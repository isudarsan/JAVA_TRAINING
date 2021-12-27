import java.util.Scanner;

class Customer {
	
	private int id;
	private String name;	
	
	Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}

class User {
	
	private String firstName;
	private int age;
	
	public User(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}



class CustomerService {
	
	final int SIZE = 3;
	static int count = 0;
	Customer[] customers = new Customer[SIZE];
	
	void create(Customer customer) {			
		customers[count] = customer;
		++count;
	}		
	
	Customer[] getAll() {
		return customers;		
	}
	
	Customer findBy(int id) {
		for(int i = 0; i < customers.length; i++) {
			Customer customer = customers[i];
			if(id == customer.getId()) {
				return customers[i];
			}
		}
		return null;
	}
	
	Customer findBy(String name) {
		for(int i = 0; i < customers.length; i++) {
			Customer customer = customers[i];
			if(name.equals(customer.getName())) {
				return customers[i];
			}
		}
		return null;
	}
	
	int getSize() {
		return SIZE;
	}
	
	
	
	
}

//Singleton object or Singleton design pattern
class UserService {
	
	private final int SIZE = 3;
	private User[] users = new User[SIZE];
	private int COUNT = 0;
	
	private static UserService USER_SERVICE = new UserService();
			
	private UserService() {
		
	}
	
	public static UserService getUserService() {
		return USER_SERVICE;
	}	
			
	
	public void create(User user) {
		users[COUNT] = user;
		++COUNT;
	}
	
	public User[] getAll() {		
		return users;
	}
}


class ServiceRepository {
	
	
	public static CustomerService getCustomerService() {
		return new CustomerService();
	}
	
	/*public static EmployeeService getEmployeeService() {
		return new EmployeeService();
	}*/
		
		
    public static UserService getUserService() {
    	return UserService.getUserService();
		
    }		
	
}




public class SampleApp {	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); 

        //CustomerService service = new CustomerService();

		/*CustomerService service = ServiceRepository.getCustomerService();
				
		for(int i = 0; i < service.getSize(); i++) {
			System.out.print("ID : ");
			int id = scanner.nextInt();
			System.out.print("Name : ");
			String name = scanner.next();
			
			Customer customer = new Customer(id,name);
			
			service.create(customer);
		}
				
		Customer[] customers = service.getAll();
		
		for(Customer c : customers) {
			System.out.println(c.getId() + " \t" + c.getName());
		}
		
		System.out.print("Enter Customer Id to find : ");
		int customerId = scanner.nextInt();
		
		
		Customer customer1 = service.findBy(customerId);	
		if(null == customer1) {
			System.out.println("Customer Not foumnd");
		}else {
			System.out.println("Customer Found");
			System.out.print(customer1.getId() + "\t"+ customer1.getName());
		}	
		
		System.out.print("Enter Customer Name to find : ");
		String customerName = scanner.next();
		
		Customer customer2 = service.findBy(customerName);	
		if(null == customer2) {
			System.out.println("Customer Not foumnd");
		}else {
			System.out.println("Customer Found");
			System.out.print(customer2.getId() + "\t"+ customer2.getName());
		}	*/
		
		
		
		
		UserService userService = ServiceRepository.getUserService();
		
		System.out.println(userService.hashCode());
		
		User user1 = new User("AAA", 12);
		User user2 = new User("BBB",13);
		User user3 = new User("CCC",14);
		
		userService.create(user1);
		userService.create(user2);
		userService.create(user3);
		
		User[] users = userService.getAll();
		
		for(User u : users) {
			System.out.println(u.getFirstName() + "\t" + u.getAge());
		}		
			
		
		UserService userService1 = ServiceRepository.getUserService();
		System.out.println(userService1.hashCode());
		
		
	}	
}