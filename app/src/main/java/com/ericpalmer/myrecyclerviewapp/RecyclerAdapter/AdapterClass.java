package com.ericpalmer.myrecyclerviewapp.RecyclerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ericpalmer.myrecyclerviewapp.R;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter <AdapterClass.AdapterViewHolder>{

    ArrayList<HelperClass> helperClassArrayList;
        //this adapter class holds the data
    public AdapterClass(ArrayList<HelperClass> helperClassArrayList) {
        this.helperClassArrayList = helperClassArrayList;

    }

    @NonNull
    @Override
    //in this method,we get the values of the views from the cardview design/inflate
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_card_design,
                parent,false);
        //create an instance of the viewholder class and pass the view in it

        AdapterViewHolder viewHolder=new AdapterViewHolder(view);

        return viewHolder;
    }

    //In this method we bind the data from helperclass to the design
    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        HelperClass helperClass=helperClassArrayList.get(position);
        holder.image.setImageResource(helperClass.getImage());
        holder.title.setText(helperClass.getTitle());
        holder.description.setText(helperClass.getDescription());


    }

    @Override
    public int getItemCount() {
        return helperClassArrayList.size();
    }


    //this class holds the view/design of the recyclerview

    public static class AdapterViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title,description;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.recyclerImg);
            title=itemView.findViewById(R.id.recyclerTitle);
            description=itemView.findViewById(R.id.recyclerDesc);
        }
    }
}
