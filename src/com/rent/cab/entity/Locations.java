package com.rent.cab.entity;

// Generated Jan 11, 2014 12:15:42 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Locations generated by hbm2java
 */
@Entity
@Table(name = "locations", catalog = "rendacab")
public class Locations implements java.io.Serializable {

	private Long locationId;
	private String locationName;
	private String address;
	private String block;
	private String street;
	private String city;
	private String postCode;
	private Set<UserLocations> userLocationses = new HashSet<UserLocations>(0);
	private Set<CabService> cabServicesForLocationIdDropoff = new HashSet<CabService>(
			0);
	private Set<CabService> cabServicesForLocationIdPickup = new HashSet<CabService>(
			0);

	public Locations() {
	}

	public Locations(String locationName, String address, String block,
			String street, String city, String postCode) {
		this.locationName = locationName;
		this.address = address;
		this.block = block;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
	}

	public Locations(String locationName, String address, String block,
			String street, String city, String postCode,
			Set<UserLocations> userLocationses,
			Set<CabService> cabServicesForLocationIdDropoff,
			Set<CabService> cabServicesForLocationIdPickup) {
		this.locationName = locationName;
		this.address = address;
		this.block = block;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		this.userLocationses = userLocationses;
		this.cabServicesForLocationIdDropoff = cabServicesForLocationIdDropoff;
		this.cabServicesForLocationIdPickup = cabServicesForLocationIdPickup;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "location_id", unique = true, nullable = false)
	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	@Column(name = "location_name", nullable = false, length = 200)
	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Column(name = "address", nullable = false, length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "block", nullable = false, length = 200)
	public String getBlock() {
		return this.block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	@Column(name = "street", nullable = false, length = 200)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "city", nullable = false, length = 200)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "post_code", nullable = false, length = 100)
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locations")
	public Set<UserLocations> getUserLocationses() {
		return this.userLocationses;
	}

	public void setUserLocationses(Set<UserLocations> userLocationses) {
		this.userLocationses = userLocationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationsByLocationIdDropoff")
	public Set<CabService> getCabServicesForLocationIdDropoff() {
		return this.cabServicesForLocationIdDropoff;
	}

	public void setCabServicesForLocationIdDropoff(
			Set<CabService> cabServicesForLocationIdDropoff) {
		this.cabServicesForLocationIdDropoff = cabServicesForLocationIdDropoff;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationsByLocationIdPickup")
	public Set<CabService> getCabServicesForLocationIdPickup() {
		return this.cabServicesForLocationIdPickup;
	}

	public void setCabServicesForLocationIdPickup(
			Set<CabService> cabServicesForLocationIdPickup) {
		this.cabServicesForLocationIdPickup = cabServicesForLocationIdPickup;
	}

}
