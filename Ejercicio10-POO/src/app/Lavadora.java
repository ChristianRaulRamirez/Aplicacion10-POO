package app;
public class Lavadora extends Electromestico{
    
    private int carga;

    public int getCarga() {
        return carga;
    }

    @Override
    public double obtenerPrecioFinal() {
       double plus = super.obtenerPrecioFinal();
       if(carga > 30){
           plus += 50;
       }
       return plus;
    }
    

    
    public Lavadora(String color, char consumoEnergetico, double precioBase, double peso,int carga) {
        super(color, consumoEnergetico, precioBase, peso);
        this.carga = carga;
    }
    
}
