package com.impetus.learning.MethodReference;
import java.util.*;
import java.util.stream.*;
class Person
{
private String name;
private int age;
public Person(String name,int age)
{
this.name=name;
this.age=age;
}
public void setName(String name){ this.name=name; }
public String getName(){ return this.name; }
public void setAge(int age){ this.age=age; }
public int getAge(){ return this.age; }
}
class PersonComparator
{
public static int compareByAge(Person p1,Person p2)
{
return p1.getAge()-p2.getAge();
}
public static int compareByName(Person p1,Person p2)
{
return p1.getName().compareTo(p2.getName());
}
}
public class Example8
{
public static void main(String gg[])
{
List<Person> persons=new LinkedList<>();
persons.add(new Person("vickey",24));
persons.add(new Person("poonam",25));
persons.add(new Person("sachin",19));
Collections.sort(persons,new Comparator<Person>(){
public int compare(Person p1,Person p2)
{
return p1.getAge()-p2.getAge();
}
});
for(Person p :persons)System.out.println("Name : "+p.getName()+", Age : "+p.getAge());
System.out.println();
System.out.println("Comparision on basis of name : ");
Collections.sort(persons,PersonComparator::compareByName);
for(Person p :persons)System.out.println("Name : "+p.getName()+", Age : "+p.getAge());
System.out.println();
System.out.println("Comparision on basis of age : ");
Collections.sort(persons,PersonComparator::compareByAge);
for(Person p :persons)System.out.println("Name : "+p.getName()+", Age : "+p.getAge());
System.out.println();
Collections.sort(persons,(p1,p2) -> PersonComparator.compareByName(p1,p2));
for(Person p :persons)System.out.println("Name : "+p.getName()+", Age : "+p.getAge());
System.out.println();
System.out.println("Using the stream and basis of comparision is age :");
//persons=persons.stream().map(p -> p.getAge()).collect(Collectors.toList());
persons=persons.stream().sorted(PersonComparator::compareByAge).collect(Collectors.toList());
for(Person p :persons)System.out.println("Name : "+p.getName()+", Age : "+p.getAge());
System.out.println();
}
}