package com.project.hmikup

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class StafDetail : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staf_detail)

        val btnWhatsapp: Button = findViewById( R.id.btn_whatsapp )
        btnWhatsapp.setOnClickListener( this )

        val btnDial: Button = findViewById( R.id.btn_dialer )
        btnDial.setOnClickListener( this )

        val name: String = intent.getStringExtra("staf_name")
        val position: String = intent.getStringExtra("staf_position")
        val code: String = intent.getStringExtra("staf_code")
        val phone: String = intent.getStringExtra("staf_phone")
        val photo: Int = intent.getIntExtra( "staf_photo", 0 )
        val nameContainer: TextView = findViewById( R.id.staf_name_container )
        val positionContainer: TextView = findViewById( R.id.staf_position_container )
        val codeContainer: TextView = findViewById( R.id.staf_code_container )
        val phoneContainer: TextView = findViewById( R.id.staf_phone_container )
        val photoContainer: ImageView = findViewById( R.id.staf_photo )
        nameContainer.text = name
        positionContainer.text = position
        codeContainer.text = code
        phoneContainer.text = phone

        Glide.with( this )
            .load( photo )
            .into( photoContainer )
    }

    override fun onClick( v: View ) {
        when ( v.id ){
            R.id.btn_whatsapp -> {
                val name: String = intent.getStringExtra("staf_name")
                val phone: String = intent.getStringExtra("staf_phone")
                val sendWhatsapp = Intent ( Intent.ACTION_VIEW, Uri.parse( "https://api.whatsapp.com/send?phone=$phone&text=Saya $name%0AAda yang ingin dibicarakan" ) )
                startActivity( sendWhatsapp )
            }

            R.id.btn_dialer -> {
                val phone: String = intent.getStringExtra("staf_phone")
                val dialStaf = Intent ( Intent.ACTION_DIAL, Uri.parse( "tel:$phone" ) )
                startActivity( dialStaf )
            }
        }
    }
}
