

package laboratorion2;

import java.util.ArrayList;


public class Alumno {
    
    private String nombre,date,ciudad,nacionalidad,usuaro,password;
    private int nCuenta, ID, edad;
    
    private ArrayList<Examen> examen = new ArrayList<>();
    
    public Alumno(){
        
    }

    public Alumno(String nombre, String date, String ciudad, String nacionalidad, String usuaro, String password, int nCuenta, int ID, int edad) {
        this.nombre = nombre;
        this.date = date;
        this.ciudad = ciudad;
        this.nacionalidad = nacionalidad;
        this.usuaro = usuaro;
        this.password = password;
        this.nCuenta = nCuenta;
        this.ID = ID;
        this.edad = edad;
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

    public String getUsuaro() {
        return usuaro;
    }

    public void setUsuaro(String usuaro) {
        this.usuaro = usuaro;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList getExamen() {
        return examen;
    }

    public void setExamen(ArrayList examen) {
        this.examen = examen;
    }

    @Override
    public String toString() {
        return "Alumno\n" + 
                "Nombre: " + nombre + 
                "\nFecha de Nacimiento: " + date + 
                "\nCiudad: " + ciudad + 
                "\nNacionalidad: " + nacionalidad + 
                "\nUsuaro: " + usuaro + 
                "\nPassword: " + password + 
                "\n# de Cuenta: " + nCuenta + 
                "\nID: " + ID + 
                "\nEdad:" + edad + '\n';
    }

    

}
