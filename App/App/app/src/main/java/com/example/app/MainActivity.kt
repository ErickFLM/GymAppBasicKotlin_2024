import android.os.Bundle
import android.print.PrintAttributes.Margins
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        modifier = Modifier
            .background(Color(0xFFF5F5F5))
            .fillMaxWidth()
    ) {
        // Título centralizado
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "GymApp",

                style = TextStyle(
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = Color(0xFF0A74DA),

                )
            )
        }

        // Card 1 - Treino de Tríceps
        RoundedCard(
            modifier = Modifier.padding(10.dp),


        ) {


            Column(Modifier.padding(30.dp
            )) {
                Text(text = "Tríceps",fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(2.dp))
                Text(text = "Treine tríceps com extensões e mergulhos para desenvolver braços definidos e fortes.",fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp))

            }
        }

        // Espaçamento entre os cards
        Row(Modifier.padding(2.dp))

        // Card 2 - Notícia
        RoundedCard(
            modifier = Modifier.padding(10.dp)


        ) {
            Arrangement.Center
            Column(Modifier.padding(30.dp)) {
                Text(text = "Treino de Costas",fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp))
                Text(text = "Fortaleça as costas com remadas e puxadas para melhorar a postura e aumentar a força muscular.",fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(12.dp))

            }
        }
        // Espaçamento entre os cards
        Row(Modifier.padding(2.dp))

        RoundedCard(
            modifier = Modifier.padding(10.dp)


        ) {
            Arrangement.Center
            Column(Modifier.padding(30.dp)) {
                Text(text = "Treino de Peito",fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp))
                Text(text = "Desenvolva o peitoral com exercícios como supino e flexões, essenciais para um torso bem definido.",fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(12.dp))

            }
        }
        // Espaçamento entre os cards
        Row(Modifier.padding(2.dp))
        RoundedCard(
            modifier = Modifier.padding(10.dp)


        ) {
            Arrangement.Center
            Column(Modifier.padding(30.dp)) {
                Text(text = "Treino de Perna",fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp))
                Text(text = "Fortaleça pernas com agachamentos e leg press para equilíbrio e resistência."
                        ,fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(12.dp))

            }
        }
    }
}

fun Row(modifier: Modifier) {

}

@Composable
fun RoundedCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium, // Define o shape como médio (arredondado)
        color = Color.LightGray,
       
    ) {
        content()
    }
}

@Composable
@Preview
fun AppPreview() {
    AppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}
