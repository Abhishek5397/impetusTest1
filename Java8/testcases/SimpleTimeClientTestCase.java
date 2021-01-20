import com.impetus.learning.defaultKeyword.*;
class SimpleTimeClientTestCase
{
public static void main(String gg[])
{
TimeClient timeClient=new SimpleTimeClient();
System.out.println("Current Time : "+timeClient.getLocalDateTime());
timeClient.setDate(1997,3,5);
System.out.println("Set date : "+timeClient.getLocalDateTime());
timeClient.setTime(1,30,35);
System.out.println("Set time : "+timeClient.getLocalDateTime());
timeClient.setDateAndTime(1997,5,4,9,5,30);
System.out.println("Set Date and Time : "+timeClient.getLocalDateTime());
System.out.println("Now : "+timeClient.toString());
}
}