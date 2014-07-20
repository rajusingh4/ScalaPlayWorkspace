package controllers

import play.api._
import play.api.mvc._
import traits.Configuration

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def config = Action {
    Ok(views.html.config(new Configuration()))
  }
}