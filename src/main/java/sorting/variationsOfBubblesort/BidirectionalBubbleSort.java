package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * This bubble sort variation has two internal iterations. In the first, it
 * pushes big elements to the right, like the normal bubble sort does. Then in
 * the second, iterates the array backwards, that is, from right to left, while
 * pushing small elements to the left. This process is repeated until the array
 * is sorted.
 */
public class BidirectionalBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(leftIndex < 0 || rightIndex > array.length) {return;} 

		
		int inicio = 0;
		int fim = array.length-1;
		
		while(inicio < fim) {
			boolean swapped = false;
			for(int i = inicio; i <= fim - 1; i++) {

                if(array[i].compareTo(array[i + 1]) > 0) {
                    Util.swap(array, i, i + 1);
					swapped = true;
                }
               

                }
				fim -= 1;
				
				if(!swapped) {return;}; 
				for(int j = fim; j > inicio; j--) {
					if(array[j].compareTo(array[j - 1]) < 0) {
						Util.swap(array, j, j - 1);
					}
					
				}
				inicio += 1;

		}
	}
}
