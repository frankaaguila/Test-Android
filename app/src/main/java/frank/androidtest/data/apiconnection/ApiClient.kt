package frank.androidtest.data.apiconnection

import frank.androidtest.data.Trips.TripModel
import retrofit2.Response
import retrofit2.http.GET

//Interfaz para realizar petición

interface ApiClient {
    //Método y endpoint para realizar petición
    @GET("/api/interview")
    //Adaptar la respuesta para su uso
    suspend fun getViajes(): Response<List<TripModel>>

}