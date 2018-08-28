package constructorinjection;

public class Student {
	private Integer id;
	private String name;
	private Address address;
	
	public Student() {
	}

	public Student(String name) {
		this.name=name;
	}

	public Student(Integer id) {
		this.id=id;
	}

	public Student(String name,Integer id,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}

	public String getDetails() {
		return this.id+":"+this.name+":"+this.address;
	}
}
