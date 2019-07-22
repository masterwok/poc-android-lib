package com.styledemo.xml.config

import contracts.Foo
import dagger.LibraryClient

class ExampleDependencyResolver : LibraryClient.DependencyResolver {
    override fun foo(): Foo {
        return object : Foo {
            override fun bar(): String {
                return "hack the planet!"
            }
        }
    }
}