package beanpostprocessorexample;

public class Student {
	private Integer rollno;
	private String name;
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void getDetails() {
		System.out.println(this.name+":"+this.rollno);
	}
	
	public void init() {
		System.out.println("Inside init method");
		this.rollno=1;
		getDetails();
	}
	
	public void destroy() {
		System.out.println("In destory method");
		this.rollno=null;
	}
}
