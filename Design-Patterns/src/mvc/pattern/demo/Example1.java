package mvc.pattern.demo;
class StudentModel
{
	private String name;
	private int rollNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
}
class StudentView
{
	public void printStudentDetails(int rollNumber, String name)
	{
		System.out.println("Printing students detais : ");
		System.out.println("Roll number : "+rollNumber);
		System.out.println("Name : "+name);
	}
}
class StudentController
{
	private StudentModel model;
	private StudentView view;
	public StudentController(StudentModel model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String name)
	{
		this.model.setName(name);
	}
	public String getStudentName()
	{
		return this.model.getName();
	}
	public void setStudentRollNumber(int rollNumber)
	{
		this.model.setRollNumber(rollNumber);
	}
	public int getStudentRollNumber()
	{
		return this.model.getRollNumber();
	}
	public void updateView()
	{
		this.view.printStudentDetails(getStudentRollNumber(), getStudentName());
	}
}
public class Example1 {
	private static StudentModel getStudentFromDataBase()
	{
		StudentModel model=new StudentModel();
		model.setName("Abhishek Kataria");
		model.setRollNumber(101);
		return model;
	}
	public static void main(String gg[])
	{
		StudentModel model=getStudentFromDataBase();
		StudentView view=new StudentView();
		StudentController controller=new StudentController(model,view);
		controller.updateView();
		controller.setStudentName("Rahul Singhal");
		controller.updateView();
		controller.setStudentName("Divyanshi Pathak");
		controller.updateView();
	}
}
