package constructorinjection;

public class Student {
	private Integer id;
	private String name;
	
	public Student() {
	}

	public Student(String name) {
		this.name=name;
	}

	public Student(Integer id) {
		this.id=id;
	}

	public Student(String name,Integer id) {
		this.id=id;
		this.name=name;
	}

	public String getDetails() {
		return this.id+":"+this.name;
	}
}
