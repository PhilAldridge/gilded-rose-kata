package com.gildedrose;

public class GildedItem {
    private final Item item;

    public GildedItem(Item item){
        this.item = item;
    }

    public void reduceSellIn(){
        item.sellIn --;
    }

    public void decreaseQualityBy(int amount){
        item.quality -= amount;
        if(item.quality<0){
            item.quality=0;
        }
    }

    public void increaseQualityBy(int amount){
        item.quality += amount;
        if(item.quality>50){
            item.quality=50;
        }
    }

    public int getSellIn(){
        return item.sellIn;
    }

    public void setQuality(int amount){
        item.quality=amount;
    }
}
