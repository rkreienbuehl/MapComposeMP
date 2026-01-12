package ovh.plrapps.mapcompose.vector.data.extension

import androidx.compose.ui.graphics.ImageBitmap
import org.jetbrains.skia.Image

expect fun Image.toComposeImageBitmap(): ImageBitmap