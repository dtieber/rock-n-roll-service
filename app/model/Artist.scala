package model

import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._

case class Artist(id: Long, name: String, genre: String)

object Artist {
  implicit val artistReads: Reads[Artist] = (
    (__ \ "id").read[Long] and
    (__ \ "name").read[String] and
      (__ \ "genre").read[String]
    )(Artist.apply _)

  implicit val artistWrites: Writes[Artist] = (
    (__ \ "id").write[Long] and
    (__ \ "name").write[String] and
      (__ \ "genre").write[String]
    )(unlift(Artist.unapply))
}