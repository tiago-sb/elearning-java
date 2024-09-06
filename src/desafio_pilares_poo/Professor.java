package desafio_pilares_poo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {
    private String nomeProfessor;
    private Set<Assunto> competencias = new LinkedHashSet<>();

    public void adicionarCompetencia(Assunto competencia) {
        this.competencias.add(competencia);
    }

    public Boolean checarCompetencias(Set<Assunto> competencias) {
        return this.competencias.containsAll(competencias);
    }

    public Professor(String nome) {
        this.nomeProfessor = nome;
    }

    public void setNome(String nome) {
        this.nomeProfessor = nome;
    }

    public Set<Assunto> getCompetencias() {
        return competencias;
    }

    public String getNome() {
        return nomeProfessor;
    }
}