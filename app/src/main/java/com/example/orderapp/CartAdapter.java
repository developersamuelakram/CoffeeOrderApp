package com.example.orderapp;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.orderapp.Database.OrderContract;

public class CartAdapter extends CursorAdapter {


    public CartAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.cartlist, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        // getting theviews

        TextView drinkName, yesCream, yesTopping, price, quantity;


        drinkName = view.findViewById(R.id.drinkNameinOrderSummary);
        price = view.findViewById(R.id.priceinOrderSummary);
        yesCream = view.findViewById(R.id.hasCream);
        yesTopping = view.findViewById(R.id.hasTopping);
        quantity = view.findViewById(R.id.quantityinOrderSummary);

        // getting the values by first getting the position of their columns

        int name = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_NAME);
        int priceofdrink = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_PRICE);
        int quantityofdrink = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_QUANTITY);
        int hasCream = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_CREAM);
        int hasTopping = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_HASTOPPING);


        String nameofdrink = cursor.getString(name);
        String pricesofdrink = cursor.getString(priceofdrink);
        String quantitysofdrink = cursor.getString(quantityofdrink);
        String yeshasCream = cursor.getString(hasCream);
        String yeshastopping = cursor.getString(hasTopping);



        drinkName.setText(nameofdrink);
        price.setText(pricesofdrink);
        yesCream.setText(yeshasCream);
        yesTopping.setText(yeshastopping);
        quantity.setText(quantitysofdrink);





    }
}
