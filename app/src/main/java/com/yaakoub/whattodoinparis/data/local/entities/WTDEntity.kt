import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "what_to_do_in_paris")
data class WTDEntity(
    @PrimaryKey val nhits: Int,
    val parameters: Parameters
)