package main;

import processing.core.PApplet;

public class Cuadro implements Runnable {

	private PApplet app;
	private int posX;
	private int posY;
	private int tam;
	private int velX;
	private int velY;
	private int r;
	private int g;
	private int b;

	public Cuadro(PApplet app) {
		this.app = app;
		posX = (int) app.random(0, 399);
		posY = (int) app.random(0, 399);
		tam = (int) app.random(50, 80);
		velX = 5;
		velY = 5;
		r = (int) app.random(0, 250);
		g = (int) app.random(0, 250);
		b = (int) app.random(0, 250);
	}

	public void run() {
			
			try {
				Thread.sleep(3000);
				mover();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	
	}

	public void dibujar() {
		app.fill(r, g, b);
		app.circle(posX, posY, tam);

	}

	public void mover() {

		posX += velX;
		if(posX > app.width) {
			velX *= -1;
		}
		if(posX < 0) {
			velX *= -1;
		}
		posY += velY;
		if(posY > app.height) {
			velY *= -1;
		}
		if(posY < 0) {
			velY *= -1;
		}

	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

}