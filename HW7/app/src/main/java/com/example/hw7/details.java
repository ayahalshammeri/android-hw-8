package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle b = getIntent().getExtras();
        Pokemon p = (Pokemon) b.getSerializable("pokemon");

        TextView name = findViewById(R.id.textView4);
        TextView attack = findViewById(R.id.textView5);
        TextView defence = findViewById(R.id.textView6);
        TextView total = findViewById(R.id.textView7);
        ImageView img = findViewById(R.id.imageView3);

        name.setText(p.getName());
        attack.setText("Attack:  "+p.getAttack()+"");
        defence.setText("Defence:  "+ p.getDefence()+"");
        total.setText("Total:   "+p.getTotal()+"");
        img.setImageResource(p.getImage());



    }
}