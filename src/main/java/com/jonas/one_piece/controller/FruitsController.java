package com.jonas.one_piece.controller;

import com.jonas.one_piece.enums.FruitTypeEnum;
import com.jonas.one_piece.models.DTO.FruitsResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruits_demos")
public class FruitsController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public FruitsResponseDTO getFruit() {
        FruitsResponseDTO fruitsResponseDTO = new FruitsResponseDTO();
        fruitsResponseDTO.setName("Gomu-Gomu");
        fruitsResponseDTO.setFruitType(FruitTypeEnum.PARAMERSIA);
        return fruitsResponseDTO;
    }

}
