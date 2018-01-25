package strategypattern

import java.util.*

class ProbStrategy():Strategy {
    lateinit var random:Random
    var won:Boolean = false
    var prevHand:Hand? =null

    constructor(seed:Int):this(){
       random = Random()
    }

    override fun nextHand(): Hand {

    }

    override fun study(win: Boolean) {

    }
}