package com.chase.kudzie.chasemusic.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val typography = Typography(
    h1 = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = 1.15.sp,
    ),
    h2 = TextStyle(
        fontSize = 15.sp,
        letterSpacing = 1.15.sp,
        fontWeight = FontWeight.Normal
        // Add CAPS
    ),
    h3 = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Bold
    ),
    body1 = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.15.sp,
        // Todo Add caps
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        letterSpacing = 1.15.sp,
        fontWeight = FontWeight.Normal
        // Add caps
    )
)
