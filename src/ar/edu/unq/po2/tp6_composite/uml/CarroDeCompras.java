package ar.edu.unq.po2.tp6_composite.uml;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	List<Product> products = new ArrayList<Product>();
	
	private void setElements(List<Product> lp) {
		this.products = lp;
	}
	
	public List<Product> getElements(){
		return products;
	}
	
	public int totalRounded() {
		return (int) this.total();
	}
	
	public float total() {
		float total=0;
		for (Product p : products) {
			total+= p.getPrice();
		}
		return total;
	}
	

}
