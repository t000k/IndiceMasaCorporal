
package indice.de.masa.corporal;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Menu {
    String opciones[];
    final int SALIR =5;
    
public Menu(){
        opciones=new String[5];
        opciones[0]="Calcular IMC";
        opciones[1]="Calcular RFC";
        opciones[2]="Opcion 3";
        opciones[3]="Opcion 4";
        opciones[4]="salir";
    }
    
public String desplegarOpciones(){
    String str="";
    int nopc;
    
    for(int i=0; i<opciones.length;i++){
        nopc=i+1;
        str+=nopc+"."+opciones[i]+"\n";
    }
    
    return str;
    }

public void desplegarMenu(Scanner sc){
    int opcSelected = 0;
    do{
        System.out.print(desplegarOpciones());
        opcSelected=sc.nextInt();
        procesarOpcionSelected(opcSelected);
    }while(opcSelected != SALIR);

}

public void procesarOpcionSelected(int opc){
    switch(opc){
        case 1:
            System.out.println("Se selecciono calcular IMC...");
            break;
        case 2:
            System.out.println("Se selecciono Calcular RFC...");
            break;
        case 3:
            System.out.println("Se selecciono la opcion 3...");
            break;
        case 4:
            System.out.println("Se selecciono la opcion 4...");
            break;
        case 5:
            System.out.println("Se selecciono la opcion de salir...");
            break;
        default:
            System.out.println("Seleccionó opcion invalida...");
    
    }

}

public void desplegarMenuJOP(){
    int opcSelected=5;
    String OpcionStr;
    do{
       OpcionStr = JOptionPane.showInputDialog(null, desplegarOpciones());
       opcSelected = Integer.parseInt(OpcionStr);
       procesarOpcionSelectedJOP(opcSelected);
    }while(opcSelected !=SALIR);
    JOptionPane.showMessageDialog(null,"Saliendo ... ");
    }

public void procesarOpcionSelectedJOP(int opc){
    switch(opc){
        case 1:
            JOptionPane.showMessageDialog(null,"Se seleccionó calcular ICM...");
            persona p1 = new persona();
            p1.inInfo();
            JOptionPane.showMessageDialog(null, p1.getInfo());
            
        break;
        case 2:
            JOptionPane.showMessageDialog(null,"Se selecciono Calcular RFC...");
            RFC p2 = new RFC();
            p2.inInfo();
            JOptionPane.showMessageDialog(null, p2.getInfo());
        break;
        case 3:
            JOptionPane.showMessageDialog(null,"Se selecciono la opcion 3...");
        break;
        case 4:
            JOptionPane.showMessageDialog(null,"Se selecciono la opcion 4...");
        break;
        case 5:
            JOptionPane.showMessageDialog(null,"Se selecciono la opcion 5...");
        break;
    }

}
}