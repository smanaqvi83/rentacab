package com.rent.cab.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "chigwell_post_codes")
public class UKPostCodes implements Serializable {
	
	private Long id;
	private String postcode;
	private String longitude;
	private String latitude;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "chigwell_post_code_id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "chigwell_post_code", length = 30)
	public String getPostcode() {
		return postcode;
	}
	
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	@Column(name = "chigwell_longitude", length = 30)
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	@Column(name = "chigwell_latitude", length = 30)
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
}