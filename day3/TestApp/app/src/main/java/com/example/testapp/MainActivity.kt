package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.models.Article
import com.example.testapp.models.Author
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var author: Author = Author("Aibek","Kuralbaev", 3.6f)

        var article: Article = Article("This is title",
            "body body body body body body", "2019", author)
        setArticleUi(article)
    }

    fun setArticleUi(a: Article){
        articleTitle.text = a.title
        articleBody.text = a.body
        articleYear.text = a.year
        setAuthorUi(a.author)
    }

    fun setAuthorUi(author: Author){
        authorName.text = author.name
        authorSurname.text = author.surname
        authorRating.text = author.rating.toString()
    }
}
