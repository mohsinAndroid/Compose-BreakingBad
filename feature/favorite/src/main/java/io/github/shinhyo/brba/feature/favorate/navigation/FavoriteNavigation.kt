/*
 * Copyright 2023 shinhyo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.shinhyo.brba.feature.favorate.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navOptions
import io.github.shinhyo.brba.feature.favorate.FavoriteRoute

const val FAVORITE_ROUTE = "favorite_route"

fun NavController.navigateFavorite() {
    navigate(
        route = FAVORITE_ROUTE,
        navOptions = navOptions {
            popUpTo(FAVORITE_ROUTE)
            launchSingleTop = true
        }
    )
}

fun NavGraphBuilder.favoriteScreen(
    navigateToDetail: (Long) -> Unit
) {
    composable(
        route = FAVORITE_ROUTE
    ) {
        FavoriteRoute(
            navigateToDetail = navigateToDetail
        )
    }
}