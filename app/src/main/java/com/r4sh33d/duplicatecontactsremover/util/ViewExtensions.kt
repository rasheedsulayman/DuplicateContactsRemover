
package com.r4sh33d.duplicatecontactsremover.util

import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.onScrollChanged(scroll: (Int) -> Unit) {
  addOnScrollListener(object : RecyclerView.OnScrollListener() {
    override fun onScrolled(
      recyclerView: RecyclerView,
      dx: Int,
      dy: Int
    ) {
      super.onScrolled(recyclerView, dx, dy)
      scroll(computeVerticalScrollOffset())
    }
  })
}
