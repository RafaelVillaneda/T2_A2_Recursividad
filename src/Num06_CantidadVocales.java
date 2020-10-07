import java.util.Scanner;
class ConteoVocales {
	public static int cantidadVocales(String fra,int i,int suma) {
		boolean existenciapoci=true;
		char poci =' ';
		int s = 0;
		try {
			poci=fra.charAt(i);
			existenciapoci=true; 		
		}catch (IndexOutOfBoundsException e) {
			existenciapoci=false;
		}
		if(existenciapoci==true) {
			if(poci=='A'|| poci=='E'||poci=='I'||poci=='O'||poci=='U') {
				System.out.println(poci);
				suma++;
				System.out.println(suma);
				s=suma;
				cantidadVocales(fra, i+1,suma);
				return s;
			}else {
				cantidadVocales(fra, i+1,suma);
			}
			
		}else if(existenciapoci==false) {
			return s;
		}
		return s;
	}//calse
}
public class Num06_CantidadVocales {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa la frase que deseas saber su numro de vocales: ");
		String frase=entrada.nextLine().toUpperCase();
		System.out.println("La cantidad de vocales es de: "+ConteoVocales.cantidadVocales(frase,0,0));
	}

}
