package adapter.pattern.demo;
interface IntegerValueInterface
{
	public int getInteger();
}
class IntegerValue implements IntegerValueInterface
{
	public int getInteger() { return 5; }
}
class ClassAdapter extends IntegerValue
{
	public int getInteger() { return 2+super.getInteger(); }
}
class ObjectAdapter
{
	private IntegerValue intValue;
	public ObjectAdapter()
	{
		this.intValue=new IntegerValue();
	}
	public int getInteger()
	{
		return 2+this.intValue.getInteger();
	}
}
public class AdapterPatternDemo2 {
	public static void main(String gg[])
	{
		ClassAdapter classAdapter=new ClassAdapter();
		System.out.println("This is the sum from ClassAdapter : "+classAdapter.getInteger());
		ObjectAdapter objectAdapter=new ObjectAdapter();
		System.out.println("This is the sum from ObjectAdapter : "+objectAdapter.getInteger());
	}

}