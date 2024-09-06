package desafio_pilares_poo;

import java.util.*;

public class Aluno {
    private String nome;
    private Set<Assunto> conteudosInscritos = new LinkedHashSet<>();
    private Set<Assunto> conteudosConcluidos = new LinkedHashSet<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void progredir() {
        Optional<Assunto> conteudo = this.conteudosInscritos.stream().findFirst();
        
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            return;
        } 
        
        System.err.println("Você não está matriculado em nenhum conteúdo!");
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Assunto::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Assunto> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Assunto> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Assunto> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Assunto> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Aluno dev = (Aluno) o;
        return Objects.equals(nome, dev.nome) && 
            Objects.equals(conteudosInscritos, dev.conteudosInscritos) && 
            Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}