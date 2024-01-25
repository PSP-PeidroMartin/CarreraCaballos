package dam.martin.activitat5;

public class Animal extends Thread {
    private String nombre;
    private int velocidad;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre, int velocidad) {
        this(nombre);
        this.velocidad = velocidad;
    }
    @Override
    public void run() {
        int distanciaRecorrer = 3000;
        int pasos = 100;
        if ( this.velocidad == 0 ){
            this.velocidad = pasos;
        }

        while ( distanciaRecorrer > 0 ){
            try {
                /*
                // Descomentando esto sería otra forma de que la carrera la gane el más rápido, he utilizado una lógica
                   que dependiendo el tipo de animal descansará más o no.
                if ( this.nombre.startsWith( "tortuga" ) ){
                    Thread.sleep( 100 );
                } else if ( this.nombre.startsWith( "conejo" ) ) {
                    Thread.sleep( 50 );
                }
                 */

                Thread.sleep( 10 );
                distanciaRecorrer -= this.velocidad;

                if ( distanciaRecorrer > 0 ){
                    System.out.println(nombre + ": " + (3000 - distanciaRecorrer));
                }

            } catch (InterruptedException e) {
                throw new RuntimeException( e );
            }
        }

        System.err.println( nombre + ": Ha finalizado la carrera");
    }
}