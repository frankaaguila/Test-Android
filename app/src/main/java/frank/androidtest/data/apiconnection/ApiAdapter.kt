package frank.androidtest.data.apiconnection

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Objeto para invocar el constructor de Retrofit

object ApiAdapter {
    val apiClient: ApiClient = Retrofit.Builder()
        .baseUrl("https://fintecimal-test.herokuapp.com")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiClient::class.java)
}
