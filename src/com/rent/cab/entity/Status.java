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
 * Status generated by hbm2java
 */
@Entity
@Table(name = "status", catalog = "rendacab")
public class Status implements java.io.Serializable {

	private Long statusId;
	private String status;
	private Set<CabService> cabServices = new HashSet<CabService>(0);

	public Status() {
	}

	public Status(String status) {
		this.status = status;
	}

	public Status(String status, Set<CabService> cabServices) {
		this.status = status;
		this.cabServices = cabServices;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "status_id", unique = true, nullable = false)
	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	@Column(name = "status", nullable = false, length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
	public Set<CabService> getCabServices() {
		return this.cabServices;
	}

	public void setCabServices(Set<CabService> cabServices) {
		this.cabServices = cabServices;
	}

}
