package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(array.length == 1 && leftIndex >= 0 || rightIndex <= array.length || leftIndex <= rightIndex) {
			recursiveSelectionSort(array, leftIndex, rightIndex);
		}
	}

	private void recursiveSelectionSort(T[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			int minIndex = findMinIndex(array, leftIndex, rightIndex, leftIndex);
			Util.swap(array, leftIndex, minIndex);
			recursiveSelectionSort(array, leftIndex + 1, rightIndex);
		}
	}

	private int findMinIndex(T[] array, int currentIndex, int rightIndex, int minIndex) {
		if(currentIndex > rightIndex) {
			return minIndex;
		}
		if(array[currentIndex].compareTo(array[minIndex]) < 0) {
			minIndex = currentIndex;
		}

		return findMinIndex(array, currentIndex + 1, rightIndex, minIndex);
	}

}
