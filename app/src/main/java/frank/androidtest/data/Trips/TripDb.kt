package frank.androidtest.data.Trips

import androidx.room.Database
import androidx.room.RoomDatabase

//Clase para el manejo de la base de datos con Room

@Database(
    entities = [Trip::class],
    version = 1

)
abstract class TripDb : RoomDatabase() {

    abstract fun  tripDao(): TripDao

}