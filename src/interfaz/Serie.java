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
public class Serie implements Entregable {
  
    
    
  //atributos  
  public String titulo;
  public int ntemp ;
  boolean entregado= false;
  public String genero;
  public String creador;
    
//atributos constantes
 public final static int MAYOR= 0;
 public final static int MENOR= 0; 
 public final static int IGUAL = 0;
 public final static int TEMPPORDEFECTO=3;
   
    //Constructor por defecto
     public Serie(){
     this("",TEMPPORDEFECTO,"","");
    }
 
    //Constructor de 2 parametros
     public Serie(String titulo,String Creador){
     this(titulo,TEMPPORDEFECTO,"",Creador);
     }
     
    //Constructor de 4 parametros
     public Serie(String titulo, int ntemp ,String genero, String creador) {
        this.titulo = titulo;
        this.ntemp = ntemp;
        this.genero = genero;
        this.creador = creador;
    }
    
  
  // getters & setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getntemp() {
        return ntemp;
    }

    public void setntemp(int ntemp) {
        this.ntemp = ntemp;
    }



    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

   // metodo ToString
    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", ntemp=" + ntemp + ", genero=" + genero + ", creador=" + creador + '}';
    }
  
    // metodo CompareTo
    public int CompareTo(Object a){
                                                                                          
        int estado = MENOR;
        Serie ref = (Serie)a;
       
        if (ntemp > ref.getntemp()) {
            estado = MAYOR;
            
        }else if (ntemp == ref.getntemp()){
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
    
   
     
    

