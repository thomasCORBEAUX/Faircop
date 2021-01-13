package com.emse.spring.faircop.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;

import java.util.List;

public interface HeaterDaoCustom {
    List<Heater> deleteAllHeatersInRoom(Long id);
}
