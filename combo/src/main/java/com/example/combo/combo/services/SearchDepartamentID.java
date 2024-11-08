package com.example.combo.combo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.combo.combo.entities.Departament;
import com.example.combo.combo.repositories.DepartamentRepository;

@Service
public class SearchDepartamentID {

    @Autowired
    private DepartamentRepository departamentRepository;
    
    /**
     * Busca un departamento por su ID y devuelve una lista con ese departamento. Si no existe, devuelve una lista vac a.
     * @param id el ID del departamento a buscar
     * @return una lista con el departamento buscado (si existe) o vac a (si no existe)
     */
    public List<Departament> buscarDepartamentoID(int id) {
        return departamentRepository.findById(id).stream().collect(Collectors.toList());
    }

}
