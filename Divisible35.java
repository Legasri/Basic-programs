import java.io.*;
import java.util.*;
class Divisible35
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of first n numbers:");
n=in.nextInt();
System.out.println("\nDivided by 3: ");		
for(int i=1; i<=n; i++) 
{
if(i%3==0) 
System.out.print(i +", ");			
}			
System.out.println("\n\nDivided by 5: ");
for(int i=1; i<=n; i++)
{
if(i%5==0) 
System.out.print(i +", ");			
}
System.out.println("\n\nDivided by 3 & 5: ");			
for(int i=1; i<=n; i++) 
{
if (i%3==0 && i%5==0) System.out.print(i +", ");			
}
System.out.println("\n");
}
}