fun main(){
println("Телевизор")
println("Введите фирму, диагональ экрана, звуковую мощность")
val parts = Tv(_firma = readLine().toString(), _screen = readLine().toString().toDouble(), _noise = readLine().toString().toInt() )
println(parts.printInfo())
println("Страна-производитель")
    val parts2=CountryCreater(_firma = readLine().toString(), _screen = readLine().toString().toDouble(), _noise = readLine().toString().toInt(), _P = readLine().toString(), )
    println(parts2.printInfo())
}