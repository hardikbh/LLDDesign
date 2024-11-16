package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Inventory {
    List<ItemShelf> itemShelfList;

    public List<ItemShelf> getItemShelfList() {
        return itemShelfList;
    }

    public void setItemShelfList(List<ItemShelf> itemShelfList) {
        this.itemShelfList = itemShelfList;
    }

    public Inventory() {
        this.itemShelfList = new ArrayList<>();
    }

    public void addItem(ItemShelf itemShelf,Item item)
    {
        itemShelf.setItem(item);
        int numOfItems = itemShelf.getNumOfitem();
        itemShelf.setNumOfitem(numOfItems+1);
        itemShelfList.add(itemShelf);
    }

    public Item removeItem(int code)
    {

        Item item=null;
        for(ItemShelf itemShelf: itemShelfList)
        {
            if(itemShelf.getCode()==code )
            {
               // ItemShelf itemShelf1 = ;
                item = itemShelf.getItem();
                int numOfItems = itemShelf.getNumOfitem();

                itemShelf.setNumOfitem(numOfItems-1);
                if(itemShelf.getNumOfitem()==0) {

                    itemShelfList.remove(itemShelf);
                }

            }
        }
        return item;
    }
}
