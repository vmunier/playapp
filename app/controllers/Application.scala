package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok("index page.")
  }

  def waitSeconds(nbSeconds: Int) = Action {
    Thread.sleep(nbSeconds * 1000)
    Ok(s"Finished after $nbSeconds seconds.")
  }

}
