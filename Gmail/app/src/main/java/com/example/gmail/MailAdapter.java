package com.example.gmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MailAdapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<Mail> maillist;

    public MailAdapter(Context context, int layout, List<Mail> maillist) {
        this.context = context;
        this.layout = layout;
        this.maillist = maillist;
    }

    @Override
    public int getCount() {
        return maillist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        TextView name = (TextView) convertView.findViewById(R.id.textView);
        TextView title = (TextView) convertView.findViewById(R.id.textView2);
        TextView content = (TextView) convertView.findViewById(R.id.textView3);
        TextView time = (TextView) convertView.findViewById(R.id.textView4);
        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);
        Mail mail = maillist.get(position);
        name.setText(mail.getName());
        title.setText(mail.getTitle());
        content.setText(mail.getContent());
        time.setText(mail.getTime());
        image.setImageResource(mail.getImage());



        return convertView;
    }
}
