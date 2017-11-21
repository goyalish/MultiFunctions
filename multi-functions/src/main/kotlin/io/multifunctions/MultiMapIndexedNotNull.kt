package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapIndexedNotNull(transform: (Int, A, B) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second -> null
                else -> transform(index,
                                  elem.first ?: throw IllegalStateException("first cannot be null"),
                                  elem.second ?: throw IllegalStateException("second cannot be null"))
            }
        }

inline fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapIndexedNotNull(transform: (Int, A, B, C) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second, elem.third -> null
                else -> transform(index,
                                  elem.first ?: throw IllegalStateException("first cannot be null"),
                                  elem.second ?: throw IllegalStateException("second cannot be null"),
                                  elem.third ?: throw IllegalStateException("third cannot be null"))
            }
        }

inline fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapIndexedNotNull(transform: (Int, A, B, C, D) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second, elem.third, elem.fourth -> null
                else -> transform(index, elem.first, elem.second, elem.third, elem.fourth)
            }
        }

inline fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapIndexedNotNull(transform: (Int, A, B, C, D, E) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second, elem.third, elem.fourth, elem.fifth -> null
                else -> transform(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth)
            }
        }

inline fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapIndexedNotNull(transform: (Int, A, B, C, D, E, F) -> R): List<R> =
        this.mapIndexedNotNull { index, elem ->
            when (null) {
                elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth -> null
                else -> transform(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth)
            }
        }