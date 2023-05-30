package com.cermat.resepku

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class ListResepAdapter (val listResep: ArrayList<Resep>) :
    RecyclerView.Adapter<ListResepAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).
        inflate(R.layout.item_cardview_resep, parent, false)
        return ListViewHolder(view)
    }
    override fun getItemCount(): Int {
        return listResep.size
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val resep = listResep[position]

        Glide.with(holder.itemView.context)
            .load(resep.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = resep.name
        holder.tvBahan.text = resep.bahan

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailResep::class.java)
            moveDetail.putExtra(DetailResep.EXTRA_NAME, resep.name)
            moveDetail.putExtra(DetailResep.EXTRA_PHOTO, resep.photo)
            moveDetail.putExtra(DetailResep.EXTRA_BAHAN, resep.bahan)
            moveDetail.putExtra(DetailResep.EXTRA_CARA, resep.cara)
            mContext.startActivity(moveDetail)
        }
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvBahan: TextView = itemView.findViewById(R.id.tv_bahan)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}