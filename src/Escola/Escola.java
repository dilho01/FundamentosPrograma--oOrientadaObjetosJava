package Escola;

public class Escola {
    public static void main(String[] args) {
        Alunos felipe = new Alunos();
		felipe.getNome("Felipe");    
		felipe.getIdade(8);
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
    }
}
