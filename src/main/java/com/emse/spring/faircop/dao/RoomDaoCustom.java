package com.emse.spring.faircop.dao;

import com.emse.spring.faircorp.model.Room;

import java.util.List;

public interface RoomDaoCustom {
    List<Room> findByName(String name);
}
