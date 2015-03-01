package factura;
/** Muestra cada línea de la factura calculando su importe
 * Se utiliza en la clase Factura.
 * @author jap
 * @version 001
 * @see Factura
 */
public class LineaFactura {
	
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	/** Constructor de cada Línea de la factura.
	 * 
	 * @param idProducto Identificación del producto, String.
	 * @param nombreProducto Nombre del producto.
	 * @param precio Precio, float.
	 * @param cantidad Unidades, float.
	 * @param descuento Descuento, float.
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	@Override
	/** Muestra cada Línea de la Factura en un texto
	 * 
	 */
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea.
	 @return Precio por unidad multiplicado por la cantidad del producto. 
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}


}
