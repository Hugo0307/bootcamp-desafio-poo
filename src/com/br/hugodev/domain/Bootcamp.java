package com.br.hugodev.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Atividade> atividades = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", devsInscritos=" + devsInscritos +
                ", atividades=" + atividades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(atividades, bootcamp.atividades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, atividades);
    }

    public void imprimirInformacoesBootcamp() {
        System.out.println("====== BOOTCAMP ======");
        System.out.println("Nome: " + getNome());
        System.out.println("Data de in??cio: " + Utils.formatarData(getDataInicial()));
        System.out.println("Data de t??rmino: " + Utils.formatarData(getDataFinal()));
        System.out.println("** Atividades do Bootcamp:");
        if(getAtividades().isEmpty()) System.out.println("Nenhuma atividade cadastrada neste bootcamp.");
        else getAtividades().forEach(
                atividade -> System.out.println(
                        atividade.getClass().getSimpleName()
                                + ": " + atividade.getTitulo()));
        System.out.println("--- Devs inscritos: ---");
        if(getDevsInscritos().isEmpty()) System.out.println("N??o h?? devs inscritos.");
        else getDevsInscritos().forEach(dev -> System.out.println("- Nome: " + dev.getNome()));
        System.out.println();
    }

}
