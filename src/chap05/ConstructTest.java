package chap05;

public class ConstructTest {
	public static void main(String args[]) {
//		Student s = new Student("lily",30);
//		System.out.println(s.getAge());
		
		
		Student s = new Student();
		s.setName("rose");
		s.setAge(30);
		s.setSalary(15001);
		s.setGender(false);
		System.out.println(s);
	}
}
class Student {
	private String name;
	private int age;
	private boolean gender;
	private double salary;
	/**
	 * 如果没有构造器系统会给一个默认的无参数构造器
	 * 如果自定义了有参数的构造器 则不会自动补充无参数的构造器
	 * this(调用同类函数) 必须在第一句
	 */
	public Student() {
//		this.name = "tom";
//		this.age = 18; 
		this("tom",18);
		System.out.println("this is no paramter");
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name,int age) {
		this.age = age;
		this.name = name;
		System.out.println("this is two param");
	}
	public Student(String name,int age,boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	public void setSalary(double salary) {
		if(salary<=3500) {
			this.salary= salary;
		}else if(salary>3500&&salary<=10000){
			this.salary = (3500+(salary-3500)*(1-0.05));
		}else if(salary>10000&&salary<=15000) {
			this.salary = (3500+6500*(1-0.05)+(salary-10000)*(1-0.15));
		}else {
			this.salary=0.0;
			System.out.println("this is secret");
		}
	}
	public double getSalary() {
		return this.salary;
	}
	
	public void setName(String name) {
		this.name = "briup-"+name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		if(age>=30) {
			age = 20;
		}else {
			this.age = age;
		}
		return this.age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public boolean getGender() {
		return this.gender;
	}
	public String toString() {
		return "name:"+name+" age:"+age+" gender:"+gender+" salary:"+this.salary;
	}
}
