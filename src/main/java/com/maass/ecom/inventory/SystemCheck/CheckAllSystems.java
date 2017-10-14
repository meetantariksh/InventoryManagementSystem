package com.maass.ecom.inventory.SystemCheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maass.ecom.inventory.Beans.SystemCheckBean;
import com.maass.ecom.inventory.dao.SystemCheckDao;

@RestController
@CrossOrigin("*")
public class CheckAllSystems {
	
	@Autowired
	private SystemCheckDao systemCheckDao;
	
	@RequestMapping("/checkBackEndSystem")
	public SystemCheckBean checkBackEndSystem() {
		SystemCheckBean systemCheckBean = new SystemCheckBean();
		systemCheckBean.setCheckProperty("APPLICATION");
		systemCheckBean.setCheckStatus(true);
		return systemCheckBean;
	}
	
	@RequestMapping("/checkDataBaseSystem")
	public SystemCheckBean checkDataBaseSystem() {
		SystemCheckBean checkBean = null;
		try{
			checkBean = new SystemCheckBean();
			checkBean.setCheckProperty("DATABASE");
			if(systemCheckDao.checkDatabaseStatus()){
				checkBean.setCheckStatus(true);
			}else{
				checkBean.setCheckStatus(false);
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
		return checkBean;
	}
	
}
