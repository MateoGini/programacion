import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */
public class iterativas {
    public static void main(String [] args) {
        int edad, pacientes, opcion, prestadores;
        int atendidos=0;
        int contadorprestador= 0;
        int contadoredad=0;
        try{
            System.out.println("Ingrese la opcion");
            BufferedReader entrada3 = new BufferedReader( new InputStreamReader(System.in));
            opcion = Integer.valueOf(entrada3.readLine());

    switch(opcion){
    case 1:{ 
        System.out.println("Ingrese la cantidad de pacientes");
        BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
        pacientes = Integer.valueOf(entrada.readLine());
         if(pacientes<15){
            for(int i=0; i<pacientes; i++){
            System.out.println("Ingrese la edad del paciente");
            BufferedReader entrada2 = new BufferedReader( new InputStreamReader(System.in));
            edad = Integer.valueOf(entrada2.readLine());
           if(edad>=78){
            contadoredad++;
        }
            }
            System.out.println("La cantidad de pacientes mayor a 78 es " + contadoredad);
        }
    }
    break;

    case 2:{
        System.out.println("Ingrese la cantidad de prestadores");
        BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
        prestadores = Integer.valueOf(entrada.readLine());
        if(prestadores<10){
            for (int i =0; i<prestadores; i++){
                System.out.println("Ingrese la cantidad de atendidos por cada paciente");
                BufferedReader entrada4 = new BufferedReader( new InputStreamReader(System.in));
                atendidos = Integer.valueOf(entrada4.readLine());
            
        if(atendidos>=10){
        contadorprestador++;
        }
    }
        System.out.println("la cantida de prestadores que atendieron mas de 10 es " + contadorprestador);
        }
    
    }
    break;

    default:System.out.println("error en la opcion");
    }
        }
    catch(Exception e){
    System.out.println("el numero ingresado no es valido");
        }
}

}
