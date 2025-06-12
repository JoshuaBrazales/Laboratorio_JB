package modelo;
public class Arista {
    private modelo.Vertice origen;
    private modelo.Vertice destino;
    private int peso;
    public Arista(modelo.Vertice origen, modelo.Vertice destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }
    public modelo.Vertice getOrigen() { return origen; }
    public modelo.Vertice getDestino() { return destino; }
    public int getPeso() { return peso; }
    @Override
    public String toString() {
        return origen.getId() + " " + destino.getId() + " (" + peso + ")";
    }
}
