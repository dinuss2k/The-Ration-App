package com.example.rs2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class week3 extends AppCompatActivity {
ImageView week3image;
    FirebaseStorage storage=FirebaseStorage.getInstance();
    StorageReference storageReference = storage.getReferenceFromUrl("gs://myloginapp-8b1bc.appspot.com").child("week3.jpeg");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3);
        week3image=(ImageView)findViewById(R.id.week3image);
        try {
            final File file = File.createTempFile("week3", "jpeg");
            storageReference.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    week3image.setImageBitmap(bitmap);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(week3.this, "Image error", Toast.LENGTH_SHORT).show();

                }
            });
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}