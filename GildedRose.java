package com.gildedrose;
import java.util.ArrayList;
import java.util.List;

class GildedRose {
    Item[] items;
    List<updatableItem> containedItems;

    public GildedRose(Item[] items) {
        this.items = items;
        buildContainedItems();
    }

    public void updateQuality() {
        containedItems.forEach(updatableItem::update);
    }

    private void buildContainedItems() {
        containedItems = new ArrayList<>();
        for (Item item: items) {
            GildedItem gildedItem = new GildedItem(item);
            if (item.name.equals("Aged Brie")) {
                containedItems.add(new AgedBrie(gildedItem));
            } else if(item.name.contains("Backstage passes")) {
                containedItems.add(new Backstage(gildedItem));
            } else if(item.name.equals("Sulfuras, Hand of Ragnaros")) {
                containedItems.add(new Sulfuras(gildedItem));
            } else if(item.name.startsWith("Conjured")) {
                containedItems.add(new ConjuredItem(gildedItem));
            } else {
                containedItems.add(new GeneralItem(gildedItem));
            }
        }
    }

    public void setDaysPassed(int days){
        for(int i=0;i<days;i++){
            updateQuality();
        }
    }
}
