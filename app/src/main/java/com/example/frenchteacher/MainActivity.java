package com.example.frenchteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blackbutton,greenbutton,purplebutton,redbutton,yellowbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        blackbutton=findViewById(R.id.blackbutton);
        greenbutton=findViewById(R.id.greenbutton);
        purplebutton=findViewById(R.id.purplebutton);
        redbutton=findViewById(R.id.redbutton);
        yellowbutton=findViewById(R.id.yellowbutton);

        blackbutton.setOnClickListener(this);
        greenbutton.setOnClickListener(this);
        purplebutton.setOnClickListener(this);
        redbutton.setOnClickListener(this);
        yellowbutton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        int clickedbutton=v.getId();

        if(clickedbutton==R.id.blackbutton)
        {
            playsound(R.raw.black);
            Toast.makeText(this, "Black in french", Toast.LENGTH_SHORT).show();
        }
        else if(clickedbutton==R.id.greenbutton)
        {
            playsound(R.raw.green);
            Toast.makeText(this, "Green in french", Toast.LENGTH_SHORT).show();
        }
        else if(clickedbutton==R.id.purplebutton)
        {
            playsound(R.raw.purple);
            Toast.makeText(this, "Purple in french", Toast.LENGTH_SHORT).show();
        }
        else if(clickedbutton==R.id.redbutton)
        {
            playsound(R.raw.red);
            Toast.makeText(this, "Red in french", Toast.LENGTH_SHORT).show();
        }
        else if(clickedbutton==R.id.yellowbutton)
        {
            playsound(R.raw.yellow);
            Toast.makeText(this, "Yellow in french", Toast.LENGTH_SHORT).show();
        }

    }

    public void playsound(int id)
    {
        MediaPlayer mediaPlayer=MediaPlayer.create(this,id);
        mediaPlayer.start();
    }
}