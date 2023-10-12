package com.gildedrose;

public class AgedBrie implements updatableItem {
    private final GildedItem item;

    public AgedBrie(GildedItem item){
        this.item  = item;
    }

    @Override
    public void update() {
        item.reduceSellIn();
        item.increaseQualityBy(1);
    }
}
