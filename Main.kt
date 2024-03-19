//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // checking the index of 8
   val number = arrayOf(1,3,4,6,8)
    println(number.indexOf(8))

    averageOf(30,20,40)
    greeting("Good morning")
    school()
    sentence("I really thank you for being kind yesterday")

    var akirachix=schools("Nairobi","8:4:4",100,"Technology")
     println(akirachix.location)
      food()
    println(akirachix.level)
}
//Write a program that calculates the average of three numbers. The user should be prompted to enter the three numbers.

fun averageOf(num1:Int,num2:Int,num3:Int){
    var sum = num1 + num2 + num3
    var average = sum/3
    println(average)
}
// We can easily access the element of the string using string[index]
fun greeting (word:String){
    println(word[2])
    println(word[7])
}
  fun school (){
      var sentence="I love AkiraChix";
      var comment = "thats really true who told you that"
      println(sentence .length)
      println(sentence .get(4))
      println(sentence.subSequence(2,5))
      println(sentence.compareTo("comment"))
  }
//checking
  fun sentence(words:String){
      if("thank you" in words){
          println("welcome")}
      else{
          println("okey")
      }
  }
//class and objects

class schools( val location:String, var level:String , var numberOfStudents:Int,val typeOfEducation:String)
fun dates(){
    println("closing")
}

fun food(){
    println("Kitheri")
}
fun perform(){
    println("Basketball")
}


