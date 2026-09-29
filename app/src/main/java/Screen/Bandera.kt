package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension


@Composable
fun BanderaJaponC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (blanco) = createRefs()

        Box(modifier = Modifier
            .background(Color.White)
            .constrainAs(blanco)
            {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            }, contentAlignment = Alignment.Center
        ) {
            Box(modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .background(Color.Red))
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaJaponC(modifier = Modifier.fillMaxSize())
    }
}