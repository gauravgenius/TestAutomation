package utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix3x3 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number[][] = new int[3][3];
		int i,j;
	    String m;
        System.out.println("Enter Elements for Matrix 3x3 :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                m=br.readLine();
                number[i][j]=Integer.parseInt(m);
            }
        }
        System.out.println("Elements in Matrix are : ");
                                System.out.println("");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(number[i][j]+"\t");
            }
            System.out.println();
        }
	}
}
