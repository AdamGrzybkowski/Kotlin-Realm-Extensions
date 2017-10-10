package com.vicpin.krealmextensions.model.realmmodel

import io.realm.RealmModel
import io.realm.annotations.RealmClass

/**
 * Created by adam on 10.10.2017.
 */
@RealmClass
open class TestEntity(var name: String = ""): RealmModel