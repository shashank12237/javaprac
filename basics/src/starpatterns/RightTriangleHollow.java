package starpatterns;

public class RightTriangleHollow {

	public static void main(String[] args) {
		int m=5;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==m||j==1||i==j) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
