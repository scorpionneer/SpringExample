package beanpostprocessorexample;

public class Teacher {
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getDetails() {
		System.out.println(this.name+":"+this.id);
	}	
}
