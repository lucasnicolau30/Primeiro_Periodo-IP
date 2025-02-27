import java.util.Scanner;

public class Numero{

private int a;

public void setA(int a){
    this.a = a;
}

public int getA(){
    return this.a;
}

public void Antecessor(){
    int ant;
    ant = (this.getA() - 1);
    System.out.println("Antecessor: " + ant);
}

public void Sucessor(){
    int suc;
    suc = (this.getA() + 1);
    System.out.println("Sucessor: " + suc);
}

public void numero(){
    System.out.println("Numero: " + this.getA());
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Numero objeto = new Numero();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
objeto.numero();
objeto.Antecessor();
objeto.Sucessor();
}
}
