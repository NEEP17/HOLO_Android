package com.example.holo_android.UI.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.holo_android.Data.MenuData
import com.example.holo_android.R

class MenuItemRecyclerViewAdapter(val ctx: Context, var dataList: ArrayList<MenuData>?): RecyclerView.Adapter<MenuItemRecyclerViewAdapter.Holder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx)
            .inflate(R.layout.rv_menu, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList!!.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList!![position].img_url)
            .into(holder.img_thumbnail)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img_thumbnail = itemView.findViewById(R.id.img_rv_list_menu) as ImageView
    }
}