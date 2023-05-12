package cm4Big0Day4;

import java.util.Arrays;

public class FindDoctor {
public static void main(String[] args) {
	int[][] arr = {{1,2,3},
            {4,2,6},
            {4,2,6}}
            ;
	for(int i=0;i<arr.length;i++)
	System.out.println(Arrays.toString(arr[i]));
	System.out.println(countDoctors(arr));
	//O(N^2xM)
}
public static int countDoctors(int[][] arr) {
  
    int count = 0;

    
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

    return count;
}
}
