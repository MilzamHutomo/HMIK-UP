package com.project.hmikup

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class StafListViewAdapter( private val listStaf: ArrayList< Staf > ) : RecyclerView.Adapter<StafListViewAdapter.ListViewHolder>(), View.OnClickListener {

    inner class ListViewHolder( itemView: View ) : RecyclerView.ViewHolder( itemView ) {
        var viewName: TextView = itemView.findViewById( R.id.staf_name )
        var viewPosition: TextView = itemView.findViewById( R.id.staf_position )
        var viewPhoto: ImageView = itemView.findViewById( R.id.staf_photo )
        var btnDetail: Button = itemView.findViewById( R.id.staf_detail_btn )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from( parent.context ).inflate( R.layout.item_row_staf, parent, false )
        return ListViewHolder( view )
    }

    override fun getItemCount(): Int {
        return listStaf.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val staf = listStaf[ position ]

        Glide.with( holder.itemView.context )
            .load( staf.photo )
            .into( holder.viewPhoto )

        holder.viewName.text = staf.name
        holder.viewPosition.text = staf.position

        holder.btnDetail.setOnClickListener {
            val moveToDetail = Intent( holder.itemView.context, StafDetail::class.java )
            moveToDetail.putExtra("staf_name", staf.name )
            moveToDetail.putExtra("staf_position", staf.position )
            moveToDetail.putExtra("staf_code", staf.code )
            moveToDetail.putExtra("staf_phone", staf.phone )
            moveToDetail.putExtra("staf_photo", staf.photo )
            holder.itemView.context.startActivity( moveToDetail )
        }
    }

    override fun onClick( v: View ) {

    }
}