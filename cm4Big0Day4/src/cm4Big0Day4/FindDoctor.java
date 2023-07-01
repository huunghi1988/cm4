package cm4Big0Day4;

import java.util.Arrays;

public class FindDoctor {
public static void main(String[] args) {
	int[][] arr = {{1,1,5,2,3},
            {4,5,6,4,3},
            {9,4,4,1,5}};
	int[][] arr1 = {{4,3},
            {5,5},
            {6,2}} ;
	int[][] arr2 = {{1,2,2},
            {3,1,4}};
	
	
	countDoctors(arr);
	countDoctors(arr2);
	countDoctors(arr1);


	
	//O(N^2xM)
}
public static void countDoctors(int[][] arr) {
  
    int count = 0;
    for(int i=0;i<arr.length;i++)
    	System.out.println(Arrays.toString(arr[i]));
    
    boolean[][] visited = new boolean[arr.length][arr[0].length];

    // Check for doctors working at multiple hospitals
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            // Check if the doctor at hospital i on day j has already been counted
            if (!visited[i][j]) {
                int doctorId = arr[i][j];
                boolean foundDuplicate = false;

                // Check if the same doctor works at another hospital on the same day
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k][j] == doctorId) {
                        foundDuplicate = true;
                        visited[k][j] = true;
                   }
                }

                // If a duplicate doctor was found
                if (foundDuplicate) {
                    count++;
                    visited[i][j] = true;
                }
            }
        }
    }
    for(int i=0;i<visited.length;i++)
    	System.out.println(Arrays.toString(visited[i]));
    System.out.println(count);
}
}
