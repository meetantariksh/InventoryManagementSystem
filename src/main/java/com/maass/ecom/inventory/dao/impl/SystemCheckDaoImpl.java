package com.maass.ecom.inventory.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maass.ecom.inventory.Collections.SystemCheck;
import com.maass.ecom.inventory.Repositories.SystemCheckRepository;
import com.maass.ecom.inventory.dao.SystemCheckDao;

@Service
public class SystemCheckDaoImpl implements SystemCheckDao{
	
	private static String databaseCheckID = "59e1bd72734d1d1c37fc5b58";

	@Autowired
	private SystemCheckRepository systemCheckRepository;
	
	public boolean checkDatabaseStatus() {
		boolean checkStatus = false;
		SystemCheck systemCheck = null;
		try{
			systemCheck = systemCheckRepository.findOne(databaseCheckID);
			if(systemCheck.checkStatus){
				checkStatus = true;
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
		return checkStatus;	
	}

}
