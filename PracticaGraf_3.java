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
      
      Color trianguloColor = Color.gray;
      Color flechaColor = Color.black;
      Color estrellaColor = Color.yellow;
      Color circuloColor = Color.red;
      Color rayoColor = Color.blue;
      
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
      for(int i=0; i<50; i++) {
         p.dibujarPixel(385 + i, 440, 3, estrellaColor, g); 
      }

      for(int i=0; i<50; i++) {
         p.dibujarPixel(466 + i, 440, 3, estrellaColor, g); 
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(435 + Math.round(i*15/45), 440 - i, 3, estrellaColor, g); 
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(466 - Math.round(i*15/45), 440 - i, 3, estrellaColor, g); 
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(385 + i, 440 + Math.round(i*24/40), 3, estrellaColor, g); 
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(515 - i, 440 + Math.round(i*24/40), 3, estrellaColor, g); 
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(425 - Math.round(i*15/45), 464 + i, 3, estrellaColor, g); 
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(476 + Math.round(i*15/45), 464 + i, 3, estrellaColor, g); 
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(410 + i, 510 - Math.round(i*2/3), 3, estrellaColor, g); 
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(490 - i, 510 - Math.round(i*2/3), 3, estrellaColor, g); 
      }
      
   }
   
   public static void main(String args[]) {
      new PracticaGraf_3();
   }
}