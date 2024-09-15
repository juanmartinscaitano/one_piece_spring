package com.jonas.one_piece.controller;

import com.jonas.one_piece.entity.Fruits;
import com.jonas.one_piece.enums.FruitTypeEnum;
import com.jonas.one_piece.models.DTO.FruitsRequestDTO;
import com.jonas.one_piece.models.DTO.FruitsResponseDTO;
import com.jonas.one_piece.services.imp.FruitsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits_demos")
public class FruitsController {

    @Autowired
    private FruitsServiceImp fruitsServiceImp;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Fruits createFruit(@RequestBody FruitsRequestDTO fruitsRequestDTO) {
        return this.fruitsServiceImp.createFruit(fruitsRequestDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Fruits> listFruits() {
        return this.fruitsServiceImp.listFruits();
    }

}
