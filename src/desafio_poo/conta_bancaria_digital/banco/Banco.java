package desafio_poo.conta_bancaria_digital.banco;

import java.util.ArrayList;

import desafio_poo.conta_bancaria_digital.conta.Conta;

public class Banco {

  private String nome;
  private static ArrayList<Conta> contas = new ArrayList<>();

  public Banco() {}
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void getContas() {
    for(Conta conta: contas) {
      conta.imprimirInformacaoConta();
     }
  }

  public static void setContas(ArrayList<Conta> contas_01) {
    contas = contas_01;
  }
  
  public void adicionarConta(Conta cliente) {
    contas.add(cliente);
  }

  public static void deposito(double valor, int contaDestino) {
    for(Conta conta : contas) {
      if(conta.getNumero() == contaDestino){
        conta.depositar_quantia(valor);
        System.out.println("Valor Depositado na Conta " + conta.getNumero());
        return;
      }
    }
    System.out.println("conta nao encontrada!!");
  }
  
  
}