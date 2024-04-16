def twofer(name: String = "you"): String =
    //default parameter value => name: String = "you"
    name match {
      case _ => "One for "+ name+ ", one for me."
    }

 /*In Scala, default parameter values refer to assigning values to parameters when defining functions or methods. 
 This means that if no value is provided for a parameter when calling the function, the default value will be used.*/   