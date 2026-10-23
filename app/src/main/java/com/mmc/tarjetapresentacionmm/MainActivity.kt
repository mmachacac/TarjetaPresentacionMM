package com.mmc.tarjetapresentacionmm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mmc.tarjetapresentacionmm.ui.theme.TarjetaPresentacionMMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPresentacionMMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TarjetaPresentacion()
                }
            }
        }
    }
}


@Composable
fun TarjetaPresentacion() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E5D2))
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Sección superior: logotipo, nombre y profesión
        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center
        ) {
            DatosPersonales()
        }

        // Sección inferior: información de contacto
        DatosContacto()
    }
}

@Composable
fun DatosPersonales() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Logotipo de Android",
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xFF073042))
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Jennifer Doe",
            fontSize = 40.sp,
            fontWeight = FontWeight.Light,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006D3B)
        )
    }
}

@Composable
fun DatosContacto() {
    Column(
        modifier = Modifier.padding(bottom = 48.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "Teléfono",
                tint = Color(0xFF006D3B)
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text("+11 (123) 444 555 666")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Redes sociales",
                tint = Color(0xFF006D3B)
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text("@AndroidDev")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Correo electrónico",
                tint = Color(0xFF006D3B)
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text("jen.doe@android.com")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionMMTheme {
        TarjetaPresentacion()
    }
}