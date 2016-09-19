package com.example.baptiste.cvbaptistedesbois;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Baptiste on 29/06/2016.
 */
public class CustomListView extends BaseAdapter {
    private List<ObjectList> mListObj;
    private Context ctx;
    private LayoutInflater mInflater;

    public CustomListView(List<ObjectList> mListObj, Context ctx) {
        this.mListObj = mListObj;
        this.ctx = ctx;
        this.mInflater=LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return mListObj.size();
    }

    @Override
    public Object getItem(int position) {
        return mListObj.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout layoutItem;
        if (convertView==null)
            layoutItem=(LinearLayout)mInflater.inflate(R.layout.custom_linear,parent,false);
        else
            layoutItem=(LinearLayout) convertView;
        TextView title=(TextView)layoutItem.findViewById(R.id.txtTitle);
        TextView date= (TextView)layoutItem.findViewById(R.id.txtDate);
        TextView desc=(TextView)layoutItem.findViewById(R.id.TxtDesc);
        title.setText(mListObj.get(position).getTitle());
        if (mListObj.get(position).getCity()!=null)
        {
            String str=title.getText().toString();
            str+=", "+ mListObj.get(position).getCity();
            title.setText(str);
        }


        if(mListObj.get(position).getDate().toString() != null)
            date.setText(mListObj.get(position).getDate().toString());
        desc.setText(mListObj.get(position).getDescrib());

        return layoutItem;
    }
}
