public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza", "Blanco", 2.0);
        

        Automovil mazda = new Automovil(
        "Mazda", 
        "BT-50", 
        "Blanco", 
        3.0);
    


        System.out.println(mazda.verDetalle());
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(3000));

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 0.75f));
    }
}
