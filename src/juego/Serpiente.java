package juego;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import entorno.Entorno;
import entorno.Herramientas;

public class Serpiente {
	Image serpiente;
	//Posicion de spawn y velocidad de movimiento
	public int x;
	public int y;
	
	public Serpiente(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void dibujarSerpiente(Entorno e) {
		serpiente = Herramientas.cargarImagen("serpiente.gif");
		//e.dibujarRectangulo(x, y-40, 40,40,0, Color.RED);
		e.dibujarImagen(serpiente,x, y-40, 0,4);
	}
	
	public Rectangle serpienteHitBox() {
		return new Rectangle(x , y-40 , 40, 40);
	}
}
