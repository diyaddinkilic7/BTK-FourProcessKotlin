package com.diyaddinkilic.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.diyaddinkilic.dortislemkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var sayi1: Int? = null
    var sayi2: Int? = null
    var sonuc: Int? = null
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //  setContentView(R.layout.activity_main)

    }

    fun topla(view: View) {
         sayi1 = binding.editText.text.toString().toIntOrNull()
         sayi2 = binding.editText2.text.toString().toIntOrNull()

        if (sayi1 == null || sayi2 == null) {
            binding.textView.text = "Sayı girmeyii unutmayınız"
        } else {
            var sonuc = sayi1!! + sayi2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun cikar(view: View) {
        sayi1 = binding.editText.text.toString().toIntOrNull()
        sayi2 = binding.editText2.text.toString().toIntOrNull()

        if (sayi1 == null || sayi2 == null) {
            binding.textView.text = "Sayı girmeyii unutmayınız"
        } else {
            var sonuc = sayi1!! - sayi2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        }
    }

    fun bol(view: View) {
        sayi1 = binding.editText.text.toString().toIntOrNull()
        sayi2 = binding.editText2.text.toString().toIntOrNull()

        if (sayi1 == null || sayi2 == null) {
            binding.textView.text = "Sayı girmeyii unutmayınız"
        } else {
            var sonuc = sayi1!! / sayi2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        }
    }

    fun carp(view: View) {
        sayi1 = binding.editText.text.toString().toIntOrNull()
        sayi2 = binding.editText2.text.toString().toIntOrNull()

        if (sayi1 == null || sayi2 == null) {
            binding.textView.text = "Sayı girmeyii unutmayınız"
        } else {
            var sonuc = sayi1!! * sayi2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        }
    }

}