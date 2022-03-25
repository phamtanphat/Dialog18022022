package com.example.dialog18022022.demo_builder_design_pattern;

public interface MyBuilder {
    MyBuilder orderChicken(Chicken chicken);
    MyBuilder orderHamburger(Hamburger hamburger);
    MyBuilder orderCombo(Combo combo);
    MyBuilder orderWater(Water water);
    FastFood build();
}
