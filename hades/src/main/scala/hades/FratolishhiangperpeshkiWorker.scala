package hades

import wncomwnco.thePrinter
case class functions[-inputTP,+outputTP](sumparam:inputTP=>outputTP) {
    def dowit(a:inputTP):outputTP=sumparam(a)
  }
  class animal
  class doggo extends animal
  class smalldoggo extends doggo
  class cat extends animal
  
 object implementation {
    def thisFunction(sumit:doggo):doggo=sumit
    def thatFunction(a:smalldoggo):animal=a
    def onemoretime(a:functions[smalldoggo,animal])=a.dowit(new smalldoggo)
    val thingy = functions(thisFunction)
    val thongo = functions(thatFunction)
    val punchLine = onemoretime(thingy)
    case class box[+ii](a:ii) {
        def newBox[jj>:ii](funcy:jj):box[jj] = box(funcy)
    }
    val sm = box(new doggo)
    val cast:box[animal] = sm
    val tst = cast.newBox(new cat)
    val eric = box(new smalldoggo).newBox(new doggo)
    val robbo = thePrinter.point1
}