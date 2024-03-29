package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//This is similar to add class entry in the mapping file

@Entity
@Table(name="myprodtab")
public class Product {
	
	//it create this column as primary key
	@Id
	
	//the pid values will be autogenerated
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	
	private int pid;
	
	// it is not null and unique and column name will be name
	@Column(name="name",nullable=false,unique=true)
	private String pname;
	private int qty;
	private double price;
	public Product() {
		super();
	}
	public Product(String pname, int qty, double price) {
		super();
//		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
	}
	

}