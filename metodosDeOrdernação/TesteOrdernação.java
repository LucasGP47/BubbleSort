package metodosDeOrderna��o;

public class TesteOrderna��o {

	public static void main(String[] args) {
		int[] array = {5,7,8,2,4,1,9,11};
		M�todosDeOrdena��o ordenar = new M�todosDeOrdena��o();
		
		if (ordenar.ordemCheck(array) == false) {
			System.out.println("Array n�o ordenado! Come�ando a ordernar!" + "\n");
			ordenar.bubbleSort(array);
		} else {
			System.out.println("Array ordenado!");
		}
			
		for (int num:array) {
			System.out.println(num);
		}
		
	}

}
