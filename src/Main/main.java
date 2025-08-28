package Main;

import Aluno.Aluno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno(1, "Pedro", "SI"));
        lista.add(new Aluno(2, "Lucas", "PDA"));
        lista.add(new Aluno(3, "Caio", "Cafe"));
        lista.add(new Aluno(4, "Cesar", "SI"));
        lista.add(new Aluno(5, "Cesar", "ADM"));

        lista.sort(Comparator.comparing(Aluno::getNome)
                .thenComparing(Aluno::getRm));

        lista.forEach( aluno -> {
            System.out.println(aluno);
        });


    }
}
