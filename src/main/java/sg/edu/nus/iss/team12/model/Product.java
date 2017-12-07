package sg.edu.nus.iss.team12.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Products")
public class Product {
	
	@Id
	@Column(name = "PartID")
	private int partID;
	@Column (name = "Description")
	private String description;
	@Column (name="UnitPrice")
	private float unitPrice;
	@Column (name = "color")
	private String color;
	@Column (name = "dimension")
	private String dimension;
	@Column (name = "Manufacturer")
	private String manufacturer;
	@Column (name ="ReorderLevel")
	private int reOrderLevel;
	@Column (name = "MinReorderQty")
	private int minReOrderQty;
	@Column (name = "shelfLocation")
	private String shelfLocation;
	@Column (name = "SupplierID")
	private String supplierID;
	@Column (name = "UnitsInStock")
	private int unitInStock;
	@Column (name = "UnitsOnOrder")
	private int unitOnOrder;
	@Column (name = "Discontinued")
	private int discontinued;
	

	// !!Pending Relationship Statement!!
	//Constructors
	
	
	public Product(int partID, String description, float unitPrice, String color, String dimension, String manufacturer,
			int reOrderLevel, int minReOrderQty, String shelfLocation, String supplierID, int unitInStock,
			int unitOnOrder, int discontinued) {
		super();
		this.partID = partID;
		this.description = description;
		this.unitPrice = unitPrice;
		this.color = color;
		this.dimension = dimension;
		this.manufacturer = manufacturer;
		this.reOrderLevel = reOrderLevel;
		this.minReOrderQty = minReOrderQty;
		this.shelfLocation = shelfLocation;
		this.supplierID = supplierID;
		this.unitInStock = unitInStock;
		this.unitOnOrder = unitOnOrder;
		this.discontinued = discontinued;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	//Getters and Setters
	
	public int getPartID() {
		return partID;
	}

	public void setPartID(int partID) {
		this.partID = partID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getReOrderLevel() {
		return reOrderLevel;
	}

	public void setReOrderLevel(int reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}

	public int getMinReOrderQty() {
		return minReOrderQty;
	}

	public void setMinReOrderQty(int minReOrderQty) {
		this.minReOrderQty = minReOrderQty;
	}

	public String getShelfLocation() {
		return shelfLocation;
	}

	public void setShelfLocation(String shelfLocation) {
		this.shelfLocation = shelfLocation;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public int getUnitOnOrder() {
		return unitOnOrder;
	}

	public void setUnitOnOrder(int unitOnOrder) {
		this.unitOnOrder = unitOnOrder;
	}

	public int getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(int discontinued) {
		this.discontinued = discontinued;
	}

	//HashCode() and override equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + partID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (partID != other.partID)
			return false;
		return true;
	}
	
	//Override toString()

	@Override
	public String toString() {
		return "Product [partID=" + partID + ", description=" + description + ", unitPrice=" + unitPrice + ", color="
				+ color + ", dimension=" + dimension + ", manufacturer=" + manufacturer + ", reOrderLevel="
				+ reOrderLevel + ", minReOrderQty=" + minReOrderQty + ", shelfLocation=" + shelfLocation
				+ ", supplierID=" + supplierID + ", unitInStock=" + unitInStock + ", unitOnOrder=" + unitOnOrder
				+ ", discontinued=" + discontinued + "]";
	}
	

	
	
	
	
	
	

}
