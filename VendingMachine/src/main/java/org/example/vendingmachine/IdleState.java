package org.example.vendingmachine;

import org.example.model.Coin;
import org.example.model.Item;
import org.example.model.ItemShelf;

import java.util.List;

public class IdleState implements State{

    @Override
    public void pressInsertCoin(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new MoneyState());

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception(" System can not perform in idle state ");
    }

    @Override
    public void pressProductSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" System can not perform in idle state ");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception(" System can not perform in idle state ");
    }

    @Override
    public void pressProductDispense(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" System can not perform in idle state ");
    }

    @Override
    public List<Coin> refundCancelation(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" System can not perform in idle state ");
    }

    @Override
    public int getChange(int changeCash) throws Exception {
        throw new Exception(" System can not perform in idle state ");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine,int code) throws Exception {
        throw new Exception(" System can not perform in idle state ");
    }
}
