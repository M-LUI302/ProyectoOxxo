
public class Productos {
	
	private String nombre;
	private float precio;
	private int stock;
	private boolean estatus;

	
	//Constructor vacio
	public Productos() {
	}

	//Constructor con parametros o argumenntos
	public Productos(String nombre, float precio, int stock, boolean estatus) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.estatus = estatus;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", estatus=" + estatus + "]";
	}

	
	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
	
	

	
	
}
