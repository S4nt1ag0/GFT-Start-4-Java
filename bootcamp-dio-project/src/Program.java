import entities.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso Introdução Java","curso Java Description",2);
        Conteudo curso2 = new Curso("Curso Collection","curso Java Description",6);
        curso2.setXp(25.0);
        Conteudo curso3 = new Curso("Curso Git","curso Java Description",2);
        curso3.setXp(35.0);
        Conteudo curso4 = new Curso("Curso POO","curso Java Description",3);
        curso4.setXp(50.0);
        Conteudo curso5 = new Curso("Curso IDEs","curso Java Description",2);
        curso5.setXp(70.0);
        Conteudo curso6 = new Curso("Curso Introdução Js","curso Js Description",2);

        Conteudo mentoria1 = new Mentoria("Mentoria GIT", "mentoria de GIT", LocalDate.now().plusDays(5),2);
        Conteudo mentoria2 = new Mentoria("Mentoria Collections", "mentoria de Collections", LocalDate.now().plusDays(10),2);
        Conteudo mentoria3 = new Mentoria("Mentoria POO", "mentoria de POO", LocalDate.now().plusDays(15),2);

        Conteudo atividade1 = new Challenge("desafio Arrays","chanlenge with array",2);
        atividade1.setXp(10.00);
        Conteudo atividade2 = new Challenge("desafio POO","chanlenge with poo",4);
        atividade1.setXp(150.00);

        Conteudo project1 = new Project("DigitalBank", "project of a digital bank", "github.com/S4nt1ag0/GFT-Start-4-Java/tree/main/BancoDigitalProject");
        project1.setXp(300d);
        Conteudo project2 = new Project("Bootcamp", "project of a bootcamp", "github.com/S4nt1ag0/GFT-Start-4-Java/tree/main/Bootcamp-dio-project");
        project2.setXp(400d);
        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java","Bootcamp Java GFT");
        Bootcamp bootcampJs = new Bootcamp("Bootcamp Js","Bootcamp Js GFT");

        bootcampJava.getContents().addAll(Arrays.asList(
                curso1,atividade1,curso2,project1,atividade2,curso3,mentoria1,curso4,curso5,project2
        ));

        bootcampJs.getContents().addAll(Arrays.asList(
                curso6,atividade1,curso2,project1,atividade2,curso3,mentoria1,curso4,curso5,project2
        ));





        Dev dev1 = new Dev("S4nt1ag0");
        Dev dev2 = new Dev("Maria");


        dev1.registerBootcamp(bootcampJava);
        dev1.registerBootcamp(bootcampJs);

        dev2.registerBootcamp(bootcampJs);

        System.out.println(dev1);

        System.out.println(dev2);

        dev1.progress(bootcampJava);
        dev1.progress(null);
        dev2.progress(bootcampJava);

        dev1.progress(bootcampJava);
        dev1.progress(bootcampJava);
        dev1.progress(bootcampJava);
        dev1.progress(bootcampJava);
        dev1.progress(bootcampJava);
        dev1.progress(bootcampJava);
        dev1.progress(bootcampJava);

        dev1.progress(bootcampJs);
        dev1.progress(bootcampJs);
        dev1.progress(bootcampJs);
        System.out.println(dev1);

        System.out.println(dev2);

    }
}
