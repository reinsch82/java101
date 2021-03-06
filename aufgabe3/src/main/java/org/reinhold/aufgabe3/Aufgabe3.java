package org.reinhold.aufgabe3;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

/*
    Aufgabe 3) Verschachtelte Schleifen und Verzweigungen - Optische Täuschung
*/
public class Aufgabe3 {
	private static final int SQUARE_SIZE = 40;
	static final Color brightGreen = new Color(166, 166, 76);
	static final Color darkGreen = new Color(90, 90, 0);

	public static void main(String[] args) {

		// Implementieren Sie die in Abbildung 1 gezeigte optische Tauschung. Die
		// optische Tauschung
		// besteht aus 10 Quadraten horizontal und 11 Quadraten vertikal. Die Quadrate
		// haben eine
		// Abmessung von 40 * 40 Pixel.
		//  Verwenden Sie fur die Quadrate folgende Farben:
		// { fur dunkelgrune Quadrate StdDraw.setPenColor(90, 90, 0)
		// { fur hellgrune Quadrate StdDraw.setPenColor(166, 166, 76).
		//  Zeichnen Sie bei jedem Kreuzungspunkt zwei ubereinander liegende Rechtecke
		// (siehe Abbildung)
		// ein. Die Lange der Rechtecke betragt 20 Pixel und die Breite 4 Pixel.
		// Achten Sie dabei
		// darauf, wie die schwarzen und weien Rechtecke angeordnet werden.
		//  Verwenden Sie fur die Implementierung des kompletten Programms zwei
		// ineinander verschachtelte
		// for-Schleifen.

		int height = 22;
		int width = 23;
		int canvasWidth = width * SQUARE_SIZE;
		int canvasHeight = height * SQUARE_SIZE;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		StdDraw.setXscale(0, canvasWidth);
		StdDraw.setYscale(0, canvasHeight);
		// boolean change=true;
		for (int v = 0; v < height; v++) { // 11 Quadrate hoch, 1 mehr für LAG
			for (int h = 0; h < width; h++) { // 10 Quadrate breit
				boolean even = (h%2 + v) % 2 == 0;
				int x = h * SQUARE_SIZE;
				int y = v * SQUARE_SIZE;
				draw1Rect(x, y, even ? brightGreen : darkGreen);
				if (v > 0 && h > 0) {
					drawCross(x, y, v >= height/2 ? !even : even);
				}
			}
		}
	}

	private static void drawCross(int v, int h, boolean even) {
		int firstSize = even ? 10 : 2;
		int secondSize = even ? 2 : 10;
		drawBar(v, h, firstSize, secondSize, Color.WHITE);
		drawBar(v, h, secondSize, firstSize, Color.BLACK);
	}

	private static void drawBar(int x, int y, int halfWidth, int halfHeight, Color color) {
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
	}

	private static void draw1Rect(int x, int y, Color color) {
		StdDraw.setPenColor(color);
		StdDraw.filledSquare(20 + x, 20 + y, SQUARE_SIZE / 2);
	}
}
