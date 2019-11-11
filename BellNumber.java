public class BellNumber
{
    public static int getBellNumber(int n){
        int[][] bellTriangle = new int[n+1][n+1];
        bellTriangle[0][0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(j==0) bellTriangle[i][j] = bellTriangle[i-1][i-1];
                else bellTriangle[i][j] = bellTriangle[i-1][j-1]+bellTriangle[i][j-1];
            }
        }
        return bellTriangle[n][0];
    }
	public static void main(String[] args) {
		System.out.println("0 Bell number is "+getBellNumber(5));
	}
}
