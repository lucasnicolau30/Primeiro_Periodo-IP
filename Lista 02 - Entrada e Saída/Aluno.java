import java.util.Scanner;

public class Aluno{

private String nome;
private int nota;

public void setNome(String nome){
    this.nome = nome;
}

public void setNota(int nota){
    this.nota = nota;
}

public String getNome(){
    return this.nome;
}

public int getNota(){
    return this.nota;
}

public void Info(){

System.out.println(this.getNome());
System.out.println(this.getNota());
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Aluno objeto = new Aluno();

String valorLeitura = input.nextLine();
objeto.setNome(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setNota(valorLeitura1);
objeto.Info();
}
}