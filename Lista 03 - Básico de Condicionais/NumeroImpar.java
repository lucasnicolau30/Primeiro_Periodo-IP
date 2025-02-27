import java.util.Scanner;

public class NumeroImpar{

private int a;

public void setA(int a){
    this.a = a;
}

public int getA(){
    return this.a;
}

public void descobre(){
if(this.getA() %2 != 0){
    System.out.println("Numero " + this.getA() + " nao eh par");	
} 
    System.out.println("F1m d0 Pr0gr4m4");

}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
NumeroImpar objeto = new NumeroImpar();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
objeto.descobre();
}
}