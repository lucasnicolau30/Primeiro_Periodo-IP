import java.util.Scanner;

public class Valor{
	
private int n;	
	
public void setN(int n){
	this.n = n;
}	
	
public int getN(){
	return this.n;
}	

public void Metodo(){

float fatorial , resultado;
fatorial = 1.0f;
resultado = 1.0f;
	
for(int i = 1 ; i <= this.getN() ; i++){
	
	fatorial = (fatorial * i);
	resultado += 1/fatorial;
	
	}	

System.out.printf("Valor de E: %.8f" , resultado);
	
}
		
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
Valor objeto = new Valor();	
int valorLeitura = input.nextInt();	
objeto.setN(valorLeitura);	
objeto.Metodo();		
}	
	}

