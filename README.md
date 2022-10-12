# Infinity
<https://play.google.com/store/apps/details?id=pgm.poolp.infinity>

A Jetpack Compose app in which you can scroll infinite Blitz Bowl characters in a LazyColumn thanks to Paging 3 library.

Libraries and components used
--------------
* [Material Design 3][0] - Light and dark mode supported with MaterialTheme.
* Abstract factory design pattern architecture used to build items in LazyColumn.
* [Kotlin flows][1] - Handled state with a viewmodel using StateFlow.
* [Paging 3 with compose][2] - Handles LazyColumn infinite items.
* [Coil][3] - Used to load card images from network.

[0]: https://developer.android.com/jetpack/compose/themes/material3
[1]: https://developer.android.com/kotlin/flow/stateflow-and-sharedflow
[2]: https://developer.android.com/topic/libraries/architecture/paging/v3-overview
[3]: https://coil-kt.github.io/coil/compose/
