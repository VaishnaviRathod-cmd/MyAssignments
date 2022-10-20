package lab1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VaishnaviRathod s = new VaishnaviRathod();
		//System.out.println(s.SumofCubeDigits(23));
		Q1 a = new Q1();
		System.out.println(a.SumofCubeDigits(23));
		
		
}
	 int SumofCubeDigits(int x) {
		int sum=0;
		while(x!=0) {
		int n=x%10;
		x=x/10;
		sum=sum+(n*n*n);
		}
		return sum;
	  }
}

