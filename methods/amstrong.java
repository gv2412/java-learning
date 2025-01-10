import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int s;
		double q;double sum=0;int m=n;
		while(n>0)
		{
			int d=n%10;
			 q=Math.pow(d,s);
			 sum=sum+q;
			 count=count+1;
			n=n/10;
		}
		if(m==sum) {
			System.out.print("yeah its Amstrong");
		}
		else 
			{
				System.out.print("not Amstrong");
			}
	}

}