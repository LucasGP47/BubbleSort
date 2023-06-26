package metodosDeOrdernação;

public class bucketSort {
	
	public static void bucketSort(int[]array) {
		if(array.length <= 1) {
			return;
		}
		
		ListaEncadeada[] buckets = new ListaEncadeada[array.length];
		
		int maiorValor = array[0];
		for (int i: array) {
			if (i> maiorValor)
				maiorValor = i;
		}
		for (int i = 0; i <array.length; i++) {
			int indiceBucket = array[i] * array.length / (maiorValor + 1);
			if (buckets[indiceBucket] == null){
				buckets[indiceBucket] = new ListaEncadeada();
				buckets[indiceBucket].inserirOrdenado(array[i]);
			} else {
				buckets[indiceBucket].inserirOrdenado(array[i]);
			}
					
				}
			int index = 0;
			for (int i = 0; i <array.length; i++) {
			if (buckets[i] != null) {
				Nodo aux = buckets[i].getInicio();
				while (aux!=null) {
					array[index++] = aux.getDado();
					aux = aux.getProx();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {18,64,92,28,49,83,56,70,38,44};
		
		System.out.print("Array antes da ordenação: ");
		for (int num : array) {
			System.out.print(num + "; ");
		}
		
		bucketSort(array);
		
		System.out.print("\nArray após a ordenação: ");
		for (int num : array) {
			System.out.print(num + "; ");
		}
	}

}
