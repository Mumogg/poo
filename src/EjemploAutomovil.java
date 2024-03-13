import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza", "Blanco", 2.0);
        

        Automovil mazda = new Automovil(
        "Mazda", 
        "BT-50", 
        "Blanco", 
        3.0);
    
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro",3.5, 50);
        
        Date fecha = new Date();

        System.out.println("son iguales? "+(nissan==nissan2));
        System.out.println("son iguales? "+(nissan.equals(nissan2)));
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.verDetalle());
        System.out.println(nissan.verDetalle());
        
        
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(3000));

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 0.75f));
        System.out.println();
    }
}
