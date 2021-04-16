import java.io.*;
import java.util.*;
class SecConverter
{
public static void main(String args[])
{
int sec,min,hour;
Scanner in=new Scanner(System.in);
System.out.print("Enter the seconds:");
sec=in.nextInt();
min=sec/60;
hour=sec/3600;
System.out.println(sec+" seconds="+min+" min");
System.out.println(sec+" seconds="+hour+" hrs");
}
}