package estruturas_de_dados;

import java.util.Stack;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
public class Principal {
  public static void imprimirCarros(Stack<String> p) {
    System.out.print("| ");
    for(String carro : p) {
      System.out.print(carro + " | ");
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    double soma = 0.0;
    ArrayList<Double> notas = new ArrayList<>();
    notas.add(10.0);
    notas.add(8.25);
    notas.add(5.96);
    notas.add(9.56);
    Iterator<Double> it = notas.iterator();
    
    while(it.hasNext()) {
       Double next = it.next();
       soma += next; 
    }
    
    System.out.printf("%.1f", soma / notas.size());

    // stack
    // Stack<String> pilha_carros = new Stack<>();
    // pilha_carros.push("Uno 2000");
    // pilha_carros.push("Lamborguini");
    // pilha_carros.push("Ferrari");
    // System.out.println(pilha_carros.isEmpty());
    // pilha_carros.pop();
    // imprimirCarros(pilha_carros);
    // System.out.println(pilha_carros.peek() + "\n");
    
    // queue
    // Queue<String> fila_carros = new LinkedList<>();
    // fila_carros.add("Uno 2000"); // caso nao consiga estoura um erro
    // System.out.println(fila_carros.offer("Lamborguini")); // retorna um boolean, caso inseriu - true, caso nao - false
    // fila_carros.add("Fiat Mobi");
    // System.out.println(fila_carros);
    // fila_carros.remove();
    // System.out.println(fila_carros);
    // System.out.println(!fila_carros.isEmpty());
    // System.out.println(fila_carros.size());
    // System.out.println(fila_carros.poll());
    // System.out.println(fila_carros);

    // set
    // Set<String> hashSetCarros = new HashSet<>(); // consjunto de carros
    // hashSetCarros.add("Ford");
    // hashSetCarros.add("Chevrolet");
    // hashSetCarros.add("Fiat");
    // hashSetCarros.add("Zip");
    // System.out.println(hashSetCarros.size());
    // System.out.println(hashSetCarros); // nao preserva
  } 
}
