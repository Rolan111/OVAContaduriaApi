package com.ucc.ova.OVAContaduriaApi.repository;

import com.ucc.ova.OVAContaduriaApi.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<DataModel, Integer> {

    DataModel findByIdUsuario(int idUsuario);

    @Query(value = "SELECT * FROM data", nativeQuery = true)
    List<DataModel> query();
}
