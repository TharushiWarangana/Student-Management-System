class Demo{
	public static void main(String args[]){
	StudentCollection studentCollection=new StudentCollection();
	new AddStudent(studentCollection).setVisible(true);
	new SearchStudent(studentCollection).setVisible(true);
	new DeleteStudent(studentCollection).setVisible(true);
	new UpdateStudent(studentCollection).setVisible(true);
	new ViewStudent(studentCollection).setVisible(true);
	
	
	}
}
