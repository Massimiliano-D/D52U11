package ESERCIZIO2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainEs2 {
    static Logger log = LoggerFactory.getLogger(MainEs2.class);
    static Random random = new Random();

    public static void main(String[] args) {
        log.info(metodo1(5).toString());
        //chiamo il metodo metodo1(5) per generare una lista di 5 numeri casuali compresi tra 0 e 100.
        // risultato viene stampato utilizzando il logger.

        List<Integer> pippo3 = metodo1(10);
        //chiamo il metodo metodo1(10) per generare una lista di 10 numeri casuali e il risultato viene
        // assegnato a una variabile di tipo List<Integer> chiamata pippo3.

        log.info(pippo3.toString());
        //stampo la lista arry1 utilizzando il logger

        log.info(metodo2(pippo3).toString());
        //chiamo il metodo metodo2(pippo3) per invertire l'ordine degli elementi nella lista arry1,
        //e il risultato viene stampato utilizzando il logger

        metodo3(pippo3, true);
        //chiamo il metodo metodo3(pippo3, true) per stampare i numeri pari dalla lista pippo3.
    }

    private static List<Integer> metodo1(int numero) {
        List<Integer> pippo = new ArrayList<Integer>();
        for (int i = 0; i < numero; i++) {
            pippo.add(random.nextInt(101));
        }
        return pippo;
    }
    //Il metodo metodo1 riceve un intero numero come parametro e restituisce una lista di numeri
    // casuali generati con la classe Random. Il numero di elementi nella lista è specificato dal parametro numero.

    private static List<Integer> metodo2(List<Integer> pippo2) {
        Collections.reverse(pippo2);
        return pippo2;
    }

    //Il metodo metodo2 riceve una lista array come parametro e inverte l'ordine degli elementi
    //utilizzando Collections.reverse(). Restituisce la lista invertita.

    private static void metodo3(List<Integer> pippo2, boolean x) {
        if (x) {
            for (int numero : pippo2) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }

            }
        } else {
            for (int numero : pippo2) {
                if (numero % 2 != 0) {
                    System.out.println(numero);
                }
            }

        }
    }
    //Il metodo metodo3 riceve una lista array e un valore booleano x come parametri.
    // Se x è true, il metodo stampa i numeri pari nella lista array, altrimenti stampa i numeri dispari.
}
