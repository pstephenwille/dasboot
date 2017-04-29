package me.dasboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dasboot.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
