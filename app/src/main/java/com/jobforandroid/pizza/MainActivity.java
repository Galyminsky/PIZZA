package com.jobforandroid.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.alyaska, Utils.PIZZA_ALYASKA_TITLE,
                    Utils.PIZZA_ALYASKA_DESCRIPTION, Utils.PIZZA_ALYASKA_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.bif_strong,Utils.PIZZA_BIF_STRONG_TITLE,
                    Utils.PIZZA_BIF_STRONG_DESCRIPTION,Utils.PIZZA_BIF_STRONG_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.chezare,Utils.PIZZA_CHEZARE_TITLE,
                    Utils.PIZZA_CHEZARE_DESCRIPTION,Utils.PIZZA_CHEZARE_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.classic,Utils.PIZZA_CLASSIC_TITLE,
                    Utils.PIZZA_CLASSIC_DESCRIPTION,Utils.PIZZA_CLASSIC_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.emiliya,Utils.PIZZA_EMILIYA_TITLE,
                    Utils.PIZZA_EMILIYA_DESCRIPTION,Utils.PIZZA_EMILIYA_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.gribnaya,Utils.PIZZA_GRIBNAYA_TITLE,
                    Utils.PIZZA_GRIBNAYA_DESCRIPTION,Utils.PIZZA_GRIBNAYA_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.kantri,Utils.PIZZA_KANTRI_TITLE,
                    Utils.PIZZA_KANTRI_DESCRIPTION,Utils.PIZZA_KANTRI_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.kemping,Utils.PIZZA_KEMPING_TITLE,
                    Utils.PIZZA_KEMPING_DESCRIPTION,Utils.PIZZA_KEMPING_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.margarita,Utils.PIZZA_MARGARITA_TITLE,
                    Utils.PIZZA_MARGARITA_DESCRIPTION,Utils.PIZZA_MARGARITA_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.milkidog,Utils.PIZZA_MILKIDOG_TITLE,
                    Utils.PIZZA_MILKIDOG_DESCRIPTION,Utils.PIZZA_MILKIDOG_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.mit_bang,Utils.PIZZA_MIT_BANG_TITLE,
                    Utils.PIZZA_MIT_BANG_DESCRIPTION,Utils.PIZZA_MIT_BANG_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pepperoni,Utils.PIZZA_PEPPERONI_TITLE,
                    Utils.PIZZA_PEPPERONI_DESCRIPTION,Utils.PIZZA_PEPPERONI_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.provanskaya,Utils.PIZZA_PROVANSKAYA_TITLE,
                    Utils.PIZZA_PROVANSKAYA_DESCRIPTION,Utils.PIZZA_PROVANSKAYA_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.salyami,Utils.PIZZA_SALYAMI_TITLE,
                    Utils.PIZZA_SALYAMI_DESCRIPTION,Utils.PIZZA_SALYAMI_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.tri_cheese,Utils.PIZZA_TRI_CHEESE_TITLE,
                    Utils.PIZZA_TRI_CHEESE_DESCRIPTION,Utils.PIZZA_TRI_CHEESE_RECIPE));
            pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.vegana,Utils.PIZZA_VEGANA_TITLE,Utils.PIZZA_VEGANA_DESCRIPTION,
                    Utils.PIZZA_VEGANA_RECIPE));

    }
}