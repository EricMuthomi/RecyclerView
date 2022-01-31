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
        arrayList.add(new HelperClass(R.drawable.airforceshoes,"AirForce","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.airjordanshoes,"AirJordan","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.bomberjacket,"Bomber Jacket","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.designertrousers,"Louis Vuitton Trousers","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.givenchypants,"Givenchy Pants","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.diorshirts,"Dior Shirts","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.hat,"Gucci Marvin","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.heavyjacket,"Prada Jackets","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.jacket,"Jacket","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.louisvuittonhat,"Louis Vuitton Marvin","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.nikeairshoes,"Nike Air Force Shoes","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.pradaboots,"Prada Boots","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.sweatpants,"Sweatpants","This is just a dummy description"));
        arrayList.add(new HelperClass(R.drawable.tshirts,"T-Shirts","This is just a dummy description"));

        myAdapter=new AdapterClass(arrayList);
        recyclerView.setAdapter(myAdapter);
    }
}