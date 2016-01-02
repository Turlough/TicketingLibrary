package com.example.test;

import com.example.com.example.product.Product;
import com.example.com.example.product.ProductManager;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by turlough on 02/01/16.
 */
public class ProductTest {

    ProductManager productManager = ProductManager.getInstance();

    @Test
    public void testFilterByStops(){

        List<Product> actual = productManager.filterByStops(1, 2);
        assertEquals(2, actual.size());
    }

    @Test
    public void testTop4(){

        List<Product> products = productManager.getProducts();
        List<Product> filtered = productManager.filterTop4(products, 4);
        assertEquals(4, filtered.size());
    }
}
