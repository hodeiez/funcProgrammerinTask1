package ÖvnUppg2c_SingleDigitOperation;


import ÖvnUppg2_FunctionalInterfaceFacit.MathOperation;

public class SingleDigitOperationMain {

    
   public static void main(String args[]) {

      SingleDigitOperation square = a  -> a * a;
      SingleDigitOperation checkPositive = a ->  {if (a >= 0) return 1; else  return 0;};
      
      System.out.println(square.operate(4));
      System.out.println(square.operate(-2));
      System.out.println(checkPositive.operate(13));
      System.out.println(checkPositive.operate(-2));

   }
}
