class Solution 
{
    public double myPow(double x, int n) 
    {
        // Base Cases 
        if (n == 0)
        { 
            return 1;
        }
        
        // Recursive calls to find the x^(n/2) power
        double half = myPow(x, n / 2);

        // If n is even
        if (n % 2 == 0) 
        {
            return half * half;
        }
        // If n is < 0
        if (n < 0) 
        {
            return half * half / x;
        
        }
        // Else n is odd
        return half * half * x;
    }
}