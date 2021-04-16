import java.io.*;
import java.util.Scanner;
class Ftoc
{
float celcius;
void convert(float f)
{
celcius=(f-32)*5/9;
System.out.println(f+" degree fahrenheit ="+celcius+" in celcius");
}
public static void main(String args[])
{
float fahrenheit;
Ftoc c=new Ftoc();
Scanner in=new Scanner(System.in);
System.out.println("Enter the degree in fahrenheit:");
fahrenheit=in.nextFloat();
c.convert(fahrenheit);
}
}