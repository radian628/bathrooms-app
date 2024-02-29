package radian628.bathrooms

enum class BathroomGender {
    MALE, FEMALE, INCLUSIVE
}

data class Bathroom(
    val room_number: String,
    val building_id: String,
    val gender: BathroomGender,
    val wheelchair_accessible: Boolean,
    val rating: Double
)
data class Floor(
    val name: String,
    val bathrooms: List<Bathroom>
)

data class Building(
    val floors: List<Floor>,
    val lat: Double,
    val lon: Double
)
