package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERY")
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String city;

	private String street;

	private String zipcode;

	private DeliveryStatus status;

	@OneToOne(mappedBy = "delivery")
	private Order order;
}
