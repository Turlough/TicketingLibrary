package com.cowman.turlough.ticketinglibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import com.example.com.example.product.ProductManager;

public class TicketingActivity extends AppCompatActivity {

    GridView gridView;
    ProductManager productManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        productManager = ProductManager.getInstance();
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ProductAdapter(this, R.layout.productgrid_item, productManager. getProducts().toArray()));

    }

}
