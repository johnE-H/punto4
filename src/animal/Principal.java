
package animal;

import javax.swing.JOptionPane;


public class Principal {

    public Principal() {
    }
    public static void main(String[] args)
{

  int opcion = 0;
Animals principal = new Animals();





opcion = principal.leerDatoTipoEntero("1. Para procesar los datos del mamifero"+"\n"
        +"2. Para procesar datos de reptiles "+"\n 3.Para procesar datos de aves"+"\n 4.Para salir");
if (opcion == 1){

Mamiferos manejadorA = new Mamiferos();

manejadorA=manejadorA .ingresarDatosA();

manejadorA.imprimirMamif();

}
else{
    if(opcion == 2){
       
        
        Reptiles manejadorR = new Reptiles();
     
       manejadorR = manejadorR.ingresarDatosR();
    
      manejadorR.imprimirDatosAnimal();
     
      manejadorR.imprimirReptil();
    }else{
        if (opcion == 3) {
            
            Aves manejadorAv=new Aves();
            manejadorAv=manejadorAv.ingresarDatosAv();
            manejadorAv.imprimirDatosAnimal();
            manejadorAv.imprimirAves();
            
            
        } else {
        
        if(opcion == 4){
            
            JOptionPane.showMessageDialog(null,"Saliendo");
           
            }else{
            JOptionPane.showMessageDialog(null,"Opción no definida");
            }

        }
    
    }
}









}
    
}
