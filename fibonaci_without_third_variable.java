package whileloop;

public class fibonaci_without_third_variable {
	public static void main(String args[])
	{
		Fibanoci obj=new Fibanoci();
		obj.check();
	
	}
	public void check()
	{
		int n=10;
		int count=1;
		int first=0;
		int second=1;
		
		if(n>=1)
		{
			System.out.println("0");
		}
		if(n>=2)
		{
			System.out.println("1");
		}
		while(count<=n)
		{
		
			
			System.out.println(first+second);
			second=first+second;
			first=second-first;
			count++;
		}
	}
}
