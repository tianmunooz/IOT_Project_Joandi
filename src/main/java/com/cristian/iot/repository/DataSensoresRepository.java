package com.cristian.iot.repository;

import com.cristian.iot.model.DataSensores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSensoresRepository extends JpaRepository <DataSensores,Long> {
}
