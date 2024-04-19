//defalut value als parameter 

def twofer(name: String = "you"): String =
  name match {
    case _ => s"One for $name, one for me."
  }   

