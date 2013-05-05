package com.dw.dao;

import java.util.List;

import com.dw.dao.interfaces.StatusDAO;
import com.dw.entity.Status;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class StatusDAOImpl extends ParentDAO implements StatusDAO
{
	public StatusDAOImpl(HibernateTemplate template)
	{
		super(template);
	}

	@Override
	public List<Status> getStatus()
	{		
		return template.find("from Status");
	}


}
