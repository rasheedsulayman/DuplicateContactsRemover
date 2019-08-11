package com.r4sh33d.duplicatecontactsremover.util

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

inline fun ViewGroup.forEach(action: (View) -> Unit) {
    for (index in 0 until childCount) {
        action(getChildAt(index))
    }
}

fun RecyclerView.onScrollChanged(scrollListener: (Int) -> Unit) {
    addOnScrollListener(object : RecyclerView.OnScrollListener() {
        override fun onScrolled(
            recyclerView: RecyclerView,
            dx: Int,
            dy: Int
        ) {
            super.onScrolled(recyclerView, dx, dy)
            scrollListener(computeVerticalScrollOffset())
        }
    })
}
