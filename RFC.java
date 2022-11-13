
package indice.de.masa.corporal;

import javax.swing.JOptionPane;


public class RFC {
    String dia;
    String mes;
    String año;
    String Amaterno;
    String Apaterno;
    String Nombre;
    
    public RFC(String nombre, String Apaterno, String Amaterno, String dia, String mes, String año){
        this.Nombre = nombre;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.dia = dia;
        this.mes = mes;
        this.año= año; 
    }
     
    public RFC(){
    
    }
   
    public void inInfo(){
        
         Nombre= JOptionPane.showInputDialog(null,"Nombre de la persona: ");
         Apaterno =JOptionPane.showInputDialog(null,"Apellido Paterno: ");
         Amaterno =JOptionPane.showInputDialog(null,"Apellido Materno: ");
         dia =JOptionPane.showInputDialog(null,"Dia de nacimiento: ");
         mes =JOptionPane.showInputDialog(null,"Mes de nacimiento [MM]: ");
         año =JOptionPane.showInputDialog(null,"Año de nacimiento: ");
         
         String str;
    }
    
    public String evaluarMes(){
        String str="";
        switch(mes){
            case "01":
                str = "Enero";
                break;
            case "02":
                str = "Febrero";
                break;
            case "03":
                str = "Marzo";
                break;
            case "04":
                str = "Abril";
                break;
            case "05":
                str = "Mayo";
                break;
            case "06":
                str = "Junio";
                break;
            case "07":
                str = "Julio";
                break;
            case "08":
                str = "Agosto";
                break;
            case "09":
                str = "Septiembre";
                break;
            case "10":
                str = "Octubre";
                break;
            case "11":
                str = "Noviembre";
                break;
            case "12":
                str = "Diciembre";
                break;
                
            default: str=mes;
        }

        return str;
    }
    
    public String getInfo(){
        String str = " ";
        str += "Nombre: \n"+Nombre+" "+Apaterno+" "+Amaterno+"\n";
        str += "Fecha de nacimineto: \n"+dia+"/"+evaluarMes()+"/"+año+"\n";
        str += "RFC: "+CalcularRFC();
        return str;
    }
    
    public String CalcularRFC(){
        String rfc="";
        rfc =Apaterno.trim().substring(0,2);
        rfc = rfc.concat(Amaterno.trim().substring(0,1));
        rfc = rfc.concat(Nombre.trim().substring(0,1));
        rfc = rfc.concat(año.substring(2,4));
        rfc = rfc.concat(mes);
        rfc = rfc.concat(dia);
        return rfc;
    }
}
