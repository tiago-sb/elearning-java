package desafio_poo.modelagem_iphone;

import java.util.Objects;
import java.util.Scanner;
public class AparelhoTelefonico {
  private String numero_celular;
  Scanner scan = new Scanner(System.in);
  
  public AparelhoTelefonico(String numero_celular) {
    this.numero_celular = numero_celular;
  }
  
  public void iniciar() {
    System.out.println("Bem Vindo ao telefone!! Faça suas ligações!!");
    menu_chamadas();
  }
  public String getNumero_celular() {
    return numero_celular;
  }

  public void setNumero_celular(String numero_celular) {
    this.numero_celular = numero_celular;
  }

  public void ligar(String numero){
    System.out.println(this.numero_celular + " ligando para: " + numero);
  }
  
  public void atender(String numero) {
    try {
      System.out.println(numero + " esta te ligando, deseja atender a ligacao [1 - sim | 2 - nao]? ");
      int resposta = scan.nextInt();
      if(resposta == 1) {
        System.out.println("ok!! fale agora com o numero " + numero);
      }
      if(resposta == 2) {
        System.out.println("ok!! chamada perdida!!");
      }
    } catch(Exception e) {
      System.out.println("Voce nao inseriu o numero valido!!");
    }
     
  }
 
  public void iniciarCorreioVoz() {
    System.out.println("iniciando correio de voz!!");
  }
  
  public void menu_chamadas() {
    int saida = 0;
    while(true) {
      System.out.println("1. Ligar Para Algum contato");
      System.out.println("0. Sair do Aplicativo");
      System.out.print("Digite sua Escolha: ");
      switch (scan.nextInt()) {
        case 1: {
          System.out.print("Insira o Escolhido Para Fazer a Ligacao: ");
          ligar(scan.next());
          break;
        }
        case 0: {
          System.out.println("Saindo...");
          saida = 1;
          break;
        }
        default: {
          System.out.println("comando invalido!!");
          menu_chamadas();
        }
      }
      if(saida == 1) {
        break;
      }
    }
  }
  
  public boolean equals(Object o) {
    if(this == o) {
      return true;
    }
    if(o == null || this.getClass() != o.getClass()) {
      return false;
    }
    
    AparelhoTelefonico aparelho = (AparelhoTelefonico) o;  
    return Objects.equals(getNumero_celular(), aparelho.getNumero_celular());
 }
 
}
