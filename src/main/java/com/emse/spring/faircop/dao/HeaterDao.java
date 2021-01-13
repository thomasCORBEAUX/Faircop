package com.emse.spring.faircop.dao;

import com.emse.spring.faircorp.model.Heater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeaterDao extends JpaRepository<Heater, Long>, HeaterDaoCustom {
}