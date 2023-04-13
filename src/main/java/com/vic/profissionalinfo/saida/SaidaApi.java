package com.vic.profissionalinfo.saida;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SaidaApi {
    @GetMapping
    public ResponseEntity<String> retornaValor(){
        return new ResponseEntity<>("Saída do teste!", HttpStatus.OK);
    }
}
