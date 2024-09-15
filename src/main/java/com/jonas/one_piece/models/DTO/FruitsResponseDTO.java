package com.jonas.one_piece.models.DTO;


import com.jonas.one_piece.enums.FruitTypeEnum;

public class FruitsResponseDTO {

    private String name;

    private FruitTypeEnum fruitType;



    public String getName() {
        return this.name;
    }

    public FruitTypeEnum getFruitType() {
        return this.fruitType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFruitType(FruitTypeEnum fruitType) {
        this.fruitType = fruitType;
    }

}
