package com.gildedrose;

public class Backstage implements updatableItem {
    private final GildedItem item;

    public Backstage(GildedItem item){
        this.item  = item;
    }

    @Override
    public void update() {
        item.reduceSellIn();
        int sellIn = item.getSellIn();
        if(sellIn>10) {
            item.increaseQualityBy(1);
        } else if(sellIn>5) {
            item.increaseQualityBy(2);
        } else if(sellIn>0) {
            item.increaseQualityBy(3);
        } else {
            item.setQuality(0);
        }
    }


}
