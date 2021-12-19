package com.company;

import germanyForniture.FornitureFactoryGermany;
import russianForniture.FornitureFactoryRussia;

public class Main {

    public static void main(String[] args) {
	FornitureFactory fornitureFactory = new FornitureFactoryRussia();
    Chair chair1 = fornitureFactory.getChair();
    chair1.setHeight(100);
    chair1.setName("Стул деревянный");
    chair1.setPrice(1000);
    chair1.getDescription();
    Cooker cooker1 = fornitureFactory.getCooker();
    cooker1.setName("Плита Витязь");
    cooker1.setPrice(3000);
    cooker1.setPower(1000);
    cooker1.getDescription();
    FornitureFactory fornitureFactory1 = new FornitureFactoryGermany();
    Chair chair2 = fornitureFactory1.getChair();
    chair2.setHeight(80);
    chair2.setName("Стул из немецкого дерева");
    chair2.setPrice(1300);
    chair2.getDescription();
    Cooker cooker2 = fornitureFactory1.getCooker();
    cooker2.setName("Плита Schneider");
    cooker2.setPrice(5000);
    cooker2.setPower(1200);
    cooker2.getDescription();
    }
}
