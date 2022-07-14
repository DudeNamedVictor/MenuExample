package com.example.menuexample.ui.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuexample.data.MenuPageItem
import com.example.menuexample.databinding.MenuItemLayoutBinding


class MenuAdapter(private val items: List<MenuPageItem>) :
    RecyclerView.Adapter<MenuAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: MenuItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(items: List<MenuPageItem>, position: Int) {
            binding.title.text = items[position].title
            binding.description.text = items[position].description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MenuItemLayoutBinding.inflate(inflater, parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(items, position)
    }

    override fun getItemCount() = items.size

}