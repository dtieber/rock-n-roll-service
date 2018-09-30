package contracts

import com.itv.scalapact.ScalaPactVerify.{loadFromLocal, verifyPact}
import org.scalatest.{FunSpec, Matchers}
import com.itv.scalapact.circe09._
import com.itv.scalapact.http4s18._

class SassyProviderTest extends FunSpec with Matchers {

  describe("ArtistService") {
    it("should return list of artist") {
      verifyPact
        .withPactSource(loadFromLocal("./"))
        .noSetupRequired
        .runVerificationAgainst("http", "localhost", 9000)
    }
  }
}
