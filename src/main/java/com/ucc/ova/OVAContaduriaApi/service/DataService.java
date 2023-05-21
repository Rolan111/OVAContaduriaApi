package com.ucc.ova.OVAContaduriaApi.service;

import com.ucc.ova.OVAContaduriaApi.model.DataModel;
import com.ucc.ova.OVAContaduriaApi.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public List<DataModel> findAll() {
        return dataRepository.findAll();
    }

    public DataModel findByIdUsuario(int idUsuario) {
        return dataRepository.findByIdUsuario(idUsuario);
    }

    public DataModel save(@RequestBody DataModel dataModel) {
        return dataRepository.save(dataModel);
    }
}
