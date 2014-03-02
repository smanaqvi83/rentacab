package com.rent.cab.converters;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import assets.IUKCodesDAO;
import assets.impl.Factory;

import com.rent.cab.entity.UKPostCodes;

public class UKPostCodesConverter implements Converter {
	
	
	UKPostCodes ukPostCode = null;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2.trim().equals("")) {
            return null;
        } else {
            try {
            	IUKCodesDAO dao = Factory.getUKCodesDAO();
            	
        		ukPostCode = dao.getPostCodeAgainstId(Long.parseLong(arg2));
        		if(ukPostCode != null){
        			return ukPostCode;
        		}else{
        			return null;
        		}
        		
            } catch(NumberFormatException exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid player"));  
            }
        }
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 == null || arg2.equals("")){
			return "";
		}else{
			return String.valueOf(((UKPostCodes) arg2).getId());
		}
	}
}