package week6Tuesday;

import java.util.Scanner;
public class Q6
{
	public static int getMax(int a,int b,int c)
	{
		if(a==0 || b==0 || c==0)
			return -1;
		if(a==b && b==c)
			return 0;
		if(a>=b && a>=c)                           
			return 1;
		else if(b>=a && b>=c)
			return 2;
		else if(c>=a && c>=b)
			return 3;
		return 0;
	}
	public static void main(String ... args)
	{
		Scanner scan=new Scanner(System.in);
		int no1 = scan.nextInt();
		int no2 = scan.nextInt();
		int no3 = scan.nextInt();
		StackProgram s1=new StackProgram();
		StackProgram s2=new StackProgram();
		StackProgram s3=new StackProgram();
		System.out.println("no 1 : ");
		for(int i=0;i<no1;i++)
			s1.push(scan.nextInt()+"");
		System.out.println("no 2 : ");
		for(int i=0;i<no2;i++)
			s2.push(scan.nextInt()+"");
		System.out.println("no 3 : ");
		for(int i=0;i<no3;i++)
			s3.push(scan.nextInt()+"");

		
		for(int x=0;;x++)
		{
			int i=getMax(s1.getSum(),s2.getSum(),s3.getSum());
			if(i==-1)
			{
				System.out.println("0");
				break;
			}
			if(i==0)
			{
				System.out.println(s1.getSum());
				break;
			}
			switch(i)
			{
				case 1:
				{
					s1.pop();
					break;
				}
				case 2:
				{
					s2.pop();
					break;
				}
				case 3:
				{
					s3.pop();
					break;
				}
			}
		}
	}
}
