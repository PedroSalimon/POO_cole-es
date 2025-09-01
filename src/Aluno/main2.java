package Aluno;

import java.util.ArrayList;
import java.util.List;

public class main2 {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();


        lista.add(new Aluno(1, "Pedro", "SI"));
        lista.add(new Aluno(2, "Lucas", "PDA"));
        lista.add(new Aluno(3, "Caio", "Cafe"));
        lista.add(new Aluno(4, "Cesar", "SI"));
        lista.add(new Aluno(5, "Cesar", "ADM"));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
