package com.dw.dao.interfaces;

import com.dw.entity.DesktopIcon;
import com.dw.entity.User;

public interface DesktopIconDAO extends ParentDAO
{
    public DesktopIcon getDesktopIcon(String email);
	public void addDefaultSettings(User user);	
	public void updateSettings(String email, String settings);

}
