package com.gildedrose;

public class ConjuredItem implements updatableItem {
    private final GildedItem item;

    public ConjuredItem(GildedItem item){
        this.item  = item;
    }

    @Override
    public void update() {
        item.reduceSellIn();
        int degradationRate = 2;
        int sellIn = item.getSellIn();
        if(sellIn<0) {
            degradationRate *=2;
        }
        item.decreaseQualityBy(degradationRate);
    }
}
