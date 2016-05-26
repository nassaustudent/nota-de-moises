import java.io.Serializable;
import javax.swing.JOptionPane;
/**
* Método de Interpolação Polinomial.
* @author Armando Couto
* Bibliografia:
* http://dexter-one.net/programacion/codigo-fuente-en-java-para-la-resolucion-de-metodos-numericos/
*/
public class InterpolacaoPolinomial implements Serializable {
private static final long serialVersionUID = 1L;
int n;
double x[];
double y[];
double xx[];
double valorX;
private void metodoPolinomial() {
n = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamanho dos Vetores:"));
x = new double[n];
y = new double[n];

}
System.out.println("Valor da Interpolação: " + xx[0]);
}
public static void main(String[] args) {
new InterpolacaoPolinomial().metodoPolinomial();
}
}
