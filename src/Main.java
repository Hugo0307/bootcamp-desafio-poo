import com.br.hugodev.domain.Bootcamp;
import com.br.hugodev.domain.Curso;
import com.br.hugodev.domain.Dev;
import com.br.hugodev.domain.Mentoria;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Lógica de Programação I");
        curso1.setDescricao("Lógica de Programação com JavaScript, HTML e CSS");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java e POO");
        curso2.setDescricao("Aprenda Java e o Paradigma Orientação a Objetos");
        curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprenda na prática POO");
        mentoria.setDescricao("Abstraindo um bootcamp usando POO e Java");
        mentoria.setDataMentoria(LocalDateTime.now().plusDays(15));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Phillips Fullstack Developer | You are you");
        bootcamp.setDescricao("Bootcamp desenvolvido para inclusão de iniciantes na área tech.");
        bootcamp.getAtividades().add(curso1);
        bootcamp.getAtividades().add(curso2);
        bootcamp.getAtividades().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Hugo Henrique");
        dev1.inscreverBootcamp(bootcamp);

        Dev dev2 = new Dev();
        dev2.setNome("Hugo Almeida");
        dev2.inscreverBootcamp(bootcamp);

        bootcamp.imprimirInformacoesBootcamp();

        dev1.exibirAtividades();
        dev2.exibirAtividades();

    }
}
