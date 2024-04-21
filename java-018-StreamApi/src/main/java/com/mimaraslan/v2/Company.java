package com.mimaraslan.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1, "Ekmek", 6.0));
        productsList.add(new Product(2, "Süt", 8.1));
        productsList.add(new Product(3, "Su", 3.2));
        productsList.add(new Product(4, "Peynir", 66.1));
        productsList.add(new Product(5, "Çikolata", 18.1));
        productsList.add(new Product(6, "Domates", 9.1));


        List<Product> productsList2 =
                productsList
                        .stream()
                        .filter(p -> p.getPrice() > 5 && p.getPrice() < 50)
                        .limit(3)
                        //             u -> u.getPrice()
                        // .mapToDouble(Product::getPrice).sum()
                        // .reduce()  // 2. yol
                        // TODO toplam sonucu elde edin lütfen.
                        .collect(Collectors.toList());

        System.out.println(productsList2);


    }

}
