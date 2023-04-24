fun main(args: Array<String>) {

   var pin = 1220
   do {
       println("Enter your pin")
       pin =  readLine()!!.toInt()

   }
       while (pin != 1220)
       println("Correct password")


}