package com.ucc.ova.OVAContaduriaApi.api;

import com.ucc.ova.OVAContaduriaApi.model.DataModel;
import com.ucc.ova.OVAContaduriaApi.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("data")
public class DataApi {

    @Autowired
    private DataService dataService;

    @GetMapping
    @RequestMapping("findAll")
    public ResponseEntity<List<DataModel>> findAll() {
        return ResponseEntity.ok(dataService.findAll());
    }

    @GetMapping
    @RequestMapping("findByIdUsuario")
    public ResponseEntity<DataModel> findByIdUsuario(@RequestParam int idUsuario) {
        return ResponseEntity.ok(dataService.findByIdUsuario(idUsuario));
    }

    @PostMapping("save")
    public ResponseEntity<DataModel> save(@RequestBody DataModel dataModel) {
        return ResponseEntity.ok(dataService.save(dataModel));
    }

}
