package desafio_poo.modelagem_iphone;

import java.util.Scanner;
public class Principal {
  static Scanner scan = new Scanner(System.in);
 
  public static int menu_sistema() {
    System.out.println("=== Escolha um app ===");
    System.out.println("1. Spotfy");
    System.out.println("2. Teleforne(chamadas)");
    System.out.println("3. Safari");
    System.out.println("0. Desligar");
    System.out.print("Digite o numero escolhido: ");
    int escolha = scan.nextInt();
    return escolha;
  }
  public static void main(String[] args) {
    
    System.out.println("=======================================");
    System.out.println("=== Bem Vindo(a) ao seu novo iphone ===");
    System.out.println("=======================================");
    
    while(true) {
      switch (menu_sistema()) {
        case 1: {
          ReprodutorMusical spotify = new ReprodutorMusical();
          spotify.iniciar();
          break;
        }
        case 2: {
          AparelhoTelefonico telefone = new AparelhoTelefonico("99 99999 9999");
          telefone.iniciar();
          break;
        }
        case 3: {
          NavegadorInternet safari = new NavegadorInternet("dio.com");
          safari.atualizarPagina();
          System.out.println(safari.exibirPagina(safari.getUrl()));
          break;
        }
        case 0: {
          System.out.println("desligando celular...");
          System.exit(0);
        }
        default: {
          System.out.println("opcao invalida!!");
          menu_sistema();
        }
      }
    }
    
    
  }
}
