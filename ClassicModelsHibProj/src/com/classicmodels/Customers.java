package com.classicmodels;

public class Customers {

}
/*
 *
package com.classicmodels;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	@Column(name="customerNumber")
	private int customerNumber;
	@Column(name="customerName")
	private String customerName;
	@Column(name="contactLastName")
	private String contactLastName;
	@Column(name="contactFirstName")
	private String contactFirstName;
	@Column(name="phone")
	private BigDecimal phone;
	@Column(name="addressLine1")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="postalcode")
	private long postalcode;
	@Column(name="country")
	private String country;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customerNumber")
	private Set<Orders> order;
	
	public Customers() {
	
	}

	public Customers(int customerNumber, String customerName, String contactLastName, String contactFirstName,
			BigDecimal phone, String address, String city, String state, long postalcode, String country) {
		
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.contactFirstName = contactFirstName;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
		this.country = country;
	}

	public Set<Orders> getOrder() {
		return order;
	}

	public void setOrder(Set<Orders> order) {
		this.order = order;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}



	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getContactLastName() {
		return contactLastName;
	}



	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}



	public String getContactFirstName() {
		return contactFirstName;
	}



	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}



	public BigDecimal getPhone() {
		return phone;
	}



	public void setPhone(BigDecimal phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public long getPostalcode() {
		return postalcode;
	}



	public void setPostalcode(long postalcode) {
		this.postalcode = postalcode;
	}



	public String getCountry() {
		return country;
	}



	…
package com.classicmodels;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="orders")
public class Orders {
	@Id
	@Column(name="orderNumber")
	private int orderNumber;
	@Column(name="orderDate")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	@Column(name="requiredDate")
	@Temporal(TemporalType.DATE)
	private Date requiredDate;
	@Column(name="shippedDate")
	@Temporal(TemporalType.DATE)
	private Date shippedDate;
	@Column(name="status")
	private String status;
	
	
	public Orders() {
		
	}
	public Orders(int orderNumber, Date orderDate, Date requiredDate, Date shippedDate, String status) {
		
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.status = status;
	}


	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public Date getRequiredDate() {
		return requiredDate;
	}


	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}


	public Date getShippedDate() {
		return shippedDate;
	}


	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

}
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.classicmodels.Customers;
import com.classicmodels.Orders;
import com.mtc.util.HibernateClass;

public class TestClassicmodels {

	public static void main(String[] args) {
		
		
		Customers customer=new Customers(701,"Bhanu","Madike","Anu",new BigDecimal(987354623),"Khammam", "Khammam","Telangana", 52113, "India");
		
		Orders orders1=new Orders(903, new Date(0), new Date(0), new Date(0),"Success");
		Orders orders2=new Orders(904, new Date(0), new Date(0), new Date(0),"Failure");
		Orders orders3=new Orders(905, new Date(0), new Date(0), new Date(0),"Failure");
		
		Set<Orders> order=new HashSet<Orders>();
		
		order.add(orders1);
		order.add(orders2);
		order.add(orders3);
		
		customer.setOrder(order);
		
			
		SessionFactory sessionFactory = HibernateClass.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t=session.getTransaction(); //For Non-Select Operations
		
		t.begin();
		
		session.save(customer); 
		
		t.commit();
		
		
		session.close();
		
		sessionFactory.close();


	}

} 
 * 
 * 
 */
