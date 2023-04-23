
 class Value

{

        public  static void main( String args[] )
            {
            Value object = new Value();
           int answer= object.addition();
            object.discount(answer);
            } 
        
            public int addition() 
            {
             int first = 5;
             int second = 10;
             int total = first+second;
             System.out.println("First value is: "+ first);
             System.out.println("Second value is: "+second);
             System.out.println("the addition output is " + total);
            return total;
            }  

           public void discount(int answer)
            { 
             int finalAnswer = answer-5;
            System.out.println("pls pay : "+ finalAnswer);
                
                }
        
}
