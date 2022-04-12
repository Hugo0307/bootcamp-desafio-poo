import com.br.hugodev.domain.Curso;

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

        System.out.println("Curso: " + curso1);
        System.out.println("Curso: " + curso2);

    }
}
