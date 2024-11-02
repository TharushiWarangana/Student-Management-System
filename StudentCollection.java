class StudentCollection{
	private Student[] studentArray;
	
	StudentCollection(){
		studentArray=new Student[0];
		}
		
	public void extendsArray(){
		Student[] tempStudentArray=new Student[studentArray.length+1];
		for(int i=0;i<studentArray.length;i++){
			tempStudentArray[i]=studentArray[i];
			}
			studentArray=tempStudentArray;
		}
		
	public boolean addStudent(Student student){
		extendsArray();
		studentArray[studentArray.length-1]=student;
		return true;
		}
	
	public String generateId(){
		if(size()==0){
			return "C001";
			}else{
				int lastNumber=Integer.parseInt(studentArray[studentArray.length-1].getId().substring(1));
				return String.format("C%03d",lastNumber+1);
			}
		}
		
	public int size(){
		return studentArray.length;
		}
		
	public Student get(int index){
		if(index>=0 && index<size()){
			return studentArray[index];
			}
			return null;
		}
		
	public Student searchStudent(String id){
		for(int i=0;i<studentArray.length;i++){
			if(studentArray[i].getId().equalsIgnoreCase(id)){
				return studentArray[i];
				}
			}
			return null;
		}
		
	public int searchStudent(Student student){
		for(int i=0;i<studentArray.length;i++){
			if(student.getId().equalsIgnoreCase(studentArray[i].getId())){
				return i;
				}
			}
			return -1;
		}
		
	public boolean deleteStudent(String id){
		int index=-1;
		for(int i=0;i<studentArray.length;i++){
			if(studentArray[i].getId().equalsIgnoreCase(id)){
				index=i;
				break;
				}
			}
			if(index==-1){
				return false;
				}else{
				for(int i=0;i<studentArray.length-1;i++){
					studentArray[i]=studentArray[i+1];
					}
					Student[] tempStudentArray=new Student[studentArray.length-1];
						for(int i=0;i<tempStudentArray.length;i++){
							tempStudentArray[i]=studentArray[i];				
						}
						studentArray=tempStudentArray;
						return true;
					}
			}
			
		public boolean updateStudent(Student student){
			int index=searchStudent(student);
			if(index!=-1){
				studentArray[index]=student;
				return true;
				}
				return false;
			}
			
		public Student[] getStudentObjects(){
			Student[] tempStudentArray=new Student[studentArray.length];
			for(int i=0;i<studentArray.length;i++){
			tempStudentArray[i]=studentArray[i];
			}
			return tempStudentArray;
		 
		}
		
	
	
	
	
	
	
	}
