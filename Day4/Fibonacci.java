package Day4;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[20];
		int i;
		a[0]=1;
		a[1]=1;
		for(i=2;i<10;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		for(i=0;i<10;i++)
			System.out.print("  "+a[i]);
	}

}
