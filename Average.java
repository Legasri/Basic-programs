import java.io.*;
import java.util.*;
class Average
{
public static void main(String args[])
{
int a,sum=0,avg;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of elements");
a=in.nextInt();
for(int i=1;i<=a;i++)
{
System.out.println("Enter the num"+i);
sum+=in.nextInt();
}
avg=sum/a;
System.out.println("Average="+avg);
}
}