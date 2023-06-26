package metodosDeOrdernação;

public class MétodosDeOrdenação {
	
	public int[] bubbleSort(int array[]) {
	int temp = 0;
	for (int i = 0; i<array.length; i++) {
		for (int j = 0;j < array.length - i - 1; j++) {
			
			if (array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				}
			}
		}
	return array;
	}
	
	public boolean ordemCheck(int array[]) {		
		for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] > array[i+1]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public int[] selectionSort(int array[]) {
		int min, temp;
		for (int i = 0; i < array.length -1; i++) {
			min = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}								
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;		
		}
		return array;
	}
	
	public int[] insertionSort (int array[]) {
		int pivo, j;
		for (int i=0; i < array.length; i++) {
			pivo = array[i];
			j=i-1;
			while (j >=0 && array[j] > pivo) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j+1] = pivo;
		}
		return array;
	}

	

}
