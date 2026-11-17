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
import com.permuta.djinlog.seeder.TipoDjinn
import com.permuta.djinlog.seeder.listaDjinn
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
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(listaDjinn.size) { index ->
                Text(text = stringResource(R.string.hola_soy_un_texto))
                var curr = listaDjinn[index]
                HorizontalCard(
                    data = HorizontalCardData(
                        id = curr.id,
                        title = curr.nombre,
                        subTitle = "",
                        color = when (curr.tipo) {
                            TipoDjinn.FIRE -> Color.Red
                            TipoDjinn.WATER -> Color.Blue
                            TipoDjinn.AIR -> Color.Cyan
                            TipoDjinn.EARTH -> Color.Green
                        },
                        descripcion = curr.descripcion,
                        imageId = when (curr.tipo) {
                            TipoDjinn.FIRE -> R.drawable.fire
                            TipoDjinn.WATER -> R.drawable.water
                            TipoDjinn.AIR -> R.drawable.wind
                            TipoDjinn.EARTH -> R.drawable.earth
                        },
                        iconId = when (curr.tipo) {
                            TipoDjinn.FIRE -> R.drawable.fire_icon
                            TipoDjinn.WATER -> R.drawable.water_icon
                            TipoDjinn.AIR -> R.drawable.wind_icon
                            TipoDjinn.EARTH -> R.drawable.earth_icon
                        }
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
