package com.hyc.api

import com.hyc.model.StotyModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * @author: 贺宇成
 * @date: 2019-10-26 10:38
 * @desc:
 */
interface Api {

  companion object{
    const val baseUrl = "http://api.zhuishushenqi.com/"
  }

  @GET("http://api.zhuishushenqi.com/ranking/54d43437d47d13ff21cad58b")
  fun fetch(): Call<StotyModel>

}