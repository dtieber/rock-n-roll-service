package services

import model.Artist

import scala.collection.immutable

object ArtistService {

  val jimi = Artist(1, "Jimi Hendrix", "Rock")
  val bob = Artist(2, "Bob Dylan", "Folk")
  val jennis = Artist(3, "Jennis Joplin", "Blues")
  val joe = Artist(4, "Joe Cocker", "Rock")
  val dict = List(jimi, bob, jennis, joe)


  def list = {
    dict
  }

  def find(id: Long): Option[Artist] ={
    dict.find(_.id == id)
  }
}