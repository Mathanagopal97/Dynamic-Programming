public class BinomialCoefficient
{
    public static int calcCoefficient(int n,int k){
        int[] factorialArr = new int[n+1];
        factorialArr[0] = 1;
        for(int i=1;i<=n;i++){
            factorialArr[i] = i*factorialArr[i-1];
        }
        return (factorialArr[n])/(factorialArr[k]*factorialArr[n-k]);
    }
    
	public static void main(String[] args) {
	  long startTime = System.nanoTime();
		System.out.println(calcCoefficient(5,2));
		long endTime = System.nanoTime();
    System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
}
