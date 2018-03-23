package com.example.finalprojectejb.dao;

import javax.ejb.Remote;

import com.example.finalprojectejb.dto.PlatformUserDTO;

@Remote
public interface PlatformUserDAORemote extends GenericDAO<PlatformUserDTO>{

}
