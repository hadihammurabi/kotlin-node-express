external fun require(module: String): dynamic

val Router = require("express").Router

fun create() {
  val r = Router()

  r.get("/", { _, res ->
    res.send("halo semua")
  })

  return r 
}
