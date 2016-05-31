Scanner;
public class Calc {
	/*Declaração dos métodos*/
	public int som(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2){
		return num1 - num2;
	}
	public int div(int num1,int num2){
		return num1 / num2;
	}
	public int mult(int num1, int num2){
		return num1 - num2;
	}
	


public static void main (String args[]){
		//criando um objeto c a apartir do metodo calc
		Calc c = new Calc();
		//declarando as varíaveis

int opcao = 5;



		int num1;
		int num2;
	      Scanner input = new Scanner(System.in);  
		System.out.println("-Escolha uma opção-");
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtracao");  
- [ ] 	    System.out.println("3. Multiplicacao");  
