package ÖvnUppg2_FunctionalInterface;


public interface MathOperation {
      int operation(int a, int b);
      default MathOperation sum(MathOperation m ){return (c,d)->m.operation(c,d)+m.operation(c,d);}
      
   }