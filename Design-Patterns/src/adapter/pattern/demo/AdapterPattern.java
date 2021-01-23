package adapter.pattern.demo;
class Rectangle
{
	private double length;
	private double breadth;
	public Rectangle()
	{
		this.length=0;
		this.breadth=0;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
}
class Triangle
{
	private double base;
	private double height;
	public Triangle()
	{
		this.base=0;
		this.height=0;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
class Calculator
{
	private Rectangle rectangle;
	public Calculator()
	{
		this.rectangle=null;
	}
	public double getArea(Rectangle rectangle)
	{
		this.rectangle=rectangle;
		return this.rectangle.getLength()*this.rectangle.getBreadth();
	}
}
class CalculatorAdapter {
	private Triangle triangle;
	private Calculator calculator;
	public CalculatorAdapter() {
		super();
		// TODO Auto-generated constructor stub
		this.triangle=null;
		this.calculator=new Calculator();
	}
	public double getArea(Triangle triangle)
	{
		this.triangle=triangle;
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(this.triangle.getBase());
		rectangle.setBreadth(this.triangle.getHeight());
		return 0.5*this.calculator.getArea(rectangle);
	}
}
public class AdapterPattern
{
	public static void main(String gg[])
	{
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(10);
		rectangle.setBreadth(5);
		Calculator calculator=new Calculator();
		double area=calculator.getArea(rectangle);
		System.out.println("Area of rectangle : "+area);
		Triangle triangle=new Triangle();
		triangle.setBase(20);
		triangle.setHeight(5);
		CalculatorAdapter calculatorAdapter=new CalculatorAdapter();
		area=calculatorAdapter.getArea(triangle);
		System.out.println("Area of triangle : "+area);
	}
}