package com.example.bitirmeprojesi.ui.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.bitirmeprojesi.R
import com.example.bitirmeprojesi.databinding.FragmentCartDiscountBinding
import com.example.bitirmeprojesi.databinding.FragmentMainBinding
import com.example.bitirmeprojesi.utils.gecisYap


class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater,container,false)
















        return binding.root
    }


}