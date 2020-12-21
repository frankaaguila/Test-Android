package frank.androidtest.data.Trips

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

//Data Access Object de Trip
@Dao
interface TripDao {
    @Query("SELECT * FROM Trip")
    suspend fun getAll(): List<Trip>

    @Query("SELECT * FROM Trip WHERE id = :id")
    suspend fun getById(id: Int): Trip

    @Update
    suspend fun update(trip: Trip)

    @Insert
    suspend fun insert(trip: List<Trip>)
}