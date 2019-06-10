package com.example.testapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.models.Article
import kotlinx.android.synthetic.main.item_article.view.*

class ArticleAdapter(var dataset: ArrayList<Article>): RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_article,parent,false))
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(dataset[position])
    }


    inner class ArticleViewHolder(v: View): RecyclerView.ViewHolder(v){
        fun bind(article: Article){
            itemView.articleTitleTextView.text = article.title
            itemView.articleYearTextView.text = article.year
            itemView.bodyTextView.text = article.body
        }
    }
}