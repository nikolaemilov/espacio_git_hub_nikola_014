package tienda;

public class Productos {

	private int idProducto;
	private String nombreProducto;
	private double precioProducto;
	/**
	 * @return the idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}
	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}
	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	/**
	 * @return the precioProducto
	 */
	public double getPrecioProducto() {
		return precioProducto;
	}
	/**
	 * @param precioProducto the precioProducto to set
	 */
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
}
