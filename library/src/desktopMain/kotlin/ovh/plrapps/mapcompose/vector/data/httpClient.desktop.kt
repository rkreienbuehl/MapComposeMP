package ovh.plrapps.mapcompose.vector.data

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation

internal actual val httpClient = HttpClient(CIO) {
    install(ContentNegotiation) {
    }
}