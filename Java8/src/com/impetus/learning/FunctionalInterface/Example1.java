package com.impetus.learning.FunctionalInterface;
import java.util.*;
public class Example1
{
public static void main(String gg[])
{
List<String> list1=new ArrayList<>();
list1.add("Mahesh ");
list1.add("Suresh ");
list1.add("Ramesh ");
list1.add("Naresh ");
list1.add("Kalpesh ");
List<String> list2=new ArrayList<>();
list2.add("Mahesh ");
list2.add("Suresh ");
list2.add("Ramesh ");
list2.add("Naresh ");
list2.add("Kalpesh ");
System.out.println("List 1 : Before sorting");
for(String s: list1)System.out.print(s);
System.out.println("\nList 2 : Before sorting");
for(String s: list2)System.out.print(s);
Example1 a=new Example1();
a.sortList1(list1);
a.sortList2(list2);
System.out.println("\nList 1 : After sorting");
for(String t: list1)System.out.print(t);
System.out.println("\nList 2 : After sorting");
for(String s: list2)System.out.print(s);
}
private void sortList1(List<String> list1)
{
Collections.sort(list1,new Comparator<String>(){
public int compare(String left,String right)
{
return left.compareTo(right);
}
});
}
private void sortList2(List<String> list2)
{
Collections.sort(list2,(left,right)-> left.compareTo(right));
}
}