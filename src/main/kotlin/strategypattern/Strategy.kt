package strategypattern

interface Strategy {
    open fun nextHand():Hand
    open fun study(win : Boolean)
}

