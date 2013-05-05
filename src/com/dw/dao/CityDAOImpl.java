package com.dw.dao;

import java.util.List;

import com.dw.dao.interfaces.CityDAO;
import com.dw.entity.City;
import com.dw.entity.Province;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class CityDAOImpl extends ParentDAO implements CityDAO
{
	public CityDAOImpl(HibernateTemplate template)
	{
		super(template);
	}

	@Override
	public List<City> getCities(int provinceId)
	{
		return template.find("from City where provinceId = ?",
				provinceId);
	}

}
