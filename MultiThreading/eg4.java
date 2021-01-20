class Resource
{
private int num;
private boolean b;
synchronized public void setNumber(int num)
{
if(this.b==false)
{
this.num=num;
System.out.println("Produced : "+this.num);
this.b=true;
notify();
}
else
{
try
{
wait();
}catch(InterruptedException interruptedException)
{
System.out.println(interruptedException.getMessage());
}
}
}
synchronized public int getNumber()
{
if(this.b)
{
System.out.println("Consumed : "+this.num);
this.b=false;
notify();
}
else
{
try
{
wait();
}catch(InterruptedException interruptedException)
{
System.out.println(interruptedException.getMessage());
}
}
return this.num;
}
}
class Producer extends Thread
{
private Resource resource;
public Producer(Resource resource)
{
this.resource=resource;
start();
}
public void run()
{
for(int i=201;i<=250;++i)this.resource.setNumber(i);
}
}
class Consumer extends Thread
{
private Resource resource;
public Consumer(Resource resource)
{
this.resource=resource;
start();
}
public void run()
{
for(int i=1;i<=50;++i)this.resource.getNumber();
}
}
class eg4
{
public static void main(String gg[])
{
Resource resource;
resource=new Resource();
new Producer(resource);
new Consumer(resource);
}
}