package com.example.combo.combo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.combo.combo.repositories.ProjectRepository;
import com.example.combo.combo.entities.Project;

@Service
public class ListProjects {
     @Autowired
    private ProjectRepository projectRepository;

    /**
     * Listar todos los proyectos en la base de datos.
     *
     * @return una lista de proyectos
     */
    public List<Project> listarProyectos() {
        return projectRepository.findAll();
    }
}
