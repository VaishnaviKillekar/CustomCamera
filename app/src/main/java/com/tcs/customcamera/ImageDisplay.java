package com.tcs.customcamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

public class ImageDisplay extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);

        imageView = findViewById(R.id.imageView);

        String imgFile = getIntent().getStringExtra("FILE");

        Bitmap bitmap = BitmapFactory.decodeFile(imgFile);
        imageView.setImageBitmap(bitmap);
    }
}
