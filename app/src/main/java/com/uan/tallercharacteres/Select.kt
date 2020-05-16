package com.uan.tallercharacteres

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.qualification.*
import java.util.*

class Select  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qualification)

        val qualification = QualificationCharacters(this)
        val contentId= this.intent.extras
        //________________________________________________________________________________________

        val select = contentId?.getInt("id")
        if (select!=null){
            when (select) {
                1 -> {
                    ratingBar.setRating(qualification.getRateChavo())}2-> {
                    ratingBar.setRating(qualification.getRateDonRamon())}3-> {
                    ratingBar.setRating(qualification.getRateChilindrina())}4-> {
                    ratingBar.setRating(qualification.getRateBarriga())}

            }
        }
        //__________________________________________________________________________________________

        buttonOk.setOnClickListener {

            var calificacion = ratingBar.getRating()

            if (select != null) {
                when (select) {
                    1 -> {
                        qualification.setRateChavo(calificacion)}2 -> {
                        qualification.setRateDonRamon(calificacion)}3 -> {
                        qualification.setRateChilindrina(calificacion)}4 -> {
                        qualification.setRateBarriga(calificacion)}
                }
            }
            val ratingValue = ratingBar.rating
            Toast.makeText(this, "Calification is:"+ratingValue, Toast.LENGTH_LONG).show()
            finish()
        }
        setName()
        setPhoto()
        setDescription()
    }

    fun setPhoto(){
        val contentPhoto = this.intent.extras
        if (contentPhoto != null){
            val namePhoto =contentPhoto.getString("photo")
            val idImage = resources.getIdentifier(namePhoto,"drawable", packageName)
            imageViewPhoto.setImageResource(idImage)

        }

    }

    //____________________________________________________________________________________

    fun setName(){
        val contentName = this.intent.extras
        if (contentName != null){
            val titleName= contentName.getString("name")
            textViewName.setText(titleName)
        }
    }
    //______________________________________________________________________________________

    fun setDescription(){
        val contentDescription = this.intent.extras
        var characterDescription = ""
        if (contentDescription != null){
            val nameDescription =contentDescription.getString("description")

            val idDescription = resources.getIdentifier(nameDescription,"raw", packageName)


            val scanner = Scanner(resources.openRawResource(idDescription))



            while (scanner.hasNextLine())


            {
                val lineText = scanner.nextLine()
                characterDescription += lineText
            }
            textViewDescription.setText(characterDescription)
            scanner.close()


        }

    }

}