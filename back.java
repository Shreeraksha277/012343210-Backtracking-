public class Backtracking
{
    static int n=4;
    static int i;
	public static void main(String[] args) {
		fun(i);
	}
	public static void fun(int i)
	{
	    if(i<n)
	    {
	        System.out.print(i+ " ");
	        fun(i+1);
	    }
	    System.out.print(i+ " ");//Backtracking 
	}//once reached here we have to empty the stack or the memory so we will backtrack it 
}
