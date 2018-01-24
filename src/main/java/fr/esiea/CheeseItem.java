package fr.esiea;

public class CheeseItem extends Item {

    public CheeseItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    /**
     * Cheese actually increases in Quality the older it gets
     */
    public void updateQuality() {
        this.quality += (this.sellIn > 0) ? 1 : 2;
    }

};