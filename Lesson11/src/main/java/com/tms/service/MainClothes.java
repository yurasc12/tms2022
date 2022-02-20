package com.tms.service;

import com.tms.models.*;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Создать массив, содержащий все типы одежды
 */
public class MainClothes {
    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<>();
        for (ClothesSizes sizes : ClothesSizes.values()) {
            Tshirt tshirt = new Tshirt(sizes.getSize(), new BigDecimal(100), "black");
            Pants pants = new Pants(sizes.getSize(), new BigDecimal(200), "gray");
            Skirt skirt = new Skirt(sizes.getSize(), new BigDecimal(150), "red");
            Tie tie = new Tie(sizes.getSize(), new BigDecimal(80), "dark blue");


            clothes.add(tshirt);
            clothes.add(pants);
            clothes.add(skirt);
            clothes.add(tie);
        }

        Studio studio = new Studio();
        studio.dressedAWomen(clothes);
        studio.dressedAMen(clothes);

    }
}
