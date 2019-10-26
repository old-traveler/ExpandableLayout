package com.hyc.adapter

import android.content.Context
import android.util.SparseIntArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hyc.R
import com.hyc.adapter.MyAdapter.ViewHolder
import com.hyc.expandable.ExpandableLayout
import com.hyc.model.Book
import java.net.URLDecoder

/**
 * @author: 贺宇成
 * @date: 2019-10-26 10:14
 * @desc:
 */
class MyAdapter : RecyclerView.Adapter<ViewHolder>() {
  val dataList = mutableListOf<Book>()
  lateinit var context: Context
  val array : SparseIntArray = SparseIntArray()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    context = parent.context
    return ViewHolder(
      LayoutInflater.from(parent.context).inflate(
        R.layout.item_stoty,
        parent,
        false
      )
    )
  }

  override fun getItemCount() = dataList.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    Glide.with(context)
      .load(URLDecoder.decode(dataList[position].cover.substring(7),"UTF-8"))
      .into(holder.imageView)
    holder.textView.text = dataList[position].shortIntro.trim()
    holder.expandableLayout.updateState(array,position)
  }

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.imageView)
    val textView: TextView = itemView.findViewById(R.id.tv_content)
    val expandableLayout : ExpandableLayout = itemView.findViewById(R.id.expandedLayout)
  }

  fun addData(data: List<Book>?) {
    data?.let {
      dataList.addAll(it)
    }
    notifyDataSetChanged()
  }
}