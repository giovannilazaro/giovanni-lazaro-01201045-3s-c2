package com.br.bandtec.lutalivre.controller;

import com.br.bandtec.lutalivre.model.Lutador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.bandtec.lutalivre.repository.LutadorRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lutadores")


public class LutadorController {

@Autowired
    private LutadorRepository repository;


  @PostMapping
public ResponseEntity postLutador(@RequestBody @Valid Lutador novoLutador){
repository.save(novoLutador);
return ResponseEntity.status(201).build();

  }

@GetMapping ResponseEntity getLutador (){

      return ResponseEntity.status(200).body(repository.findAll());
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
