package whileloop;

public class Hcf_three {
	public static void main(String arg[])
    {
  Hcf_three object=new Hcf_three();
  object.number(14,6,8);
  object.number(12,24,36);
  object.number(8,24,64);
 }
   public void number(int a,int b,int c)
     {
    int i=1;
    int hrf=0;
     int small= a>b? b:a;
     int num =small>c?c:small;
     while(i<=num)
     { 
     if(a%i==0 && b%i==0 && c%i==0)
     {
       hrf=i;
     
     }
   
     i++;   
     } 
    System.out.println("hcf number="+hrf);
     }
}


