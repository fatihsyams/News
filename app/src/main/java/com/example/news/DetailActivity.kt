package com.example.news

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    var judul: String? = null
    var desc: String? = null
    var photo: String? = null

    companion object {
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
        const val cont_DetailNews = "cont_PhotoNews"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        judul = intent.getStringExtra(cont_TitleNews)
        desc = intent.getStringExtra(cont_DetailNews)
        photo = intent.getStringExtra(cont_PhotoNews)

        tvJudulNews.text = judul
        tvDescNews.text = desc
        Glide.with(this)
            .load(photo)
            .into(imgDetailNews)    }
}