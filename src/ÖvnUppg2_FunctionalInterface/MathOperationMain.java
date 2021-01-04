package ÖvnUppg2_FunctionalInterface;


public class MathOperationMain {

   private static int operate(int a, int b, MathOperation mathOperation) {

      return mathOperation.operation(a, b);
   }
    
   public static void main(String args[]) {
      MathOperation addition = (a, b) -> a+b;


      MathOperation subtraction = (a,b)->a-b;

      MathOperation multiplication =(a,b)->a*b;

      MathOperation division = (a,b)->a/b;

      System.out.println("10 + 5 = " + operate(10, 5, addition));
      System.out.println("10 - 5 = " + operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + operate(10, 5, division));

      MathOperation testing=multiplication.sum(subtraction);
      MathOperation testing2=multiplication.sum(multiplication).divide(addition);
      System.out.println(operate(10,5,testing));
      System.out.println(operate(4,10,testing2));

      //System.out.println(testing.operation(5,10));

   }
}
