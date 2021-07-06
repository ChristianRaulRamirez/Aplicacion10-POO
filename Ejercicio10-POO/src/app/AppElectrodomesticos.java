package app;

import java.util.Scanner;

public class AppElectrodomesticos {
    public static void main(String[] args) {

        System.out.println("Control de Electrodomésticos");
        Scanner teclado = new Scanner(System.in);
        Electromestico[] listaElectrodomesticos = new Electromestico[3];
        int opcion;
        
        //Registramos nuestros electrodomesticos
        for(int i = 0;i < listaElectrodomesticos.length;){
            System.out.println("\nDigite una opcion : ");
            System.out.println("1 . Agregar electrodoméstico  ");
            System.out.println("2 . Agregar lavadora ");
            System.out.println("3 . Agregar televisión");
            System.out.print("Digite una opcion : ");
            opcion = teclado.nextInt();
            
            if(opcion == 1 || opcion == 2 || opcion == 3){
                switch(opcion){
                    case 1:
                        String colorElectrodomestico;
                        char consumoEnergeticoElectrodomestico;
                        double precioBaseElectrodomestico,pesoElectrodomestico;
                        
                        System.out.print("\nDigite un color : ");
                        colorElectrodomestico = teclado.next();
                        
                        System.out.print("Digite el consumo energético : ");
                        consumoEnergeticoElectrodomestico = teclado.next().charAt(0);
                        
                        System.out.print("Digite el precio base : ");
                        precioBaseElectrodomestico = teclado.nextDouble();
                        
                        System.out.print("Digite el peso : ");
                        pesoElectrodomestico = teclado.nextDouble();
                        
                        listaElectrodomesticos[i] = new Electromestico(colorElectrodomestico, consumoEnergeticoElectrodomestico, precioBaseElectrodomestico, pesoElectrodomestico);
                        System.out.println("\nElectrodomestico agregado . ");
                        i++;
                        break;
                        
                    case 2:
                        String colorLavadora;
                        char consumoEnergeticoLavadora;
                        double precioBaseLavadora,pesoLavadora;
                        int cargaLavadora;
                        
                        System.out.print("\nDigite un color : ");
                        colorLavadora = teclado.next();
                        
                        System.out.print("Digite el consumo energético : ");
                        consumoEnergeticoLavadora = teclado.next().charAt(0);
                        
                        System.out.print("Digite el precio base : ");
                        precioBaseLavadora = teclado.nextDouble();
                        
                        System.out.print("Digite el peso : ");
                        pesoLavadora = teclado.nextDouble();
                        
                        System.out.print("Digite la carga de la lavadora : ");
                        cargaLavadora = teclado.nextInt();
                        
                        listaElectrodomesticos[i] = new Lavadora(colorLavadora, consumoEnergeticoLavadora, precioBaseLavadora, pesoLavadora, cargaLavadora);
                        System.out.println("\nLavadora agregada . ");
                        i++;
                        break;
                        
                    case 3:
                        String colorTelevisor;
                        char consumoEnergeticoTelevisor;
                        double precioBaseTelevisor,pesoTelevisor;
                        int resolucion;
                        boolean sincronizadorTDT;
                        
                        System.out.print("\nDigite un color : ");
                        colorTelevisor = teclado.next();
                        
                        System.out.print("Digite el consumo energético : ");
                        consumoEnergeticoTelevisor = teclado.next().charAt(0);
                        
                        System.out.print("Digite el precio base : ");
                        precioBaseTelevisor = teclado.nextDouble();
                        
                        System.out.print("Digite el peso : ");
                        pesoTelevisor = teclado.nextDouble();
                        
                        System.out.print("Digite la resolucion : ");
                        resolucion = teclado.nextInt();
                        
                        System.out.print("Digite el sincronizador TDT : ");
                        sincronizadorTDT = teclado.nextBoolean();
                        
                        listaElectrodomesticos[i] = new Televisor(colorTelevisor, consumoEnergeticoTelevisor, precioBaseTelevisor, pesoTelevisor, resolucion, sincronizadorTDT);
                        System.out.println("\nTelevisor agregado . ");
                        i++;
                        break;
                        
                    default:
                        System.out.println("\nOpción no disponible , vuelva a intentar . ");
                        break;
                }
            }
        }
        
        //Calculamos la suma de todos los electrodomesticos
        double sumaElectrodomesticos = 0;
        double sumaTelevisores = 0;
        double sumaLavadoras = 0;
        
        //Recorremos nuestra lista de electrodomesticos 
        for(int i = 0;i < listaElectrodomesticos.length;i++){
            if(listaElectrodomesticos[i] instanceof Electromestico){
                sumaElectrodomesticos += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Televisor){
                sumaTelevisores += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
        }
        
        //mostramos la suma de los electrodomesticos
        System.out.println("\nLa suma del precio de electrodomesticos es de : " + sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es : " + sumaLavadoras);
        System.out.println("La suma del precio de los televisores es de : " + sumaTelevisores);
    }
}
