package com.impetus.learning.MethodReference;
import java.util.*;
public class Example9
{
public static void main(String gg[])
{
List<String> names=new LinkedList<>();
names.add("vickey");
names.add("poonam");
names.add("sachin");
Collections.sort(names,String::compareToIgnoreCase);
Iterator<String> iter=names.iterator();
while(iter.hasNext())System.out.println(iter.next());
}
}