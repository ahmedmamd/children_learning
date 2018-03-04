package com.example.mashal.testchild;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mashal.testchild.model.modell;
import com.example.mashal.testchild.views.E_view;
import com.example.mashal.testchild.views.arbicviews;
import com.example.mashal.testchild.views.carton;
import com.example.mashal.testchild.views.dean;
import com.example.mashal.testchild.views.math;
import com.example.mashal.testchild.views.song;
import com.example.mashal.testchild.views.story;

import java.util.ArrayList;

/**
 * Created by mashal on 2017-11-29.
 */
public class adaptor extends RecyclerView.Adapter<adaptor.viewholder> {
    ArrayList<modell> data=new ArrayList();
    Context context;


    public adaptor(ArrayList<modell> data ,Context context){
        this.data=data;
        this.context=context;

    }

    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
      viewholder viewh=new viewholder(view);
        return viewh;
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position)  {
        modell v=data.get(position);
        holder.textView.setText(v.getData());
        holder.imageView.setImageResource(v.getImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public class viewholder extends  RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
         public viewholder(View itemView) {
            super(itemView);
            textView=(TextView) itemView.findViewById(R.id.text);
            imageView=(ImageView) itemView.findViewById(R.id.image);
             textView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     modell variable= data.get(getAdapterPosition());
                     Toast.makeText(context,"you clicked on "+variable.getData(), Toast.LENGTH_LONG).show();
                     if (getAdapterPosition()==0){
                         Intent intent=new Intent(context,dean.class);
                         intent.putExtra("flag",0);
                         context.startActivity(intent);
                     }else if (getAdapterPosition()==1){
                         Intent intent=new Intent(context,E_view.class);
                         intent.putExtra("flag",0);
                         context.startActivity(intent);
                     }
                    else if (getAdapterPosition()==2){
                         Intent intent=new Intent(context,arbicviews.class);
                         intent.putExtra("flag",0);
                         context.startActivity(intent);
                     } else if (getAdapterPosition()==3){
                         Intent intent=new Intent(context,math.class);
                         intent.putExtra("flag",0);
                         context.startActivity(intent);
                     } else if (getAdapterPosition()==4){
                         Intent intent=new Intent(context,carton.class);
                         intent.putExtra("flag",0);
                         context.startActivity(intent);
                     } else if (getAdapterPosition()==5){
                         Intent intent=new Intent(context,song.class);
                         intent.putExtra("flag",0);
                         context.startActivity(intent);
                     } else if (getAdapterPosition()==6){
                         Intent intent=new Intent(context,story.class);
                         intent.putExtra("flag",0);
                         context.startActivity(intent);
                     }else if (getAdapterPosition()==7){
                         // روح للرسام

                     }else
                         Toast.makeText(context,"اعد المحاولة ",Toast.LENGTH_SHORT).show();
                 }
             });
        }
}
}
