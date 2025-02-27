import java.util.Scanner;

public class Aumento{

private float a , b;

public void setA(float a){
    this.a = a;
}

public void setB(float b){
    this.b = b;
}

public float getA(){
    return this.a;
}

public float getB(){
    return this.b;
}

public void resulato(){

float c;	
c = (this.getA() * (0.01f * this.getB()));
	
System.out.printf("O novo salario eh: %.2f" , (c + this.getA()));

}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Aumento objeto = new Aumento();
float valorLeitura = input.nextFloat();
objeto.setA(valorLeitura);
float valorLeitura1 = input.nextFloat();
objeto.setB(valorLeitura1);
objeto.resulato();
}
}


