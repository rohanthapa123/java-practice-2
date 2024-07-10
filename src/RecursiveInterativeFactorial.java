public class RecursiveInterativeFactorial{
    public static int factorialRecursive(int n){
        if(n==0)
            return 1;
        else 
            return n*factorialRecursive(n-1);
    }
    public static int factorialIterative(int n){
        int result =1 ;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[]args){
        int a=7;
        System.out.println("Factorial: Recursion of "+ a +" = " + factorialRecursive(a));
        System.out.println("Factorial: iteration of "+ a +" = " + factorialIterative(a));
    }
}


