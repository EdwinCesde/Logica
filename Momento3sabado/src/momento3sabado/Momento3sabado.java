
package momento3sabado;

import java.util.Scanner;
public class Momento3sabado {

   
    public static void main(String[] args) {
       Scanner dato = new Scanner(System.in);
       String nombrecliente, nombrearticulo;
       String nom[] = new String[30];
       float vlrcre[] = new float[30];
       float vlrbruto, IVA, vlrtotal, vlrunitario, acum = 0, promvp = 0, vlrcuota, vlrtotalcredito, vlrRestante = 0, totalpc = 0;
       int cantvendida, cc, i, N;
       char res, menu;
        System.out.println("Por favor elija la opción que desee realizar (1 = Venta Regular, 2 = Venta a Crédito, 3 = Clientes Registrados, 4 = Salir)");
        menu = dato.next().charAt(0);
        switch(menu){
            case '1':
                System.out.println("¿Desea facturar artículos? (S/N)");
                res = dato.next().charAt(0);
                if(res == 'S' || res == 's'){
                    System.out.println("Ingrese la cantidad de artículos que desea facturar");
                    N = dato.nextInt();
                    for(i = 0; i <= N-1; i++){
                        System.out.println("Ingrese el nombre del artículo: ");
                        nombrearticulo = dato.next();
                        System.out.println("Ingrese el valor unitario del artículo: ");
                        vlrunitario = dato.nextFloat();
                        System.out.println("Ingrese la cantidad de artículos vendidos: ");
                        cantvendida = dato.nextInt();

                        vlrbruto = vlrunitario * cantvendida;
                        IVA = (float) (vlrbruto * 0.19);
                        vlrtotal = vlrbruto + IVA;
                        acum = acum + vlrtotal;

                        System.out.println("*****************FACTURA*****************");
                        System.out.println("Nombre del articulo: "+nombrearticulo);
                        System.out.println("Valor bruto del artículo: "+vlrbruto);
                        System.out.println("Valor del IVA del artículo: "+IVA);
                        System.out.println("Total a pagar: "+vlrtotal);
                    }
                    promvp = acum / N;
                    System.out.println("valor Promedio de ventas: "+promvp);
                    System.out.println("*****************Edwin inc*****************");
                }else{
                    System.out.println("Que tenga un buen día");
                }
                break;
            case '2':
                System.out.println("Escriba el nombre del cliente: ");
                nombrecliente = dato.next();
                System.out.println("Ingrese el valor total del crédito");
                vlrtotalcredito = dato.nextFloat();
                System.out.println("Ingrese la cantidad de cuotas pagadas: ");
                cc = dato.nextInt();
                for(i = 1; i <= cc; i++){
                    System.out.println("Ingrese el valor de la cuota número "+i);
                    vlrcuota = dato.nextFloat();
                    totalpc = totalpc + vlrcuota;
                }
            vlrRestante = totalpc - vlrtotalcredito;
            
                System.out.println("**************Flamingo**************");
                System.out.println("Señor (a): "+nombrecliente);
                System.out.println("Valor total pagado: $"+totalpc);
                System.out.println("Valor restante: $"+vlrRestante);
                break;
            case '3':
                System.out.println("¿Cuantos clientes desea ingresar? ");
                N = dato.nextInt();
                
                for(i = 0; i <= N-1; i++){
                    System.out.println("Nombre del cliente: ");
                    nom[i] = dato.next();
                    System.out.println("valor de crédito: ");
                    vlrcre[i] = dato.nextFloat();
                }
                
        }
        
    }
    
}
