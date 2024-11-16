package org.example.vendingmachine;

import org.example.model.Coin;
import org.example.model.Inventory;
import org.example.model.Item;
import org.example.model.ItemShelf;

import java.util.List;
import java.util.Scanner;

public class SelectionState implements State{

    @Override
    public void pressInsertCoin(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" Cannot press insert in selection State ");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception(" Cannot press insert in selection State ");
    }

    @Override
    public void pressProductSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception(" Cannot press product selection in selection State ");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int code) throws Exception {
        Inventory inventory = vendingMachine.getInventory();
        List<Coin> coinList = vendingMachine.getCoinList();
        List<ItemShelf> itemShelfList = inventory.getItemShelfList();

        int totalAmountEnter =0;
        for(Coin coin : coinList)
        {
            totalAmountEnter+= coin.val;
        }

        for(ItemShelf itemShelf:itemShelfList)
        {
            if(itemShelf.getCode()==code)
            {
                Item item1 = itemShelf.getItem();
                if(item1.getPrice()==totalAmountEnter)
                {
                    System.out.println(" You can take the product by pressing the dispense button ");


                }
                else if(item1.getPrice()<totalAmountEnter)  // 15 > 10
                {
                    getChange(totalAmountEnter- item1.getPrice());
                }
                else
                {
                    System.out.println(" Insufficient balance you need to enter more money to select this product ");
                    System.out.println(" Do you want to add more coin or full refund please enter YES or NO :");
                   Scanner sc = new Scanner(System.in);
                    String s = sc.nextLine();
                    switch (s)
                    {
                        case "Yes":
                            vendingMachine.setState(new MoneyState());
                            break;
                        case "No":
                            refundCancelation(vendingMachine);
                            break;
                        default:
                            refundCancelation(vendingMachine);
                            break;
                    }
                   // vendingMachine.setState(new MoneyState());
                   // refundCancelation(vendingMachine);
                }
            }
        }


    }

    @Override
    public void pressProductDispense(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new DispenseState());
    }

    @Override
    public List<Coin> refundCancelation(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new IdleState());
        return vendingMachine.getCoinList();
    }

    @Override
    public int getChange(int changeCash) throws Exception {
        return changeCash;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine,int code) throws Exception {
        throw new Exception(" Cannot press product selection in selection State ");
    }
}
