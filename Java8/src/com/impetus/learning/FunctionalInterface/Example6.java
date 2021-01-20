package com.impetus.learning.FunctionalInterface;
import static java.lang.System.*;
import java.util.*;
public class Example6
{
public static void main(String gg[])
{
List<String> list=new ArrayList<>();
list.add("Mahesh");
list.add("Suresh");
list.add("Ramesh");
list.add("Naresh");
list.add("Kalpesh");
list.forEach(out::println);
}
}