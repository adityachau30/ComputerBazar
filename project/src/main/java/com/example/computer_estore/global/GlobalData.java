package com.example.computer_estore.global;

import com.example.computer_estore.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static  {
        cart = new ArrayList<>();

    }
}
