package com.android.dailyforecasts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog

class BottomSheetActivity : AppCompatActivity() {
    lateinit var btnShowBottomSheet: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        val zwdiophoto = findViewById<ImageView>(R.id.idImageRandom)
        val zwdioname = intent.extras?.getString("zwdioSelected") ?: getString(R.string.zwdiotitle)
        val zwdioname2 = findViewById<TextView>(R.id.zwdioname)
        zwdioname2.setText(zwdioname.toString())

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        when (zwdioname) {
            getString(R.string.krios) -> {
                zwdiophoto.setImageResource(R.drawable.krios)
            }
            getString(R.string.tavros) -> {
                zwdiophoto.setImageResource(R.drawable.tavros)
            }
            getString(R.string.didymoi) -> {
                zwdiophoto.setImageResource(R.drawable.didymoi)
            }
            getString(R.string.karkinos) -> {
                zwdiophoto.setImageResource(R.drawable.karkinos)
            }
            getString(R.string.leon) -> {
                zwdiophoto.setImageResource(R.drawable.leon)
            }
            getString(R.string.parthenos) -> {
                zwdiophoto.setImageResource(R.drawable.parthenos)
            }
            getString(R.string.zygos) -> {
                zwdiophoto.setImageResource(R.drawable.zygos)
            }
            getString(R.string.skorpios) -> {
                zwdiophoto.setImageResource(R.drawable.skorpios)
            }
            getString(R.string.toxotis) -> {
                zwdiophoto.setImageResource(R.drawable.toxotis)
            }
            getString(R.string.aigokerws) -> {
                zwdiophoto.setImageResource(R.drawable.aigokerws)
            }
            getString(R.string.ydroxoos) -> {
                zwdiophoto.setImageResource(R.drawable.ydroxoos)
            }
            getString(R.string.ixthys) -> {
                zwdiophoto.setImageResource(R.drawable.ixthyes)
            }
        }


        // initializing our variable for button with its id.
        btnShowBottomSheet = findViewById(R.id.idBtnShowBottomSheet);

        // adding on click listener for our button.
        btnShowBottomSheet.setOnClickListener {

            // on below line we are creating a new bottom sheet dialog.
            val dialog = BottomSheetDialog(this)

            // on below line we are inflating a layout file which we have created.
            val view = layoutInflater.inflate(R.layout.activity_bottom_sheet, null)

            // on below line we are creating a variable for our button
            // which we are using to dismiss our dialog.
            val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

            // on below line we are adding on click listener
            // for our dismissing the dialog button.
            btnClose.setOnClickListener {
                // on below line we are calling a dismiss
                // method to close our dialog.
                dialog.dismiss()
            }
            // below line is use to set cancelable to avoid
            // closing of dialog box when clicking on the screen.
            dialog.setCancelable(false)

            // on below line we are setting
            // content view to our view.
            dialog.setContentView(view)

            // on below line we are calling
            // a show method to display a dialog.
            dialog.show()
        }

    }
}