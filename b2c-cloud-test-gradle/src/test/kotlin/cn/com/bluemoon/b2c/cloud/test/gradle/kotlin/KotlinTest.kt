package cn.com.bluemoon.b2c.cloud.test.gradle.kotlin

import com.sun.corba.se.impl.orbutil.graph.Graph
import org.junit.Before
import org.junit.Test
import sun.security.provider.certpath.Vertex
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator
import javax.inject.Inject
import javax.swing.JButton
import javax.swing.JFrame
import kotlin.properties.Delegates
import kotlin.reflect.KProperty
import cn.com.bluemoon.b2c.cloud.test.gradle.kotlin.BeanNameGenerator as BeanNameGenerator1

fun main(args: Array<String>) {
    sum3(3, 4)
    Test1().test()
    string()
    foo()
    copyAddress(Address())
}

// 定义函数
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 将表达式作为函数体、返回值类型自动推断的函数
fun sum1(a: Int, b: Int) = a + b

// 函数返回无意义的值,Unit可省略
fun sum3(a: Int, b: Int): Unit {
    // 字符串模板
    println("$a+$b=${a + b}")
}

fun test() {
    // 定义只读局部变量使用关键字 val
    val a: Int = 1
    val b = 2
    // 可重新赋值的变量使用 var
    var c = 3
    c = 4
}

fun maxOf(a: Int, b: Int): Int {
    // 条件表达式
    return if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}

// 条件表达式
fun maxOf1(a: Int, b: Int) = if (a > b) a else b

// 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空
fun parseInt(s: String?): Int? {
    if (s == null) {
        return -1
    }
    return s.toInt()
}

// is 运算符检测一个表达式是否某类型的一个实例
fun getStringLength(s: Any): Int? {
    if (s is String) {
        return s.length
    }
    return null
}

fun getStringLength1(obj: Any): Int? {
    if (obj !is String) return null
    // `obj` 在这一分支自动转换为 `String`
    return obj.length
}

fun getStringLength2(obj: Any): Int? {
    // `obj` 在 `&&` 右边自动转换成 `String` 类型
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}

// 使用 for 循环和 while 循环
fun test1() {
    val fruits = listOf("apple", "banana", "orange")
    for (fruit in fruits) {
        print("$fruit ")
    }
    for (index in fruits.indices) {
        println("item at $index is ${fruits[index]}")
    }
    var index = 0
    while (index < fruits.size) {
        println("item at $index is ${fruits[index]}")
        index++
    }
}

// 使用 when 表达式
fun describe(a: Any): String {
    val fruits = listOf("apple", "banana", "orange")
    when {
        "orange" in fruits -> println("juicy")
        "apple" in fruits -> println("apple is fine too")
    }
    when (a) {
        // 很多分支需要用相同的方式处理，则可以把多个分支条件放在一起，用逗号分隔
        0, 1 -> print("x == 0 or x == 1")
        a == "b" -> print("s encodes x")
        is String -> a.toUpperCase()
        else -> print("otherwise")
    }
    return when (a) {
        1 -> "one"
        "hello" -> "greeting"
        is Long -> "long"
        in 10..20 -> "between 10 to 20"
        !is String -> "not string"
        else -> "unknown"
    }
}

// 使用区间（range）
fun range() {
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    for (x in 1..10 step 2) {
        print(x)
    }
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    for ((index, value) in fruits.withIndex()) {
        println("the element at $index is $value")
    }
}

fun change() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}

// 创建 DTOs（POJOs/POCOs）
data class Person(val name: String, var age: Int)

var person = Person("liangyudong", 28)

class Test1 {
    // 函数的默认参数
    fun test(s: String = "welcome") {
        println("$s $person")
    }
}

fun iteratorMap() {
    // 只读 map
    val map = mutableMapOf<String, Int>()
    println(map["one"])
    map["one"] = 1
    for ((k, v) in map) {
        println("$k -> $v")
    }
}

// 扩展函数
fun String.trimAllSpace(s: String): String {
    return s.replace(" ", "")
}

// 创建单例
object AppConsts {
    // 编译期常量
    const val NAME = "Name"
}

fun getSize(array: List<String>?): Int? {
    // If not null 缩写
    return array?.size
}

fun getSize1(array: List<String>?): Int {
    // If not null and else 缩写
    return array?.size ?: 0
}

fun test3() {
    val result = try {
        getSize1(null)
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    val string = if (result == 1) {
        "one"
    } else if (result == 2) {
        "two"
    } else {
        "three"
    }
}

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}

