package traits

/**
 * Created by raju on 7/20/2014.
 */
sealed trait Config

case class Configuration(

                          config: String = "bootstrap",
                          key: String = "no value specified",
                          debug: Boolean = false

                          ) extends Config

object Configuration {
  def hello: String = {
    "buhuhu"
  }
}