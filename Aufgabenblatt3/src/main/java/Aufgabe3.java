import edu.princeton.cs.introcs.StdDraw;

/*
    Aufgabe 3) Zeichnen mit Schleifen und Methoden
*/
public class Aufgabe3 {
    
    public static void main(String[] args) {
        int pixelWidth = 600;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);
        
//      drawHorizontalRect(100, 100, 100, 10);
//      drawVerticalRect(10, 100, 100, 10);
//        drawBigH(200, 100, 100, 10);
        drawLineOfH(200, 100, 100, 10, 3);
    }
    
    private static void drawHorizontalRect(int mx, int my, int length, int width) {
		int x0 = mx - length/ 2;
		int y0 = my - width / 2;
		int x1 = mx + length /2;
		int y1 = my + width /2;
		StdDraw.line(x0, y0, x1, y0);
		StdDraw.line(x0, y0, x0, y1);
		StdDraw.line(x1, y0, x1, y1);
		StdDraw.line(x0, y1, x1, y1);
    }
    
    private static void drawVerticalRect(int mx, int my, int length, int width) {
        drawHorizontalRect(mx, my, width, length);
    }
    
    private static void drawBigH(int mx, int my, int length, int width) {
    	drawHorizontalRect(mx, my, length, width);
    	drawVerticalRect(mx-length/2-width/2, my, length,width);
    	drawVerticalRect(mx+length/2+width/2, my, length, width);
    }
    
    private static void drawLineOfH(int sx, int sy, int length, int width, int numCopies) {
        for(int i = 0; i < numCopies; ++i) {
        	drawBigH(sx+i*(length+width*2), sy, length, width);
        }
    }
}


