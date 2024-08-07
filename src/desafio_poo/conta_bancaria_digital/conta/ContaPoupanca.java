package desafio_poo.conta_bancaria_digital.conta;

import desafio_poo.conta_bancaria_digital.cliente.Cliente;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(Cliente cliente, int numero) {
    super(cliente, numero);
  }

  @Override
  public void sacar_quantia(double valor) throws Exception {
    System.out.println("=== Sacando Valor da Conta Poupança ===");
    super.sacar_quantia(valor);
  }

  @Override
  public void depositar_quantia(double valor) {
    super.depositar_quantia(valor);
  }

  @Override
  public void transferir_quantia(double valor, int contaDestino) throws Exception {
    super.transferir_quantia(valor, contaDestino);
  }
  
  @Override
  public void imprimirInformacaoConta() {
    System.out.println("=== Informacoes da Conta Poupança ===");
    super.imprimirInformacaoConta();
  }
}