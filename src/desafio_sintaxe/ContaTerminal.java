package desafio_sintaxe;

import java.util.ArrayList;
public class ContaTerminal {
  private int numero;
  private String agencia;
  private String nome;
  private double saldo;
  private static ArrayList<ContaTerminal> clientes = new ArrayList<>();
  
  public ContaTerminal(int numero, String agencia, String nome, double saldo) {
    this.numero = numero;
    this.agencia = agencia;
    this.nome = nome;
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  
  public void adicionarCliente() {
    informacaoCliente(this);
    clientes.add(this);
  }
  
  public static void removerCliente(ContaTerminal cliente) {
    clientes.remove(cliente);
  }
  
  public static void informacaoCliente(ContaTerminal cliente) {
    System.out.println("=======================================\n"
        + "Oi " + cliente.getNome() + ", obrigado por criar uma conta"
        + " em nosso banco!!\nSua agência: " + cliente.getAgencia() + "\nSua conta: " 
        + cliente.getNumero() + "\nSeu saldo: R$ " + cliente.getSaldo() + ", já está disponível para saque!!\n"
        + "=======================================");
  }
}
