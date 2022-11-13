
package indice.de.masa.corporal;

import javax.swing.JOptionPane;


public class persona {
    String nombre;
    int edad;
    double estatura;
    double peso;
    
    public persona(String nombre, int edad, double estatura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
    public persona (){
    
    
    }
    
    public void inInfo(){
      
          //  String nombre;
         nombre= JOptionPane.showInputDialog(null,"Nombre de la persona: ");
         
         String strAux;
         strAux =JOptionPane.showInputDialog(null,"Edad: ");
         edad = Integer.parseInt(strAux);
         
         String strest;
         strest =JOptionPane.showInputDialog(null,"Estatura: ");
         estatura = Double.parseDouble(strest);
         
         String strpeso;
         strpeso =JOptionPane.showInputDialog(null,"Peso: ");
         peso = Double.parseDouble(strpeso);
         
         
    }
    
    //obtener informacion de la persona retornada en string
    public String getInfo(){
        String str = " ";
        str += "Nombre: "+nombre+"\n";
        str += "Edad: "+ edad+"\n";
        str += "Estatura: "+ estatura + "\n";
        str += "Peso: "+ peso + "\n";
        String strAux = String.format("%.2f", calcularIMC());
        str += "IMC: "+ strAux+"\n";
        str += "Rango: " +interpretarIMC()+ "\n";
        
        return str;
    }
    
    //Calcular imc
    public double calcularIMC(){
        double imc =0.0;
        imc = peso/(estatura*estatura);
        return imc;
    }
    
    //decir en que rango se encuentra el imc segun lo que retorne calcularIMC()
    public String interpretarIMC(){
        String str = "";
        double imc = calcularIMC();
        
        if(imc<18.5){
            str = "Peso insuficiente.";
        }else if(imc >= 18.5 && imc < 24.6){
            str = "Peso normal.";
            }else if(imc >=25.0 && imc <=29.9){
                str = "Sobrepeso.";
            }else{
                str="No entra en un rango";
            }
        return str;
    }
}
