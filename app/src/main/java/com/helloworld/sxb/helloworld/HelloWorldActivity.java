package com.helloworld.sxb.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);


        final ImageView img = (ImageView)findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show messaga
                Context context = getApplicationContext();
                CharSequence textOnClick = "That me ;) \ud83d\ude01";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, textOnClick, duration);
                toast.show();

                // Enlarge image
                Intent fullScreenIntent = new Intent(getBaseContext(), FullScreenImageActivity.class);
                fullScreenIntent.putExtra("msg", "From HelloWorld Activity");
                startActivity(fullScreenIntent);
            }
        });

    }



}
