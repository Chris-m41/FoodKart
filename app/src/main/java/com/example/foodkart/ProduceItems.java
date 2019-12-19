package com.example.foodkart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Iterator;

public class ProduceItems extends AppCompatActivity {
    //String login = "StartLogin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produce_items);


        ImageView img1 = (ImageView)findViewById(R.id.produce1);
        ImageView img2 = (ImageView)findViewById(R.id.produce2);
        ImageView img3 = (ImageView)findViewById(R.id.produce3);
        ImageView img4 = (ImageView)findViewById(R.id.produce4);
        ImageView img5 = (ImageView)findViewById(R.id.produce5);
        ImageView img6 = (ImageView)findViewById(R.id.produce6);
        ImageView img7 = (ImageView)findViewById(R.id.produce7);
        ImageView img8 = (ImageView)findViewById(R.id.produce8);
        ImageView img9 = (ImageView)findViewById(R.id.produce9);
        ImageView img10 =(ImageView)findViewById(R.id.produce);

       // Sets onclick for Meat Image
        img1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce1", Toast.LENGTH_LONG).show();

            }
        });

        //Sets onclick for Produce Image
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce2", Toast.LENGTH_LONG).show();

            }
        });

        //Sets onClick for Dairy Image
        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce3", Toast.LENGTH_LONG).show();


            }
        });

        img4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce4", Toast.LENGTH_LONG).show();



            }
        });

        //Sets onclick for Produce Image
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce5", Toast.LENGTH_LONG).show();

            }
        });

        //Sets onClick for Dairy Image
        img6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce6", Toast.LENGTH_LONG).show();


            }
        });

        img7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce7", Toast.LENGTH_LONG).show();



            }
        });

        //Sets onclick for Produce Image
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sPrice = 1.0;
                double s1Price = 2.0;
                double s2Price = 3.0;

                SavedList s = new SavedList();
                s.wList.add(sPrice);
                s.aList.add(s1Price);
                s.bList.add(s2Price);
                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce8", Toast.LENGTH_LONG).show();

            }
        });

        //Sets onClick for Dairy Image
        img9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double sPrice = 1.0;
                double s1Price = 2.0;
                double s2Price = 3.0;

                SavedList s = new SavedList();
                s.wList.add(sPrice);
                s.aList.add(s1Price);
                s.bList.add(s2Price);

                //s.wList.add(s.wPrice);
                // Add an Iterator to hs.
                Iterator it = s.wList.iterator();
                Iterator it2 = s.aList.iterator();
                Iterator it3 = s.bList.iterator();

                // Display element by element using Iterator
                while (it.hasNext())
                    System.out.println(it.next());
                while (it2.hasNext())
                    System.out.println(it2.next());
                while (it3.hasNext())
                    System.out.println(it3.next());

                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce9 " , Toast.LENGTH_LONG).show();

            }
        });

        //Sets onClick for Dairy Image
        img10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ProduceItems.this, "Added ____ Item to Cart produce10", Toast.LENGTH_LONG).show();


            }
        });


        //TODO: CREATE LIST SO WHEN USER CLICKS ON ICON IT WILL ADD IT TO MAIN LIST.


    }



}