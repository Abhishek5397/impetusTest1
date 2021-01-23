import com.impetus.common.util.*;
class TMLinkedListTestCase
{
public static void main(String gg[])
{
TMList<Integer> list1=new TMLinkedList<>();
list1.add(1);
list1.add(2);
list1.add(3);
list1.add(4);
list1.add(5);
list1.add(6);
list1.add(7);
for(int i=0;i<list1.size();++i)System.out.println(list1.get(i));
list1.add(2,10);
for(int i=0;i<list1.size();++i)System.out.println(list1.get(i));
TMList<String> list2=new TMLinkedList<>();
list2.add("Indore");
list2.add("Ujjain");
list2.add("Dewas");
list2.add("Badnagar");
for(int i=0;i<list2.size();++i)System.out.println(list2.get(i));
list1.insert(4,10101);
System.out.println("After inserting 10101 at index 4");
for(int i=0;i<list1.size();++i)System.out.println(list1.get(i));
System.out.println("After removing from index 2: ");
System.out.println("Removed : "+list1.removeAt(2));
for(int i=0;i<list1.size();++i)System.out.println(list1.get(i));
System.out.println("After removing from index 4: ");
System.out.println("Removed : "+list1.removeAt(4));
for(int i=0;i<list1.size();++i)System.out.println(list1.get(i));
System.out.println("After updating element at index 5");
list1.update(5,456);
for(int i=0;i<list1.size();++i)System.out.println(list1.get(i));
}
}