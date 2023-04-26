class Salary

{
 public static void main(String args[])
  {
   Salary obj=new Salary();
   obj.money();
   
  }
  public void money()
   {
     int yearly_salary=4573000;
      
     if((yearly_salary>0)  &&  (yearly_salary<=200000))
     {
     System.out.println( yearly_salary +" =  Lower Middle Class");
     }
      
     else if ((yearly_salary>200000) && (yearly_salary<=500000))
     { 
       System.out.println(yearly_salary + " = Middle Class");
     }
       
     else if ((yearly_salary>500000) && (yearly_salary<=2500000))
     { 
       System.out.println(yearly_salary + " = Upper Middle Class");
     }
      
     else if ((yearly_salary>2500000) && (yearly_salary<=1000000))
     {
      System.out.println(yearly_salary+ " = Millionaire");
     }
     else if ((yearly_salary>1000000) && (yearly_salary<=100000000))
     {
      System.out.println(yearly_salary+ " = Billionaire");
     }
      
     else  
     {
       System.out.println(yearly_salary +" = Please check your salary");
     }
  }
}
