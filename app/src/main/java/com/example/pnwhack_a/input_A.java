package com.example.pnwhack_a;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.*;
public class input_A extends AppCompatActivity {
    private String ingredName;
    private ArrayList<input_A> ingredList;
    private CheckBox checkBox;
    private Button recipe;
    private Button delete;
    EditText addtolist;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);

        checkBox = (checkBox) findViewById(R.id.frizz_A);
        addtolist = (EditText) findViewById(R.id.textView2_A);

    }
    public void updateText(View view){
        checkBox.setText("Hi " + addtolist.getText());
    }




    /*public input_A(String ingredName){
        this.ingredName = ingredName;
        this.checkBox = false;
    }
    public String getIngredName(){
        return this.ingredName;
    }

    public void setIngredName(String newIngredName){
        this.ingredName = newIngredName;
    }
    public String getaddtolist(){

        return
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        do {
            String name = console.nextLine();
            int quantity = console.nextInt();
            input_A newIngred = new input_A(name, quantity);
            (this.ingredList).add(newIngred);

        } while ((console.next()).equals("-1"));
        */
    }

