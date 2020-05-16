package com.uan.tallercharacteres

import android.content.Context

class QualificationCharacters (context : Context){

    val ESCORE_CHAVO="escoreChavo"

    val ESCORE_RAMON="escoreRamon"

    val ESCORE_CHILINDRINA="escoreChilindrina"

    val ESCORE_BARRIGA="ecoreBarriga"

//__________________________________________________________________________________


    val ESCORECHVAVO1 ="escore"

    val ESCORERAMON2="escore"

    val ESCORECHILINDRINA3 ="escore"

    val ESCOREBARRIGA4 ="escore"

    //______________________________________________________________________________

    val chavo11 =context.getSharedPreferences(ESCORE_CHAVO, Context.MODE_PRIVATE)

    val ramon22 =context.getSharedPreferences(ESCORE_RAMON, Context.MODE_PRIVATE)

    val chilindrina33 =context.getSharedPreferences(ESCORE_CHILINDRINA, Context.MODE_PRIVATE)

    val barri44 =context.getSharedPreferences(ESCORE_BARRIGA, Context.MODE_PRIVATE)

//______________________________________________________________________________________
    fun getRateChavo(): Float {
        return  chavo11.getFloat(ESCORECHVAVO1 ,0f)
    }

    fun setRateChavo(escore:Float){
        val editor = chavo11.edit()
        editor.putFloat(ESCORECHVAVO1 ,escore)
        editor.apply()
    }

    fun getRateDonRamon(): Float {
        return  ramon22.getFloat(ESCORERAMON2,0f)
    }


    fun setRateDonRamon(escore:Float){
        val editor = ramon22.edit()
        editor.putFloat(ESCORERAMON2,escore)
        editor.apply()
    }




    fun getRateChilindrina(): Float {
        return  chilindrina33.getFloat(ESCORECHILINDRINA3,0f)
    }

    fun setRateChilindrina(escore:Float){
        val editor = chilindrina33.edit()
        editor.putFloat(ESCORECHILINDRINA3,escore)
        editor.apply()
    }
    fun getRateBarriga(): Float {
        return  barri44.getFloat(ESCOREBARRIGA4,0f)
    }

    fun setRateBarriga(escore:Float){
        val editor = barri44.edit()
        editor.putFloat(ESCOREBARRIGA4,escore)
        editor.apply()
    }




}