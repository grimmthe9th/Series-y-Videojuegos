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
public  class SyVApp implements Entregable {
    public static void main(String[] args) {
 
    Videojuego[] videojuego = new Videojuego[5];
    Serie[] series = new Serie [5];

    videojuego[0]= new Videojuego();
    videojuego[1]= new Videojuego("resident evil",6,"terror","capcom");
    videojuego[2]= new Videojuego("Devil May Cry",10,"terror","capcom");
    videojuego[3]= new Videojuego("the Sims",100,"simulacion social","Electronic Arts");
    videojuego[4]= new Videojuego("Call of duty",30,"FPS","Activision");
    
    series[0]= new Serie();
    series[1]= new Serie("Game of thrones",7,"fantasia","David benoff");
    series[2]= new Serie("Daredevil",2,"accion","Stan lee");
    series[3]= new Serie("Stranger things",2,"terror","the duffer brothers");
    series[4]= new Serie("Doctor who",10,"ciencia ficcion","Sidney newman");
        
        //imprimimos la lista de los dos arrays
      
        System.out.println("VIDEOJUEGOS");
        for (int i = 0; i < 5; i++) {
            
            System.out.println(videojuego[i]);
          
        }
        System.out.println("-------------");
        
        System.out.println("SERIES");
        
        for (int x = 0; x < 5; x++) {
            
            System.out.println(series[x]);
        }
        //entregar algunos videojuegos y series
        videojuego[1].entregar();
        videojuego[3].entregar();
        series[2].entregar();
        series[4].entregar();
        
        // recorremos los arrays para contar cuantos entregados hay y tambien los devolvemos
        int entregados = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i].isEntregado()) {
                entregados += 1;
                series[i].devolver();
            }
             if (videojuego[i].isEntregado()) {
                entregados += 1;
                videojuego[i].devolver();
            }
        
        }
        
        System.out.println("------------------------------------------");
        
        System.out.println("Hay " + entregados + "articulos entregados");
        
        System.out.println("------------------------------------------");
        // creamos dos objetos
        Serie serieMayor = series[0];
        Videojuego videojuegoMayor = videojuego[0];
        
        // se recorre el array desde la posicion 1, comparando
        
        for (int i = 0; i < series.length; i++) {
            if (series[i].CompareTo(serieMayor)== Serie.MAYOR) {
                serieMayor = series[i];
            }
            if (videojuego[i].CompareTo(videojuegoMayor)== Videojuego.MAYOR) {
                videojuegoMayor = videojuego[i];
            }
        }
        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }

    @Override
    public int compareTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEntregado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    }

