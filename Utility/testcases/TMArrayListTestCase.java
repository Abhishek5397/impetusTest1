import com.impetus.common.util.*;
class TMArrayListTestCase
{
public static void main(String gg[])
{
TMList<String> list1=new TMArrayList<String>();
list1.add("Indore");
list1.add("Ujjain");
list1.add("Dewas");
list1.add("Badnagar");
for(int i=0;i<list1.size();++i)System.out.println(list1.get(i));
list1.add(2,"Laxmi Bai Nagar");
for(int i=0;i<list1.size();++i)System.out.println(list1.get(i));
TMList<String> list2=new TMArrayList<>();
list1.copyTo(list2);
System.out.println("Iterating on list 2 after copying contents from list 1");
for(int i=0;i<list2.size();++i)System.out.println(list2.get(i));
}
}