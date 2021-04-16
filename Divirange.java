import java.io.*;
import java.util.Scanner;
class Divirange
{
public static void main(String args[])
{
int start,end,div,count=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter the starting num:");
start=in.nextInt();
System.out.print("Enter the ending num:");
end=in.nextInt();
System.out.print("Enter the divisor:");
div=in.nextInt();
for(int i=start;i<=end;i++)
{
if(i%div==0)
count++;
}
System.out.println(count);
}
}