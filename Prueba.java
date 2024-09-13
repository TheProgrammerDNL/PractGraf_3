import java.awt.*;
import javax.swing.*;
public class Prueba extends JFrame {
   
   Pixel p = new Pixel();
   
   public Prueba() {
      setSize(800, 700);
      setLocationRelativeTo(null);
      getContentPane().setBackground(Color.black);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   public void paint(Graphics g) {
      p.dibujarPixel(100,100,g);
      p.dibujarPixel(100,110,Color.green,g);
      p.dibujarPixel(100,120,4,g);
      p.dibujarPixel(100,130,6,Color.red,g);
      
      p.dibujarPixel(150,100,20,Color.blue,g);
      
      p.dibujarPixel(0,0,100,Color.yellow,g);
   }
   
   public static void main(String args[]) {
      new Prueba();
   }
}