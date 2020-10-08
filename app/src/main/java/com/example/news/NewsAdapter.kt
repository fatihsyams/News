package com.example.news

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class NewsAdapter(val listnews: List<news>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: NewsAdapter.MyViewHolder, position: Int) {
        holder.bindItem(listnews[position])
    }




    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(item: news) {
            itemView.apply {
                imgNews.setImageResource(item.photo)
                tvTitleNews.text = item.title
            }
            itemView.setOnClickListener {
                val moveData = Intent(itemView.context,DetailActivity::class.java)
                moveData.putExtra(DetailActivity.cont_TitleNews, item.title)
                moveData.putExtra(DetailActivity.cont_DetailNews, item.desc)
                moveData.putExtra(DetailActivity.cont_PhotoNews, item.photo)
                itemView.context.startActivity(moveData)
            }
        }
    }


}
