package com.example.picdog.db
import androidx.room.*
import com.example.picdog.model.UserEntity


@Dao
interface UserDao {

  @Query("SELECT * FROM UserEntity")
  fun selectAll(): List<UserEntity>

  @Delete
  fun delete(pokemon: UserEntity)

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  fun insert(entity: UserEntity): Long

  @Update(onConflict = OnConflictStrategy.REPLACE)
  fun update(entity: UserEntity)

  @Transaction
  fun upsert(entity: UserEntity) {
    val id = insert(entity)
    if (id == -1L) {
      update(entity)
    }
  }
}