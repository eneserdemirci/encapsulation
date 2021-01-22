fun main() {

var user = User()
//user.name = "Enes" Error: cannot assign to 'name': the setter is private in 'User
user.lastName = "Erdemirci"
 
println(user.name) // 'null' return
println(user.lastName)
 
}

class User{
  var uname : String? = null
  var ulastName : String? = null
  var usalary : Int? = null

  // Encapsulation

  var name : String? = uname
      private set
      get
  var lastName : String? = ulastName
  var salary : Int? = usalary
  
}
