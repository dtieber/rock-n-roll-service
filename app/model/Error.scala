package model

import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._


case class Error(status: String, message: String)

object Error {
  implicit val errorReads: Reads[Error] = (
      (__ \ "status").read[String] and
      (__ \ "message").read[String]
    )(Error.apply _)

  implicit val errorWrites: Writes[Error] = (
      (__ \ "status").write[String] and
      (__ \ "message").write[String]
    )(unlift(Error.unapply))
}