fun test4() {
    val myTurtle = Turtle()
    // with链式调用
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

// 在 Kotlin 中，所有东西都是对象，在这个意义上讲我们可以在任何变量上调用成员函数与属性。
// 对于数字没有隐式拓宽转换
// Kotlin 提供了如下的内置类型来表示数字（与 Java 很相近）：
// Type	Bit width
// Double	64
// Float	32
// Long	64
// Int	32
// Short	16
// Byte	8
fun baseType() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    var a: Int = 10000
    println(a === a) // 输出“true”
    var boxedA: Int? = a
    var anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // ！！！输出“false”！！！

    a = 10000
    println(a == a) // 输出“true”
    boxedA = a
    anotherBoxedA = a
    println(boxedA == anotherBoxedA) // 输出“true”

    val b: Byte = 1 // OK, 字面值是静态检测的
    val i: Int = b.toInt() // OK：显式拓宽
    print(i)

//    对于位运算，没有特殊字符来表示，而只可用中缀方式调用命名函数
    val x = (1 shl 2) and 0x000FF000
//    这是完整的位运算列表（只用于 Int 与 Long）：
//    shl(bits) – 有符号左移 (Java 的 <<)
//    shr(bits) – 有符号右移 (Java 的 >>)
//    ushr(bits) – 无符号右移 (Java 的 >>>)
//    and(bits) – 位与
//    or(bits) – 位或
//    xor(bits) – 位异或
//    inv() – 位非
}

fun arr() {
    var arr = arrayOf(1, 2, 3)
    // 创建一个 Array<String> 初始化为 ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    var arr1 = IntArray(5)
    // e.g. initialise the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    arr1 = IntArray(5, { 42 })

    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    arr1 = IntArray(5) { it * 1 }
}

fun string() {
    var text = """
    for (c in "foo")
        print(c)
"""
    println(text)
    text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)
}

fun test5() {
    // 在 Kotlin 中任何表达式都可以用标签（label）来标记。 标签的格式为标识符后跟 @ 符号，例如：abc@、fooBar@都是有效的标签
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 20) break@loop
        }
    }
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // 非局部直接返回到 foo() 的调用者
        print(it)
    }
    println("this point is unreachable")
}

fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
        print(it)
    }
    print(" done with explicit label")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // 隐式标签,局部返回到该 lambda 表达式的调用者，即 forEach 循环
        print(it)
    }
    print(" done with implicit label")
}

fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // 局部返回到匿名函数的调用者，即 forEach 循环
        print(value)
    })
    print(" done with anonymous function")
}

// // 从 Any 隐式继承,Any 并不是 java.lang.Object；尤其是，它除了 equals()、hashCode() 与 toString() 外没有任何成员。
class Invoice {}

// 类没有类体，可以省略花括号
class emptyCalss

class Person1 constructor(firstName: String) {
    val firstName = firstName
    fun output(): String {
        return this.firstName
    }
}

// 主构造函数
class Person2 @Inject constructor(private val firstName: String) {
    // 次构造函数
    constructor(firstName: String, secondName: String) : this(firstName)

    fun output(): String {
        return this.firstName
    }
}

// 主构造函数没有任何注解或者可见性修饰符，可以省略这个 constructor 关键字。
class Person3(private val firstName: String, private var secondName: String) {
    private var age: Int = 0

    // 次构造函数
    constructor(firstName: String, secondName: String, age: Int) : this(firstName, secondName) {
        this.age = age
    }

    // 主构造函数不能包含任何的代码,初始化的代码可以放到以 init 关键字作为前缀的初始化块（initializer blocks）中。
    // 初始化块中的代码实际上会成为主构造函数的一部分,因此所有初始化块中的代码都会在次构造函数体之前执行。
    init {
        this.secondName = this.secondName.toUpperCase()
    }

    init {
        println("Second initializer block that prints ${secondName.length}")
    }

    fun output(): String {
        return this.firstName
    }
}

open class Base(name: Int) {
    open fun v() {}
    fun nv() {}
}

class Derived(name: Int, age: Int) : Base(name) {
    override fun v() {}
    // 标记为 override 的成员本身是开放的，也就是说，它可以在子类中覆盖。如果你想禁止再次覆盖，使用 final 关键字
    // final override fun v() { }
}

open class Foo {
    open val x: Int
        get() {
            return x
        }
}

class Bar1 : Foo() {
    override var x: Int = 2
        get() {
            return -x
        }
}

open class Foo1 {
    open fun f() {
        println("Foo.f()")
    }

    open val x: Int get() = 1
}

class Bar : Foo1() {
    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override val x: Int get() = super.x + 1
}

class Bar2 : Foo1() {
    override fun f() { /* …… */
    }

    override val x: Int get() = 0

    inner class Baz2 {
        fun g() {
            super@Bar2.f() // 调用 Foo1 实现的 f()
            println(super@Bar2.x) // 使用 Foo1 实现的 x 的 getter
            this@Bar2.f() // 调用 Bar1 实现的 f()
        }
    }
}

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // 接口成员默认就是“open”的

    fun b() {
        print("b")
    }
}

class C() : A(), B {
    // 编译器要求覆盖 f()：
    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }
}

open class Base1 {
    open fun f() {}
}

abstract class Derived1 : Base1() {
    abstract override fun f()
}

fun test6() {
    var person = Person1("liang")
}

class Address {
    var name: String = ""
        set(value) {
            field = value.toUpperCase()
        }
    var street: String = ""
    var city: String = ""
        @Inject set // 用 Inject 注解此 setter
    var state: String? = null
        private set // 此 setter 是私有的并且有默认实现
    var zip: String = ""
    val isEmpty: Boolean
        get() = this.name == ""

}

