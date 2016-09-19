package com.example.baptiste.cvbaptistedesbois;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Projects extends AppCompatActivity {
    ListView liste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        liste=(ListView)findViewById(R.id.LVProject);
        RecupValeur();
    }
    public void RecupValeur()
    {
        try
        {
            ArrayList<ObjectList> list= new ArrayList<ObjectList>();
            String[] title= this.getResources().getStringArray(R.array.TitleProject);
            String[] date= this.getResources().getStringArray(R.array.DatePro);
            String[] desc= this.getResources().getStringArray(R.array.DescProjet);
            int id1=R.drawable.cigarrete_logo;
            int id2=R.drawable.digikup_logo;
            int[] dr= {id1,id2};
            for (int i=0;i<title.length;i++)
            {
                  ObjectList obj=new ObjectList(title[i],desc[i],date[i],dr[i]);
                    list.add(obj);
            }
            if (list!=null)
            {
                AdapterProject adapter= new AdapterProject(list,this);
                liste.setAdapter(adapter);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
