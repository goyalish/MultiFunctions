package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B> Iterable<Pair<A?, B?>>.forEach(action: (A?, B?) -> Unit): Unit =
        this.forEach { elem -> action(elem.first, elem.second) }

inline fun <A, B, C> Iterable<Triple<A?, B?, C?>>.forEach(action: (A?, B?, C?) -> Unit): Unit =
        this.forEach { elem -> action(elem.first, elem.second, elem.third) }

inline fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.forEach(action: (A?, B?, C?, D?) -> Unit): Unit =
        this.forEach { elem -> action(elem.first, elem.second, elem.third, elem.fourth) }

inline fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.forEach(action: (A?, B?, C?, D?, E?) -> Unit): Unit =
        this.forEach { elem -> action(elem.first, elem.second, elem.third, elem.fourth, elem.fifth) }

inline fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.forEach(action: (A?, B?, C?, D?, E?, F?) -> Unit): Unit =
        this.forEach { elem -> action(elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth) }