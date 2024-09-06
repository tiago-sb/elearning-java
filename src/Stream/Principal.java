package Stream;

import java.util.ArrayList;
import java.util.Comparator;

class Pessoa {
  private String nome;
  private int idade;
  private char sexo;
  
  public Pessoa(String nome, int idade, char sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }
}

public class Principal {

  public static void main(String[] args) {
    ArrayList<Pessoa> familia = new ArrayList<Pessoa>(){{
     add(new Pessoa("Tiago", 20, 'm'));
     add(new Pessoa("Laiana", 21, 'f'));
    }};
    
    familia.sort(Comparator.comparing(Pessoa::getIdade));
     
  }
}
