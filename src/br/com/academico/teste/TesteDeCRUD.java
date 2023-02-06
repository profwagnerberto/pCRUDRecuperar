package br.com.academico.teste;

import java.util.ArrayList;

import br.com.academico.dao.AlunoDAO;
import br.com.academico.modelo.Aluno;

public class TesteDeCRUD {

  public static void main(String[] args) throws Exception {
    try {
      Aluno aluno1 = new Aluno();

      aluno1.setCpf("1");
      aluno1.setNome("Henzo");
      aluno1.setIdade(20);
      aluno1.setAltura(1.81);

      System.out.println("Aluno criado e preenchido");

      AlunoDAO alunoDAO1 = new AlunoDAO();
      alunoDAO1.criar(aluno1);
      System.out.println("Inserido por objeto");
      
      ArrayList<Aluno> alunos = alunoDAO1.recuperarTodos();
      
      System.out.printf("CPF         | NOME            | IDADE | ALTURA\n");
      System.out.printf("==============================================\n");
      for (Aluno auxiliar : alunos)
        System.out.printf("%-11s | %-15s | %5d | %6.2f\n",
            auxiliar.getCpf(),
            auxiliar.getNome(),
            auxiliar.getIdade(),
            auxiliar.getAltura());
    } catch (Exception e) {
      System.err.println("Erro no banco de dados: " + "\n" + 
          e.getMessage() + "\n" + 
          e.getClass());
//    e.printStackTrace();
    }
  }
}
