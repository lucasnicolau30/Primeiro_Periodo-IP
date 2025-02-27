import java.util.Scanner;

public class Comparacao{

private int a , b; 

public void setA(int a){
    this.a = a;
}

public void setB(int b){
    this.b = b;
}

public int getA(){
    return this.a;
}

public int getB(){
    return this.b;
}

public void comparacao(){

if(this.getA() > this.getB()){
System.out.println("Numero " + this.getB() + " eh menor que " + this.getA());
}  else if(this.getB() > this.getA()){
System.out.println("Numero " + this.getA() + "eh menor que " + this.getB());
}
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Comparacao objeto = new Comparacao();

int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setB(valorLeitura1);
objeto.comparacao();
}
}