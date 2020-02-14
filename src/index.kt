external fun require(module: String): dynamic

fun main() {
  val express = require("express")
  val app = express()

  val PORT = 8080

  val routes = require("./routes")
  app.use(routes.create());

  app.listen(PORT, {
    println("Application running on port ${PORT}")
  })
}
