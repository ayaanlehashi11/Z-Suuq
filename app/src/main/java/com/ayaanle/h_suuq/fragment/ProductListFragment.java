package com.ayaanle.h_suuq.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ayaanle.h_suuq.R;

public class ProductListFragment extends Fragment {
    private String subCategoryKey;
    private final boolean isShoppingList;
    public ProductListFragment()
    {
        isShoppingList = true;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product_list , container , false);
        if(isShoppingList)
        {

        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public ProductListFragment(String subCategoryKey)
    {
        isShoppingList = false;
        this.subCategoryKey = subCategoryKey;
    }

}
