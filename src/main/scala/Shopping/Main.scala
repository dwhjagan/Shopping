package Shopping

object Main {

  def main(args: Array[String]) {
    println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.checkoutWithOffers(args))
  }

}
