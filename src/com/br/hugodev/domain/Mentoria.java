package com.br.hugodev.domain;

import java.time.LocalDateTime;

public class Mentoria extends Atividade {

    private LocalDateTime dataMentoria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public LocalDateTime getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDateTime dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }
}
