package Lambda;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import Enum.Tax;
import Product.Product;

public class lambaTaller2 {

	public static BigDecimal totalCompra = new BigDecimal("0");
	public static BigDecimal impuestos = new BigDecimal("0");

	public static void main(String[] args) {

		List<Product> shoppingCart = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		// Implementación

		// TOTAL DE LA COMPRA
		shoppingCart.stream().forEach(pro -> {
			impuestos = pro.getPrecio().multiply(pro.getTax().getPrecio());
			totalCompra = totalCompra.add(pro.getPrecio().add(impuestos));
		});
		System.out.println("The total of purchase is: " + totalCompra + "€.\n");

		// Los productos que empiecen con C separados por una coma, pero da coma al final también. 
		Stream<Product> productos = shoppingCart.stream().filter(producto -> producto.getProducto().startsWith("C"))
				.sorted();
		productos.forEach((p) -> {
			System.out.printf(p.getProducto() + ",");
		});

/*NO FUNCIONA
* 
* Product.forEach(productos -> { if(productos.subSequence(0,1).equals("C")) {
* System.out.println(productos); } });
*/

/*NO FUNCIONA
* Product.shoppingCart() .filter(productos->productos.subSequence(0,
* 1).equals("C")) .forEach(System.out::println);
*/

/*NO DA EL RESULTADO ESPERADO
 * 
 * BigDecimal total=new BigDecimal(0);
 * 
 * shoppingCart.stream().forEach((p)-> { total.add(BigDecimal.valueOf
 * (Double.valueOf (p.getTax).getPrecio)); }
 * 
 * 
 * Stream<Product>
 * producto=shoppingCart.stream().filter(producto->producto.getPrecio());
 * producto.forEach((p) -> { System.out.println(p.getPrecio);
 * 
 * });
 * 
 * //ESTO MAL ArrayList<Integer> Product = new ArrayList<Integer>();
 * Product.add(5); Product.add(9); Product.add(8); Product.add(1);
 * Product.forEach( (n) -> { System.out.println("La compra " + n + "."); } );
 * 
 * //Da de resultado La compra 5. //La compra 9. //La compra 8. //La compra 1.
 * 
 */
		
	}
}