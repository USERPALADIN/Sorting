import sort.ArrayBubble;
import sort.MergeSort;
import sort.QuickSort;

import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		
//		ArrayBubble array = new ArrayBubble(5); //Создаем массив array на 5 элементов
//
//		array.into(163);       //заполняем массив
//		array.into(300);
//		array.into(184);
//		array.into(191);
//		array.into(174);
//
//		array.printer();            //выводим элементы до сортировки
//		array.bubbleSorter();       //ИСПОЛЬЗУЕМ ПУЗЫРЬКОВУЮ СОРТИРОВКУ
//		array.printer();
		
//		int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
//		int[] result =  MergeSort.mergesort(array1);;
//		System.out.println(Arrays.toString(result));
		
		int [] array1 = {9, 0, -2, 89, 1, 2, 3, -3, -99, 6};
		
		QuickSort.quicksort(array1, 0, array1.length);
		System.out.println(Arrays.toString(array1));
	}
}
