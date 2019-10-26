package com.hyc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hyc.adapter.MyAdapter
import com.hyc.api.Api
import com.hyc.http.RetrofitClient
import com.hyc.model.StotyModel
import kotlinx.android.synthetic.main.activity_main.recyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
  private val adapter = MyAdapter()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = adapter
    val call = RetrofitClient.getInstance().getRetrofit(Api.baseUrl).create(Api::class.java).fetch()
    call.enqueue(object : Callback<StotyModel>{
      override fun onResponse(call: Call<StotyModel>, response: Response<StotyModel>) {
        val model = response.body()
        adapter.addData(model?.ranking?.books)
      }

      override fun onFailure(call: Call<StotyModel>, t: Throwable) {
      }

    })
  }
}
