package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapp.models.Article
import com.example.testapp.models.Author
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var articles: ArrayList<Article> = ArrayList()
        var author: Author = Author("Aibek","Kuralbaev", 3.6f)

        var articleFirst: Article = Article("This is title",
            "body body body body body body", "2019")
        var articleSecond: Article = Article("This is title",
            "body body body body body body", "2019")
        var articleThird: Article = Article("This is title",
            "body body body body body body", "2019")
        var articleFourth: Article = Article("This is title",
            "body body body body body body", "2019")
        articles.add(articleFirst)
        articles.add(articleSecond)

        articles.add(articleThird)

        articles.add(articleFourth)
        recList.layoutManager = LinearLayoutManager(this)
        recList.adapter = ArticleAdapter(articles)

    }


}
