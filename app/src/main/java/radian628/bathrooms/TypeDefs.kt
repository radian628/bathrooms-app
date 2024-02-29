package radian628.bathrooms

import java.util.Date

public enum class BathroomGender {
    MALE, FEMALE, INCLUSIVE
}

public class Review(
    // ranges from 1 to 5
    val rating: Double,

    val description: String,

    // when the review was posted
    // (Date might be deprecated so I may change this)
    val posted_at: Date
)

public data class Bathroom(
    // should be same as it appears IRL
    val room_number: String,

    // not sure whether to use building name or an ID linked to it
    // especially since the Locations API doesn't use name
    val building_id: String,

    val gender: BathroomGender,
    val wheelchair_accessible: Boolean,

    // ranges from 1 to 5
    val rating: Double
)

public data class Floor(
    val name: String,
    val bathrooms: List<Bathroom>
)

public data class Building(
    val floors: List<Floor>,

    // coordinates
    val lat: Double,
    val lon: Double
)
