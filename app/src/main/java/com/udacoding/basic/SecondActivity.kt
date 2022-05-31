package com.udacoding.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.udacoding.basic.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button12.setOnClickListener {

            if (binding.editTextNumber.text.isEmpty()){

                binding.editTextNumber.error = "tidak ada boleh ada yang kosong"
            }
            else if(binding.editTextNumber2.text.isEmpty()){

                binding.editTextNumber2.error = "tidak boleh ada yang kosong"
            }
            else{

                val numb1 = binding.editTextNumber.text.toString().toDouble()
                val numb2 = binding.editTextNumber2.text.toString().toDouble()
                val result = numb1.times(numb2)

                showAlert("${result}")







            }

        }


    }


    fun showAlert(result : String){
       val alert =  AlertDialog.Builder(this)
        alert.setTitle("Informasi")
        alert.setMessage(result)
        alert.show()
    }
}