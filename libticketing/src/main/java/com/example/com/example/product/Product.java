package com.example.com.example.product;

import lombok.Data;

/**
 * Created by turlough on 01/01/16.
 */
public @Data
class Product {
    String code;
    String name;
    int fromId;
    int toId;
    int value;

    public Product(int fromId, int toId, int value){
        this.fromId = fromId;
        this.toId = toId;
        this.value = value;
    }
}
