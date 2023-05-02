package cm4dataStructure;

import java.util.Calendar;
import java.util.Arrays;

public class big0 {
public static void main(String[] args) {
	int size= 110000;
	int[] arr= new int[size];
	for (int i=0; i<arr.length;i++)
		arr[i]=i;
	
	long startTime=Calendar.getInstance().getTimeInMillis();
	sortARR(arr);
	long endTime=Calendar.getInstance().getTimeInMillis();
	System.out.println("took" +(endTime-startTime)+"mill");


}

public static int sortARR(int[] arr) {
	
	int temp=arr[0];
	for(int i=0; i<arr.length;i++) {
	  if (arr[i]<=temp)
	  {
		temp=arr[i];
		}
	 
	}
	
	 return temp;
}
}
