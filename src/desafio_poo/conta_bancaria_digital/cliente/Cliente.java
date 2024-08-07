package desafio_poo.conta_bancaria_digital.cliente;

public class Cliente {

  private String nome;
  private String cpf;
  
  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }
  
  public Cliente() {
    this.nome = null;
    this.cpf = null;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}