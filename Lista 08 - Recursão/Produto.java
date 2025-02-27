import java.util.Scanner;

public class Produto{
	
private int n;	
	
public void setN(int n){
	this.n = n;
}	
	
public int getN(){
	return this.n;
}	
	
public int proRec(int n , int b){

if(n == 0){
	return 0;
}	
	
if(b == 0){
	return 0;
}	

if(b == 1){
	return n;
}	
	
if(n == 1){
	return b;
}	
	
return n + proRec(n , b - 1);
	
}
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	Produto objeto = new Produto();
	int valorLeitura = input.nextInt();
	objeto.setN(valorLeitura);
	int b = input.nextInt();
	objeto.proRec(valorLeitura , b);
	System.out.println(objeto.proRec(valorLeitura , b));
	}	
}