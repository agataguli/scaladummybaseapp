package com.company

import org.scalatest.{FreeSpec, Matchers}

class SiemaPieknaSpec extends FreeSpec with Matchers {

    "no siema" in {
        val siemaPiekna = SiemaPiekna("Tequilka")

        siemaPiekna.sieemmmmmaaa shouldBe "Tequilka/AGA"
    }
}
