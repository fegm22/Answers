package com.balazscholczer.visitor;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
