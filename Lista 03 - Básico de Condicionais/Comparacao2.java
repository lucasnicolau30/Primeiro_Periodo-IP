import java.util.Scanner;

public class Comparacao2{

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
System.out.println("Numero " + this.getB() + " eh inferior ao numero " + this.getA());
}  else if(this.getB() > this.getA()){
System.out.println("Numero " + this.getA() + " eh inferior ao numero " + this.getB());
}
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Comparacao2 objeto = new Comparacao2();

int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setB(valorLeitura1);
objeto.comparacao();
}
}