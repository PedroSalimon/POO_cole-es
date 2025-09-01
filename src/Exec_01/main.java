package Exec_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class main {
    public static void main(String[] args) {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato(1, "Pedro", 9));
        lista.add(new Candidato(2, "Lucas", 8));
        lista.add(new Candidato(3, "Caio", 7));
        lista.add(new Candidato(4, "Cesar", 6));
        lista.add(new Candidato(5, "Cesar", 5));

        Comparator<Candidato> cnp = Comparator.comparing(Candidato::getNota)
                .thenComparing(Candidato::getAnos).reversed().thenComparing(Candidato::getNome);

        lista.sort(cnp);
        AtomicInteger cont = new AtomicInteger(1);
        lista.forEach( candidato -> {
            System.out.println(cont.getAndIncrement() + "° " + candidato);
        });
    }
}
