package ru.epam.jonline.module2.d1_array;

public class OneDimensionalArray {

//	В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

	public static void firstTask(int[] arr, int k) {
		System.out.println("Answer firstTask: ");
		printIntArray(arr);

		int sum = 0;
		for (int i : arr) {
			if (i % k == 0) {
				sum += i;
			}
		}

		System.out.printf("Сумма элементов кратных %d равна %d %n", k, sum);
	}

//	Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
//	Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен

	public static void secondTask(double[] arr, int z) {
		System.out.println("Answer secondTask: ");
		printDoubleArray(arr);

		System.out.println("для Z = " + z);

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				count++;
			}
		}

		printDoubleArray(arr);
		System.out.println("Количество замен: " + count);
	}

//    Дан массив действительных чисел, размерность которого N. 
//    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов

	public static void thirdTask(double[] arr) {
		System.out.println("Answer thirdTask: ");
		printDoubleArray(arr);

		int countZero = 0;
		int countNeg = 0;
		int countPos = 0;

		for (double i : arr) {
			if (i == 0) {
				countZero++;
			}
			if (i > 0) {
				countPos++;
			} else {
				countNeg++;
			}
		}

		System.out.printf("countZero = %d, countPos = %d, countNeg = %d %n", countZero, countPos, countNeg);
	}

//    Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

	public static void fourthTask(double[] arr) {
		System.out.println("Answer fourthTask: ");
		printDoubleArray(arr);

		double max = arr[0];
		double min = arr[0];
		int iMax = 0;
		int iMin = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				iMax = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				iMin = i;
			}
		}

		double p = arr[iMax];
		arr[iMax] = arr[iMin];
		arr[iMin] = p;

		printDoubleArray(arr);
	}

//    Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i

	public static void fifthTask(double[] arr) {
		System.out.println("Answer fifthTask: ");
		printDoubleArray(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

//    Задана последовательность N вещественных чисел. 
//    Вычислить сумму чисел, порядковые номера которых являются простыми числами

	public static void sixthTask(int[] arr) {
		System.out.println("Answer sixthTask: ");
		printIntArray(arr);

		boolean checkPrime = true;

		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					checkPrime = false;
					break;
				}
			}
			if (checkPrime) {
				System.out.print(arr[i] + " ");
			}
			checkPrime = true;
		}
		System.out.println();
	}

//    Даны действительные числа. Найти max(a1+a2n, a2+a2n-1)

	public static void seventhTask(double[] arr) {
		System.out.println("Answer seventhTask: ");
		printDoubleArray(arr);

		double max = arr[0] + arr[arr.length - 1];
		double p = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			p = arr[i] + arr[arr.length - 1 - i];
			if (max < p) {
				max = p;
			}
		}

		System.out.println("Max sum: " + max);
	}

//    Дана последовательность целых чисел. Образовать новую последовательность, 
//    выбросив из исходной те члены, которые равны min

	public static void eighthTask(double[] arr) {
		System.out.println("Answer eighthTask: ");
		printDoubleArray(arr);

		int count = 1;
		double min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (min == arr[i]) {
				count++;
			}
			if (min > arr[i]) {
				min = arr[i];
				count = 1;
			}
		}

		double[] newArr = new double[arr.length - count];
		int j = 0;

		for (double i : arr) {
			if (i != min) {
				newArr[j++] = i;
			}
		}

		printDoubleArray(newArr);
	}

//    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
//    Если таких чисел несколько, то определить наименьшее из них

	public static void ninthTask(double[] arr) {
		System.out.println("Answer ninthTask: ");
		printDoubleArray(arr);

		double result = arr[0];
		int maxCount = 0;
		int count;

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				result = arr[i];
			}
			if (count == maxCount) {
				if (result > arr[i]) {
					result = arr[i];
				}
			}
		}

		System.out.println("Наиболее часто встречающееся число: " + result);
	}

//    Дан целочисленный массив с количеством элементов п. 
//    Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
//    Примечание. Дополнительный массив не использовать

	public static void tenthTask(int[] arr) {
		System.out.println("Answer tenthTask: ");
		printIntArray(arr);

		int j = 1;

		for (int i = 1; i < (arr.length + 1) / 2; i++) {
			arr[i] = arr[i + j];
			j++;
		}

		for (int i = arr.length - 1; i >= (arr.length + 1) / 2; i--) {
			arr[i] = 0;
		}

		printIntArray(arr);
	}

	/*-------------------------------*/

	private static void printIntArray(int[] arr) {
		for (int elem : arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}

	private static void printDoubleArray(double[] arr) {
		for (double elem : arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
}
