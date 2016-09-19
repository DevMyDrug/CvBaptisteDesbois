package com.example.baptiste.cvbaptistedesbois;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Experiences extends AppCompatActivity {
    ListView liste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiences);
        liste=(ListView)findViewById(R.id.LVExperiences);
        RecupValeur();
    }

    public void RecupValeur()
    {
        try
        {
            ArrayList<ObjectList> list= new ArrayList<>();
            String[] title= this.getResources().getStringArray(R.array.TitleExp);
            String[] date= this.getResources().getStringArray(R.array.DateExp);
            String[] desc= this.getResources().getStringArray(R.array.DescExp);
            String[] city= this.getResources().getStringArray(R.array.CityExp);
            for (int i=0;i<title.length;i++)
            {
                if(city[i]!=null)
                {
                    ObjectList obj= new ObjectList(title[i],desc[i],date[i],city[i]);
                    list.add(obj);
                }
                else
                {
                    ObjectList obj=new ObjectList(title[i],desc[i],date[i]);
                    list.add(obj);
                }
            }
            if (list!=null)
            {
                CustomListView adapter= new CustomListView(list,this);
                liste.setAdapter(adapter);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
