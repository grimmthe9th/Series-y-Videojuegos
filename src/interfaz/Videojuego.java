/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author grimm
 */
public class Videojuego implements Entregable {
    
    // atributos
    public String titulo;
    public int HsEstimadas;
    boolean entregado;
    public String genero;
    public String compania;
    
    // atributos constantes
    
    public final static int MAYOR= 0;
    public final static int MENOR= 0; 
    public final static int IGUAL = 0;
    public final static int HSPORDEFECTO = 5;
    
     //Constructor por defecto
     public Videojuego(){
     this("",HSPORDEFECTO,"","");
    }
 
    //Constructor de 2 parametros
     public Videojuego(String titulo,String Creador){
     this(titulo,HSPORDEFECTO,"",Creador);
     }


    //constructor de 4 parametros 
    public Videojuego(String titulo, int HsEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.HsEstimadas = HsEstimadas;
        this.genero = genero;
        this.compania = compania;
    }
    
   
    // getters & setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHsEstimadas() {
        return HsEstimadas;
    }

    public void setHsEstimadas(int HsEstimadas) {
        this.HsEstimadas = HsEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    // metodo ToString
    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", HsEstimadas=" + HsEstimadas + ", genero=" + genero + ", compania=" + compania + '}';
    }
    
    //Metodo compareTo
    public int CompareTo(Object a){
                                                                                          
        int estado = MENOR;
        Videojuego ref = (Videojuego)a;
       
        if (HsEstimadas > ref.getHsEstimadas()) {
            estado = MAYOR;
            
        }else if (HsEstimadas == ref.getHsEstimadas()){
            estado = IGUAL;
        }
    return estado; 
    }

@Override       
 public void entregar(){
    
     entregado = true;
     
 }        
 @Override          
 public void devolver(){
 
     entregado = false;
 }              

@Override
public boolean isEntregado(){
    if(entregado) {
        return true;
    }else{
        return false;
    }}

    @Override
    public int compareTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
