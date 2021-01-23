package flyweight.pattern.demo;
import java.util.*;
class Robot implements RobotInterface
{
	private String robotType;
	private String colorOfRobot;
	public Robot(String robotType)
	{
		this.robotType=robotType;
	}
	public void setColor(String color)
	{
		this.colorOfRobot=color;
	}
	public void print()
	{
		System.out.println("This is a "+robotType+" robot with "+colorOfRobot+" color");
	}
}
class RobotFactory1
{
	private Map<String,RobotInterface> robots=new HashMap<>();
	public int getRobotCount()
	{
		return robots.size();
	}
	public RobotInterface getRobotFromFactory(String robotType) throws Exception
	{
		RobotInterface robot=null;
		if(robots.containsKey(robotType))return this.robots.get(robotType);
		else
		{
			switch(robotType)
			{
			case "King":
				System.out.println("We do not have King Robot. So we are creating a King Robot now.");
						robot = new Robot("King");
						this.robots.put("King",robot);
						break;
			case "Queen":
				System.out.println("We do not have Queen Robot. So we are creating a Queen Robot now.");
				robot= new Robot("Queen");
				this.robots.put(robotType, robot);
				break;
			default:
				throw new Exception(" Robot Factory can create only king and queen type robots");
			}
		}
		return robot;
	}
}
public class FlyweightPatternExample2 {
	public static void main(String[] args) throws Exception
	{
		RobotFactory1 myfactory = new RobotFactory1();
		System.out.println("\n***Flyweight Pattern Example Modified***\n");
		Robot shape;
		/*Here we are trying to get 3 king type robots*/
		for (int i = 0; i < 3; i++)
		{
			shape =(Robot) myfactory.getRobotFromFactory("King");
			shape.setColor(getRandomColor());
			shape.print();
		}
		/*Here we are trying to get 3 queen type robots*/
		for (int i = 0; i < 3; i++)
		{
			shape =(Robot) myfactory.getRobotFromFactory("Queen");
			shape.setColor(getRandomColor());
			shape.print();
		}
		int NumOfDistinctRobots = myfactory.getRobotCount();
		System.out.println("\nDistinct Robot objects created till now ="+ NumOfDistinctRobots);
		System.out.println("\n Finally no of Distinct Robot objects created: "+ NumOfDistinctRobots);
	}
	private static String getRandomColor()
	{
	Random r=new Random();
	int random=r.nextInt(20);
	if(random%2==0)	return "red";
	else return "green";
	}
}
