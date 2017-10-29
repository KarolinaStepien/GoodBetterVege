package com.app.miszkur.goodbettervege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView krowa;
    Button reset;
    Boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clicked = false;
        krowa = (ImageView) findViewById(R.id.krowa);
        reset = (Button) findViewById(R.id.reset);
        Button noButton=(Button)findViewById(R.id.button_nie);
//set onclicklistener for your button
        noButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!clicked){
                            krowa.setImageResource(R.drawable.wesola_krowa);
                            clicked = true;
                        }

                    }
                });

        Button yesButton=(Button)findViewById(R.id.button_tak);
//set onclicklistener for your button
        yesButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!clicked){
                            krowa.setImageResource(R.drawable.smutna_krowa);
                            clicked = true;
                        }

                    }
                });
        reset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        krowa.setImageResource(R.drawable.krowa);
                        clicked=false;
                    }
                });
        Button more = (Button) findViewById(R.id.more);

        more.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://youtu.be/zHW5LRaRVUQ"));
                        startActivity(intent);
                        }
                });

        Button about = (Button) findViewById(R.id.about_us);

        about.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, AboutActivity.class));
                    }
                });
    }
}
