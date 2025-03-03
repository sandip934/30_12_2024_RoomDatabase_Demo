package com.example.a30_12_2024_roomdatabase_demo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val products = ArrayList<Product>()

        var productDatabase = Room.databaseBuilder(
            this,
            ProductDatabase::class.java,
            "db_products"
        )
            .allowMainThreadQueries()
            .build()
        var productDao = productDatabase.getProductDao()

//        Log.e("tag", "----------------------Insert Product----------------------")
//        productDao.insertProduct(Product(1, "Phone", 10000))
//        productDao.insertProduct(Product(2, "Mixer", 5000))
//        productDao.insertProduct(Product(3, "bottle", 1000))
//        productDao.insertProduct(Product(4, "laptop", 120000))
//        productDao.insertProduct(Product(5, "charger", 1200))

//        Log.e("tag", "---------------------Get All Products-----------------")
//        var c = productDao.getAllProducts()
//        while (c.moveToNext()) {
//            var id = c.getInt(0)
//            var title = c.getString(1)
//            var price = c.getInt(2)
//
//            products.add(Product(id, title, price))
//        }
//        for (eachProduct in products) {
//            Log.e("tag", "eachProductId: "+eachProduct.id+"eachProductTitle: "+eachProduct.title+"eachProductPrice: "+eachProduct.price)
//
//        }
//        Log.e("tag", "----------------------Delete a Product----------------------")
//        productDao.deleteProduct(Product(2, "Mixer", 5000))
//
//        Log.e("tag", "---------------------Update a Product-----------------")
//        productDao.updateProduct(Product(1, "Cooker", 1300))

        var id1 = productDao.deleteProductById(5)
        Log.e("tag","id1 :" + id1)

        Log.e("tag", "---------------------Get All Products-----------------")
        var c2 = productDao.getAllProducts()
        while (c2.moveToNext()) {
            var id = c2.getInt(0)
            var title = c2.getString(1)
            var price = c2.getInt(2)

            products.add(Product(id, title, price))
        }
        for (eachProduct in products) {
            Log.e("tag",
                "eachProductId: "
                        +eachProduct.id
                        +"eachProductTitle: "
                        +eachProduct.title
                        +"eachProductPrice: "
                        +eachProduct.price)
        }
    }
}