import java.util.Scanner;

public class Impressao{

private String a;

public void setA(String a){
    this.a = a;
}

public String getA(){
    return this.a;
}

public void Imprimir(){
    System.out.println(this.getA());
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Impressao objeto = new Impressao();

String valorLeitura = input.nextLine();
objeto.setA(valorLeitura);
objeto.Imprimir();
}
}