import java.awt.*;
import javax.swing.*;

public class PracticaGraf_3 extends JFrame {
   //Resoluci�n de esta computadora:
   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
   int anchoTot = (int) dim.getWidth();   //1536
   int altoTot = (int) dim.getHeight();   //864
   
   //Dimensiones de la ventana:
   int ancho = 900;
   int alto = 600;
   
   Pixel p;
   
   public PracticaGraf_3() {
      p = new Pixel();
      setSize(ancho, alto);   //800 * 700   //1000, 700
      setTitle("Pr�ctica Gr�fica 3 - Daniel D�az Larios");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   public void paint(Graphics g) {
      super.paint(g);
      
      Color trianguloColor = Color.cyan;
      Color flechaColor = Color.green;
      Color estrellaColor = Color.magenta;
      Color circuloColor = Color.red;
      Color rayoColor = Color.yellow;
      
      int x, y;
      
      //C�RCULO ROJO
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
         p.dibujarPixel(x,y,6,circuloColor,g);
         
         //Reset
         x = 150;
         y = x;
      }
      
      
      //FLECHA NEGRA
      x = 380;
      y = 120;
      for(int i=0; i<60; i++) {
         y++;
         p.dibujarPixel(x,y,6,flechaColor,g);
      }
      
      for(int i=0; i<60; i++) {
         x++;
         p.dibujarPixel(x,y,6,flechaColor,g);
      }
      
      for(int i=0; i<40; i++) {
         y++;
         p.dibujarPixel(x,y,6,flechaColor,g);
      }
      
      for(int i=0; i<70; i++) {
         x++;
         y--;
         p.dibujarPixel(x,y,6,flechaColor,g);
      }
      
      for(int i=0; i<70; i++) {
         x--;
         y--;
         p.dibujarPixel(x,y,6,flechaColor,g);
      }
      
      for(int i=0; i<40; i++) {
         y++;
         p.dibujarPixel(x,y,6,flechaColor,g);
      }
      
      for(int i=0; i<60; i++) {
         x--;
         p.dibujarPixel(x,y,6,flechaColor,g);
      }
      
      //TRI�NGULO GRIS
      x = 700;
      y = 60;
      for(int i=0; i<140; i++) {
         y++;
         p.dibujarPixel(x,y,6,trianguloColor,g);
      }
      
      for(int i=0; i<140; i++) {
         x++;
         p.dibujarPixel(x,y,6,trianguloColor,g);
      }
      
      for(int i=0; i<140; i++) {
         y--;
         x--;
         p.dibujarPixel(x,y,4,trianguloColor,g);
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
      
      //De Pablo:
      for(int i=0; i<50; i++) {
         p.dibujarPixel(600 + i, 195, 3, estrellaColor, g); 
      }

      for(int i=0; i<50; i++) {
         p.dibujarPixel(681 + i, 195, 3, estrellaColor, g); 
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(650 + Math.round(i*15/45), 195 - i, 3, estrellaColor, g); 
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(681 - Math.round(i*15/45), 195 - i, 3, estrellaColor, g); 
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(600 + i, 195 + Math.round(i*24/40), 3, estrellaColor, g); 
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(730 - i, 195 + Math.round(i*24/40), 3, estrellaColor, g); 
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(640 - Math.round(i*15/45), 219 + i, 3, estrellaColor, g); 
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(691 + Math.round(i*15/45), 219 + i, 3, estrellaColor, g); 
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(625 + i, 265 - Math.round(i*2/3), 3, estrellaColor, g); 
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(705 - i, 265 - Math.round(i*2/3), 3, estrellaColor, g); 
      }
      
   }
   
   public static void main(String args[]) {
      new PracticaGraf_3();
   }
}