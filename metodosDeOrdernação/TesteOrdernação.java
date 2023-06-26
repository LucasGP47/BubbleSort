package metodosDeOrdernação;

public class TesteOrdernação {

	public static void main(String[] args) {
		int[] array = {5,7,8,2,4,1,9,11};
		MétodosDeOrdenação ordenar = new MétodosDeOrdenação();
		
		if (ordenar.ordemCheck(array) == false) {
			System.out.println("Array não ordenado! Começando a ordernar!" + "\n");
			ordenar.bubbleSort(array);
		} else {
			System.out.println("Array ordenado!");
		}
			
		for (int num:array) {
			System.out.println(num);
		}
		
	}

}
