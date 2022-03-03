public class Ficha {

    //Atributos 

    String color;
    int posicion;
    Dado dado = new Dado(6);


    //METODOS
    //METODO CONTRUCTOR
    public Ficha(String _color , int _posicion){
        color = _color;
        posicion = _posicion;

    }

    public void avanzar(){
        int pasos;
        pasos = dado.lanzar();
        posicion += pasos;
        System.out.println(posicion);
        
    }


}



    

