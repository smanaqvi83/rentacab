package com.beans;

import java.io.Serializable;
import java.util.List;

import com.rent.cab.entity.UKPostCodes;

import assets.IUKCodesDAO;
import assets.impl.Factory;

public class Cab implements Serializable{

	private String cabName = "Toyota";
	
	private String uk_post_code;
	
	private UKPostCodes selectedPostCode;

	public String getCabName() {
		System.gc();
		return cabName;
	}

	public void setCabName(String cabName) {
		this.cabName = cabName;
	}
	
	public String doAction(){
		System.out.println("Value -->  " + getSelectedPostCode());
		return "";
	}
	
	public String myAction(){
		return "";
	}

	public String getUk_post_code() {
		return uk_post_code;
	}

	public void setUk_post_code(String uk_post_code) {
		this.uk_post_code = uk_post_code;
	}
	
	
	public List<UKPostCodes> complete(String query) {
		IUKCodesDAO dao = Factory.getUKCodesDAO();
		List<UKPostCodes> results = dao.getMatchedPostCodes(query);
		return results;
	}

	public UKPostCodes getSelectedPostCode() {
		return selectedPostCode;
	}

	public void setSelectedPostCode(UKPostCodes selectedPostCode) {
		this.selectedPostCode = selectedPostCode;
	}
	
}
