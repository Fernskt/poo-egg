
package Entidades;


public class Ahorcado {
    
    private String palabraAAbuscar;
    int cantLetrasEncontradas;
    int cantJugadasMax;
    private String[] palabra;

    public Ahorcado() {
    }

    public Ahorcado(String palabraAAbuscar, int cantLetrasEncontradas, int cantJugadasMax, String[] palabra) {
        this.palabraAAbuscar = palabraAAbuscar;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMax = cantJugadasMax;
        this.palabra = palabra;
    }

    public String getPalabraAAbuscar() {
        return palabraAAbuscar;
    }

    public void setPalabraAAbuscar(String palabraAAbuscar) {
        this.palabraAAbuscar = palabraAAbuscar;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }
   
}
