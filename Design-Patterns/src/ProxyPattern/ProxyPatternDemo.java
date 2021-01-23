package ProxyPattern;
abstract class Subject
{
	public abstract void doSomething();
}
class ConcreteSubject extends Subject
{
	public void doSomething()
	{
		System.out.println("I am a concrete subject");
	}
}
class ProxySubject extends Subject
{
	ConcreteSubject concreteSubject;
	public void doSomething()
	{
		System.out.println("Proxy call happening now");
		if(this.concreteSubject==null) {
			System.out.println("Creating instance of complex and heavy object");
			concreteSubject=new ConcreteSubject();
		}
		concreteSubject.doSomething();
	}
}
public class ProxyPatternDemo {
	public static void main(String gg[])
	{
//		Subject subject=new ConcreteSubject();
//		subject.doSomething();
		Subject subject=new ProxySubject();
		subject.doSomething();
		System.out.println("Again invoking the surrogate object method");
		subject.doSomething();
		System.out.println("Here we found that no new instance of heavy objecct (Concrete Subject) got created, and the existing object performed the task.");
	}
}
