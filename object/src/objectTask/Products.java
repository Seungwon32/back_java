package objectTask;

import java.util.Objects;

public class Products {
	private int id;
	private String name;
	private int price;
	private int stock;
	private String mou;
	
	public Products() {;}
	public Products(int id, String name, int price, int stock, String mou) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.mou = mou;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getMou() {
		return mou;
	}
	public void setMou(String mou) {
		this.mou = mou;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", mou=" + mou + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return id == other.id;
	}
	
	
}
