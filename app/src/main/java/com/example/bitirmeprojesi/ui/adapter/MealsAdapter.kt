package com.example.bitirmeprojesi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bitirmeprojesi.data.entity.Yemekler
import com.example.bitirmeprojesi.databinding.HolderAdapterBinding

class MealsAdapter(
    private val mContext: Context,
    private val yemekler: List<Yemekler>
) : RecyclerView.Adapter<MealsAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(val binding: HolderAdapterBinding) :
        RecyclerView.ViewHolder(binding.root)

    private fun resimGoster(context: Context, imageView: ImageView, resimAdi: String) {
        val url = "http://kasimadalan.pe.hu/yemekler/resimler/$resimAdi"
        Glide.with(context)
            .load(url)
            .override(300, 300)
            .into(imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = HolderAdapterBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val yemek = yemekler[position]
        val t = holder.binding

        t.textFiyat.text = "${yemek.yemek_fiyat} ₺"
        t.textUrunAdi.text = yemek.yemek_adi

        resimGoster(mContext, t.imageView, yemek.yemek_resim_adi)

        t.fab.setOnClickListener {
            // Sepete ekleme işlemi ya da navigation
        }

        t.buttonHeart.setOnClickListener {
            // Favorilere ekleme vs.
        }
    }

    override fun getItemCount(): Int {
        return yemekler.size
    }
}
