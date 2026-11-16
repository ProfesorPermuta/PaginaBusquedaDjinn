package com.permuta.djinlog.ui.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.permuta.djinlog.R
import com.permuta.djinlog.ui.component.HorizontalCard
import com.permuta.djinlog.ui.component.HorizontalCardData


@Composable
fun DJiinListPage() {

    Column(modifier = Modifier.fillMaxSize()) {

        // Barra de búsqueda de momento sin funcionalidad (se implementará en clase)
        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(stringResource(R.string.buscar_djinn)) },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp) ,
        modifier = Modifier.fillMaxSize()) {

        item {
            HorizontalCard(
                data = HorizontalCardData(
                    1,
                    "Ignis",
                    "Fire",
                    Color(0xFFE53935),
                    descripcion = "Este djinn es raro, parece un charmander",
                    imageId = R.drawable.fire,
                    iconId = R.drawable.fire_icon
                )
            )
        }
        item {
            HorizontalCard(
                data = HorizontalCardData(
                    2,
                    "Marid",
                    "Water",
                    Color(0xFF1E88E5),
                    descripcion = "Vive en los pozos y se enfada si le tiran monedas",
                    imageId = R.drawable.water,
                    iconId = R.drawable.water_icon
                )
            )
        }
        item {
            HorizontalCard(
                data = HorizontalCardData(
                    3,
                    "Golem",
                    "Earth",
                    Color(0xFF795548),
                    descripcion = "Lento y testarudo, duerme siglos enteros bajo una montaña",
                    imageId = R.drawable.earth,
                    iconId = R.drawable.earth_icon
                )
            )
        }
        item {
            HorizontalCard(
                data = HorizontalCardData(
                    4,
                    "Zephyr",
                    "Wind",
                    Color(0xFF78909C),
                    descripcion = "Nunca se queda quieto, es imposible hacerle una foto",
                    imageId = R.drawable.wind,
                    iconId = R.drawable.wind_icon
                )
            )
        }
        item {
            HorizontalCard(
                data = HorizontalCardData(
                    5,
                    "Cenicienta",
                    "Fire",
                    Color(0xFFE53935),
                    descripcion = "Siempre huele a barbacoa y tiene mucho mal genio",
                    imageId = R.drawable.fire,
                    iconId = R.drawable.fire_icon
                )
            )
        }
        item {
            HorizontalCard(
                data = HorizontalCardData(
                    6,
                    "Burbuja",
                    "Water",
                    Color(0xFF1E88E5),
                    descripcion = "Pequeño y juguetón, solo concede deseos de cumpleaños",
                    imageId = R.drawable.water,
                    iconId = R.drawable.water_icon
                )
            )
        }
    }
    }
}

@Preview(backgroundColor = 0xFFF0EAE2, showBackground = true)
@Composable
fun DJiinListPagePreview() {
    MaterialTheme() {
        DJiinListPage()
    }
}
