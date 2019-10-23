package com.csair.b2c.cloud.test.kotlin

import org.junit.Test

class ApplicationTests {

    @Test
    fun test() {
        var a = 10
        var b: Int
        b = if (a == 10) 20 else 30
        println(a + b)

        var s1 = "hello"
        var s2 = "world"
        println(s1 == s2)

        println(say(s1))

        when (s1) {
            "hello" -> println(s1.toUpperCase())
            else -> println("default")
        }
    }

    @Test
    fun test1() {
        var nums1 = 1..10
        println(nums1.javaClass)
        println(nums1.average())
        for (i in nums1) {
            print("$i-")
        }
    }

    @Test
    fun test2() {
        var list = listOf("hello", "world", 2)
        println(list)
    }

    //String 后面的 ？ 就表示该方法可以接收 null 作为参数
    private fun say(str1: String?): Int {
        if (str1 != null) {
            return str1.length
        }
        return 0
    }

}
