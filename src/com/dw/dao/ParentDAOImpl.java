package com.dw.dao;

import java.io.Serializable;
import com.dw.dao.interfaces.ParentDAO;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class ParentDAOImpl implements ParentDAO
{
    HibernateTemplate template;
	public ParentDAOImpl(HibernateTemplate template)
	{
		this.template = template;
	}
	public Object getEntity(Class entityClass, Serializable id)
	{
		return template.get(entityClass, id);
	}
}
 