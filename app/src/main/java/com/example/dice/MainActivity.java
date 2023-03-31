package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   private ImageView imageView1,imageView2;
   private TextView textView1,textView2;
    private Button btn;
    private Random myrandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imagebutton);
        imageView2 = findViewById(R.id.imagebutton2);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        btn = findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int myRannumber1  = myrandom.nextInt(6) +1;

                switch (myRannumber1){
                    case 1:
                        imageView1.setImageResource(R.drawable.one);
                        textView1.setText("ONE");
                        break;

                    case 2:
                        imageView1.setImageResource(R.drawable.two);
                        textView1.setText("TWO");
                        break;

                    case 3:
                        imageView1.setImageResource(R.drawable.three);
                        textView1.setText("THREE");
                        break;

                    case 4:
                        imageView1.setImageResource(R.drawable.four);
                        textView1.setText("FOUR");
                        break;

                    case 5:
                        imageView1.setImageResource(R.drawable.five);
                        textView1.setText("FIVE");
                        break;

                    case 6:
                        imageView1.setImageResource(R.drawable.six);
                        textView1.setText("SIX");
                        break;
                }

                int myRannumber2  = myrandom.nextInt(6) +1;

                switch (myRannumber2){
                    case 1:
                        imageView2.setImageResource(R.drawable.one);
                        textView2.setText("ONE");
                        break;

                    case 2:
                        imageView2.setImageResource(R.drawable.two);
                        textView2.setText("TWO");
                        break;

                    case 3:
                        imageView2.setImageResource(R.drawable.three);
                        textView2.setText("THREE");
                        break;

                    case 4:
                        imageView2.setImageResource(R.drawable.four);
                        textView2.setText("FOUR");
                        break;

                    case 5:
                        imageView2.setImageResource(R.drawable.five);
                        textView2.setText("FIVE");
                        break;

                    case 6:
                        imageView1.setImageResource(R.drawable.six);
                        textView1.setText("SIX");
                        break;
                }
            }
        });
    }
}