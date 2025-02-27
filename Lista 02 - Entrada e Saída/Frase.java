import java.util.Scanner;

public class Frase{

private String palavra1 , palavra2;

public void setPalavra1(String palavra1){
    this.palavra1 = palavra1;
}

public void setPalavra2(String palavra2){
    this.palavra2 = palavra2;
}

public String getPalavra1(){
    return this.palavra1;
}

public String getPalavra2(){
    return this.palavra2;
}

public void Concatenacao(){
String concatenacao;
concatenacao = (this.getPalavra1() + " " + this.getPalavra2());
System.out.println(concatenacao);
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Frase objeto = new Frase();

String valorLeitura = input.nextLine();
objeto.setPalavra1(valorLeitura);
String valorLeitura1 = input.nextLine();
objeto.setPalavra2(valorLeitura1);
objeto.Concatenacao();
}
}