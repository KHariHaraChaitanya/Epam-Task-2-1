/*
 * This class contains methods of all arithmetic operations: Add,Multiply,Divide
 * author-K.HariHaraChaitanya project-Calculator
 */
class Arithmetics {
   double add(double num1,double num2) {
	   return num1+num2;
   }
   /*
    * overloaded add method three parameters
    */
   double add(double num1,double num2,double num3) {
	   return num1+num2+num3;
   }
   double multiply(double num1,double num2) {
	   return num1*num2;
   }
   /*
    * overloaded multiply method for three parameters
    */
   double multiply(double num1,double num2,double num3) {
	   return num1*num2*num3;
   } 
   // divide method
   double divide(double numerator,double denominator) {
	   try {
		   if(denominator==0.0) throw  new ArithmeticException();
		   return numerator/denominator;
	   }
	   catch(Exception e) {
		   return 0;
	   }
	   
   }
}
