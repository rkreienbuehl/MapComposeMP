package ovh.plrapps.mapcompose.vector.data.extension

import android.graphics.BitmapFactory
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap

import org.jetbrains.skia.Image

actual fun Image.toComposeImageBitmap(): ImageBitmap {
    val bytes = this.encodeToData()?.bytes ?: error("Could not encode Skia image")
    val androidBitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
    return androidBitmap.asImageBitmap()
}