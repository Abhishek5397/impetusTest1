package com.impetus.learning.Stream;
import java.util.stream.*;
import java.util.*;
class Product
{
private int id;
private String name;
private float price;
public Product(int id,String name,float price)
{
this.id=id;
this.name=name;
this.price=price;
}
public int getId(){ return this.id; }
public String getName(){ return this.name; }
public float getPrice(){ return this.price; }
}
public class Example3
{
public static void main(String gg[])
{
List<Product> products=new LinkedList<>();
products.add(new Product(1,"HP Laptop",25000f));
products.add(new Product(2,"Dell Laptop",30000f));
products.add(new Product(3,"Lenevo Laptop",28000f));  
products.add(new Product(4,"Sony Laptop",28000f));  
products.add(new Product(5,"Apple Laptop",90000f));
products.stream().filter(product -> product.getPrice()==30000).forEach(product -> System.out.println(product.getName()));
float totalPrice=products.stream().map(product ->product.getPrice()).reduce(0.0f, (sum,price) -> sum+price);
System.out.println("Total price : "+totalPrice);
totalPrice=products.stream().map(product -> product.getPrice()).reduce(0.0f, Float::sum);
System.out.println("Total price : "+totalPrice);

//Using Collectors
double tp=products.stream().collect(Collectors.summingDouble(price -> price.getPrice()));
System.out.println("Total price : "+tp);

//Finding count of products having price < 30000
long count=products.stream().filter(product -> product.getPrice()<30000).count();
System.out.println("Count of products having price less than 3000 : "+count);

//Finding max price
float maxPrice=products.stream().map(Product::getPrice).max((price1,price2)->(price1<price2)?1:-1).get();
System.out.println("Min price : "+maxPrice);
maxPrice=products.stream().max((product1,product2) -> (product1.getPrice()>product2.getPrice())?1:-1).get().getPrice();
System.out.println("Max price : "+maxPrice);
}
}