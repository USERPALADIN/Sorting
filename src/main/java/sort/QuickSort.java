package sort;

public class QuickSort {
	
	/**
	 * Реализуем алгоритм быстрой сортировки
	 * @param array1 Массив, в котором нужно упорядочить элементы.
	 * @param startIndex Начальный индекс в массиве (включая).
	 * @param endIndex Конечный индекс в массиве (не включая)
	 */
	public static void quicksort(int[] array1, int startIndex, int endIndex) {
		int pivotValue = getPivot(array1, startIndex, endIndex);
		int currentStartIndex = startIndex;
		int currentEndIndex = endIndex - 1;
		
		while (currentStartIndex < currentEndIndex) {
			while (array1[currentStartIndex] < pivotValue) currentStartIndex++;
			while (array1[currentEndIndex] > pivotValue) currentEndIndex--;
			if (currentStartIndex < currentEndIndex) {
				int buffer = array1[currentStartIndex];
				array1[currentStartIndex] = array1[currentEndIndex];
				array1[currentEndIndex] = buffer;
			}
		}
		if (currentStartIndex > startIndex) quicksort(
				array1, startIndex, currentStartIndex);
		if (endIndex > currentStartIndex + 1) quicksort(
				array1, currentStartIndex + 1, endIndex);
	}
	
	
	/**
	 *
	 * @param array1
	 * @param lowIndex
	 * @param highIndex
	 * @return Значение опорного элемента. В этой реализации опорный элемент -
	 *  это последний элемент в массиве.
	 */
	public static int getPivot(int[] array1, int startIndex, int endIndex) {
		return array1[endIndex - 1];
	}
}
