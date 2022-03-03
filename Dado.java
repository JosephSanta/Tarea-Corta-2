import java.util.Random;

public class Dado {

    int caras;

    Random rnd = new Random(42);
    //#long seed = 42;
    //raa.setSeed(seed);

    public Dado(int _numCaras) {
        caras = _numCaras;
    }

    public int lanzar(){
        int min = 1;
        int max=caras;
        int resultado = rnd.nextInt((max - min) + min);
        return resultado;
        
    }



}