package com.darkshan.mymovcat3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.darkshan.mymovcat3.R
import com.darkshan.mymovcat3.model.Movie
import kotlinx.android.synthetic.main.item_list.view.*
import java.util.zip.Inflater

class MovieAdapter internal constructor(private val context: Context?,private val listmovie: ArrayList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: Movie) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(movie.photo)
                    .placeholder(R.drawable.loading)
                    .into(imgmov_poster)
                txtmov_name.text = movie.name
                txtmov_rate.text = movie.rate
            }
        }
    }


    override fun getItemCount(): Int {
        return listmovie.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.item_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listmovie[position])
    }
}