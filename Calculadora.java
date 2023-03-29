import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double a, b, potEntera ;
		double  potencia ;
		System.out.println("introduce a y b");
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introuduce el primer valor");
		a=teclado.nextInt();
		System.out.println("Introuduce el segundo valor");
		b=teclado.nextInt();
		double s=suma(a,b);
		double r=resta(a,b);
		double p=prod(a,b);
		double d=divEntera(a,b);
		double re=resto(a,b);
		double f=factorial(a);
		potencia=Math.pow(a, b);
		System.out.println("suma="+s);
		System.out.println("resta="+r);
		System.out.println("producto="+p);
		System.out.println("cociente division entera="+d+" y resto="+re);
		System.out.println("Potencia de a elevado a b="+potencia);
		System.out.println("Factorial de a="+f);	
	}
	
	static double suma (double a, double b) {
		double sum=a+b;
		return sum;
	}
	
	static double resta (double a, double b) {
		double resta=a-b;
		return resta;
	}
	
	static double prod (double a, double b) {
		double prod=a*b;
		return prod;
	}
	
	static double divEntera (double a, double b) {
		double div=a/b;
		return div;
	}
	
	static double resto (double a, double b) {
		double rest=a%b;
		return rest;
	}
	

	static double factorial (double a){
		double fact=1;
		for (int i=1; i<=a; i++)
			fact*=i;
		return fact;
	}

	static double power (double a, double b) {
		double aux=1;
		for (int i=0; i<b; i++) {
			aux=aux*a;
		}
		return aux;
	}
	
	void clear (){
		int a=0;
		int b=0;
	}
	
}