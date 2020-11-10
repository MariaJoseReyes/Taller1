import java.util.Random;
public class Taller1 {

    public static void main(String[] args) {


        crearLargo();

    }

    public static void crearProducto (){
        int largo = crearLargo();

    }

    public static int crearLargo(){
        Random azar = new Random ();
        int largo = azar.nextInt(20)+1;
        System.out.println(largo);
        return largo;
    }
}
