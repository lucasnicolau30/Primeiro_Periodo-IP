import java.util.Scanner;

public class Fibonacci{
	
private int n;	
	
public void setN(int n){
	this.n = n;
}	
	
public int getN(){
	return this.n;
}	
	
public int fibo(int n){
	
if(n == 0){
	return 0;
}	
if(n == 1){
	return 1;
}	

return fibo(n - 1) + fibo(n - 2);
	
}
	
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	Fibonacci objeto = new Fibonacci();
	int valorLeitura = input.nextInt();
	objeto.setN(valorLeitura);
	objeto.fibo(valorLeitura);
	System.out.println(objeto.fibo(valorLeitura));
	}	
}