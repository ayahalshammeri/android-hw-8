package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon> mypokemons = new ArrayList<>();
        Pokemon p1 = new Pokemon("Squirtle",R.drawable.squirtle,48,65,314);
        Pokemon p2 = new Pokemon("Charmander",R.drawable.charmander,52,43,309);
        Pokemon p3 = new Pokemon("Weedle",R.drawable.weedle,35,30,195);
        Pokemon p4 = new Pokemon("Beedrill",R.drawable.beedrill,90,40,395);
        Pokemon p5 = new Pokemon("Rattata",R.drawable.rattata,56,35,253);


        mypokemons.add(p1);
        mypokemons.add(p2);
        mypokemons.add(p3);
        mypokemons.add(p4);
        mypokemons.add(p5);

        RecyclerView rv = findViewById(R.id.RecyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        PokemonAdapter adapter = new PokemonAdapter(mypokemons,this);
        rv.setAdapter(adapter);
    }
}