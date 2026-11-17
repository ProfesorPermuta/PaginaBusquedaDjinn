package com.permuta.djinlog.seeder

import androidx.compose.ui.graphics.Color
import com.permuta.djinlog.R

var listaDjinn = listOf(

    DJinnModel(
        1,
        "Ignis",
        "Este djinn es raro, parece un charmander",
        TipoDjinn.FIRE,

        ),

    DJinnModel(
        2,
        "Marid",
        "Vive en los pozos y se enfada si le tiran monedas",
        TipoDjinn.WATER
    ),

    DJinnModel(
        3,
        "Golem",
        "Lento y testarudo, duerme siglos enteros bajo una montaña",
        TipoDjinn.EARTH
    )

)

data class DJinnModel(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val tipo: TipoDjinn
)

enum class TipoDjinn {

    FIRE,
    WATER,
    AIR,
    EARTH
}
