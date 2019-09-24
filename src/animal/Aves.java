
package animal;

import javax.swing.JOptionPane;


public class Aves extends Animals {
    private String vuelo;
    private String pico;

    public Aves() {
    }

    public Aves(String vuelo, String pico, String tipo, String nombre, short Patas, String dieta) {
        super(tipo, nombre, Patas, dieta);
        this.vuelo = vuelo;
        this.pico = pico;
    }

 
    public String getVuelo() {
        return vuelo;
    }

 public String getPico() {
        return pico;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }
        public Aves ingresarDatosAv (){
          
Aves av= new Aves();
String nombre = "";
String bioma = "";
int patas = 0;
String dieta = "";
String pico ="";
String vuelo="";




dieta = leerDatoTipoCadena("ingrese si es carnivoro,hervivoro o frugívoros: ");
nombre = leerDatoTipoCadena("Ingrese el nombre del animal: ");
bioma = leerDatoTipoCadena("Ingrese el ecosistema al que pertenece: ");
patas= leerDatoTipoEntero("Cuantas patas tiene: ");
pico= leerDatoTipoCadena("tipo de pico" );
vuelo=leerDatoTipoCadena("tipo de vuelo");








//Definimos los datos para el constructor
av.setNombre(nombre);
av.setBioma(bioma);
av.setPatas(patas);
av.setDieta(dieta);
av.setPico(pico);
av.setVuelo(vuelo);





//Retornamos el objeto
return (av);
}
    
            public void imprimirAves()
{

imprimirDatosAnimal();

JOptionPane.showMessageDialog(null,"el animal es de pico  " + pico+"  y se su vuelo es " + vuelo);

}
              public void definirAlimento (String Dieta){
    String comida = "";
    switch (Dieta) {
            case "insectivoros":
                comida = "pequeños insectos y lombrizes";
                break;
            case "frugivoros":
                comida = "frutas de los arboles";
                break;
                case "carnivoros":
                comida = "mamiferos pequeños y otras aves";
                break;
            default: JOptionPane.showMessageDialog(null,"no esta definido");
                break;
        }
    
   
    JOptionPane.showMessageDialog(null,"l@s" + getNombre()
    + " son animalescon una dieta predominante de " + comida + " " );
    }

    
    
}  
    

