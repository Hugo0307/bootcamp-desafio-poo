package com.br.hugodev.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Atividade> atividadesInscritas = new LinkedHashSet<>();
    private Set<Atividade> atividadesConcluidas = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.atividadesInscritas.addAll(bootcamp.getAtividades());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Atividade> atividade = this.atividadesInscritas.stream().findFirst();
        if(atividade.isPresent()) {
            this.atividadesConcluidas.add(atividade.get());
            this.atividadesInscritas.remove(atividade.get());
        } else {
            System.err.println("Você não está inscrito em nenhuma atividade!");
        }
    }

    public double calcularTotalXp() {
        return this.atividadesConcluidas
                .stream()
                .mapToDouble(atividade -> atividade.calcularXp())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Atividade> getAtividadesInscritas() {
        return atividadesInscritas;
    }

    public void setAtividadesInscritas(Set<Atividade> atividadesInscritas) {
        this.atividadesInscritas = atividadesInscritas;
    }

    public Set<Atividade> getAtividadesConcluidas() {
        return atividadesConcluidas;
    }

    public void setAtividadesConcluidas(Set<Atividade> atividadesConcluidas) {
        this.atividadesConcluidas = atividadesConcluidas;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", atividadesInscritas=" + atividadesInscritas +
                ", atividadesConcluidas=" + atividadesConcluidas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(atividadesInscritas, dev.atividadesInscritas) && Objects.equals(atividadesConcluidas, dev.atividadesConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, atividadesInscritas, atividadesConcluidas);
    }

    public void exibirAtividades() {
        if (getNome() == null) System.out.println("Dev: ");
        else System.out.println("Dev: " + getNome());

        System.out.println("--- Atividades inscritas ---");
        getAtividadesInscritas().forEach(
                atividade -> System.out.println("- " + atividade.getTitulo()));
        System.out.println("Total atividades inscritas: " + getAtividadesInscritas().size());
        System.out.println("--- Atividades concluídas ---");
        getAtividadesConcluidas().forEach(
                atividade -> System.out.println("* " + atividade.getTitulo()));
        System.out.println("Total atividades concluídas: " + getAtividadesConcluidas().size());
        System.out.println();
    }
}
