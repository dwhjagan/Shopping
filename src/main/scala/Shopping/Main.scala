package Shopping

object Main {
//this is the main program for the shopping cart
  def main(args: Array[String]) {
    println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.checkoutWithOffers(args))
  }

}
