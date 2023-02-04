package com.example.pnwhack_a;
import java.util.*;
public class input_A {
    private String ingredName;
    private ArrayList ingredList;

    public input_A(String ingredName, int ingredQuantity){
        this.ingredName = ingredName;
    }
    public String getIngredName(){
        return this.ingredName;
    }

    public void setIngredName(String newIngredName){
        this.ingredName = newIngredName;
    }
    public String toString(){
        return ;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        do {
            String name = console.nextLine();
            int quantity = console.nextInt();
            input_A newIngred = new input_A(name, quantity);
            (this.ingredList).add(newIngred);
        } while ((console.next()).equals("-1"));

        if ()
    }
}
