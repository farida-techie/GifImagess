package com.malkinfo.gifimagess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.malkinfo.gifimagess.view.GifImageView
import com.malkinfo.gifimagess.view.NewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set gif  image*/
        val gifImageView = findViewById<GifImageView>(R.id.gifImageView) as GifImageView

        gifImageView.setGifImageResource(R.drawable.solution)

        /**create a splash screen*/
        try {
            Handler().postDelayed({
                val mInt = Intent(this, NewActivity::class.java)
                startActivity(mInt)
                finish()
            },7000)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
   /**ok now run it */

}