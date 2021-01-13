/**
 * 构造集合
 */
fun main() {
    listT()
    copyT()
}


//空集合
fun emptyCollections() {
    val empty = emptyList<String>()
}

//list 的初始化函数
fun listT() {
    var double = List(3, { it * 2 })
    println(double)
}

//复制
fun copyT() {
    val sourceList = mutableListOf<Int>(1, 2, 3)
    val copyList = sourceList.toMutableList()
    val readOnlyCopyList = sourceList.toList()
    copyList.add(4)
    //readOnlyCopyList.add(4)             // 编译异常
    println("sourceList=${sourceList.size},copyList=${copyList.size}")

    val copySet = sourceList.toMutableSet();
    copySet.add(3)
    copySet.add(4)
    println("copySet=${copySet}")

    val referenceList: List<Int> = sourceList
    //readOnlyCopyList.add(4)  //编译错误
    sourceList.add(4)
    println("referenceList=${referenceList}") //// 显示 sourceList 当前状态
}