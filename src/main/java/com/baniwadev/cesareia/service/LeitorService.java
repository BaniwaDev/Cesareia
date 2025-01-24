package com.baniwadev.cesareia.service;

import com.baniwadev.cesareia.model.Leitor;
import com.baniwadev.cesareia.repository.LeitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeitorService {

    @Autowired
    private LeitorRepository leitorRepository;

    public List<Leitor> listarTodos(){
        return leitorRepository.findAll();
    }

    public Optional<Leitor> buscarPorId(Long Id){
        return leitorRepository.findById(Id);
    }

    public Leitor salvar(Leitor leitor){
        return leitorRepository.save(leitor);
    }

    public void deletar(Long id){
        leitorRepository.deleteById(id);
    }

}
