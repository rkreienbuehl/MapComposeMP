package ovh.plrapps.mapcompose.vector.data.extension

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap as toImageBitmap
import org.jetbrains.skia.Image

actual fun Image.toComposeImageBitmap(): ImageBitmap {
    return this.toImageBitmap()
}