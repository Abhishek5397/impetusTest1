package flyweight.pattern.demo;
import java.util.*;
interface RobotInterface
{
	void print();
}
class SmallRobot implements RobotInterface
{
	public void print()
	{
		System.out.println("I'm a small robot.");
	}
}
class LargeRobot implements RobotInterface
{
	public void print() {
		System.out.println("I'm a large robot.");
	}
}
class RobotFactory
{
	private static Map<String,RobotInterface> robots=new HashMap<>();
	public int getTotalRobots() {
		return robots.size();
	}
	public static RobotInterface getRobotFromFactory(String type)
	{
		if(robots.containsKey(type))return robots.get(type);
		else
		{
			RobotInterface robot=null;
			switch(type)
			{
			case "small":
				robot=new SmallRobot();
				System.out.println("Small robot was not present, therefore creating the Small Robot now...");
				robots.put(type, robot);
				break;
			case "large":
				System.out.println("Large robot was not present, therefore creating the Large Robot now...");
				robot=new LargeRobot();
				robots.put(type, robot);
				break;
			default:
				throw new RuntimeException("Robot Factory will only create small and large robots.");
			}
			return robot;
		}
	}
}
public class FlyweightPatternExample1 {
	public static void main(String gg[])
	{
		int i;
		RobotFactory robotFactory=new RobotFactory();
		System.out.println("\n***Flyweight Pattern Demo***\n");
		RobotInterface robot=RobotFactory.getRobotFromFactory("small");
		robot.print();
		for(i=1;i<=3;++i)RobotFactory.getRobotFromFactory("small").print();
		System.out.println("Number of objects created : "+robotFactory.getTotalRobots());
		robot=RobotFactory.getRobotFromFactory("large");
		robot.print();
		for(i=1;i<=7;++i)RobotFactory.getRobotFromFactory("large").print();
		System.out.println("Number of objects created : "+robotFactory.getTotalRobots());
		robot=RobotFactory.getRobotFromFactory("Something");
		robot.print();
	}
}
