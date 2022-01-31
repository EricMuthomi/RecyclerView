package com.ericpalmer.myrecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ericpalmer.myrecyclerviewapp.RecyclerAdapter.AdapterClass;
import com.ericpalmer.myrecyclerviewapp.RecyclerAdapter.HelperClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        recyclerViewItems();

    }

    private void recyclerViewItems()
    {
        recyclerView.setHasFixedSize(true); //loads only the items that are visible to the user

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<HelperClass> arrayList=new ArrayList<>();
        arrayList.add(new HelperClass(R.drawable.airforceshoes,"AirForce","Quality Military Nike AirForce shoes"));
        arrayList.add(new HelperClass(R.drawable.airjordanshoes,"AirJordan","Very affordable Air Jordans"));
        arrayList.add(new HelperClass(R.drawable.bomberjacket,"Bomber Jacket","Bomber jacket for the winter!"));
        arrayList.add(new HelperClass(R.drawable.designertrousers,"Louis Vuitton Trousers","Synthetic Louis Vuitton trousers"));
        arrayList.add(new HelperClass(R.drawable.givenchypants,"Givenchy Pants","Quality Givenchy pants for you!"));
        arrayList.add(new HelperClass(R.drawable.diorshirts,"Dior Shirts","Dior T-Shirts available in all colors"));
        arrayList.add(new HelperClass(R.drawable.hat,"Gucci Marvin","Black Louis Vuitton marvin"));
        arrayList.add(new HelperClass(R.drawable.heavyjacket,"Prada Jackets","Synthetic Prada jackets for winter"));
        arrayList.add(new HelperClass(R.drawable.jacket,"Jacket","Jackets available in all colors and designs"));
        arrayList.add(new HelperClass(R.drawable.louisvuittonhat,"Louis Vuitton Marvin","Louis Vuitton marvins to kick the cold"));
        arrayList.add(new HelperClass(R.drawable.nikeairshoes,"Nike Air Force Shoes","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.pradaboots,"Prada Boots","Prada Boots to color your look!"));
        arrayList.add(new HelperClass(R.drawable.sweatpants,"Sweatpants","A whole set is available to color your look!"));
        arrayList.add(new HelperClass(R.drawable.tshirts,"T-Shirts","Louis V T-Shirts available in all colors and sizes!"));

        myAdapter=new AdapterClass(arrayList);
        recyclerView.setAdapter(myAdapter);
    }
}