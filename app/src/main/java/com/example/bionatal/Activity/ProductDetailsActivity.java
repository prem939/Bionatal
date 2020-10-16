package com.example.bionatal.Activity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bionatal.BuildConfig;
import com.example.bionatal.Do.ProductDo;
import com.example.bionatal.R;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsActivity extends BaseActivity {
    LinearLayout llProduct;
    private ImageView imgProductImage,imgBack;
    private TextView txtTitle, txtPrice, txtDes1,txtHead1;
    private ProductDo product = new ProductDo();
    private int position = 0;
    private Button btnAddToBad;

    @Override
    public void initialize() {
        llProduct = (LinearLayout) inflater.inflate(R.layout.product_details, null);
        llBody.addView(llProduct, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        llheader.setVisibility(View.GONE);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            product = (ProductDo) bundle.getSerializable("product");
            position = (int) bundle.get("position");
        }
        imgProductImage = llProduct.findViewById(R.id.imgProductImage);
        txtTitle = llProduct.findViewById(R.id.txtTitle);
        txtPrice = llProduct.findViewById(R.id.txtPrice);
        txtHead1 = llProduct.findViewById(R.id.txtHead1);
        txtDes1 = llProduct.findViewById(R.id.txtDes1);
        btnAddToBad = llProduct.findViewById(R.id.btnAddToBad);
        imgBack = llProduct.findViewById(R.id.imgBack);

        imgProductImage.setImageResource(product.getImgProduct());
        txtTitle.setText(product.getDescription());
        txtPrice.setText("$" + product.getAmount());
        txtHead1.setText(productHeader().get(position));
        txtDes1.setText(productDec().get(position));

        btnAddToBad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProductDetailsActivity.this, "Added", Toast.LENGTH_SHORT).show();
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public List<String> productHeader(){
        List<String> productHeader = new ArrayList<>();
        productHeader.add(getResources().getString(R.string.p0head));
        productHeader.add(getResources().getString(R.string.p1head));
        productHeader.add(getResources().getString(R.string.p2head));
        productHeader.add(getResources().getString(R.string.p3head));
        productHeader.add(getResources().getString(R.string.p4head));
        productHeader.add(getResources().getString(R.string.p5head));
        productHeader.add(getResources().getString(R.string.p6head));
        productHeader.add(getResources().getString(R.string.p7head));
        productHeader.add(getResources().getString(R.string.p8head));
        productHeader.add(getResources().getString(R.string.p9head));
        productHeader.add(getResources().getString(R.string.p10head));
        return productHeader;
    }
    public List<String> productDec(){
        List<String> productDec = new ArrayList<>();
        productDec.add(getResources().getString(R.string.p0dec));
        productDec.add(getResources().getString(R.string.p1dec));
        productDec.add(getResources().getString(R.string.p2dec));
        productDec.add(getResources().getString(R.string.p3dec));
        productDec.add(getResources().getString(R.string.p4dec));
        productDec.add(getResources().getString(R.string.p5dec));
        productDec.add(getResources().getString(R.string.p6dec));
        productDec.add(getResources().getString(R.string.p7dec));
        productDec.add(getResources().getString(R.string.p8dec));
        productDec.add(getResources().getString(R.string.p9dec));
        productDec.add(getResources().getString(R.string.p10dec));
        return productDec;
    }
}
