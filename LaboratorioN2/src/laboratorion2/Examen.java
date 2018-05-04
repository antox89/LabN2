

package laboratorion2;

import java.util.ArrayList;


public class Examen {
    
    private String nombreClase;
    private ArrayList preguntas = new ArrayList<>();
    private ArrayList respuestas = new ArrayList<>();

    public Examen(){
        
    }
    
    public Examen(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public ArrayList getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "Examen{" + "nombreClase=" + nombreClase + ", preguntas=" + preguntas + ", respuestas=" + respuestas + '}';
    }
    
    
    

}
