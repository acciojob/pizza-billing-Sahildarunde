package com.driver;

public class Pizza {


    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private billGenerator billGen;
    private int basePrice;
    private int vegToppingsPrice = 70;
    private int nonVegToppingsPrice = 120;
    private int cheesePrice = 80;
    private boolean isTakeaway;
    private int toppingPrice;
    private int paperBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        basePrice = getBasePrice();
        price = basePrice;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isTakeaway = false;
        this.billGen = new billGeneratorimpl();
    }
    public Pizza (Boolean isVeg, billGenerator billGen){
        this.isVeg = isVeg;
        basePrice = getBasePrice();
        price = basePrice;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isTakeaway = false;
        this.billGen = billGen;
    }

    public int getPrice(){
        return this.price;
    }

    public Boolean getIsVeg() {
        return isVeg;
    }

    public int getVegBasePrice() {
        return vegBasePrice;
    }

    public boolean getIsCheeseAdded() {
        return isCheeseAdded;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            isCheeseAdded = true;
            price += cheesePrice;
        }
    }

    public boolean getIsToppingsAdded() {
        return isToppingsAdded;
    }

    public int getVegToppingsPrice() {
        return vegToppingsPrice;
    }

    public int getNonVegToppingsPrice() {
        return nonVegToppingsPrice;
    }

    public int getPaperBagPrice() {
        return paperBagPrice;
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

    public boolean getIsTakeaway() {
        return isTakeaway;
    }

    public int getCheesePrice() {
        return cheesePrice;
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            isToppingsAdded = true;
            price += isVeg ? vegToppingsPrice : nonVegToppingsPrice;
            toppingPrice = isVeg ? vegToppingsPrice : nonVegToppingsPrice;
        }
    }

    int getBasePrice(){
        return isVeg ? vegBasePrice : nonVegBasePrice;
    }
    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            isTakeaway = true;
            price += paperBagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String bill = billGen.getBill(this);
        this.bill = bill;
        return this.bill;
    }

}
