import java.util.Scanner;

public class Negativo{

private int a;

public void setA(int a){
    this.a = a;
}

public int getA(){
    return this.a;
}

public void descobre(){
if(this.getA() <= 0){
    System.out.println("Numero " + this.getA() + " nao eh super positivo");	
} 
    System.out.println("Exiting...");

}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Negativo objeto = new Negativo();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
objeto.descobre();
}
}