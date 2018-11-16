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

		StdDraw.setCanvasSize(400, 440);
		StdDraw.setXscale(0, 400);
		StdDraw.setYscale(0, 440);
		// boolean change=true;
		int height = 11;
		int width = 10;
		for (int v = 0; v < height; v++) { // 11 Quadrate hoch, 1 mehr für LAG
			for (int h = 0; h < width; h++) { // 10 Quadrate breit
				boolean even = (h * height + v) % 2 == 0;
				draw1Rect(v, h, even ? brightGreen : darkGreen);
				if (v > 0 && h > 0) {
					drawCross(v, h, v >= 6 ? !even : even);
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

	private static void drawBar(int v, int h, int firstSize, int secondSize, Color color) {
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(h * SQUARE_SIZE, v * SQUARE_SIZE, firstSize, secondSize);
	}

	private static void draw1Rect(int i, int j, Color color) {
		StdDraw.setPenColor(color);
		StdDraw.filledSquare(20 + j * SQUARE_SIZE, 20 + i * SQUARE_SIZE, SQUARE_SIZE / 2);
	}
}
