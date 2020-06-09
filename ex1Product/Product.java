package com.it.academy.homework.ex1Product;

import java.util.Objects;

public class Product {


    public final int price;
    public final String name;
    public final int quantity;

    public Product(int price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;

    }

    @Override //poruwnuje, czy mają te same dane ( bo == sprawdza czy są zapisane w tych samych miejscach w pamięci RAM)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                quantity == product.quantity &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, quantity);
    }

    @Override // klouje
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // pozwala wyświetlić zrozumiały dla nas przekaz
    public String toString() {
        return "To jest " + name + " w cenie " + price + " jest tego " + quantity + " sztuk";
    }


    @Override // pozwala wykonywać akcje na obiekcie, gdy ten zostanie usunięty z pamięci
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
