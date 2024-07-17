import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.dominio.Curso;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(9);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java Descricao");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descricao BootCamp Java Developer ");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devRaphael = new Dev();
        devRaphael.setNome("Raphael");
        devRaphael.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos "+ devRaphael.getConteudosInscritos());
        System.out.println("Conteudos Concluidos "+ devRaphael.getConteudosConcluidos());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos "+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Concluidos"+ devCamila.getConteudosConcluidos());
        System.out.println("Xp" + devCamila.calcularTotalXp());
    }
}