package org.example.vendingmachine;

import org.example.model.Coin;
import org.example.model.Inventory;
import org.example.model.Item;
import org.example.model.ItemShelf;

import java.util.List;

public class DispenseState implements State{

    @Override
    public void pressInsertCoin(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" System can not perform in dispense state ");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception(" System can not perform in dispense state ");
    }

    @Override
    public void pressProductSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" System can not perform in dispense state ");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception(" System can not perform in dispense state ");
    }

    @Override
    public void pressProductDispense(VendingMachine vendingMachine) throws Exception {
           vendingMachine.setState(new IdleState());
    }

    @Override
    public List<Coin> refundCancelation(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" System can not perform in dispense state ");
    }

    @Override
    public int getChange(int changeCash) throws Exception {
        throw new Exception(" System can not perform in dispense state ");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine,int code) throws Exception {
        Inventory inventory = vendingMachine.getInventory();
        Item item = inventory.removeItem(code);
        if(item ==null)
        {
            throw new Exception(" Please select new item it is out of stock now ");
        }
        vendingMachine.setState(new IdleState());
        return item;

    }
}
