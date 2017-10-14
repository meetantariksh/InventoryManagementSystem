package com.maass.ecom.inventory.Collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="SystemCheck")
public class SystemCheck {
	@Id
	public String id;
	
	public String checkProperty = null;
	public boolean checkStatus = false;
	
	public SystemCheck(){
		
	}
	
	@Override
    public String toString() {
        return String.format(
                "SystemCheck[id=%s, firstName='%s', lastName='%s']",
                id, checkProperty, checkStatus);
    }
	
}
