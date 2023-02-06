package br.com.academico.modelo;

import java.util.Calendar;

public class Aluno {
  private String cpf;
  private String nome;
  private int idade;
  private double altura;
  private Calendar insercao;
  
  public Aluno() { }
  
  public Aluno(String cpf, String nome, int idade, double altura, Calendar insercao) {
    setCpf(cpf);
    setNome(nome);
    setIdade(idade);
    setAltura(altura);
    setInsercao(insercao);
  }

  public String getCpf() {
    return cpf;
  }
  public String getNome() {
    return nome;
  }
  public int getIdade() {
    return idade;
  }
  public double getAltura() {
    return altura;
  }
  public Calendar getInsercao() {
    return insercao;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  public void setInsercao(Calendar insercao) {
    this.insercao = insercao;
  }
}
