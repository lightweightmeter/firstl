package com.example.first

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class countryadapter(private val countrylist :ArrayList<CoountryModel>): RecyclerView.Adapter<countryadapter.ViewHolder>() {
    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){

        val countryName = itemView.findViewById<TextView>(R.id.country_name_tv)
        val countryImage = itemView.findViewById<CircleImageView>(R.id.country_flag_iv)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryadapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false))
    }

    override fun onBindViewHolder(holder: countryadapter.ViewHolder, position: Int) {
        val country=countrylist[position]
        holder.countryName.text=country.countryname
        holder.countryImage.setImageResource(country.countryimage)
    }

    override fun getItemCount(): Int {
        return countrylist.size
    }
}