package services

import model.Artist

import scala.collection.immutable

object ArtistService {

  val jimi = Artist(1, "Jimi Hendrix", "Rock", "https://img.discogs.com/Zuu63mGuIdRc0Vh1lKEQjJF2um4=/600x692/smart/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/A-110593-1449578430-6807.jpeg.jpg")
  val bob = Artist(2, "Bob Dylan", "Folk", "https://i.redd.it/yg8l04xc3h7y.jpg")
  val jennis = Artist(3, "Jennis Joplin", "Blues", "https://www.morrisonhotelgallery.com/images/big/126432.jpg")
  val joe = Artist(4, "Joe Cocker", "Rock", "https://consequenceofsound.files.wordpress.com/2014/12/screen-shot-2014-12-22-at-12-42-51-pm.png?w=703")
  val eric = Artist(5, "Eric Clapton", "Blue", "https://www.rockhall.com/sites/default/files/styles/header_image_portrait/public/ericclapton_001-2.jpg?itok=-nceAiaG")
  val johnny = Artist(6, "Johnny Cash", "Country", "https://www.biography.com/.image/t_share/MTE5NDg0MDU1MjgwMjU2NTI3/image-title1.jpg")
  val neil = Artist(7, "Neil Young", "Folk", "https://pixel.nymag.com/imgs/daily/vulture/2017/09/07/07-neil-young-1976.w700.h700.jpg")
  val patty = Artist(8, "Patty Smith", "Punk", "https://alchetron.com/cdn/patti-smith-724d8ee7-bd3a-4621-a66e-2e20caeaea1-resize-750.jpeg")
  val david = Artist(9, "David Bowie", "Pop", "https://i.ytimg.com/vi/6FJwH46Ig10/maxresdefault.jpg")
  val dict = List(jimi, bob, jennis, joe, eric, johnny, neil, patty, david)


  def list = {
    dict
  }

  def find(id: Long): Option[Artist] ={
    dict.find(_.id == id)
  }
}