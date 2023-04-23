public class Swap
{
       public static void main(String args[])
        {
         Swap obj= new Swap();
         obj.num();
          }
//
       public void num()
       {
         int first = 5;
          int second =7;
          int a=first;
          first=second;
          second=a;
         System.out.println("first = "+first);
         System.out.println("second = "+second);

        }
}

