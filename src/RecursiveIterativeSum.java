public class RecursiveIterativeSum{
    public static int sumRecursive(int n){
        if(n==0)
            return 0;
        else 
            return n+sumRecursive(n-1);
    }
    public static int sumIterative(int n){
        int result = 0 ;
        for(int i=1;i<=n;i++){
            result+=i;
        }
        return result;
    }
    public static void main(String[]args){
        int a=100;
        System.out.println("Sum using Recursion of "+ a +" is " + sumRecursive(a));
        System.out.println("Sum using iteration of "+ a +" is " + sumIterative(a));
    }
}



