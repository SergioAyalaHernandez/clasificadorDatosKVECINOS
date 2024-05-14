package com.euclidiana.dimensions.web.controller;

import com.euclidiana.dimensions.persistence.entity.TablaAEntity;
import com.euclidiana.dimensions.service.TablaAService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eucidiana")
public class TablaAController {
    public final TablaAService tablaAService;

    public TablaAController(TablaAService tablaAService) {
        this.tablaAService = tablaAService;
    }

    @GetMapping("/tablaA")
    public ResponseEntity<List<TablaAEntity>> getAll(){
        return ResponseEntity.ok(this.tablaAService.getAll());
    }

    @PostMapping("/tablaA")
    public ResponseEntity<TablaAEntity> add(@RequestBody TablaAEntity tablaA) {
        if (tablaA != null) {
            if (tablaA.getIdTablaA() != null && tablaAService.exist(tablaA.getIdTablaA())) {
                TablaAEntity savedEntity = tablaAService.save(tablaA);
                return ResponseEntity.ok(savedEntity);
            } else {
                TablaAEntity newEntity = tablaAService.save(tablaA);
                return ResponseEntity.status(HttpStatus.CREATED).body(newEntity);
            }
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
