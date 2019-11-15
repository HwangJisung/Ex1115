package com.hjs.ex_1115;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button back1 , back2;
    ImageView img1 , img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back1 = findViewById(R.id.back1);
        back2 = findViewById(R.id.back2);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);


        back1.setOnClickListener(click);
        back2.setOnClickListener(click);
    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.back1 :
                    img1.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.INVISIBLE);
                    break;
                case R.id.back2 :
                    img2.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.INVISIBLE);
                    break;
            }
        }
    };

}
