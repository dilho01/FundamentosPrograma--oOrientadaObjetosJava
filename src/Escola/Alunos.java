package Escola;

public class Alunos {
    private String nome;
    private int idade;
      public  String getNome(){
        return nome;
      }
      public void getNome(String newNome){
         nome = newNome;
      }
      public int getIdade(){
        return idade;
      }
      public void getIdade(int newIdade){
    this.idade = newIdade;
      }
}
