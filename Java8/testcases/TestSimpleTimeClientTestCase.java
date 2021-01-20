import com.impetus.learning.defaultKeyword.*;
class TestSimpleTimeClientTestCase
{
public static void main(String gg[])
{
TimeClient timeClient=new SimpleTimeClient();
System.out.println("Now in India : "+timeClient.toString());
System.out.println("Now in California : "+timeClient.getZonedDateTime("Pacific Region").toString());
}
}