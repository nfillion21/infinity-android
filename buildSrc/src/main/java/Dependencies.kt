/**
 * To define dependencies
 */
object Dependencies {
    val coreAndroidX by lazy {"androidx.core:core-ktx:${Versions.coreAndroidX}"}
    val lifecycleRuntime by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleAndroidX}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val composeUi by lazy {"androidx.compose.ui:ui:${Versions.compose}"}
    val composeUiToolingPreview by lazy {"androidx.compose.ui:ui-tooling-preview:${Versions.compose}"}
    val composeMaterial3 by lazy {"androidx.compose.material3:material3:${Versions.composeMaterial3}"}

    val junit by lazy {"junit:junit:${Versions.junit}"}
    val composeUiTestJUnit4 by lazy {"androidx.compose.ui:ui-test-junit4:${Versions.compose}"}
    val composeUiTestTooling by lazy {"androidx.compose.ui:ui-tooling:${Versions.compose}"}
    val composeUiTestManifest by lazy {"androidx.compose.ui:ui-test-manifest:${Versions.compose}"}

    val androidTestJunit by lazy {"androidx.test.ext:junit:${Versions.androidTestJUnit}"}
    val androidTestEspresso by lazy {"androidx.test.espresso:espresso-core:${Versions.androidTestEspresso}"}
}
