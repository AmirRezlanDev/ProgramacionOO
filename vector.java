package arreglo;

public class vector {
	
	static void vectorAlAzar() {
		int[] array = new int[10];
		for(int i=0; i<10; i++) {
			array[i] = (int)(Math.random()*10)+1;
			
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		vectorAlAzar();

	}

}
