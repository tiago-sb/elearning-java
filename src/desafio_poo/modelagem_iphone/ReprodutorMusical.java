package desafio_poo.modelagem_iphone;

import java.util.ArrayList;
import java.util.Scanner;
public class ReprodutorMusical {
  Scanner scan = new Scanner(System.in);
  private double minutos_musica;
  private String nome_musica;
  private static ArrayList<ReprodutorMusical> musicas = new ArrayList<ReprodutorMusical>();
  
  public ReprodutorMusical() {}
  
  public ReprodutorMusical(String nome_musica, double minutos_musica) {
    this.nome_musica = nome_musica;
    this.minutos_musica = minutos_musica;
    
  }
  
  public void iniciar() {
    System.out.println("Bem Vindo ao Spotify!!");
    menu_reprodutor();
  }
  
  public double getMinutos_musica() {
    return minutos_musica;
  }

  public void setMinutos_musica(double minutos_musica) {
    this.minutos_musica = minutos_musica;
  }

  public String getNome_musica() {
    return nome_musica;
  }

  public void setNome_musica(String nome_musica) {
    this.nome_musica = nome_musica;
  }

  public static void getMusica(String nome) {
    for(ReprodutorMusical musica : musicas) {
      if(musica.getNome_musica().equals(nome)) {
        System.out.println("musica encontrada!!");
        System.out.println("Nome: " + musica.getNome_musica());
        System.out.println("Minutos: " + musica.getMinutos_musica());
        return;
      }
    }
    System.out.println("Musica nao encontrada!!");
  }
  
  public static void getMusicas() {
    System.out.println("Musicas de sua playlist");
    for(ReprodutorMusical musica : musicas) {
      System.out.println("Nome: " + musica.getNome_musica());
      System.out.println("Minutos: " + musica.getMinutos_musica());
    }
  }

  public static void adicionaMusica(ReprodutorMusical musica) {
    musicas.add(musica);
  }

  public void tocarMusica(String nome_musica) {
    for(ReprodutorMusical musica : musicas) {
      if(musica.getNome_musica().equals(nome_musica)) {
        System.out.println(musica.getNome_musica() + " tocando no momento!");
        return;
      }
    }
    System.out.println("musica nao encontrada na playlist!!");
  }
  
  public void pausarMusica(String nome_musica) {
    for(ReprodutorMusical musica : musicas) {
      if(musica.getNome_musica().equals(nome_musica)) {
        System.out.println(musica.getNome_musica() + " pausada!");
        return;
      }
    }
    System.out.println("musica nao encontrada!!");
  }
  
  public void selecionarMusica(String nome_musica){
    for(ReprodutorMusical musica1 : musicas) {
      if(musica1.getNome_musica().equals(nome_musica)) {
        System.out.println(musica1.getNome_musica() + " selecionada!");
        return;
      }
    }
    System.out.println("musica nao encontrada!!");
  }
  
  public void listarMusicas() {
    for(ReprodutorMusical musica: musicas) {
      System.out.println(musica.nome_musica + ". Minutos: " + musica.minutos_musica);
    }
  }
  
  public void menu_reprodutor() {
    int saida = 0;
    while(true) {
      System.out.println("1. Listar Suas Musicas");
      System.out.println("2. Tocar Musica");
      System.out.println("3. Pesquisar Musica");
      System.out.println("4. Adiconar Musica Nova");
      System.out.println("0. Sair Spotify");
      System.out.println("Escolha uma opcao: ");
      switch (scan.nextInt()) {
        case 1:{
          System.out.println("Suas Musicas");
          listarMusicas();
          break;
        }
        case 2: {
          System.out.println("Escolha uma musica: ");
          tocarMusica(scan.next());
          break;
        }
        case 3: {
          System.out.println("Digite: ");
          getMusica(scan.next());
          break;
        }
        case 4: {
          System.out.print("Insira o Nome da Musica Nova: ");
          String nome = scan.next();
          
          System.out.print("Insira o Tempo de Duracao da Musica Nova: ");
          double tempo = scan.nextDouble();
          
          ReprodutorMusical nova_musica = new ReprodutorMusical(nome, tempo);
          adicionaMusica(nova_musica);
          break;
        }
        case 0: {
          System.out.println("saindo do spotify...");
          saida = 1;
          break;
        }
        default: {
          System.out.println("Invalido!!");
          menu_reprodutor();
        }
      }
      if(saida == 1) {
        break;
      }
    }
  }
}
