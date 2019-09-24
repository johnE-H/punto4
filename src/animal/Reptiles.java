/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import javax.swing.JOptionPane;

/**
 *
 * @author johnh
 */
public class Reptiles extends Animals {
    private String veneno;
    private String desplazamiento;

    public Reptiles() {
    }

    public Reptiles(String veneno, String desplazamiento, String tipo, String nombre, short Patas, String dieta) {
        super(tipo, nombre, Patas, dieta);
        this.veneno = veneno;
        this.desplazamiento = desplazamiento;
    }

   
    

   

    public String getVeneno() {
        return veneno;
    }

    
    public String getPiel() {
        return desplazamiento;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    public void setDezplasamiento(String desplasamiento) {
        this.desplazamiento = desplasamiento;
    }
    
      public Reptiles ingresarDatosR (){
          
Reptiles re= new Reptiles();
String nombre = "";
String bioma = "";
int patas = 0;
String dieta = "";
String desplazamiento ="";
String veneno="";




dieta = leerDatoTipoCadena("ingrese si es carnivoro,hervivoro o frugívoros: ");
nombre = leerDatoTipoCadena("Ingrese el nombre del animal: ");
bioma = leerDatoTipoCadena("Ingrese el ecosistema al que pertenece: ");
patas= leerDatoTipoEntero("Cuantas patas tiene: ");
desplazamiento= leerDatoTipoCadena("como es el desplazamiento" );
veneno=leerDatoTipoCadena("es venenenoso?");








//Definimos los datos para el constructor
re.setNombre(nombre);
re.setBioma(bioma);
re.setPatas(patas);
re.setDieta(dieta);
re.setDezplasamiento(desplazamiento);
re.setVeneno(veneno);





//Retornamos el objeto
return (re);
}
          public void imprimirReptil()
{

imprimirDatosAnimal();

JOptionPane.showMessageDialog(null,"el animal  " + veneno +" es venenoso y se desplasa" + desplazamiento);

}
             public void definirAlimento (String dieta){
    String comida = "";
    switch (dieta) {
            case "insectivoros":
                comida = "pequeños insectos y lombrizes";
                break;
            
                case "carnivoros":
                comida = "mamiferos, aves ,peces";
                break;
            default: JOptionPane.showMessageDialog(null,"no esta definido");
                break;
        }
    
   
    JOptionPane.showMessageDialog(null,"l@s" + getNombre()
    + " son animalescon una dieta predominante de " + comida + " " );
    }

    
    
}
