package com.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.boot.dao.DepartamentoDAO;
import com.curso.boot.domain.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoDAO dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Departamento departamento) {
        // Implementação para salvar um departamento
        dao.save(departamento);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Departamento departamento) {
        // Implementação para editar um departamento
        dao.update(departamento);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        // Implementação para excluir um departamento por ID
        dao.delete(id);

    }

    @Override
    public Departamento buscarPorId(Long id) {
        // Implementação para buscar um departamento por ID
        return dao.findById(id);
    }

    @Override
    public List<Departamento> buscarTodos() {
        // Implementação para buscar todos os departamentos
        return dao.findAll();
    }
}