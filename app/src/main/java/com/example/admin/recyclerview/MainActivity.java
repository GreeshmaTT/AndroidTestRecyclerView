package com.example.admin.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recylerView;
    List<ModelClass> model =new ArrayList<>();
    RecyAdapter adapter;

//            R.drawable.food3,
//            R.drawable.food4};

//    int[] paintings = new int[]{
//            R.drawable.food1,
//            R.drawable.food2,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView=findViewById(R.id.Rview1);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recylerView.setLayoutManager(layoutManager);

//        ModelClass m1 = new ModelClass();
//        m1.setName("Hotel1");
//        m1.setFoodItem("Dosa");
//        m1.setFoodImage("https://media.istockphoto.com/photos/chef-in-hotel-or-restaurant-kitchen-cooking-only-hands-picture-id626311516");
//        model.add(m1);

        ModelClass m2 = new ModelClass();
        m2.setName("Hotel2");
        m2.setFoodItem("chicken");
        m2.setFoodImage("https://media.istockphoto.com/photos/last-straw-picture-id516329534");
        model.add(m2);

        ModelClass m3 = new ModelClass();
        m3.setName("Hotel3");
        m3.setFoodItem("Idly");
        m3.setFoodImage("https://media.istockphoto.com/photos/health-food-for-fitness-picture-id855098134");
        model.add(m3);

        ModelClass m4 = new ModelClass();
        m4.setName("Hotel1");
        m4.setFoodItem("Dosa");
        m4.setFoodImage("https://img.sndimg.com/food/image/upload/w_560,h_315,c_fill,fl_progressive,q_80/v1/img/recipes/53/74/76/83kDuWs7QsCf4oZ0rhFs_0S9A7513.jpg");
        model.add(m4);
        ModelClass m5 = new ModelClass();
        m5.setName("Hotel1");
        m5.setFoodItem("Dosa");
        m5.setFoodImage("https://media.istockphoto.com/photos/chef-in-hotel-or-restaurant-kitchen-cooking-only-hands-picture-id626311516");
        model.add(m5);

        ModelClass m6 = new ModelClass();
        m6.setName("Hotel2");
        m6.setFoodItem("chicken");
        m6.setFoodImage("https://media.istockphoto.com/photos/last-straw-picture-id516329534");
        model.add(m6);

        ModelClass m7 = new ModelClass();
        m7.setName("Hotel3");
        m7.setFoodItem("Idly");
        m7.setFoodImage("https://media.istockphoto.com/photos/health-food-for-fitness-picture-id855098134");
        model.add(m7);

        ModelClass m8 = new ModelClass();
        m8.setName("Hotel1");
        m8.setFoodItem("Dosa");
        m8.setFoodImage("https://img.sndimg.com/food/image/upload/w_560,h_315,c_fill,fl_progressive,q_80/v1/img/recipes/53/74/76/83kDuWs7QsCf4oZ0rhFs_0S9A7513.jpg");
        model.add(m8);
        adapter = new RecyAdapter(model,this);
        recylerView.setAdapter(adapter);

    }
}
