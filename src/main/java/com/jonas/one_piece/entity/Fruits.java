package com.jonas.one_piece.entity;

import com.jonas.one_piece.enums.FruitTypeEnum;
import com.jonas.one_piece.models.DTO.FruitsRequestDTO;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tb_fruit_name")
public class Fruits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fruit_name")
    private String name;

    @Column(name = "fruit_type")
    private FruitTypeEnum fruitType;

    public Fruits(FruitsRequestDTO fruitsRequestDTO) {
        this.name = fruitsRequestDTO.getName();
        this.fruitType = fruitsRequestDTO.getFruitType();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public FruitTypeEnum getFruitType() {
        return this.fruitType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFruitType(FruitTypeEnum fruitType) {
        this.fruitType = fruitType;
    }


}
