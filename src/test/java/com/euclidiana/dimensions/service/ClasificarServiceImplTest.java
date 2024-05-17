package com.euclidiana.dimensions.service;

import com.euclidiana.dimensions.persistence.entity.DTO.ValorreferenciaAClasificarDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClasificarServiceImplTest {
    private ClasificarService clasificarService;
    @Autowired
    public ClasificarServiceImplTest(ClasificarService clasificarService) {
        this.clasificarService = clasificarService;
    }
    @Test
    void retornarClasificacion() {
        ValorreferenciaAClasificarDto valorReferencia = new ValorreferenciaAClasificarDto();
        valorReferencia.setValorX(1);
        valorReferencia.setValorY(1);
        String resultado = clasificarService.retornarClasificacion(valorReferencia);
        assertNotNull(resultado);
    }

    @Test
    void recibir_valor_bajos() {
        ValorreferenciaAClasificarDto valorReferencia = new ValorreferenciaAClasificarDto();
        valorReferencia.setValorX(1);
        valorReferencia.setValorY(1);
        String resultado = clasificarService.retornarClasificacion(valorReferencia);
        assertEquals("Bajos",resultado);
    }

    @Test
    void recibir_valor_Altos() {
        ValorreferenciaAClasificarDto valorReferencia = new ValorreferenciaAClasificarDto();
        valorReferencia.setValorX(99);
        valorReferencia.setValorY(99);

        String resultado = clasificarService.retornarClasificacion(valorReferencia);
        assertEquals("Altos",resultado);
    }
}
