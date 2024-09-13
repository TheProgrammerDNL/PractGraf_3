import java.awt.*;
import javax.swing.*;

import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class PracticaGraf_3 extends JFrame {
   //Resolución de esta computadora:
   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
   int anchoTot = (int) dim.getWidth();   //1536
   int altoTot = (int) dim.getHeight();   //864
   
   //Dimensiones de la ventana:
   int ancho = 900;
   int alto = 600;
   
   BufferedImage bi = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
   Graphics big = bi.createGraphics();
   
   Pixel p;
   
   public PracticaGraf_3() {
      p = new Pixel();
      setSize(ancho, alto);   //800 * 700   //1000, 700
      setTitle("Práctica Gráfica 3 - Daniel Díaz Larios");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   public void paint(Graphics g) {
      super.paint(g);
      super.paint(big);
      
      Color trianguloColor = Color.gray;
      Color flechaColor = Color.black;
      Color estrellaColor = new Color(255, 234, 0);
      Color circuloColor = Color.red;
      Color rayoColor = Color.blue;
      
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
         p.dibujarPixel(x,y,6,circuloColor,g);
         p.dibujarPixel(x,y,6,circuloColor,big);
         
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
         p.dibujarPixel(x,y,6,flechaColor,big);
      }
      
      for(int i=0; i<60; i++) {
         x++;
         p.dibujarPixel(x,y,6,flechaColor,g);
         p.dibujarPixel(x,y,6,flechaColor,big);
      }
      
      for(int i=0; i<40; i++) {
         y++;
         p.dibujarPixel(x,y,6,flechaColor,g);
         p.dibujarPixel(x,y,6,flechaColor,big);
      }
      
      for(int i=0; i<70; i++) {
         x++;
         y--;
         p.dibujarPixel(x,y,6,flechaColor,g);
         p.dibujarPixel(x,y,6,flechaColor,big);
      }
      
      for(int i=0; i<70; i++) {
         x--;
         y--;
         p.dibujarPixel(x,y,6,flechaColor,g);
         p.dibujarPixel(x,y,6,flechaColor,big);
      }
      
      for(int i=0; i<40; i++) {
         y++;
         p.dibujarPixel(x,y,6,flechaColor,g);
         p.dibujarPixel(x,y,6,flechaColor,big);
      }
      
      for(int i=0; i<60; i++) {
         x--;
         p.dibujarPixel(x,y,6,flechaColor,g);
         p.dibujarPixel(x,y,6,flechaColor,big);
      }
      
      //TRIÁNGULO GRIS
      x = 700;
      y = 60;
      for(int i=0; i<140; i++) {
         y++;
         p.dibujarPixel(x,y,6,trianguloColor,g);
         p.dibujarPixel(x,y,6,trianguloColor,big);
      }
      
      for(int i=0; i<140; i++) {
         x++;
         p.dibujarPixel(x,y,6,trianguloColor,g);
         p.dibujarPixel(x,y,6,trianguloColor,big);
      }
      
      for(int i=0; i<140; i++) {
         y--;
         x--;
         p.dibujarPixel(x,y,4,trianguloColor,g);
         p.dibujarPixel(x,y,6,trianguloColor,big);
      }
      
      //RAYO AZUL (RELLENO)
      //Punto inicial
      x = 100;
      y = 360;
      
      for (int j=0; j<40; j++) {
         for (int i=0; i<50-(int)j/5; i++) {
            p.dibujarPixel(x,y,6,rayoColor,g);
            p.dibujarPixel(x,y,6,rayoColor,big);
            x++;
         }
         x = 100 + j;
         y++;
      }
      
      x = 110;
      y = 400;
      
      for (int j=0; j<40; j++) {
         for (int i=0; i<50-(int)j/3; i++) {
            p.dibujarPixel(x,y,6,rayoColor,g);
            p.dibujarPixel(x,y,6,rayoColor,big);
            x++;
         }
         x = 110 + j;
         y++;
      }
      
      x = 125;
      y = 440;
      
      for (int j=0; j<80; j++) {
         for (int i=0; i<40-(int)j/2; i++) {
            p.dibujarPixel(x,y,6,rayoColor,g);
            p.dibujarPixel(x,y,6,rayoColor,big);
            x++;
         }
         x = 125 + j;
         y++;
      }
      
      
      //ESTRELLA AMARILLA
      for(int i=0; i<50; i++) {
         p.dibujarPixel(385 + i, 440, 6, estrellaColor, g);
         p.dibujarPixel(385 + i, 440, 6, estrellaColor, big);
      }

      for(int i=0; i<50; i++) {
         p.dibujarPixel(466 + i, 440, 6, estrellaColor, g);
         p.dibujarPixel(466 + i, 440, 6, estrellaColor, big);
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(435 + Math.round(i*15/45), 440 - i, 6, estrellaColor, g);
         p.dibujarPixel(435 + Math.round(i*15/45), 440 - i, 6, estrellaColor, big);
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(466 - Math.round(i*15/45), 440 - i, 6, estrellaColor, g);
         p.dibujarPixel(466 - Math.round(i*15/45), 440 - i, 6, estrellaColor, big);
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(385 + i, 440 + Math.round(i*24/40), 6, estrellaColor, g);
         p.dibujarPixel(385 + i, 440 + Math.round(i*24/40), 6, estrellaColor, big);
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(515 - i, 440 + Math.round(i*24/40), 6, estrellaColor, g);
         p.dibujarPixel(515 - i, 440 + Math.round(i*24/40), 6, estrellaColor, big);
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(425 - Math.round(i*15/45), 464 + i, 6, estrellaColor, g);
         p.dibujarPixel(425 - Math.round(i*15/45), 464 + i, 6, estrellaColor, big);
      }

      for(int i=0; i<46; i++) {
         p.dibujarPixel(476 + Math.round(i*15/45), 464 + i, 6, estrellaColor, g);
         p.dibujarPixel(476 + Math.round(i*15/45), 464 + i, 6, estrellaColor, big);
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(410 + i, 510 - Math.round(i*2/3), 6, estrellaColor, g);
         p.dibujarPixel(410 + i, 510 - Math.round(i*2/3), 6, estrellaColor, big);
      }

      for(int i=0; i<40; i++) {
         p.dibujarPixel(490 - i, 510 - Math.round(i*2/3), 6, estrellaColor, g);
         p.dibujarPixel(490 - i, 510 - Math.round(i*2/3), 6, estrellaColor, big);
      }
      
      //Guardando imagen...
      try {
         ImageIO.write(bi, "jpg", new File("Figuras.jpg"));
         System.out.println("Se ha guardado la imagen correctamente ;)");
      } catch (IOException e) {
         System.out.println("Algo salió mal :(");
      }
   }
   
   public static void main(String args[]) {
      new PracticaGraf_3();
   }
}