import java.awt.*;
import javax.swing.*;

public class PracticaGraf_3 extends JFrame {
   //Resolución de esta computadora:
   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
   int anchoTot = (int) dim.getWidth();   //1536
   int altoTot = (int) dim.getHeight();   //864
   
   Pixel p = new Pixel();
   
   public PracticaGraf_3() {
      setSize(900, 600);   //800 * 700   //1000, 700
      setTitle("Práctica Gráfica 3");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   public void paint(Graphics g) {
      super.paint(g);
      
      int x, y;
      
      //CÍRCULO ROJO
      //Punto central
      x = 150;
      y = x;
      
      //Radio
      int r = 100;
      
      //parametricas
      //x = sin(t)
      //y = cos(t)
      
      for (float t=0; t < 2*Math.PI; t+=0.01) {
         x += r*Math.sin(t);
         y += r*Math.cos(t);
         p.dibujarPixel(x,y,6,Color.red,g);
         
         //Reset
         x = 150;
         y = x;
      }
      
      
      //FLECHA NEGRA
      x = 380;
      y = 120;
      for(int i=0; i<60; i++) {
         y++;
         p.dibujarPixel(x,y,6,Color.black,g);
      }
      
      for(int i=0; i<60; i++) {
         x++;
         p.dibujarPixel(x,y,6,Color.black,g);
      }
      
      for(int i=0; i<40; i++) {
         y++;
         p.dibujarPixel(x,y,6,Color.black,g);
      }
      
      for(int i=0; i<70; i++) {
         x++;
         y--;
         p.dibujarPixel(x,y,6,Color.black,g);
      }
      
      for(int i=0; i<70; i++) {
         x--;
         y--;
         p.dibujarPixel(x,y,6,Color.black,g);
      }
      
      for(int i=0; i<40; i++) {
         y++;
         p.dibujarPixel(x,y,6,Color.black,g);
      }
      
      for(int i=0; i<60; i++) {
         x--;
         p.dibujarPixel(x,y,6,Color.black,g);
      }
      
      //TRIÁNGULO GRIS
      x = 700;
      y = 60;
      for(int i=0; i<140; i++) {
         y++;
         p.dibujarPixel(x,y,6,Color.gray,g);
      }
      
      for(int i=0; i<140; i++) {
         x++;
         p.dibujarPixel(x,y,6,Color.gray,g);
      }
      
      for(int i=0; i<140; i++) {
         y--;
         x--;
         p.dibujarPixel(x,y,4,Color.gray,g);
      }
      
      //RAYO AZUL (RELLENO)
      //Punto central
      x = 150;
      y = 450;
      
      //ESTRELLA AMARILLA
      //ESTRELLA DE 5 PICOS
      //Punto central
      x = 450;
      y = x;
      
      int rad = 100;
      int apo = (int) (rad * 0.81);
      int lado = (int) (rad * 1.175);
      int radX = (int) (rad * 0.95);
      int radY = (int) (rad * 0.31);      
      int xPuntos[] = {x, x-lado/2, x+radX, x-radX, x+lado/2};
      int yPuntos[] = {y-rad, y+apo, y-radY, y-radY, y+apo};
      
      g.setColor(Color.yellow);
      g.drawPolygon(xPuntos, yPuntos, 5);
      
   }
   
   public static void main(String args[]) {
      new PracticaGraf_3();
   }
}