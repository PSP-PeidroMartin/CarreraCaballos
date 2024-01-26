package dam.martin.activitat4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    static Random r = new Random();
    final static int TOTAL_DESCALIFICADOS = 5;
    //  Dependiendo de la paciencia de juez, podrán acabar la carrera los cinco caballos salvados del juez, o por
    //  el otro lado puede salvarse algún caballo más.
    final static int PACIENCIA = 1600;
    final static int IMPACIENTE = 700;
    static int descalificados = 0;
    public static void main(String[] args) {
        List<Thread> caballos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            String      nombreCaballo = "Caballo" + String.format("%02d", i);
            ThreadHorse threadHorse   = new ThreadHorse(nombreCaballo);
            Thread      caballoThread = new Thread(threadHorse, nombreCaballo);
            caballos.add( caballoThread );
            caballoThread.start();
        }
        JudgeThread judgeThread = new JudgeThread();
        Thread judge = new Thread(judgeThread);
        judgeThread.sleepJudge( 1500 );
        judge.start();

            while ( descalificados <= TOTAL_DESCALIFICADOS ){
                if ( !caballos.get( r.nextInt( caballos.size() ) ).isInterrupted() ){
                judgeThread.descalificarCaballo( caballos.get( r.nextInt( caballos.size() ) ) );
                judgeThread.sleepJudge( IMPACIENTE );
                descalificados++;
            }
        }
    }
}
