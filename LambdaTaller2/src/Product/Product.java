package Product;
import java.math.BigDecimal;

import Enum.Tax;

public class Product implements Comparable <Product>{

	private String producto;
	private BigDecimal precio;
	private Tax tax;

	public Product(String producto, BigDecimal precio, Tax tax) {
		super();
		this.producto = producto;
		this.precio = precio;
		this.tax = tax;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	@Override
	public int compareTo(Product o) {
		return 0;
	}

}
