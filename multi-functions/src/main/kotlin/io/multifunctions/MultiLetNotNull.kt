@file:Suppress("UNCHECKED_CAST")

package io.multifunctions

import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

inline fun <A, B, R> Pair<A?, B?>.letNotNull(transform: (A, B) -> R): R? =
        when (null) {
            first, second -> null
            else -> transform(first as A, second as B)
        }

inline fun <A, B, C, R> Triple<A?, B?, C?>.letNotNull(transform: (A, B, C) -> R): R? =
        when (null) {
            first, second, third -> null
            else -> transform(first as A, second as B, third as C)
        }

inline fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.letNotNull(transform: (A, B, C, D) -> R): R? =
        when (null) {
            first, second, third, fourth -> null
            else -> transform(first, second, third, fourth)
        }

inline fun <A, B, C, D, E, R> Penta<A?, B?, C?, D?, E?>.letNotNull(transform: (A, B, C, D, E) -> R): R? =
        when (null) {
            first, second, third, fourth, fifth -> null
            else -> transform(first, second, third, fourth, fifth)
        }

inline fun <A, B, C, D, E, F, R> Hexa<A?, B?, C?, D?, E?, F?>.letNotNull(transform: (A, B, C, D, E, F) -> R): R? =
        when (null) {
            first, second, third, fourth, fifth, sixth -> null
            else -> transform(first, second, third, fourth, fifth, sixth)
        }