import java.util.Scanner;
class MostrarCocientesEnteros{
	public static void mostrarCocientes(int n,int n2,int num) {
		double cociente=0.0;
		if(num>=n) {
			cociente=n2/num;
			if(n2%num==0) {
				System.out.println(cociente);
				mostrarCocientes(n, n2, num-1);
			}else {
				mostrarCocientes(n, n2, num-1);
			}
		}else if(num<=n) {
			System.out.println(n2);
		}
	}
}

public class Num03_Cocientes {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Imgrese el primer valor ");
		int num1=entrada.nextInt();
		System.out.println("Imgrese el segundo  valor");
		int num2=entrada.nextInt();
		
		MostrarCocientesEnteros.mostrarCocientes(num1, num2,num2);
	}

}
