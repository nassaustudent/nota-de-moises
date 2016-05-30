import javax.swing.*;
import java.awt.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.vp.*;
import javax.media.j3d.*;
import javax.vecmath.*;

public class BehaviorExample extends JFrame {

    ///////////////////////////////////////////////////////////////////////
    // Atributo da classe BehaviorExample
    //
    private SimpleUniverse universe = null;

    ///////////////////////////////////////////////////////////////////////
    // Construtor da classe BehaviorExample
    //
    public BehaviorExample() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        GraphicsConfiguration config =
           SimpleUniverse.getPreferredConfiguration();

        Canvas3D canvas = new Canvas3D(config);
        container.add("Center", canvas);

        // Cria um grafo de cena
        BranchGroup scene = criaGrafoDeCena();
        universe = new SimpleUniverse(canvas);

        // O código abaixo faz com que a ViewPlatform seja movida
        // um pouco para trás, para que os objetos possam ser
        // visualizados
        ViewingPlatform viewingPlatform = universe.getViewingPlatform();
        viewingPlatform.setNominalViewingTransform();
        
        // Adiciona "mouse behaviors" à "viewingPlatform" 
        // (equivale a trocar a posição do "observador virtual")
        OrbitBehavior orbit = new OrbitBehavior(canvas, OrbitBehavior.REVERSE_ALL);
        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
        orbit.setSchedulingBounds(bounds);
        viewingPlatform.setViewPlatformBehavior(orbit);
     
        universe.addBranchGraph(scene);
        
        setSize(350,350);
        setVisible(true);
    }
    
    
       
    
        // Para o Java 3D realizar otimizações no grafo de cena
        objRaiz.compile();

        return objRaiz;
    }

    ///////////////////////////////////////////////////////////////////////
    // Método principal que permite executar a aplicação
    //
    public static void main(String[] args) 
    {
        BehaviorExample h = new BehaviorExample();
    }
}
