package com.example.picdog.ui.main

/**
 * Class with possible interactions/events made by the user on MainActivity.
 */

sealed class MainStateEvent {

    class GetFeedEvent(
        val section: Int
    ): MainStateEvent()

    object TappedSignOut : MainStateEvent()

    class TappedImage(
        val picture: String?
    ): MainStateEvent()

    object None : MainStateEvent()

    // Add expandImage

}
