import java.util.Scanner;

public class ejercicio1{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        if(edad < 0){
            System.out.println("Ingrese una edad válida.");
        } else{
            if(edad < 18){
                System.out.println("Es menor de edad.");
            } else{
                System.out.println("Es mayor de edad.");
            }
        }
        
    }
}