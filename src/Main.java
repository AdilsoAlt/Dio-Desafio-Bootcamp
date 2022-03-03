import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso java", "Descrição curso java", 5);
        Curso curso2 = new Curso("Curso js", "Descrição curso js", 6);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição mentoria java", LocalDate.now());

        //Criando bootcamp
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java");
        bootcamp1.setDescricao("Descrição bootcamp java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        //Criando dev
        Dev dev1 = new Dev();
        Dev dev2 = new Dev();
        dev1.setNome("Adilso");
        dev2.setNome("João");

        dev1.inscreverBootcamp(bootcamp1);
        dev2.inscreverBootcamp(bootcamp1);

        System.out.println("Adilso " + dev1.getConteudosInscritos());
        System.out.println("João " + dev2.getConteudosInscritos());

        dev1.progredir();

        dev2.progredir();
        dev2.progredir();

        System.out.println("Adilso " + dev1.getConteudosConcluidos());
        System.out.println("João " + dev2.getConteudosConcluidos());

        System.out.println("XP Adilso = " + dev1.calcularXp());
        System.out.println("XP João = " + dev2.calcularXp());



    }
}
