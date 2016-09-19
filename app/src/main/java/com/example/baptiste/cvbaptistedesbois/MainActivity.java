package com.example.baptiste.cvbaptistedesbois;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.baptiste.cvbaptistedesbois.View.FlyMenu;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    RoundImage roundedImage;
    FlyMenu root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.root=(FlyMenu) this.getLayoutInflater().inflate(R.layout.activity_main, null);
        setContentView(root);
        imageView1 = (ImageView) findViewById(R.id.imageView);
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.me);
        roundedImage = new RoundImage(bm);
        imageView1.setImageDrawable(roundedImage);

    }
    public void onAboutClick(View v)
    {
        Intent intent=new Intent(this,About_me.class);
        this.startActivity(intent);
    }
    public void onSkillsClick(View v)
    {
        Intent intent=new Intent(this,Skills.class);
        this.startActivity(intent);
    }
    public void onScolarityClick(View v)
    {
        Intent intent=new Intent(this,Scolarity.class);
        this.startActivity(intent);
    }
    public void onExperienceClick(View v)
    {
        Intent intent=new Intent(this,Experiences.class);
        this.startActivity(intent);
    }
    public void onProjectClick(View v)
    {
        Intent intent=new Intent(this,Projects.class);
        this.startActivity(intent);
    }

    public void onContactClick(View v)
    {
        Intent intent=new Intent(this,Contact.class);
        this.startActivity(intent);
    }
    public void toggleMenu(View v){
        this.root.toggleMenu();
    }
}
