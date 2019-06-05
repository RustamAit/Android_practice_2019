
class Person(var name: String, var surname: String): MoveAble {
	fun sayHello(){
		print("hello " + name)
	}
	override fun move(): String{
		return "move"
	}
}
interface MoveAble{
	fun move(): String
}

fun main(){
	var p = Person("hello", "hello hello")

	p.name
	p.sayHello()
}