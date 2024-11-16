package org.example.vendingmachine;

import org.example.model.Coin;
import org.example.model.Item;
import org.example.model.ItemShelf;

import java.util.List;

public class MoneyState implements State{

    @Override
    public void pressInsertCoin(VendingMachine vendingMachine) throws Exception {
          throw new Exception(" Cannot press insert in money State ");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        vendingMachine.coinList.add(coin);

    }

    @Override
    public void pressProductSelection(VendingMachine vendingMachine) throws Exception {
         vendingMachine.setState(new SelectionState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception(" Cannot select product in money State ");
    }

    @Override
    public void pressProductDispense(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" Cannot press product in money State ");
    }

    @Override
    public List<Coin> refundCancelation(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new IdleState());
        return vendingMachine.coinList;
    }

    @Override
    public int getChange(int changeCash) throws Exception {
        throw new Exception(" Cannot get change in money State ");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine,int code) throws Exception {
        throw new Exception(" Cannot get product in money State ");
    }
}
