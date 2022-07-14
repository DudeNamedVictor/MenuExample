package com.example.menuexample.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuexample.data.MainPageItem
import com.example.menuexample.databinding.MainItemLayoutBinding


class MainAdapter(private val items: List<MainPageItem>, private val listener: OnMainItemClick) :
    RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: MainItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(listener: OnMainItemClick,items: List<MainPageItem>, position: Int) {
            binding.title.text = items[position].title
            binding.description.text = items[position].description
            binding.root.setOnClickListener {
                listener.onMainItemClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MainItemLayoutBinding.inflate(inflater, parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(listener, items, position)
    }

    override fun getItemCount() = items.size

    interface OnMainItemClick {
        fun onMainItemClick(position: Int)
    }

}