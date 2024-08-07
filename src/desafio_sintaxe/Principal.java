package desafio_sintaxe;

import java.util.Scanner;
public class Principal {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("=======================================");
    System.out.println("=== Bem Vindo ao seu banco favorito ===");
    System.out.println("=======================================\n");
    System.out.println("Estaremos criando sua conta\n");
    
    try {
      System.out.print("Insira o numero de sua conta (numero inteiro): ");
      int numero = entrada.nextInt();
      
      System.out.print("Insira a agencia de sua conta (texto): ");
      String agencia = entrada.next();
      
      System.out.print("Insira o seu nome (texto): ");
      String nome = entrada.next();
      System.out.print("Insira o saldo de sua conta: ");
      double saldo = entrada.nextDouble();
    
      ContaTerminal nova_conta = new ContaTerminal(numero, agencia, nome, saldo);
      nova_conta.adicionarCliente();
    } catch(Exception e) {
      System.out.print("Cuidado com os caracteres especiais!! Dica use virgula ao inves de ponto!!");
      System.exit(0);
    }
    entrada.close();
  }
}
