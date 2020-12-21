package frank.androidtest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import frank.androidtest.R
import frank.androidtest.data.Trips.TripApp
import frank.androidtest.data.apiconnection.ApiAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity(), CoroutineScope by MainScope() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestInfo()
        //Comprobar si es la primera vez que se abre la app
        /*
        val sharedPref = this.getPreferences(Context.MODE_PRIVATE)
        val hasBeenUsed = sharedPref.getBoolean(R.string.has_been_used.toString(),false)


        if(!hasBeenUsed){
            //Si la petición fue exitosa
            requestInfo()
            //if(requestInfo()){
                //Ya se ha usado la aplicación

                with (sharedPref.edit()) {
                    putBoolean(getString(R.string.has_been_used), true)
                    commit()
             //   }
            }
        }
        */
        //Cargar el Fragmento principal
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = MainFragment()
        fragmentTransaction.add(R.id.mainFragment, fragment)
        fragmentTransaction.commit()


    }

    private fun requestInfo(){

        //Corrutina para realizar petición
        launch(Dispatchers.IO) {
            // Control de excepciones
            try {
                val response = ApiAdapter.apiClient.getViajes()
                // Verificar respuesta
                if (response.isSuccessful && response.body() != null) {
                    val data = response.body()!!


                    //TODO: Almacenar con Room
                    val app = applicationContext as TripApp
                    //Corrutina para ejecutar inserciones
                }
                else {
                    // Mostrar error de petición
                    /*
                        Toast.makeText(
                        this@MainActivity,
                        "Ha ocurrido un error: ${response.message()}",
                        Toast.LENGTH_LONG).show()
                        */

                }
                } catch (e: Exception){
                    //Mostrar error de cliente
                    val error = e
                        /*
                    Toast.makeText(this@MainActivity,
                        "Ha ocurrido un error: ${e.message}",
                        Toast.LENGTH_LONG).show()
                */
                }
        }

    }
}