import com.impetus.common.util.*;
public class TMIteratorTestCase
{
public static void main(String gg[])
{
TMList<Integer> list1=new TMLinkedList<>();
for(int i=1;i<=20;++i)list1.add(i);
System.out.println("Iterating on linked list : ");
TMIterator<Integer> iterator=list1.iterator();
while(iterator.hasNext())System.out.print(iterator.next()+", ");
System.out.println("\nIterating on array list : ");
TMList<Integer> list2=new TMArrayList<>();
for(int i=1;i<=20;++i)list2.add(i);
iterator=list2.iterator();
while(iterator.hasNext())System.out.print(iterator.next()+", ");
System.out.println("\nNow using the next method without precaution");
iterator=list2.iterator();
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
}
}