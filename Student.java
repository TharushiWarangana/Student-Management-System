class Student{
	String id;
	String name;
	String phoneNumber;
	String email;
	
	Student(){}
	
	Student(String id,String name,String phoneNumber,String email){
		this.id=id;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String getEmail(){
		return email;
	}
	
	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	public boolean equals(Student student){
		return this.id.equalsIgnoreCase(student.id);
	}




}
