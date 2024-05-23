val fibi = sequence {
    var a = firstElement
    yield(a)
    var b = secondElement
    yield(b)
    while (true) {
        val c = a + b
        yield(c)
        a = b
        b = c
    }
}

expect val firstElement: Int
expect val secondElement: Int

// TODO bluefalcon for service 6e400001-b5a3-f393-e0a9-e50e24dcca9e
