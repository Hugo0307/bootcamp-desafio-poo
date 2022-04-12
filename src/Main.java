import com.br.hugodev.domain.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

//        System.out.println("Curso: " + curso1);
//        System.out.println("Curso: " + curso2);

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

        System.out.println("====== BOOTCAMP ======");
        System.out.println("Nome: " + bootcamp.getNome());
        System.out.println("Data de início: " + bootcamp.getDataInicial().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Data de término: " + bootcamp.getDataFinal().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Atividades do Bootcamp:");
        bootcamp.getAtividades()
                .forEach(atividade -> System.out.println(
                        atividade.
                        getClass().getSimpleName()
                        + ": "
                        + atividade.getTitulo()));
        System.out.println();

        System.out.println("====== DEVS INSCRITOS ======");
        System.out.println("Nome: " + dev1.getNome());
        System.out.println("Atividades inscritas: ");
        dev1.getAtividadesInscritas().forEach(atividade -> System.out.println(atividade.getTitulo()));
        System.out.println("Atividades concluídas: ");
        dev1.getAtividadesConcluidas().forEach(atividade -> System.out.println(atividade.getTitulo()));
        System.out.println();
        System.out.println("Nome: " + dev2.getNome());
        System.out.println("Atividades inscritas: ");
        dev1.getAtividadesInscritas().forEach(atividade -> System.out.println(atividade.getTitulo()));
        System.out.println("Atividades concluídas: ");
        dev2.getAtividadesConcluidas().forEach(atividade -> System.out.println(atividade.getTitulo()));
        System.out.println();


    }
}
