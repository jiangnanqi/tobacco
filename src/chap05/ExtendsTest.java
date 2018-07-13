package chap05;

public class ExtendsTest {
	public static void main(String args[]) {
		Employee e = new Employee();
//		e.name = "tom";
//		e.age = 20;
//		e.setName("tom");
//		e.setAge(20);
//		e.salary = 1000;
		e.setSalary(1000);
		System.out.println(e);
	}
}
class Person{
//	public String name;
//	public int age;
	private String name;
	private int age;
	
	public void setName(String name) {
		System.out.println("person name");
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name,int age) {
		System.out.println("person(String int)");
		this.name = name;
		this.age = age;
	}
}
class Employee extends Person{
//	public int salary;
	private int salary;
	private String name;
	public Employee() {
		super("tom",20);
//		this(1000);
		System.out.println("employee()");
	}
	public Employee(int salary) {
		System.out.println("employee(int)");
	}
	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		System.out.println("employee name");
		this.name = name;
	}
	public String getName() {
		System.out.println("employee name");
		return name;
	}
	
	public String toString() {
		return "name:"+this.getName()+" age:"+this.getAge()+" salary:"+salary;
	}
}
