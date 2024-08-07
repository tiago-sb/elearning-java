package desafio_poo.conta_bancaria_digital;

import desafio_poo.conta_bancaria_digital.banco.Banco;
import desafio_poo.conta_bancaria_digital.cliente.Cliente;
import desafio_poo.conta_bancaria_digital.conta.Conta;
import desafio_poo.conta_bancaria_digital.conta.ContaCorrente;
import desafio_poo.conta_bancaria_digital.conta.ContaPoupanca;
public class Principal {

  public static void main(String[] args) throws Exception {
    Banco banco_central = new Banco();
    
    // clientes
    Cliente tiago_bela = new Cliente("tiago", "999.999.999.99");
    Cliente valter_souza = new Cliente("valter", "888.888.888.88");
    Cliente flavio_silva = new Cliente("flavio", "777.777.777.77");
    Cliente daniela_moura = new Cliente("daniela", "666.666.666.66");
    Cliente cleber_machado = new Cliente("cleber", "555.555.555.55");
    
    // criacao das contas
    Conta tiago_bela_conta_poupanca = new ContaPoupanca(tiago_bela, 1001);
    banco_central.adicionarConta(tiago_bela_conta_poupanca);
    Conta valter_souza_conta_corrente = new ContaCorrente(valter_souza, 1002);
    banco_central.adicionarConta(valter_souza_conta_corrente);
    Conta flavio_silva_conta_poupanca = new ContaPoupanca(flavio_silva, 1003);
    banco_central.adicionarConta(flavio_silva_conta_poupanca);
    Conta daniela_moura_conta_corrente = new ContaCorrente(daniela_moura, 1004);
    banco_central.adicionarConta(daniela_moura_conta_corrente);
    Conta cleber_machado_conta_corrente = new ContaCorrente(cleber_machado, 1005);
    banco_central.adicionarConta(cleber_machado_conta_corrente);

    // deposito 
    cleber_machado_conta_corrente.depositar_quantia(800);
    daniela_moura_conta_corrente.depositar_quantia(1000);
    valter_souza_conta_corrente.depositar_quantia(5000);
    
    System.out.println();
    
    // saque
    cleber_machado_conta_corrente.sacar_quantia(300);
    
    System.out.println();
    
    // deposito
    valter_souza_conta_corrente.transferir_quantia(1000, 1004);
    
    System.out.println();
    
    daniela_moura_conta_corrente.transferir_quantia(800, 1001);
    
    System.out.println();
    
    // impressao das contas
    banco_central.getContas();
  }
}
