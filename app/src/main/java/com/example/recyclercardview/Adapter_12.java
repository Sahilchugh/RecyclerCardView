package com.example.recyclercardview;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class Adapter_12 extends RecyclerView.Adapter<ViewHolder>{
    ImageView Image1;
    TextView title;
    Context context;

    LinearLayout Layout;


    ArrayList<Tests> Tests;


    public Adapter_12(Context context, ArrayList<com.example.recyclercardview.Tests> Tests){
        this.context = context;

        this.Tests = Tests;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.every_rowset, parent, false);
        return new Adapter_12.Viewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
    //   title.setText(answers.get(position));
       title.setText(Tests.get(position).getText());

       Image1.setImageDrawable(context.getResources().getDrawable(Tests.get(position).getImg()));
       Layout.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(context, "This Is a "+Tests.get(position).getText()+ " Programming Language", Toast.LENGTH_SHORT).show();
           }
       });

    }
    @Override
    public int getItemCount() {
        return Tests.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder{
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            Image1 = itemView.findViewById(R.id.Icon_Text);
            title = itemView.findViewById(R.id.Text_demo);
            Layout = itemView.findViewById(R.id.reccy);
        }
    }
}