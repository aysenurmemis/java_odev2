package ödev2;

public class Main {

	public static void main(String[] args) {

		StudentUser studentUser = new StudentUser();
		studentUser.setId(1);
		studentUser.setFirstName("Ayþenur");
		studentUser.setLastName("Memiþ");
		studentUser.setCourseName("Java");
		
		InstructorUser instructorUser = new InstructorUser();
		instructorUser.setId(2);
		instructorUser.setFirstName("Engin");
		instructorUser.setLastName("Demirog");
		instructorUser.setBranchName("yazýlým");
		
		InstructorManager instructorManager =  new InstructorManager();
		instructorManager.teach(instructorUser);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(studentUser);
		
		UserManager userManager = new UserManager();
		userManager.join(studentUser);
		userManager.join(instructorUser);
			
	}

}
