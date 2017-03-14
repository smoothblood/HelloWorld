package com.helloworld.sxb.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FullScreenImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        ImageView fullScreenImageView = (ImageView) findViewById(R.id.fullScreenimageView);
        TextView txtView = (TextView) findViewById(R.id.textView3);


        Intent callingActivityIntent = getIntent();
        if(callingActivityIntent != null){
            String msg = callingActivityIntent.getStringExtra("msg");
            txtView.setText(msg);
//            Uri imageUri = callingActivityIntent.getData();
//            if(imageUri != null && fullScreenImageView != null){
//                Glide.with(this).load(imageUri).into(fullScreenImageView);
//            }
        }

    }


}
