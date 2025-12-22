public class FactorialNumber {
    //to print a given number factorial
    //using Recursive method
    //Recursive means ... without using for loop
    //also the function calls itself
    //i)Base - caase,, ii)Recursive -  case
    public static int factorialNumber(int n){
        if(n == 0){
            return 1;
        }
        return n * factorialNumber(n - 1);
    }    
        public static void main(String args[]){
            int num = 5;
            int result = factorialNumber(num);
            System.out.println(result);
        }


    
    
}
