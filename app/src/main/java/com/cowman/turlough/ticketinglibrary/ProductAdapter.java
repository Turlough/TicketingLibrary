package com.cowman.turlough.ticketinglibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.com.example.product.Product;

import java.util.List;

/**
 * Created by turlough on 01/01/16.
 */
public class ProductAdapter extends ArrayAdapter {

    private final Context context;
    private final int resource;
    private Product[] products;

    public ProductAdapter(Context context, int resource, Object[] products) {
        super(context, resource, products);
        this.context = context;
        this.resource = resource;

        this.products = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
            this.products[i] = (Product) products[i];
        }
    }

    public void setProducts(List<Product> products){
        this.products = new Product[products.size()];
        for (int i = 0; i < products.size(); i++) {
            this.products[i]=products.get(i);
        }
        notifyDataSetChanged();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View child = convertView;
        RecordHolder holder;
        LayoutInflater inflater = ((Activity) context).getLayoutInflater(); // inflating your xml layout

        if (child == null) {
            child = inflater.inflate(resource, parent, false);
            holder = new RecordHolder();
            holder.fromName = (TextView) child.findViewById(R.id.textView1); // fname is the reference to a textview
            holder.toName = (TextView) child.findViewById(R.id.textView2); // in your xml layout file
            holder.value =(TextView) child.findViewById(R.id.textView3); // you are inflating.etc
            child.setTag(holder);
        }else{
            holder = (RecordHolder) child.getTag();
        }

        final Product product = products[position]; // you can remove the final modifieer.

        holder.fromName.setText(Integer.toString(product.getFromId()));
        holder.toName.setText(Integer.toString(product.getToId()));
        holder.value.setText(Integer.toString(product.getValue()));

        return child;
    }

    static class RecordHolder {
        TextView fromName, toName, value;
    }

    @Override
    public void notifyDataSetChanged() { // you can remove this..

        if(getCount() == 0){
            //show layout or something that notifies that no list is in..
        }else{
            // this is to make sure that you can call notifyDataSetChanged in any place and any thread
            new Handler(getContext().getMainLooper()).post(() -> ProductAdapter.super.notifyDataSetChanged());
        }
    }
}
