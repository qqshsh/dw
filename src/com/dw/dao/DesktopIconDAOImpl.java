package com.dw.dao;

import java.util.List;

import com.dw.dao.interfaces.DesktopIconDAO;
import com.dw.data.DesktopIconsDefinition;
import com.dw.entity.DesktopIcon;
import com.dw.entity.User;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class DesktopIconDAOImpl extends ParentDAOImpl implements DesktopIconDAO
{
	public DesktopIconDAOImpl(HibernateTemplate template)
	{
		super(template);
	}

	@Override
	public void updateSettings(String email, String settings)
	{
		template.bulkUpdate(
				"update DesktopIcon set settings = ? where email=?",
				new String[]
				{ settings, email });
	}

	@Override
	public void addDefaultSettings(User user)
	{
		DesktopIcon desktopIcon = new DesktopIcon();
		desktopIcon.setEmail(user.getEmail());
		desktopIcon
				.setSettings(DesktopIconsDefinition.defaultDesktopIconSettings);
		template.saveOrUpdate(desktopIcon);

	}

	@Override
	public DesktopIcon getDesktopIcon(String email)
	{
		List<DesktopIcon> desktopIcons = template.find(
				"from DesktopIcon where email=?", new String[]
				{ email });
		if (desktopIcons.size() > 0)
		{
			return desktopIcons.get(0);
		}
		return null;
	}
}
