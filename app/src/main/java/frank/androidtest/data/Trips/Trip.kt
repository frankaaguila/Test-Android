package frank.androidtest.data.Trips

import androidx.room.Entity
import androidx.room.PrimaryKey

//Clase con la que se utiliza Room
@Entity
data class Trip(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val streetName: String,
    val suburb: String,
    val visited: String,
    val latitude: String,
    val longitude: String
)
