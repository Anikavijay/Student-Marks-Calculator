import javax.swing.*;
public class Studentmarks
{
public static void main(String args[])
{
int marks,sum=0;
int failed=0;
for(int i=0;i<5;i++)
{
marks=Integer.parseInt(JOptionPane.showInputDialog("Enter marks"));
while(marks<0||marks>100)
{
System.out.println("Invalid input...Try Again");
marks=Integer.parseInt(JOptionPane.showInputDialog("Enter marks"));
}
if(marks<33)
{
failed=1;
}
sum+=marks;
}
double percentage=sum/500.0*100;
System.out.println(percentage);
if(failed==1)
{
System.out.println("Fail");
}
else
{
System.out.println("Pass");

if(percentage>=90)
{
	System.out.println("Grade A");
}
else if(percentage>=75)
{
	System.out.println("Grade B");
}
else if(percentage>=60)
{
	System.out.println("Grade C");
}
else
{
	System.out.println("Grade D");
}
}
System.out.println(sum);
}
}
