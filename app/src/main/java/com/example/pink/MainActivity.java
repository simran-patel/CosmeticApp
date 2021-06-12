package com.example.pink;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.pink.adapter.ProductAdapter;
import com.example.pink.adapter.ProductCategoryAdapter;
import com.example.pink.model.ProductCategory;
import com.example.pink.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    ProductAdapter productAdapter;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Trending"));
        productCategoryList.add(new ProductCategory(2, "Most Popular"));
        productCategoryList.add(new ProductCategory(3, "All Body Products"));
        productCategoryList.add(new ProductCategory(4, "Skin Care"));
        productCategoryList.add(new ProductCategory(5, "Hair Care"));
        productCategoryList.add(new ProductCategory(6, "Make Up"));
        productCategoryList.add(new ProductCategory(7, "Fragrance"));

        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1,"UNICORN brushes","10 brushes","1200₹",R.drawable.unicornbrushes,"MAKEUP"));
        productsList.add(new Products(2,"SHEA MOISTURE gel","1","400₹",R.drawable.hairmask,"HAIR"));
        productsList.add(new Products(3,"TEATREE Mint scalp treatment ","1","1050₹",R.drawable.haireserum,"HAIR"));
        productsList.add(new Products(4,"NEUTROGENA SCRUB","1","260₹",R.drawable.neutogenascrub,"FACE"));
        productsList.add(new Products(5,"GOLDE Face Mask","1","570₹",R.drawable.facemask,"FACE"));
        productsList.add(new Products(6,"Kerastase Hairkit","2","800₹",R.drawable.kerastasehairkit,"HAIR"));
        productsList.add(new Products(7,"COVERGIRL foundation","1","200₹",R.drawable.covergirlfoundation,"MAKEUP"));
        productsList.add(new Products(8,"FENTY BEAUTY foundation","1","390₹",R.drawable.foundation,"MAKEUP"));
        productsList.add(new Products(9,"PURE BIOLOGY SHAMPOO","1","990₹",R.drawable.purebiologyshampoo,"HAIR"));
        productsList.add(new Products(10,"MO MI Serum","1","2800₹",R.drawable.momiserum,"HAIR"));
        productsList.add(new Products(11,"RANAWAT Hair Serum","1","1500₹",R.drawable.kanawatahirserum,"HAIR"));
        productsList.add(new Products(12,"GARNIER Fructis","1","200₹",R.drawable.garniershampoo,"HAIR"));
        productsList.add(new Products(13,"RICE SHAMPOO","1 ","340₹",R.drawable.shampoo,"HAIR"));
        productsList.add(new Products(14,"BROWN shades(EYESHADOw)","4","700₹",R.drawable.eyeshadow,"MAKEUP"));
        productsList.add(new Products(15,"8 shades(PINK)","1","800₹",R.drawable.eyeshadow_3,"MAKEUP"));
        productsList.add(new Products(16,"TF Golden Highlighter","1","499₹",R.drawable.hightlighter,"MAKEUP"));
        productsList.add(new Products(17,"Blush","2","750₹",R.drawable.blushcombo,"MAKEUP"));
        productsList.add(new Products(18,"ROSE-GOLDEN brushes","7 brushes","700₹",R.drawable.rosegoldbrushes,"MAKEUP"));
        productsList.add(new Products(19,"REVLON Lipstick","12","1200₹",R.drawable.lipstick,"MAKEUP"));


        setProdItemRecycler(productsList);

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList) {

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);

    }

    private void setProdItemRecycler(List<Products> productsList) {

        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);

    }

}
