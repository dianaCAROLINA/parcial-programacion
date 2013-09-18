
package letrass;
import javax.swing.*;
public class Letrass {

 
    public static void main(String[] args) {
         String recib;
        int opc;
       
        letrikas ar =new letrikas();
        do{
          recib=JOptionPane.showInputDialog("MENU\n1.INTRODUCIR TEXTO\n2.BUSCAR VOCALES\n3.BUSCAR CONSONANTES\n4.SALIR");
          opc=Integer.parseInt(recib);
          switch(opc){
              case 1: 
                  ar.introduzca_texto();
                  break;
              case 2:
                  ar.buscar_vocales();
                  break;
              case 3:
                  ar.buscar_consonantes();
                  break;
          }
        }while(opc!=4);
        
    }
    }

