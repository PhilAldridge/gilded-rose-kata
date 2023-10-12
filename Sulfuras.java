package com.gildedrose;

public class Sulfuras implements updatableItem {
    private final GildedItem item;

    public Sulfuras(GildedItem item){
        this.item  = item;
    }

    @Override
    public void update() {
        item.setQuality(80);
    }


}
