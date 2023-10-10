package ESERCIZIO1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MainEs1 {
    private static Logger log = LoggerFactory.getLogger(MainEs1.class);
    //dichiaro un logger statico chiamato "log" per registrare i messaggi di log.
    private static Scanner sc = new Scanner(System.in);
    //dichiaro un oggetto Scanner chiamato "sc" per leggere l'input da parte dell'utente.

    public static void main(String[] args) {
        es1();
    }
    //chiamo il metodo "main" per avviare il programma. Il metodo "es1" viene richiamato all'interno del main.

    private static void es1() {
        System.out.println("Elementi da inserire:");
        int numElementi = Integer.parseInt(sc.nextLine());
        //nel metodo es1 chiedo all'utente di inserire il numero di elementi che desidera inserire.

        Set<String> contParole = new HashSet<String>();
        //creo un oggetto HashSet chiamato "contParole" per memorizzare le parole distinte.

        Set<String> ParoleDoppie = new HashSet<String>();
        //creo un secondo oggetto HashSet chiamato "ParoleDoppie" per memorizzare le parole duplicate.

        for (int i = 0; i < numElementi; i++) {
            System.out.println("Inserisci la parola");
            String parola = sc.nextLine();
            //un ciclo for per chiedere all'utente di inserire le parole per il numero specificato di volte.
            // Le parole vengono lette usando "sc.nextLine()" e vengono memorizzate in una variabile chiamata parola.

            if (contParole.contains(parola)) {
                ParoleDoppie.add(parola);
            } else {
                contParole.add(parola);
            }
            //verifico se la parola è stata aggiunta con successo all'insieme contParole utilizzando
            // il metodo .contains(). Se viene aggiunta con successo, la parola è distinta e viene mantenuta
            // nell'insieme contParole. In caso contrario, la parola è duplicata e viene aggiunta all'insieme
            // ParoleDoppie.
        }
        for (String parola : contParole) {
            log.info("parole distinte:" + " " + parola);
        }
        for (String parola : ParoleDoppie) {
            log.info("parole doppie:" + " " + parola);
        }
        //eseguo due cicli for-each separati per stampare le parole distinte e le parole duplicate utilizzando
        // il logger. Le parole distinte vengono stampate nel primo ciclo e le parole duplicate nel secondo ciclo.

        log.info("numero di parole distinte:" + " " + contParole.size());
        // stampo il numero di parole distinte utilizzando contParole.size().
    }
}
