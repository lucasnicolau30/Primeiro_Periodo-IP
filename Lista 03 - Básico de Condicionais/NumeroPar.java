import java.util.Scanner;

public class NumeroPar{

private int a;

public void setA(int a){
    this.a = a;
}

public int getA(){
    return this.a;
}

public void descobre(){
if(this.getA() %2 == 0){
    System.out.println("Numero " + this.getA() + " eh par");
}
	System.out.println("F1m d0 Program4");	
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
NumeroPar objeto = new NumeroPar();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
objeto.descobre();
}
}