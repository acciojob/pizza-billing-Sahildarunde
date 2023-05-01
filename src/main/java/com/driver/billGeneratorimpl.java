package com.driver;

public class billGeneratorimpl implements billGenerator{
    @Override
    public String getBill(Pizza pizza) {
        String var = "";
        var += "Base Price Of The Pizza: " + pizza.getBasePrice() +"\n";
        if(pizza.getIsCheeseAdded()){
            var += "Extra Cheese Added: " + pizza.getCheesePrice() +"\n";
        }
        if(pizza.getIsToppingsAdded()){
            var += "Extra Toppings Added: " + pizza.getToppingPrice() +"\n";
        }
        if(pizza.getIsTakeaway()){
            var += "Paperbag Added: " + pizza.getPaperBagPrice() +"\n";
        }
        var += "Total Price: " + pizza.getPrice() +"\n";

        return var;
    }
}
