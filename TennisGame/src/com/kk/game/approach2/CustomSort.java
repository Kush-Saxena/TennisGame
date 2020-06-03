package com.kk.game.approach2;

public class CustomSort {

	static void sort(int[] inputArray, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int mid = (startIndex + endIndex) / 2;
			sort(inputArray, startIndex, mid);
			sort(inputArray, mid + 1, endIndex);

			merger(inputArray, startIndex, mid, endIndex);

		}
	}

	static void merger(int[] arr, int startIndex, int midIndex, int endIndex) {

		int n1 = midIndex - startIndex + 1;
		int n2 = endIndex - midIndex;

		int Left[] = new int[n1];
		int Right[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; i++)
			Left[i] = arr[startIndex + i];

		for (int i = 0; i < n2; i++)
			Right[i] = arr[midIndex + 1 + i];

		/* Merge the temp arrays */

		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = startIndex;

		while (i < n1 && j < n2) {
			if (Winner2.winningScore[Left[i]][Right[j]] == 1) {
				arr[k] = Left[i];
				i++;
			} else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = Left[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = Right[j];
			j++;
			k++;
		}

	}

}
