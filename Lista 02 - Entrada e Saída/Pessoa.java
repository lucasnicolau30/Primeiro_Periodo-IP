import java.util.Scanner;

public class Pessoa{

private String nome;
private int idade;

public void setNome(String nome){
    this.nome = nome;
}

public void setIdade(int idade){
    this.idade = idade;
}

public String getNome(){
    return this.nome;
}

public int getIdade(){
    return this.idade;
}

public void pessoa(){

System.out.println("Nome: " + this.getNome());
System.out.println("Idade: " + (2021 - this.getIdade()));
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Pessoa objeto = new Pessoa();

String valorLeitura = input.nextLine();
objeto.setNome(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setIdade(valorLeitura1);
objeto.pessoa();
}
}