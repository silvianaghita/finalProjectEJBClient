package com.example.finalprojectejb;

import javax.ejb.Remote;

@Remote
public interface FinalProjectStatelessEjbRemote {
	public void insertMessage(String message) ;
}
