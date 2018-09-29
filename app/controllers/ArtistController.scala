package controllers

import javax.inject._
import model.Error
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import services.ArtistService

import scala.util.Random

@Singleton
class ArtistController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    val artists = ArtistService.list
    Ok(Json.toJson(Random.shuffle(artists)))
  }


  def details(id: Long) = Action { implicit request: Request[AnyContent] =>
    val artist = ArtistService.find(id)
    artist.fold(
      BadRequest(Json.toJson(Error("Failed", "Artist not found")))
    ) {
      (artist) => Ok(Json.toJson(artist))
    }
  }

}
