package Controller

import Utilities.EXTRA_CATEGORY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.techswag.R

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

       val categoryType= intent.getStringExtra(EXTRA_CATEGORY)
    }
}