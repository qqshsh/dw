package com.dw.dao;

import java.util.List;

import com.dw.dao.interfaces.SexDAO;
import com.dw.entity.City;
import com.dw.entity.Sex;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class SexDAOImpl extends ParentDAO implements SexDAO
{
	public SexDAOImpl(HibernateTemplate template)
	{
		super(template);
	}

	@Override
	public List<Sex> getSex()
	{		
		return template.find("from Sex");
	}


}
