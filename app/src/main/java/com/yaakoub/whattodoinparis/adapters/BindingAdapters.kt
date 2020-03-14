package com.yaakoub.whattodoinparis.adapters

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.yaakoub.whattodoinparis.R

@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}

@BindingAdapter("load_avatar")
fun loadImage(view: ImageView, imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty()) {
        Glide.with(view.getContext())
            .load(imageUrl)
            .apply(RequestOptions().circleCrop())
            .into(view)
    } else {
        view.setImageResource(R.drawable.ic_avatar)
    }
}