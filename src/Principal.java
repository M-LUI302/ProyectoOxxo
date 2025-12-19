
public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Productos producto = new Productos();
		
		System.out.println("HOLA MUNDO");
		System.out.println("Tienes " + 10);
		
		//Pasar los datos al objeto
		producto.setNombre("Barritas");
		producto.setPrecio(20.5f);
		producto.setStock(5);
		producto.setEstatus(true);
				
		//Mostrar en consola los atributos
		System.out.println("Datos del producto 1");
		System.out.println("Nombre "+producto.getNombre());
		System.out.println("Precio "+producto.getPrecio());
		System.out.println("Stock "+producto.getStock());
		System.out.println("Estatus "+producto.isEstatus());
		
		//Realizar la instancia de clase con todos los parametros 
		Productos producto2 = new Productos("Sabritas", 18, 3, true);
		
		//Mostrar los atributo del objeto
		System.out.println("Datos del producto 2");
		System.out.println(producto2);
		
		
		
	}
}
