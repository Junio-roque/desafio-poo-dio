import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Modulo Java");
        curso1.setCargaHoraria(30);

        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Modulo Angular");
        curso2.setCargaHoraria(40);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição do mentoria java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Jva Developer");
        bootcamp.setDescricao("Descrição Bootcampe Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devJunio = new Dev();
        devJunio.setNome("Junio");
        devJunio.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Junio " +devJunio.getConteudoInscrito());

        devJunio.progredir();
        devJunio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Junio " +devJunio.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Junio " +devJunio.getConteudoConcluido());
        System.out.println("XP: "+devJunio.calcularTodoXp());

        System.out.println("----------------");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.increverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Paula " +devPaula.getConteudoInscrito());

        devPaula.progredir();
        devPaula.progredir();
        devPaula.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Paula " +devPaula.getConteudoInscrito());
        System.out.println("Conteudo Concluido Paula " +devPaula.getConteudoConcluido());
        System.out.println("XP: "+devPaula.calcularTodoXp());
    }
}
