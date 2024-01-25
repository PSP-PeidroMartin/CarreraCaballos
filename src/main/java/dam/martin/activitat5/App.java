package dam.martin.activitat5;

public class App {
    static final int VELOCIDAD_RAPIDA = 100;
    static final int VELOCIDAD_MEDIA = 50;
    static final int VELOCIDAD_LENTA = 20;
    public static void main(String[] args) {

        /*
        // De esta forma ganaría una animal aleatorio independientemente de la velocidad del animal
        Animal tortuga1 = new Animal( "tortuga1" );
        Animal tortuga2 = new Animal( "tortuga2" );
        Animal tortuga3 = new Animal( "tortuga3" );
        Animal tortuga4 = new Animal( "tortuga4" );
        Animal conejo1 = new Animal( "conejo1" );
        Animal conejo2 = new Animal( "conejo2" );
        Animal conejo3 = new Animal( "conejo3" );
        Animal guepardo = new Animal( "guepardo" );
        Animal[] animales = {tortuga1, tortuga2, tortuga3, tortuga4, conejo1, conejo2, conejo3, guepardo};

        for ( int i = 0; i < animales.length; i++ ) {
            Thread threadAnimal = new Thread(animales[i]);
            threadAnimal.start();
        }
        */

        /*
       // De esta forma le asigno una velocidad a cada animal desde una valor bajo(Tortuga), un valor intermedio(Conejo)
       // hasta el valor superior para el Guepardo.
        Animal tortuga1 = new Animal( "tortuga1", VELOCIDAD_LENTA );
        Animal tortuga2 = new Animal( "tortuga2", VELOCIDAD_LENTA );
        Animal tortuga3 = new Animal( "tortuga3", VELOCIDAD_LENTA );
        Animal tortuga4 = new Animal( "tortuga4", VELOCIDAD_LENTA );
        Animal conejo1 = new Animal( "conejo1", VELOCIDAD_MEDIA );
        Animal conejo2 = new Animal( "conejo2", VELOCIDAD_MEDIA );
        Animal conejo3 = new Animal( "conejo3", VELOCIDAD_MEDIA );
        Animal guepardo = new Animal( "guepardo", VELOCIDAD_RAPIDA );
        Animal[] animales = {tortuga1, tortuga2, tortuga3, tortuga4, conejo1, conejo2, conejo3, guepardo};

        for ( int i = 0; i < animales.length; i++ ) {
            Thread threadAnimal = new Thread(animales[i]);
            threadAnimal.start();
        }
 */

    }
}
