import java.util.Scanner;
interface Number
{
  int process(int x,int y);
}
class sum impliments Numbers
{
  public in process(int x, int y)
  {
    return(x+y);
  }
}
class average extends sum
{
  public int process(int x,int y)
  {
    return (cx+y/2);
  }
}
class u2_p5 
{
  public static viod main(String args[])
  {
    int+x,y;
	sum s1=new sum();
	average a1=new sum();
	Sanner n1=new Sanner(System.in);
	System.out.print("Enter and number:");
	x=n1.nextInt();
	System.out.println("Enter a Number:");
	y=n1.nextInt();
	System.out.println("sum:"s1 process(x,y));
	System.out.println("Average:"+a1process(x,y));
  }
}
