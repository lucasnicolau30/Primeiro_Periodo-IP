import java.util.Scanner;

public class Bissexto{

private int a;

public void setA(int a){
    this.a = a;
}

public int getA(){
    return this.a;
}

public void descobre(){
if(this.getA() % 400 == 0){
    System.out.println("Esse ano promete!! uhuuu");	
}if(this.getA() % 4 == 0 ){
	if(this.getA() % 100 != 0)	
   System.out.println("Esse ano promete!! uhuuu");
}else{
	System.out.println("Nao vai ser esse ano meu nobre :(");	
}	
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Bissexto objeto = new Bissexto();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
objeto.descobre();
}
}