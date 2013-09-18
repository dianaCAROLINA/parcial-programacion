
package letrass;
import javax.swing.*;

public class letrikas {
    String ax; 
      public void introduzca_texto(){
           ax = JOptionPane.showInputDialog("introduza el texto:");
         
JOptionPane.showMessageDialog(null, "El texto ingresado es: "+ax);
      }
      public void buscar_vocales (){
          
           int cont1 = 0,cont2=0;
          for (int i=0;i<ax.length();i++){
              
             cont1++; 
          }
          for (int i=0;i<ax.length();i++){
              if ((ax.charAt(i)=='a')|| (ax.charAt(i)=='e')||(ax.charAt(i)=='i')||(ax.charAt(i)=='o')||(ax.charAt(i)=='u')){
                cont2++;  
              }
          }
          JOptionPane.showMessageDialog(null,"el texto\n"+ax+"contiene\n"+cont2+"\n"+"vocales");   
      }
}
