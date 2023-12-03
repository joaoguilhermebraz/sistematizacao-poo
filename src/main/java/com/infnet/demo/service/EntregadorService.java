package com.infnet.demo.service;

import com.infnet.demo.model.Entregador;
import com.infnet.demo.repository.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EntregadorService {

    @Autowired
    EntregadorRepository entregadorRepository;

    public Object salvar(Entregador entregador) {
        Optional<Entregador> byId = entregadorRepository.findById(entregador.getId());
        if (byId.isPresent()){
            return "Já existe um usuário para esse Id";
        }

        return entregadorRepository.save(entregador);
    }

    public List<Entregador> listarEntregadores() {
        return entregadorRepository.findAll();
    }

    public Object buscarEntregador(Long id) {
        Optional<Entregador> byId = entregadorRepository.findById(id);
        if(byId.isPresent()) {
            return byId.get();
        } else {
            return "Entregador não localizado";
        }
    }

    public Object atualizarEntregador(Entregador entregador) {
        Optional<Entregador> byId = entregadorRepository.findById(entregador.getId());
        if(byId.isPresent()) {
            return entregadorRepository.save(entregador);
        } else {
            return "Entregador não existe";
        }
    }
    public Object excluirEntregador(Long id) {
        Optional<Entregador> byId = entregadorRepository.findById(id);
        if(byId.isPresent()) {
            entregadorRepository.deleteById(id);
            return "Entregador excluído";
        } else {
            return "Entregador não localizado";
        }
    }
}
