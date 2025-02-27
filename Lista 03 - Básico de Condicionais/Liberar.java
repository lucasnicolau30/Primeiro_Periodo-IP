import java.util.Scanner;

public class Liberar{

private String nome;

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

public void acesso(){

String c = "admin";

if(this.getNome().equals(c)){
    System.out.println("$$$ Acesso Liberado, chave: {admin} $$$");
}
	System.out.println("Fim do programa");

}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Liberar objeto = new Liberar();

String valorLeitura = input.nextLine();
objeto.setNome(valorLeitura);
objeto.acesso();
}
}