import grafo.Grafo;
import interfaz.GrafoPanel;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        GrafoPanel panel = new GrafoPanel(grafo);

        javax.swing.JFrame ventana = new javax.swing.JFrame("Visualización de Grafo");
        ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.add(panel);
        ventana.setVisible(true);
    }
}

