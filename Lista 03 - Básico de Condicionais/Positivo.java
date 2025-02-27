import java.util.Scanner;

public class Positivo{

private int a;

public void setA(int a){
    this.a = a;
}

public int getA(){
    return this.a;
}

public void descobre(){
if(this.getA() >= 0){
    System.out.println("Numero " + this.getA() + " eh super positivo");	
} 
    System.out.println("Exiting...");

}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Positivo objeto = new Positivo();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
objeto.descobre();
}
}