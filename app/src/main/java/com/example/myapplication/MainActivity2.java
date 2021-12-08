package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    List<String> S2= Arrays.asList("Makharij 1,2,3","Makharij 4,5","Makharij 6,7","Makharij 8,9,10","Makharij 11","Makharij 12");
    List<String> S3=Arrays.asList("d1","d2","d3","d4","d5","d6");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void display_image(View view) {

        int id=view.getId();
        Button var = (Button) findViewById(id);
        String text =String.valueOf(var.getText()) ;
        ImageView imageView = findViewById(R.id.imageView3);
        String uri = "@drawable/"+S3.get(S2.indexOf(text));
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);
    }
}