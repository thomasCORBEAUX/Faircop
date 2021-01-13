package com.emse.spring.faircop.dao;

import com.emse.spring.faircorp.model.Window;

import java.util.List;

public interface WindowDaoCustom {
    List<Window> findRoomOpenWindows(Long id);
    List <Window> deleteAllWindowsInRoom(Long id);
}
