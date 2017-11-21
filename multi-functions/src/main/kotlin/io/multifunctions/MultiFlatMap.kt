package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B, R> Iterable<Pair<A?, B?>>.flatMap(transform: (A?, B?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second) }

inline fun <A, B, C, R> Iterable<Triple<A?, B?, C?>>.flatMap(transform: (A?, B?, C?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second, elem.third) }

inline fun <A, B, C, D, R> Iterable<Quad<A?, B?, C?, D?>>.flatMap(transform: (A?, B?, C?, D?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second, elem.third, elem.fourth) }

inline fun <A, B, C, D, E, R> Iterable<Penta<A?, B?, C?, D?, E?>>.flatMap(transform: (A?, B?, C?, D?, E?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth) }

inline fun <A, B, C, D, E, F, R> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.flatMap(transform: (A?, B?, C?, D?, E?, F?) -> Iterable<R>): List<R?> =
        this.flatMap { elem -> transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth) }