package domain.model

data class OlympicGame(val id: Long, val year: Int, val season: Season, val city: String, val country: String)