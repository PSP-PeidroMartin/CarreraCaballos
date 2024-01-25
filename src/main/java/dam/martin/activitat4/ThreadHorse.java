package dam.martin.activitat4;

public class ThreadHorse implements Runnable{
    String nombreCaballo;

    public ThreadHorse(String nombreCaballo) {
        this.nombreCaballo = nombreCaballo;
    }

    @Override
    public void run() {
        int paso = 100;
        int distanciaTotal = 5000;

        while (distanciaTotal > 0){
            try {
                Thread.sleep(200);
                distanciaTotal -= paso;

                if (distanciaTotal > 0) {
                    System.out.println(nombreCaballo + ": " + distanciaTotal + "metros para finalizar");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println( nombreCaballo + ": Ha finalizado la carrera");
    }
}
