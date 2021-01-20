import java.time.*;
class time1
{
public static void main(String gg[])
{
LocalDateTime dateAndTime;
dateAndTime=LocalDateTime.now();
System.out.println("Today's date : "+dateAndTime);
System.out.println("Time : "+dateAndTime.getHour()+":"+dateAndTime.getMinute()+":"+dateAndTime.getSecond());
}
}