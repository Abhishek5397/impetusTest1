package com.impetus.learning.Stream;
import java.util.*;
import java.util.stream.*;
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
public class Example1
{
public static void main(String gg[])
{
List<Product> products=new LinkedList<>();
products.add(new Product(1,"HP Laptop",25000f));
products.add(new Product(2,"Dell Laptop",30000f));
products.add(new Product(3,"Lenevo Laptop",28000f));  
products.add(new Product(4,"Sony Laptop",28000f));  
products.add(new Product(5,"Apple Laptop",90000f));
//List<Product> priceFilteredProducts=new LinkedList<>();
//for(Product product: products)if(product.getPrice()<30000)priceFilteredProducts.add(product);
//for(Product product: priceFilteredProducts)System.out.println("Name : "+product.getName()+", Price : "+product.getPrice());
List<Float> priceList=new LinkedList<>();
priceList=products.stream().filter(p -> p.getPrice()<30000).map(p -> p.getPrice()).collect(Collectors.toList());
for(Float price: priceList)System.out.println("Price : "+price);
}
}