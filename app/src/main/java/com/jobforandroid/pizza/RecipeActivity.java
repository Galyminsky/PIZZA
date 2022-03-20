package com.jobforandroid.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    private RecipeActivity pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        pizza = (RecipeActivity) getIntent().getSerializableExtra(PizzaRecipeItem.PIZZA_SAVE);

        TextView title = findViewById(R.id.titleEditText);
        TextView recipe = findViewById(R.id.recipeEditText);
        ImageView imageView = findViewById(R.id.recipeImageView);
        Button btn_save = findViewById(R.id.btn_save);



        Intent intent = getIntent();
        if (intent != null) {
            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));
            btn_save.setText(intent.getStringExtra("btn_save"));


        }


    }

}