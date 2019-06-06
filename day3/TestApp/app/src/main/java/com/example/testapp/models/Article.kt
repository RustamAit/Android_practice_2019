package com.example.testapp.models

class Article(
    var title: String,
    var body: String,
    var year: String,
    var author: Author
)

class Author(
    var name: String,
    var surname: String,
    var rating: Float
)