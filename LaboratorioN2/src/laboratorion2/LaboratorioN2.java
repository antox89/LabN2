package laboratorion2;

import java.util.ArrayList;
import java.util.Scanner;

public class LaboratorioN2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Alumno al = new Alumno();
        Examen ex = new Examen();
        
        ArrayList<Examen> examenes = new ArrayList();
        ArrayList<Examen> materia = new ArrayList();
        
        ArrayList alumno = new ArrayList();
        
        String user = "admin", pwd = "123";
        
        

        int menu = -1;

        do {//Menú de administración
            menuAdmin();
            menu = sc.nextInt();

            switch (menu) {
                case 1://Administrar Exámenes
                    int menuMa = -1;
                    do {
                        menuMaestros();
                        menuMa = sc.nextInt();

                        switch (menuMa) {//switch crear exámenes
                            case 1://crear
                                String nombre;
                                
                                System.out.println("Ingrese el nombre de la clase");
                                nombre = sc.next();
                                
                                
                                ArrayList<String> pregunta= new ArrayList();
                                String preg="";
                                
                                do{
                                    System.out.println("Ingrese una pregunta: ");
                                    preg=sc.next();
                                    
                                    pregunta.add(preg);
                                    
                                    System.out.println("Agregar otra pregunta? (si/no)");
                                    preg=sc.next();
                                    
                                }while(!preg.equalsIgnoreCase("no"));
                                
                                examenes.add(new Examen(nombre));
                                examenes.get(examenes.size()-1).setPreguntas(pregunta);
                                

                                break;
                            case 2://Revisar Exámenes
                                int pos;
                                System.out.println("Ingrese el posición del examen a revisar:\n");
                                pos=sc.nextInt();
                                
                                
                                
                                for (Object temp : examenes) {
                                    if (temp instanceof Examen) {

                                    }
                                }
                                break;
                            case 3://Ver notas
                                break;
                            case 4://Modificar notas
                                break;

                        }

                    } while (menuMa != 0);

                    break;//final de Administrar Exámenes
                case 2://Crear cuentas
                    int menuCre = -1;
                    do {
                        menuCrear();
                        menuCre = sc.nextInt();

                        switch (menuCre) {//switch crear cuentas
                            case 1:
                                String nombre,
                                 date,
                                 ciudad,
                                 nacionalidad,
                                 usuaro,
                                 password;
                                int nCuenta,
                                 ID,
                                 edad;
                                System.out.println("<<Registro de Alumnos>>");
                                System.out.println("Nombre del Alumno:");
                                nombre=sc.next();
                                System.out.println("Numero de Cuenta:");
                                nCuenta=sc.nextInt();
                                System.out.println("Fecha de Nacimiento:");
                                date=sc.next();
                                System.out.println("Edad:");
                                edad=sc.nextInt();
                                System.out.println("Ciudad de Nacimiento:");
                                ciudad=sc.next();
                                System.out.println("Nacionalidad:");
                                nacionalidad=sc.next();
                                System.out.println("ID:");
                                ID=sc.nextInt();
                                System.out.println("Usuario:");
                                usuaro=sc.next();
                                System.out.println("Password:");
                                password=sc.next();
                                
                                alumno.add(new Alumno(nombre, date, ciudad, 
                                        nacionalidad, usuaro, password, nCuenta, ID, edad));
                                
                                System.out.println("¡Alumno Creado Exitosamente!\n");
                                
                                break;
                        }//final switch crear cuentas

                    } while (menuCre != 0);
                    break;//final de Crear cuentas
                case 3://Log In

                    int menuLogIn = -1;
                    do {//Menú Log In
                        menuLogIn();
                        menuLogIn = sc.nextInt();
                        switch (menuLogIn) {//Opciones menú log in
                            case 1:
                                String usuario,
                                 password;

                                System.out.println("Usuario: ");
                                usuario = sc.next();
                                System.out.println("Contraseña: ");
                                password = sc.next();

                                for (Object temp : alumno) {
                                    if (temp instanceof Alumno) {

                                    }
                                }

                                if (usuario.equals(user) && password.equals(pwd)) {

                                    int menuUsuario = -1;
                                    do {//Opcionces de menú alumno
                                        menuEstudiante();
                                        menuUsuario = sc.nextInt();

                                        switch (menuUsuario) {//
                                            case 1://Ver datos
                                                al.toString();
                                                for (Object temp : alumno) {
                                                    if (temp instanceof Alumno) {
                                                        
                                                    }
                                                }
                                                break;
                                            case 2://Modificar Datos
                                                
                                                
                                                break;
                                            case 3://Realizar Exámen
                                                break;
                                            case 4://Modificar notas
                                                
                                                break;

                                        }

                                    } while (menuUsuario != 0);//Final de opciones menú estudiante

                                } else {
                                    System.err.println("\nRevise el usuario/contraseña!\n");
                                }
                                break;

                        }

                    } while (menuLogIn != 0);//Final menú Log In
                    break;//Final Log In

            }

        } while (menu != 0);//Final menú principal {do/while}

    }

    public static void menuAdmin() {
        System.out.println("<<Administración de Exámenes>>\n"
                + "1 - Administración\n"
                + "2 - Crear Cuenta\n"
                + "3 - Log In\n"
                + "0 - Salir\n");
    }

    public static void menuMaestros() {
        System.out.println("<<Admin Maestros>>\n"
                + "1 - Crear Exámen\n"
                + "2 - Revisar Exámen\n"
                + "3 - Ver Notas\n"
                + "4 - Modificar Notas\n"
                + "0 - Regresar al menú principal\n");
    }

    public static void menuCrear() {
        System.out.println("<<Crear Cuentas de Alumnos>>\n"
                + "1 - Crear Alumno\n"
                + "0 - Regresar al menú principal\n");
    }

    public static void menuLogIn() {
        System.out.println("<<Log In de Estudiantes>>\n"
                + "1 - Ingresar\n"
                + "0 - Regresar al menú principal");
    }

    public static void menuEstudiante() {
        System.out.println("<<Menú Estundiantes>>\n"
                + "1 - Ver Datos\n"
                + "2 - Modificar Datos\n"
                + "3 - Realizae Exámenes\n"
                + "4 - Ver Notas\n"
                + "0 - Log Out\n");
    }

}
