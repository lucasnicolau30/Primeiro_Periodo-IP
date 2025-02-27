import java.util.Scanner;

public class Triangulo{
	
private int n;	
	
public void setN(int n){
	this.n = n;
}	
	
public int getN(){
	return this.n;
}

public int contaBlocos(int soma , int interacao){
	
if(interacao == 1){
	return soma;
}	
if(interacao == 0){
	return 0;
}	
	
return soma + contaBlocos(soma + 1 , interacao - 1);	
	
}	

public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	Triangulo objeto = new Triangulo();
	int valorLeitura = input.nextInt();
	objeto.setN(valorLeitura);
	int soma = 1;
	objeto.contaBlocos(soma , valorLeitura);
	System.out.println(objeto.contaBlocos(soma , valorLeitura));
	}
}