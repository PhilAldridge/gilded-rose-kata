package com.gildedrose;

public class GeneralItem implements updatableItem {
    private final GildedItem item;

    public GeneralItem(GildedItem item){
        this.item  = item;
    }

    @Override
    public void update() {
        item.reduceSellIn();
        int degradationRate = 1;
        int sellIn = item.getSellIn();
        if(sellIn<0) {
            degradationRate *=2;
        }
        item.decreaseQualityBy(degradationRate);
    }
}
