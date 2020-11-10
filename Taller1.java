import java.util.Random;
public class Taller1 {

    public static void main(String[] args) {


        Random azar = new Random ();
        int largo = azar.nextInt(20)+1;
        int [] producto = new int[largo];
        agregarProducto(producto);

        mostrarProducto(producto);

    }



    public static int[] agregarProducto (int[] producto){
        Random azar = new Random ();

        for (int i=0; i< producto.length; i++){
            producto[i]=azar.nextInt(16);
        }
        return producto;

    }

    public static void mostrarProducto(int[] producto){
        int total = 0;
        for (int i=0; i< producto.length; i++){
            total = total +producto[i];
            System.out.println("El numero total de productos que va a comprar son: "+total);
        }
    }
    

}
