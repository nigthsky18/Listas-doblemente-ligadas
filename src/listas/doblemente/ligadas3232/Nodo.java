
package listas.doblemente.ligadas3232;

/**
 *
 * @author Mariana M
 */
public class Nodo {
    //Atributos
    private int Dato;
    private Nodo LigaD, LigaI;
    
    // Métodos
    public Nodo() {
        Dato = 0;
        LigaD = null;
        LigaI = null;
   //Cuando no hay nodos
    }
    public Nodo(int d) {
        Dato = d;
        LigaD = null;
        LigaI = null;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getLigaD() {
        return LigaD;
    }

    public void setLigaD(Nodo LigaD) {
        this.LigaD = LigaD;
    }

    public Nodo getLigaI() {
        return LigaI;
    }

    public void setLigaI(Nodo LigaI) {
        this.LigaI = LigaI;
    }
   
}
