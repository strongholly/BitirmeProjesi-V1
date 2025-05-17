package com.example.bitirmeprojesi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bitirmeprojesi.R
import com.example.bitirmeprojesi.databinding.FragmentCartDiscountBinding


class CartDiscount : Fragment() {

    private lateinit var binding : FragmentCartDiscountBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartDiscountBinding.inflate(inflater,container,false)
        return binding.root
    }


}