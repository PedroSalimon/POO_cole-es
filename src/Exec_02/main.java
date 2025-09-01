package Exec_02;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set <Aluno> turmaBD = new HashSet<>();
        turmaBD.add(new Aluno(1, "Pedro", "BD"));
        turmaBD.add(new Aluno(2, "Lucas", "BD"));
        turmaBD.add(new Aluno(3, "Caio", "BD"));
        turmaBD.add(new Aluno(3, "Cesar", "BD"));

        turmaBD.forEach(aluno -> System.out.println(aluno));

        Set <Aluno> turmaED = new HashSet<>();
        turmaBD.add(new Aluno(2, "Lucas", "ED"));
        turmaBD.add(new Aluno(3, "Cesar", "ED"));
        turmaED.add(new Aluno(6, "Caio", "ED"));

        //lista contendo os alunos matriculados nas duas turmas
        Set<Aluno> uniao = new HashSet<>(turmaBD);
        uniao.retainAll(turmaED);
        uniao.forEach(aluno -> System.out.println(aluno));

    }
}
