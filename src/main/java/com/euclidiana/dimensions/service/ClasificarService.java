package com.euclidiana.dimensions.service;

import com.euclidiana.dimensions.persistence.entity.DTO.ValorreferenciaAClasificarDto;
import org.springframework.stereotype.Service;


public interface ClasificarService {
    String retornarClasificacion(ValorreferenciaAClasificarDto valorreferenciaAClasificarDto);

}
