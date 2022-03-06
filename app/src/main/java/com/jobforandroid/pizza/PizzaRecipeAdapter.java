package com.jobforandroid.pizza;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter <PizzaRecipeAdapter.PizzaRecipeViewHolder>{

    ArrayList<PizzaRecipeItem> pizzaRecipeItems;

    public PizzaRecipeAdapter (ArrayList<PizzaRecipeItem> pizzaRecipeItems) {
        this.pizzaRecipeItems = pizzaRecipeItems;

    }

    public static class PizzaRecipeViewHolder extends RecyclerView.ViewHolder {

        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;


        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }
    }

    @NonNull
    @Override
    public PizzaRecipeAdapter.PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pizza_recipe_item,viewGroup, false);
       PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
       return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder viewHolder, int position) {
        PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);

        viewHolder.pizzaImageView.setImageResource(pizzaRecipeItem.getImageResource());
        viewHolder.title.setText(pizzaRecipeItem.getTitle());
        viewHolder.description.setText(pizzaRecipeItem.getDescription());

    }

    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }
}
