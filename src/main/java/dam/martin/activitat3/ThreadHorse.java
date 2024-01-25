package dam.martin.activitat3;

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
                if(this.nombreCaballo.equals( "Caballo01" )){
                    Thread.sleep(210);
                } else if ( this.nombreCaballo.equals( "Caballo10" ) ) {
                    Thread.sleep(195);
                } else Thread.sleep(200);
                distanciaTotal -= paso;

                if (distanciaTotal > 0) {
                    System.out.println(nombreCaballo + ": " + distanciaTotal + "metros para finalizar");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.err.println( nombreCaballo + ": Ha finalizado la carrera");
    }
}
