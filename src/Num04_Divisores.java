import java.util.Scanner;
class NumCocientes{
	
	public static void numeros(int n,int n2,int num,int x) {
		int total=1;
		double cociente=0.0;
		if(num==n) {
			x++;
			System.out.println(x);
		}else{
			cociente=n2/num;
			if(n2%num==0) {
				x++;
				numeros(n, n2, num-1,x);
			}else {
				numeros(n, n2, num-1,x);
			}
		}
		
	}
}
public class Num04_Divisores {

	public static void main(String[] args) {
		System.out.println("Cuantos son los divisores enteros entre dos números dados");
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el primer valor ");
		int num1=entrada.nextInt();
		System.out.println("Ingrese el segundo  valor");
		int num2=entrada.nextInt();
		
		NumCocientes.numeros(num1, num2, num2,0);
		

	}

}
