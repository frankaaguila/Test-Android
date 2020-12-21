package frank.androidtest.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import frank.androidtest.data.Trips.TripModel

class MainViewModel : ViewModel() {

    private val viajes: MutableLiveData<List<TripModel>> by lazy {
        MutableLiveData<List<TripModel>>().also {
            cargarViajes()
        }
    }

    fun getViajes(): LiveData<List<TripModel>> {
        return viajes
    }

    fun onButtonClicked(){

    }

    private fun cargarViajes() {
        // Do an asynchronous operation to fetch users.

    }
}