fun copyAddress(address: Address): Address {
    val result = Address() // Kotlin 中没有“new”关键字
    result.name = address.name // 将调用访问器
    result.street = address.street
    result.name = "liangyudong"
    println(result.name)
    return result
}

class MyTest {
    lateinit var subject: Address

    @Before
    fun setup() {
        subject = Address()
    }

    @Test
    fun test() {
        println(subject.city)
    }
}

interface BeanNameGenerator {
    fun generate(className: String): String
    fun generete(clz: Class<Any>): String {
        return clz.name
    }
}

class GeneratorImpl : BeanNameGenerator1 {
    override fun generate(className: String): String {
        return className.toUpperCase()
    }
}

interface Named {
    val name: String
}

interface Person4 : Named {
    var firstName: String
    var lastName: String
    override val name: String
        get() = "$firstName $lastName"
}

data class Employee(override var firstName: String, override var lastName: String) : Person4 {
}

fun Int.max(a: Int): Int {
    var employee = Employee("liang", "yudong")
    var employee1 = employee.copy(firstName = "li")
    var (first, second) = employee
    println("$first $second")
    var pair = Pair("yudong", 1)
    return if (a > this) a else this
}

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
    // 不再需要 `else` 子句，因为我们已经覆盖了所有的情况
}

fun annoymousFunc() {
    var frame = JFrame("")
    frame.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            println(e)
        }
    })
    var button = JButton("")
    button.addActionListener { print(it) }
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

open class AB(x: Int) {
    public open val y: Int = x
}

interface BC {}

fun expression() {
    val ab: AB = object : AB(1), BC {
        override val y = 15
    }
}

fun foo12() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}

class CD {
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // 没问题
        //val x2 = publicFoo().x  // 错误：未能解析的引用“x”
    }
}

object ServiceImpl {
    var Named = "liang yudong"
}

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

class MyClass1 {
    companion object {}
}

class MyClass2 {
    companion object Named {}
}

class MyClass3 {
    companion object {}
}

fun companionObj() {
    val instance = MyClass.create()
    val x = MyClass1
    val y = MyClass2
    val z = MyClass3
}

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun delegate() {
    val e = Example()
    println(e.p)
    e.p = "new value"
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
    println(lazyValue)
    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"

    val user1 = User1(mapOf(
            "name" to "John Doe",
            "age" to 25
    ))
    user1.age
}

class User {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println("$old -> $new")
    }
}

class User1(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

open class AA {
    open fun foo(i: Int = 10) {}
}

class BB : AA() {
    override fun foo(i: Int) {}  // 不能有默认值
}

fun foo(bar: Int = 0, baz: Int) {}
fun foo1(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {}
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
}

fun foo(vararg strings: String) {}
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun func() {
    foo(baz = 1) // 使用默认值 bar = 0
    foo1(1) { println("hello") }     // 使用默认值 baz = 1
    foo1(qux = { println("hello") }) // 使用两个默认值 bar = 0 与 baz = 1
    foo1 { println("hello") }        // 使用两个默认值 bar = 0 与 baz = 1
    reformat("")
    reformat("",
            normalizeCase = true,
            upperCaseFirstLetter = true,
            divideByCamelHumps = false,
            wordSeparator = '_'
    )
    reformat("", wordSeparator = '_')
    foo(strings = *arrayOf("a", "b", "c"))
    val list = asList(1, 2, 3)
}

fun double(x: Int): Int = x * 2

infix fun Int.shll(x: Int): Int {
    return x
}

fun infixx() {
    // 用中缀表示法调用该函数
    1 shll 2

// 等同于这样
    1.shll(2)
}

class MyStringCollection {
    infix fun add(s: String) {}

    fun build() {
        this add "abc"   // 正确
        add("abc")       // 正确
        // add "abc"        // 错误：必须指定接收者
    }
}

fun dfs(graph: Graph?) {
    val visited = HashSet<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.add(current)) return
//        for (v in current.neighbors)
        dfs(null)
    }

//    dfs(graph.vertices[0])
}

fun <T, R> Collection<T>.fold(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

fun call() {
    val items = listOf(1, 2, 3, 4, 5)

// Lambdas 表达式是花括号括起来的代码块。
    items.fold(0, {
        // 如果一个 lambda 表达式有参数，前面是参数，后跟“->”
        acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // lambda 表达式中的最后一个表达式是返回值：
        result
    })

// lambda 表达式的参数类型是可选的，如果能够推断出来的话：
    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

// 函数引用也可以用于高阶函数调用：
    val product = items.fold(1, Int::times)

    var fun0 = { a: Int, b: Int -> a + b }
    var fun1 = fun(s: String): Int { return s.toIntOrNull() ?: 0 }

    var map = mapOf<String, Int>()
    map.forEach { _, value -> println("$value!") }

    map = mapOf("key1" to 1, "key2" to 2)

    val numbersMap = mutableMapOf<String, String>().apply { this["one"] = "1"; this["two"] = "2" }

    var num1 = listOf(1, 3, 5, 7, 9)
    var num2 = mutableListOf<Int>()
    num1.filterTo(num2) { it > 5 }
}