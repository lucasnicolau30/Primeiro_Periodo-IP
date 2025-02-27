import java.util.Scanner;

public class Operacoes{

private int a , b , c , d;

public void setA(int a){
    this.a = a;
}

public void setB(int b){
    this.b = b;
}

public void setC(int c){
    this.c = c;
}

public void setD(int d){
    this.d = d;
}

public int getA(){
    return this.a;
}

public int getB(){
    return this.b;
}

public int getC(){
    return this.c;
}

public int getD(){
    return this.d;
}

public void Resultado(){

int mutiplicacao , subtracao , resultado;
mutiplicacao = this.getA() * this.getB();
subtracao = this.getC() - this.getD();
resultado = mutiplicacao + subtracao;
System.out.println(resultado);
}

public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    Operacoes objeto = new Operacoes();
    int valorLeitura = input.nextInt();
    objeto.setA(valorLeitura);
    int valorLeitura1 = input.nextInt();
    objeto.setB(valorLeitura1);
    int valorLeitura2 = input.nextInt();
    objeto.setC(valorLeitura2);
    int valorLeitura3 = input.nextInt();
    objeto.setD(valorLeitura3);
    objeto.Resultado();
}
}




