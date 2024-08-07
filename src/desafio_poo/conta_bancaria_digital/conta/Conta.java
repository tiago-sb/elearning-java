package desafio_poo.conta_bancaria_digital.conta;

import desafio_poo.conta_bancaria_digital.banco.Banco;
import desafio_poo.conta_bancaria_digital.cliente.Cliente;

public abstract class Conta implements IConta {
  private static final int AGENCIA_PADRAO = 1;
  private int agencia;
  private int numero;
  private double saldo;
  private Cliente cliente;

  public Conta(Cliente cliente, int numero) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = numero;
    this.cliente = cliente;
  }

  public void sacar_quantia(double valor) throws Exception {
    if(valor > saldo) {
      throw new Exception("Erro!! valor maior que o saldo da conta");
    }
    
    this.saldo = this.saldo - valor;
    System.out.println("Saldo atual depois do saque " + getSaldo());
  }

  public void depositar_quantia(double valor) {
    saldo = saldo + valor;
  }

  public void transferir_quantia(double valor, int contaDestino) throws Exception {
      this.sacar_quantia(valor);
      Banco.deposito(valor, contaDestino);
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void imprimirInformacaoConta() {
    System.out.println("Titular: " + this.cliente.getNome());
    System.out.println("Agencia: " + this.agencia);
    System.out.println("Numero: " + this.numero);
    System.out.printf("Saldo: R$ %.2f\n", this.saldo);
  }
}