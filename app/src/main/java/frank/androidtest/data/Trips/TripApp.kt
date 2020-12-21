package frank.androidtest.data.Trips

import android.app.Application
import androidx.room.Room

class TripApp : Application() {
    //Construir Base de datos
    val room = Room.databaseBuilder(this,TripDb::class.java,"Trip").build()
}