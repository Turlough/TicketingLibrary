package com.example.com.example.product;

import com.annimon.stream.Stream;

import java.util.ArrayList;
import java.util.List;

import static com.annimon.stream.Collectors.toList;

/**
 * Created by turlough on 01/01/16.
 * Stream API: https://github.com/aNNiMON/Lightweight-Stream-API
 * Lambdas: retrolambda
 */
public class ProductManager {
    private static ProductManager ourInstance = new ProductManager();

    List<Product> products = new ArrayList<>();

    private ProductManager() {
        createTestData();
    }

    public static ProductManager getInstance() {
        return ourInstance;
    }

    private void createTestData() {
        products.add(new Product(1, 2, 3));
        products.add(new Product(1, 2, 4));
        products.add(new Product(1, 4, 3));
        products.add(new Product(1, 5, 3));
        products.add(new Product(1, 6, 3));
        products.add(new Product(1, 7, 3));
    }

    public List<Product> getProducts(){
        return products;
    }

    public List<Product> filterByStops(int fromId, int toId){

        return Stream.of(products)
                .filter(p -> p.getFromId() == fromId && p.getToId() == toId)
                .collect(toList());

    }

    public List<Product> filterTop4(List<Product> products, int limit){

        return Stream.of(products)
                .limit(limit)
                .collect(toList());

    }
}
