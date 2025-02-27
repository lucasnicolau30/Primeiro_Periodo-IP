import java.util.Scanner;

public class Media{

private float a , b , c;

public void setA(float a){
    this.a = a;
}

public float getA(){
    return this.a;
}

public void setB(float b){
    this.b = b;
}

public float getB(){
    return this.b;
}

public void setC(float c){
    this.c = c;
}

public float getC(){
    return this.c;
}	
	
public void descobre(){

float media;
media = ((this.getA() + this.getB() + this.getC()) / 3);	
	
if(media > 5){
	System.out.printf("Media: %.2f, ta aprovado meu peixe" , media);
}
if(media <= 5){
	System.out.printf("Media: %.2f, infelizmente ta reprovado" , media);
}	
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Media objeto = new Media();
float valorLeitura = input.nextFloat();
objeto.setA(valorLeitura);
float valorLeitura1 = input.nextFloat();
objeto.setB(valorLeitura1);
float valorLeitura2 = input.nextFloat();
objeto.setC(valorLeitura2);
objeto.descobre();
}
}