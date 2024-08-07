package desafio_poo.conta_bancaria_digital.conta;

public interface IConta {
  void sacar_quantia(double valor) throws Exception ;
  
  void depositar_quantia(double valor);
  
  void transferir_quantia(double valor, int contaDestino) throws Exception;
  
  void imprimirInformacaoConta();
}
