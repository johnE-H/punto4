
package animal;

import javax.swing.JOptionPane;


public class Animals { 
    
    private String bioma;
    private String nombre;
    private int  patas;
    private String dieta;
    
    public Animals(){
        
    }

    public Animals(String tipo, String nombre, short Patas, String dieta) {
        this.bioma = tipo;
        this.nombre = nombre;
        this.patas = Patas;
        this.dieta = dieta;
    }
    

    public String getBioma() {
        return bioma;
    }

 
    public void setBioma(String tipo) {
        this.bioma = tipo;
    }

  
    public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getPatas() {
        return patas;
    }

  
    public void setPatas(int nPatas) {
        this.patas = nPatas;
    }

   
    public String getDieta() {
        return dieta;
    }

   
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    
     public void imprimirDatosAnimal()
    {
        String datosPersona = "";
        datosPersona = "Nombre " + nombre + "\n"
        + "bioma " + bioma + "\n" +
        "Numero de patas " + patas + "\n" +
        "Dieta: " + dieta;
        JOptionPane.showMessageDialog(null,datosPersona);
       
        
    }
     public String leerDatoTipoCadena (String mensaje)
    {
        String valor = "";
        valor = JOptionPane.showInputDialog(null,mensaje);
        return (valor);
    }
      public int leerDatoTipoEntero (String mensaje)
        {
        short valor = 0;
        
        
            
            valor=Short.parseShort(JOptionPane.showInputDialog(null, mensaje));
            return (valor);
       } 
      
    
    
    
    
    
    
}
