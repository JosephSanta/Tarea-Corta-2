import java.util.ArrayList;
//import java.util.List;
public class Tablero {
    int casillas;
    ArrayList<Ficha> fichas = new ArrayList<Ficha>();
    //METODO CONSTRUCTOR 

    public Tablero(int _casillas , ArrayList<Ficha> _fichas){

        casillas =_casillas;
        fichas = _fichas;
    }
    public void turno(){

        int cambiarturno =0;
        int indice = 0;
        while (cambiarturno==0){
            fichas.get(indice).avanzar();

            

            
            if (fichas.get(indice).posicion >= casillas){
                break;
            }
            else {
                indice = indice +1;
                if (indice >= fichas.size()){
                    indice=0;
                }
                else {
                    continue;
                }
            }
            }
        }
    
    }





    

    



    

