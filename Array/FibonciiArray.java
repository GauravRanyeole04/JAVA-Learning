import java.util.*;
class FibonacciArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length to find Fibonacci Series: ");
        int series = sc.nextInt();
        int[] fibonacciSeries = new int[series];
        if (series > 0) 
        {
            fibonacciSeries[0] = 0;
        }
        if (series > 1) 
        {
            fibonacciSeries[1] = 1;
        }
        for (int i = 2; i < series; i++) 
        {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        System.out.println(Arrays.toString(fibonacciSeries));
	}
}