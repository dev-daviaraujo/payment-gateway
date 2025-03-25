package com.devdaviaraujo.course.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.devdaviaraujo.course.entities.Order;
import com.devdaviaraujo.course.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/*Classe que associa as chaves primárias de Product e Order para gerar uma chave primária em OrderItem,
  que é a tabela que resolve o problema da associação "Muitos pra muitos" entre Product e Order*/
@Embeddable
public class OrderItemPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Mapeamento com a classe Order
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	//Mapeamento com a classe Product
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}
	
	
	

}
