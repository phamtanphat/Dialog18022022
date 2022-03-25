package com.example.dialog18022022.demo_builder_design_pattern;

public class FastFood {
    private Chicken chicken;
    private Hamburger hamburger;
    private Combo combo;
    private Water water;

    public FastFood(Chicken chicken, Hamburger hamburger, Combo combo, Water water) {
        this.chicken = chicken;
        this.hamburger = hamburger;
        this.combo = combo;
        this.water = water;
    }

    public Chicken getChicken() {
        return chicken;
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return "FastFood{" +
                "chicken=" + chicken +
                ", hamburger=" + hamburger +
                ", combo=" + combo +
                ", water=" + water +
                '}';
    }

    public static class Builder implements MyBuilder {

        private Chicken chicken;
        private Hamburger hamburger;
        private Combo combo;
        private Water water;

        @Override
        public MyBuilder orderChicken(Chicken chicken) {
            this.chicken = chicken;
            return this;
        }

        @Override
        public MyBuilder orderHamburger(Hamburger hamburger) {
            this.hamburger = hamburger;
            return this;
        }

        @Override
        public MyBuilder orderCombo(Combo combo) {
            this.combo = combo;
            return null;
        }

        @Override
        public MyBuilder orderWater(Water water) {
            this.water = water;
            return this;
        }

        @Override
        public FastFood build() {
            return new FastFood(chicken, hamburger, combo, water);
        }
    }
}
