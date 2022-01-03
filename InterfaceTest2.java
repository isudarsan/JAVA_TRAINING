

class Student {
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
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

interface StudentService {
	
	void create(Student student);
	
	Student[] getAll();	
	
}


// loose coupling - > Spring
class StudentServiceImpl implements StudentService {
	
	
    private final int SIZE = 3;
	
	private int count = 0;
	
	private Student[] students = new Student[SIZE];
	
    public void create(Student student) {
   	    students[count] = student;
		++ count;
    }
   
    public Student[] getAll() {
		return students;
	
    }
	
	public int getSize() {
		return SIZE;
	}	
	
}


public class InterfaceTest2 {
	
	
	public static void main(String args[]) {
		
      StudentService service = new StudentServiceImpl();	
	  
	  Student student1 = new Student(111,"AAA");
	  service.create(student1);
	  
	  service.create(new Student(222, "BBB"));
	  service.create(new Student(333, "CCC"));
	  
	  Student[] students = service.getAll();
	  
	  for(Student student : students) {
	  	
		  System.out.println(student.getId() + " " + student.getName());
	  }		
		
	}
	
}