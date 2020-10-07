import java.util.Scanner;
class MostrarCocientesEnteros{
	public static void mostrarCocientes(int n,int n2,int x) {
		
		if(n>1) {
			if(n%x==0) {
				System.out.println(x);
				mostrarCocientes(n,n2, x+1);
			}else if((x+1)<=n){
				mostrarCocientes(n,n2, x+1);
			}
			if(n==1) {
				System.out.println(n);
			}
		}
		
		
		if(n2>1) {
			System.out.println("Divisores de: "+n2);
			if(n%x==0) {
				System.out.println(x);
				mostrarCocientes(n, n2, x+1);
			}else {
				mostrarCocientes(n, n2, x+1);
			}
			if(n==1) {
				System.out.println(n);
			}
		}
		
	}
}

public class Num03_Cocientes {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Imgrese el primer valo");
		int num1=entrada.nextInt();
		System.out.println("Imgrese el primer valo");
		int num2=entrada.nextInt();
		MostrarCocientesEnteros.mostrarCocientes(num1, num2, 2);
	}

}
