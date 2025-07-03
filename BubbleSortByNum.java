package sorting;

import java.util.Arrays;

public class BubbleSortByNum {

	public static void main(String[] args) {
		int[] numAry = {15, 8, 5, 20, 25};
		int temp;
		
		for(int i = 4; i >= 1; i--)
			for(int j = 0; j < i; j++)
				if(numAry[j] > numAry[j+1]) {
					temp = numAry[j];
					numAry[j] = numAry[j+1];
					numAry[j+1]  = temp;
				}
		System.out.println(Arrays.toString(numAry));
	}

}
