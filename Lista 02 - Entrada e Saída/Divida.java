import java.util.Scanner;

public class Divida{

private int b;
private float a , c;

public void setA(float a){
    this.a = a;
}

public void setB(int b){
    this.b = b;
}

public void setC(float c){
    this.c = c;
}

public float getA(){
    return this.a;
}

public int getB(){
    return  this.b;
}

public float getC(){
    return this.c;
}

public void calcular(){

float d;
d = ((this.getB() * this.getC()) + this.getA());
System.out.printf("O valor da sua divida atual eh:  %.2f" , d); 
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Divida objeto = new Divida();

float valorLeitura = input.nextFloat();
objeto.setA(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setB(valorLeitura1);
float valorLeitura2 = input.nextFloat();
objeto.setC(valorLeitura2);
objeto.calcular();
}
}