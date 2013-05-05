package com.dw.dao.interfaces;

import java.util.List;

import com.dw.entity.City;

public interface CityDAO
{
    public List<City> getCities(int provinceId);
}
