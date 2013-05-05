package com.dw.dao;

import java.util.List;

import com.dw.dao.interfaces.ProvinceDAO;
import com.dw.entity.Province;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class ProvinceDAOImpl extends ParentDAO implements ProvinceDAO
{
	public ProvinceDAOImpl(HibernateTemplate template)
	{
		super(template);
	}

	@Override
	public List<Province> getProvinces()
	{
		return template.find("from Province");
	}

}
