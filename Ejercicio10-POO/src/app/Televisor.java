package app;
public class Televisor extends Electromestico{
    
    private int resolucion;
    private boolean sincronizadorTDT;

    @Override
    public double obtenerPrecioFinal() {
       double plus = super.obtenerPrecioFinal();
       if(resolucion > 40){
           plus += precioBase * 0.3;
       }
       if(sincronizadorTDT){
           plus += 50;
       }
       return plus;
    }

    
    public Televisor(String color, char consumoEnergetico, double precioBase, double peso,int resolucion,boolean sincronizadorTDT) {
        super(color, consumoEnergetico, precioBase, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }
    
    
    
}
