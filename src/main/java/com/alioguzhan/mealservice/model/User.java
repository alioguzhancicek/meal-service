package com.alioguzhan.mealservice.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
public class User extends BaseEntity{


    private int age;

    @Column
    private int gender;

    @Column
    private int weight;

    @Column
    private int height;

    @Column
    private boolean disability;






}
