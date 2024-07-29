package sorting.simpleSorting;

import sorting.AbstractSorting;


/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(leftIndex < 0 || rightIndex > array.length) return;

		for (int i = 1; i < array.length; i++) {

			T value = array[i];
			int j = i;

			while(j > 0 && value.compareTo(array[j - 1]) < 0) {
				value = array[j];
				array[j] = array[j - 1];
				array[j - 1] = value;
				j -= 1;
			}
		}
	}
}
