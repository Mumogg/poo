public class Automovil {
    String fabricante;
    String modelo;
    String color;
    double cilindrada;
    int capacidadEstanque = 40;

    public String verDetalle(){
        return "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;

    }

    public String acelerar(int rpm){
        return "el auto "+ fabricante + " acelerando a "+rpm+" rpm";
    }

    public String frenar(){
        return this.fabricante+ " "+this.modelo+" frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(capacidadEstanque*porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina){
        return km/(capacidadEstanque*(porcentajeGasolina/100f));
    }
}
