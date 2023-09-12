package com.example.lab06.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document("Wizard")
public class Wizard implements Serializable {
    @Id
    private String _id;
    private String sex;
    private String name;
    private String school;
    private String house;
    private Double money;
    private String position;

    public Wizard() {}

//    public Wizard(String s, String value, String s, String valueOf, String s1, String string1) {}
    public Wizard(String _id, String sex, String name, String school, String house, Double money, String position) {
        this._id = _id;
        this.sex = sex;
        this.name = name;
        this.school = school;
        this.house = house;
        this.money = money;
        this.position = position;
    }


}