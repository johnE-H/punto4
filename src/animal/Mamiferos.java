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
public class Mamiferos  extends Animals{
    
    private String piel;
    private String viviparo;

    public Mamiferos() {
    }

    public Mamiferos(String piel, String vivipar, String tipo, String nombre, short Patas, String dieta) {
        super(tipo, nombre, Patas, dieta);
        this.piel = piel;
        this.viviparo = viviparo;
    }

    /**
     * @return the piel
     */
    public String getPiel() {
        return piel;
    }

    /**
     * @param piel the piel to set
     */
    public void setPiel(String piel) {
        this.piel = piel;
    }

    /**
     * @return the viviparo
     */
    public String getViviparo() {
        return viviparo;
    }

    /**
     * @param viviparo the viviparo to set
     */
    public void setViviparo(String viviparo) {
        this.viviparo = viviparo;
    }
    
      public Mamiferos ingresarDatosA (){
          
Mamiferos ma= new Mamiferos();
String nombre = "";
String bioma = "";
int patas = 0;
String dieta = "";
String piel ="";
String viviparo="es viviparo";




dieta = leerDatoTipoCadena("ingrese si es carnivoro,hervivoro o frugívoros: ");
nombre = leerDatoTipoCadena("Ingrese el nombre del animal: ");
bioma = leerDatoTipoCadena("Ingrese el ecosistema al que pertenece: ");
patas= leerDatoTipoEntero("Cuantas patas tiene: ");
piel= leerDatoTipoCadena("tiene pelo?");







//Definimos los datos para el constructor
ma.setNombre(nombre);
ma.setBioma(bioma);
ma.setPatas(patas);
ma.setDieta(dieta);
ma.setViviparo(viviparo);
ma.setPiel(piel);




//Retornamos el objeto
return (ma);
}
      public void imprimirMamif()
{

imprimirDatosAnimal();
    

JOptionPane.showMessageDialog(null,"el animal  " + piel +" tiene pelo y es " + viviparo);

}
      
      public void definirAlimento (String dieta){
    String comida = "";
    switch (dieta) {
            case "carnivoro":
                comida = "carne";
                break;
            case "hervivoro":
                comida = "plantas";
                break;
                 case "frugivoros":
                comida = "frutas de los arboles";
                break;
            default:
                break;
        }
    
   
    JOptionPane.showMessageDialog(null,"l@s" + getNombre()
    + " son animalescon una dieta predominante de " + comida + " " );
    }


    
    
}
