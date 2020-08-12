package algo;

public class RotateImage {
	public static void main(String[] args) {
		
		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int n = arr.length;
		int m = arr[0].length;
		
		for(int i = 0; i<n; i++) {
			for(int j = i; j<m; j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}
		
		for(int i = 0; i<n; i++)
		{
			int left  = 0;
			int right = n-1;
			while(left<right)
			{
				int tmp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = tmp;
				left++;
				right--;
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				System.out.print(arr[i][j] + " ");}
		    System.out.println();}
			
	}
}
