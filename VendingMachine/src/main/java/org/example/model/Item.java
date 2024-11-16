package org.example.model;

public class Item {

    int price;
    ItemType itemType;

    public Item(int price, ItemType itemType) {
        this.price = price;
        this.itemType = itemType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
