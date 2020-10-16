package com.example.bionatal.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bionatal.Adaptor.ShopAdaptor;
import com.example.bionatal.Do.ProductDo;
import com.example.bionatal.R;

import java.util.ArrayList;
import java.util.List;

public class ShopFragment extends Fragment {
    private RecyclerView yvProducts;
    Context mcontext;
    private ShopAdaptor adaptor;
    public ShopFragment(Context mcontext) {
        this.mcontext = mcontext;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shop_fragment, container, false);
        yvProducts = view.findViewById(R.id.yvProducts);
        adaptor = new ShopAdaptor(getDummyData(),mcontext);
        yvProducts.setLayoutManager(new LinearLayoutManager(mcontext));
        yvProducts.setAdapter(adaptor);
        return view;
    }

        private List<ProductDo> getDummyData() {
        List<ProductDo> ProductList = new ArrayList<>();
        int rating = 2;
        ProductDo product1 = new ProductDo(R.drawable.black_seed_oil_glass, "Black Seed Oil 16oz", "Ethiopian Black Seed Oil 16oz (Glass)", "89", (float) 3.9);
        ProductDo product2 = new ProductDo(R.drawable.black_seed_oil_16oz_pet, "Black Seed Oil 16oz", "Ethiopian Black Seed Oil 16oz (PET)", "79", (float) 4.2);
        ProductDo product3 = new ProductDo(R.drawable.black_seed_oil_4oz_glass, "Black Seed Oil 4oz", "Ethiopian Black Seed Oil 4oz (GLASS)", "37", (float) 4.2);
        ProductDo product4 = new ProductDo(R.drawable.arugula_seed_oil_160z_glass, "Arugula Seed oil 16oz", "Egyptian desert Wide Leaf Arugula Seed Oil 16oz (GLASS)", "89", (float) 4.3);
        ProductDo product5 = new ProductDo(R.drawable.jojoba_seed_oil_4oz, "Jojoba Seed oil 4oz", "Egyptian desert Jojoba Seed Oil 4oz (GLASS)", "42", (float) 4.3);
        ProductDo product6 = new ProductDo(R.drawable.black_seed_lotion_with_citrus_8oz, "Lotion with citurs 8oz", "Black Seed Lotion with Citrus 8oz (Ethiopian Seeds)", "39", (float) 4.5);
        ProductDo product7 = new ProductDo(R.drawable.two_black_seed_soaps, "2 Black seed soaps", "2 Black Seed Soaps (Ethiopian Seeds)", "24", (float) 4.3);
        ProductDo product8 = new ProductDo(R.drawable.black_seed_mask_40z, "Black Seed Mask 3oz", "Black Seed Mask 4oz (Ethiopian Seeds)", "25", (float) 4.9);
        ProductDo product9 = new ProductDo(R.drawable.ethiopoan_black_seeds_2oz, "Black seed 2oz", "Ethiopian Black Seeds 2oz", "15", (float) 4);
        ProductDo product10 = new ProductDo(R.drawable.ehiopian_black_seed_powder_2oz, "Black seed powder 2oz", "Ethiopian Black Seeds powder 2oz", "15", (float) 4);

        ProductList.add(product1);
        ProductList.add(product2);
        ProductList.add(product3);
        ProductList.add(product4);
        ProductList.add(product5);
        ProductList.add(product6);
        ProductList.add(product7);
        ProductList.add(product8);
        ProductList.add(product9);
        ProductList.add(product10);
        return ProductList;
    }
}
