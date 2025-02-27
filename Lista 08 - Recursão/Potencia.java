import java.util.Scanner;

public class Potencia{
	
private int n;	
	
public void setN(int n){
	this.n = n;
}	
	
public int getN(){
	return this.n;
}	
	
public int pot(int n , int b){
		
if(b == 0){
	return 1;
}	

if(b == 1){
	return n;
}	
	
return n * pot(n , b - 1);
	
}
	
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	Potencia objeto = new Potencia();
	int valorLeitura = input.nextInt();
	objeto.setN(valorLeitura);
	int b = input.nextInt();
	objeto.pot(valorLeitura , b);
	System.out.println(objeto.pot(valorLeitura , b));
	}	
}
