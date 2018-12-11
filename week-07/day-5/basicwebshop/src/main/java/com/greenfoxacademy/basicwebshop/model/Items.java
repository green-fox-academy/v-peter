package com.greenfoxacademy.basicwebshop.model;

import java.util.ArrayList;
import java.util.Collections;

public class Items {
  private ArrayList<Item> itemList;

  public Items() {
    this.itemList = new ArrayList<>();
  }

  public void addItem(String name, String description, double price, int quantity) {
    Item item = new Item(name, description, price, quantity);
    itemList.add(item);
  }

  public ArrayList<Item> getItemList() {
    return itemList;
  }

  public ArrayList<Item> cheapestFirst() {
    Collections.sort(itemList);
    return itemList;
  }

}
