package Rotatematrix;
import java.util.Scanner;

public class Rotatematrix {

	public static int[][] matrixTran(int arr[][],int n,int m){
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i<j) {
					temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();			
			}
		}
		
		matrixTran(arr,n,m);
		   for (int i = 0; i < n; i++){
			    for (int j = 0; j <  n/ 2; j++){
		            int temp = arr[i][j];
		            arr[i][j] = arr[i][n - j - 1];
		            arr[i][n - j - 1] = temp;
			    }
		    }
		   for (int i = 0; i <n; i++){
		        for (int j = 0; j < m; j++)
		            System.out.print (arr[i][j] + " ");
		        System.out.println ("");
	        }
	  }

	}


	
