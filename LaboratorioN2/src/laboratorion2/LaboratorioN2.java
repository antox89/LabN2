
package laboratorion2;

import java.util.Scanner;

public class LaboratorioN2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Alumno al = new Alumno();
        
        int menu=-1;
        
        do{
            
            menu=sc.nextInt();
            
            switch(menu){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            
        }while (menu!=0);
        
    }
    
    public static void menuAdmin(){
        System.out.println("<<Administración de Exámenes>>\n"
                    + "1 - Administración\n"
                    + "2 - Crear Cuenta\n"
                    + "3 - Log In\n");
    }
    
    public static void menuMaestros(){
        
    }

}
