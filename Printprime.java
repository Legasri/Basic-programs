import java.io.*;
import java.util.*;
class Sumprime
{
public static void main(String args[])
{
int n,sum=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter upperbound:");
n=in.nextInt();
System.out.Println("The sum prime numbers within 1 to "+n+":");
for(int i=2;i<=n;i++)
{
int temp=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
temp++;
}
if(temp==0)
sum=sum+i;
}
}
}