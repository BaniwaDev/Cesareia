package net.baniwa.cesareia.controller;

import net.baniwa.cesareia.model.Leitor;
import net.baniwa.cesareia.service.LeitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leitores")
public class LeitorController {

    @Autowired
    private LeitorService leitorService;

    @GetMapping
    public List<Leitor> listarTodos(){
        return leitorService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Leitor> buscarPorId(@PathVariable Long id){
        return leitorService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Leitor> atualizar(@PathVariable Long id, @RequestBody Leitor leitorAtualizado){
        return leitorService.buscarPorId(id)
                .map(leitor -> {
                    leitorAtualizado.setId(id);
                    return ResponseEntity.ok(leitorService.salvar(leitorAtualizado));
                })
                .orElse(ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (leitorService.buscarPorId(id).isPresent()) {
            leitorService.deletar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }


}
