package com.bugcompany.kykyurtprojesi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bugcompany.kykyurtprojesi.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getIntent = intent.getSerializableExtra("object") as KykModel

        binding.apply {
            textViewKykName.text = getIntent.kykName
            textviewKykAdress.text = getIntent.kykAdress
            textViewKykPhone.text = getIntent.kykPhone
            imageViewKyk.setImageResource(getIntent.kykImage)

            toCall.setOnClickListener {
                val getEditTextPhone: String = textViewKykPhone.text.toString()
                val editTextUri = Uri.parse("tel:$getEditTextPhone")
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = editTextUri
                startActivity(intent)
            }



        }


    }
}