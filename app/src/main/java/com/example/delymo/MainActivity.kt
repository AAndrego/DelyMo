package com.example.delymo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.delymo.models.Business
import com.example.delymo.models.BusinessResponse
import com.example.delymo.services.BusinessApiInterface
import com.example.delymo.services.BusinessApiService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_business_list.layoutManager = LinearLayoutManager(this)
        rv_business_list.setHasFixedSize(true)
        getBusinessData{ business: List<Business> ->
            rv_business_list.adapter = BusinessAdapter(business)
        }
    }

    private fun getBusinessData(callback: (List<Business>) -> Unit){
        val apiService = BusinessApiService.getInstance().create(BusinessApiInterface::class.java)
        apiService.getBusinessList().enqueue(object : Callback<BusinessResponse> {
            override fun onFailure(call: Call<BusinessResponse>, t: Throwable) {

            }
            override fun onResponse(
                call: Call<BusinessResponse>,
                response: Response<BusinessResponse>
            ) {
                return callback(response.body()!!.Business)
            }



        })
    }

}