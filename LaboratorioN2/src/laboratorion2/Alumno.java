

package laboratorion2;

import java.util.ArrayList;


public class Alumno {
    
    private String nombre, date, ciudad, nacionalidad, ID, user, password;
    private int nCuenta;
    private ArrayList clases = new ArrayList<>();
    private ArrayList examen = new ArrayList<>();
    
    public Alumno(){
        
    }

    public Alumno(String nombre, String date, String ciudad, String nacionalidad, String ID, String user, String password, int nCuenta) {
        this.nombre = nombre;
        this.date = date;
        this.ciudad = ciudad;
        this.nacionalidad = nacionalidad;
        this.ID = ID;
        this.user = user;
        this.password = password;
        this.nCuenta = nCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nCuenta=" + nCuenta + '}';
    }
    
    

}
