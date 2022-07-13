package com.example.menuexample.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuexample.data.MainPageItem
import com.example.menuexample.databinding.MainItemLayoutBinding

class MainAdapter(private val items: List<MainPageItem>) :
    RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: MainItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(items: List<MainPageItem>, position: Int) {
            binding.title.text = items[position].title
            binding.description.text = items[position].description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MainItemLayoutBinding.inflate(inflater, parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(items, position)
    }

    override fun getItemCount() = items.size
}