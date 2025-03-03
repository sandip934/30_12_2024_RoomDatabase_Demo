package com.example.a30_12_2024_roomdatabase_demo

import android.database.Cursor
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {
    @Insert
    fun insertProduct(product: Product)

    @Delete
    fun deleteProduct(product: Product)

    @Update
    fun updateProduct(product: Product)

    @Query("SELECT * FROM Products")
    fun getAllProducts(): Cursor

    @Query("delete from Products where id = :id")
    fun deleteProductById(id: Int) : Int


}