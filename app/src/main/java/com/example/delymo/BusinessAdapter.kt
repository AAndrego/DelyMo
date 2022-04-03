package com.example.delymo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.delymo.models.Business
import kotlinx.android.synthetic.main.business_item.view.*

class BusinessAdapter(
    private val business : List<Business>

) : RecyclerView.Adapter<BusinessAdapter.BusinessViewHolder>(){
    class BusinessViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bindBusiness(business: Business){
            itemView.business_name.text = business.name
            Glide.with(itemView).load("https:"+business.image).into(itemView.business_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusinessViewHolder {
        return BusinessViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.business_item, parent, false)
        )
    }

    override fun getItemCount(): Int = business.size

    override fun onBindViewHolder(holder: BusinessViewHolder, position: Int) {
        holder.bindBusiness(business.get(position))
    }
}