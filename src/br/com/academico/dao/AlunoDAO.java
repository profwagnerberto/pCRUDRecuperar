package br.com.academico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.academico.jdbc.FabricaDeConexoes;
import br.com.academico.modelo.Aluno;

public class AlunoDAO {
  public void criar(Aluno pAluno) throws Exception {
    Connection con = FabricaDeConexoes.pegarConexao();

    String sql = "insert into tbaluno " + "(cpf, nome, idade, altura) " + "values (?, ?, ?, ?)";

    PreparedStatement stmt = con.prepareStatement(sql);

    stmt.setString(1, pAluno.getCpf());
    stmt.setString(2, pAluno.getNome());
    stmt.setInt(3, pAluno.getIdade());
    stmt.setDouble(4, pAluno.getAltura());
    stmt.execute();
  }

  public ArrayList<Aluno> recuperarTodos() throws Exception {
    Connection con = FabricaDeConexoes.pegarConexao();

    String sql = "select cpf, nome, idade, altura " 
             + "  from tbaluno";

    PreparedStatement stmt = con.prepareStatement(sql);
    ResultSet rs = stmt.executeQuery();

    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    while (rs.next()) {
      Aluno aluno = new Aluno();
      aluno.setCpf(rs.getString("cpf"));
      aluno.setNome(rs.getString("nome"));
      aluno.setIdade(rs.getInt("idade"));
      aluno.setAltura(rs.getDouble("altura"));

      alunos.add(aluno);
    }

    FabricaDeConexoes.encerrarRecursosBD(con, stmt, rs);

    return alunos;
  }
}
