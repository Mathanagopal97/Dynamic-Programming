public class CatalanNumber
{
  public static int calculateCatalan (int n)
  {
    int[] catalan = new int[n];
      catalan[0] = 1;
      catalan[1] = 1;
    for (int i = 2; i < n; i++)
      {
	for (int j = 0; j < i; j++)
	  {
	    catalan[i] += catalan[j] * catalan[(i - 1) - j];
	  }
      }
    return catalan[n - 1];
  }
  public static void main (String[]args)
  {
    System.out.println (calculateCatalan (5));
  }
}
