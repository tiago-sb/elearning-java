package desafio_pilares_poo;

import java.time.LocalDate;

public class Tutoria extends Assunto {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Tutoria() {}

    public Tutoria(LocalDate data, String titulo, String descricao) {
        this.setData(data);
        super.setTitulo(titulo);
        super.setDescricao(descricao);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: " +
                "titulo = " + getTitulo() +
                "| descricao = " + getDescricao() +
                "| data = " + data;
    }
}