import java.util.Scanner;

public class Troca{

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

public void troca(){

System.out.println("A: " + this.getB());
System.out.println("B: " + this.getA());
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Troca objeto = new Troca();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setB(valorLeitura1);
objeto.troca();
}
}