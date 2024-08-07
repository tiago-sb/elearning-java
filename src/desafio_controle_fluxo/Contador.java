package desafio_controle_fluxo;

import java.util.Scanner;

public class Contador {
  static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if(parametroUm > parametroDois) {
      throw new ParametrosInvalidosException("Erro!! numero 01 é maior que o numero 02");
    }
    
    int contagem = parametroDois - parametroUm;
    
    for(int indice = 1; indice <= contagem; indice++) {
      System.out.println("Imprimindo o número " + indice);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    
    System.out.println("fim da iteração.");
  }
  
  public static void main(String[] args) throws Exception {
    Scanner terminal = new Scanner(System.in);
      
    System.out.print("Digite o primeiro parâmetro: ");
    int primeiro_paramento = terminal.nextInt();
    
    System.out.print("Digite o segundo parâmetro: ");
    int segundo_paramentro = terminal.nextInt();
    
    contar(primeiro_paramento, segundo_paramentro);
    
    terminal.close();
  }
}