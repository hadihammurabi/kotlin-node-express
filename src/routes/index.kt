external fun require(module: String): dynamic

val Router = require("express").Router
const val MESSAGE: String = "halo semua";
fun create() {
  val r = Router();
    
  r.get("/", { _, res ->
    res.send(MESSAGE)
  })

  return r 
}
