package com.infnet.demo.controller;

import com.infnet.demo.model.Entregador;
import com.infnet.demo.service.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entregadores")
public class Controller {

    @Autowired
    private EntregadorService entregadorService;


    @PostMapping
    public Object criarEntegrador(@RequestBody Entregador entregador) {
        return entregadorService.salvar(entregador);
    }

    @GetMapping("/{id}")
    public Object buscarEntregador(@PathVariable("id") Long id) {
        return entregadorService.buscarEntregador(id);
    }

    @GetMapping
    public List<Entregador> listarEntregadores() {
        return entregadorService.listarEntregadores();
    }

    @PutMapping
    public Object alteraEntregador(@RequestBody Entregador entregador) {
        return entregadorService.atualizarEntregador(entregador);
    }

    @DeleteMapping("/{id}")
    public Object excluirEntregador(@PathVariable("id") Long id) {
        return entregadorService.excluirEntregador(id);
    }

}
