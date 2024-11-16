package org.example.vendingmachine;

import org.example.model.Coin;
import org.example.model.Item;
import org.example.model.ItemShelf;

import java.util.List;

public interface State {
     public void pressInsertCoin(VendingMachine vendingMachine) throws Exception;
     public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception;
     public void pressProductSelection(VendingMachine vendingMachine) throws Exception;
     public void selectProduct(VendingMachine vendingMachine, int code) throws Exception;
     public void pressProductDispense(VendingMachine vendingMachine) throws Exception;
     public List<Coin> refundCancelation(VendingMachine vendingMachine) throws Exception;

     public int getChange(int changeCash) throws Exception;
     public Item dispenseProduct(VendingMachine vendingMachine,int code) throws Exception;

}
