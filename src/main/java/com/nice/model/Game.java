package com.nice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Evegeny on 12/07/2017.
 */
@Data
@Entity
public class Game {
    @GeneratedValue
    @Id
    private int id;
    private String name;
    private int price;
}
