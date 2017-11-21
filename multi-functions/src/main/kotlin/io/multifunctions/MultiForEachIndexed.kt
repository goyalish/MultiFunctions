package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B> Iterable<Pair<A?, B?>>.forEachIndexed(action: (Int, A?, B?) -> Unit): Unit =
        this.forEachIndexed { index, elem -> action(index, elem.first, elem.second) }

inline fun <A, B, C> Iterable<Triple<A?, B?, C?>>.forEachIndexed(action: (Int, A?, B?, C?) -> Unit): Unit =
        this.forEachIndexed { index, elem -> action(index, elem.first, elem.second, elem.third) }

inline fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.forEachIndexed(action: (Int, A?, B?, C?, D?) -> Unit): Unit =
        this.forEachIndexed { index, elem -> action(index, elem.first, elem.second, elem.third, elem.fourth) }

inline fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.forEachIndexed(action: (Int, A?, B?, C?, D?, E?) -> Unit): Unit =
        this.forEachIndexed { index, elem -> action(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth) }

inline fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.forEachIndexed(action: (Int, A?, B?, C?, D?, E?, F?) -> Unit): Unit =
        this.forEachIndexed { index, elem -> action(index, elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth) }