package com.euclidiana.dimensions.web.controller;

import com.euclidiana.dimensions.persistence.entity.DTO.ValorreferenciaAClasificarDto;
import com.euclidiana.dimensions.service.ClasificarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clasificador")
public class clasificarController {

    ClasificarService clasificarService;

    public clasificarController(ClasificarService clasificarService) {
        this.clasificarService = clasificarService;
    }

    @PostMapping("/data")
    ResponseEntity<String> obtenerClasificacion(@RequestBody ValorreferenciaAClasificarDto valor){
        return ResponseEntity.ok(clasificarService.retornarClasificacion(valor));
    }
}
