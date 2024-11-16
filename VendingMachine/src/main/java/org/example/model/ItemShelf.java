package org.example.model;

public class ItemShelf {
    Item item;
    int code;
    //boolean  isAvailable;

    public int getNumOfitem() {
        return numOfitem;
    }

    public void setNumOfitem(int numOfitem) {
        this.numOfitem = numOfitem;
    }

    int numOfitem;

    public ItemShelf(Item item, int code) {
        this.item = item;
        this.code = code;

         this.numOfitem=0;
    }



    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
