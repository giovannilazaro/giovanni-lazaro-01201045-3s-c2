package com.br.bandtec.lutalivre.controller;

import com.br.bandtec.lutalivre.model.Lutador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.bandtec.lutalivre.repository.LutadorRepository;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lutadores")


public class LutadorController {

    @Autowired
    private LutadorRepository repository;


  @PostMapping
    public ResponseEntity postLutador(@RequestBody @Valid Lutador novoLutador){
      if (novoLutador.getVida() > 0){
          novoLutador.setVivo(true);
      }else {
          novoLutador.setVivo(false);
      }
    repository.save(novoLutador);
    return ResponseEntity.status(201).build();
    }

  @GetMapping ResponseEntity getLutador (){
      return ResponseEntity.status(200).body(repository.findByForcaGolpe());
    }

    @GetMapping("/mortos")
    public ResponseEntity getMortos() {

        List<Lutador> lutadores = repository.findAll();
        return ResponseEntity.ok(repository.findByVivoFalse());
    }

    @GetMapping("/vivos")
    public ResponseEntity getVivos() {
        List<Lutador> lutadores = repository.findAll();
        return ResponseEntity.ok(repository.findByVivoTrue());
    }


}
