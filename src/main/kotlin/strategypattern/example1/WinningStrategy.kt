package strategypattern.example1

import java.util.*

class WinningStrategy(): Strategy {
    lateinit var random: Random
    var won:Boolean = false
    var prevHand: Hand? =null

    constructor(seed:Int):this(){
        random = Random(seed)
    }

    override fun nextHand(): Hand {

    }

    override fun study(win: Boolean) {

    }



}