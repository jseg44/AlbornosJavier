package factura;

import java.util.Arrays;
/** Muestra los datos de una factura con los datos que se le introduzcan.
 * La clase muestra un ejemplo en el que se introducen 4 líneas de detalle
 * y los datos de un cliente.
 * Hace uso de la clase LineaFactura.
@author jap
@version 001
@see LineaFactura 
*/
public class Factura {
	public String id_cliente;		// Identificador (codigo) del cliente
	public String nombre_cliente;	// Nombre del cliente
	
	public LineaFactura lineas[];	// lista de productos comprados
		
	/** Constructor de Factura
	 * 
	 * @param idCliente Identificador del Cliente (String)
	 * @param nombreCliente Nombre del Cliente (String)
	 * @param lineas Array de Lineas de la Factura
	 * @see LineaFactura
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	
	/**
	 * Devuelve el precio total de la Factura, calculado a partir del precio de cada línea.	 
	  @return Suma total del conjunto de líneas de la factura.
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	
	@Override
	/**
	 * Muestra los datos de la factura en formato de texto.	
	 */
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}


	public static void main(String[] args){
		
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 ),
				new LineaFactura("P700", "Galletas",		1.3f, 	3, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		// Escribir la factura
		System.out.println( factura1 );
		
	}	
	

}
