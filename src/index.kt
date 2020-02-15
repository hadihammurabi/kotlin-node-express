external fun require(module: String): dynamic

const val PORT: Int = 8080
fun main() {
  val express = require("express")
  val app = express()
  val routes = require("./routes")

  app.use(routes.create());

  app.listen(PORT, {
    println("Application running on port ${PORT}")
  })
}
