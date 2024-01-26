package dam.martin.activitat4;

public class JudgeThread implements Runnable{
    private Thread caballoElegido;
    @Override
    public void run() {
        try {
            Thread.sleep( 3000 );
        } catch (InterruptedException e) {
            throw new RuntimeException( e );
        }
    }

    public void descalificarCaballo(Thread caballoElegido){
        this.caballoElegido = caballoElegido;
        this.caballoElegido.interrupt();
    }

    public void sleepJudge(int milis){
        try {
            Thread.sleep( milis );
        } catch (InterruptedException e) {
            throw new RuntimeException( e );
        }
    }
}
