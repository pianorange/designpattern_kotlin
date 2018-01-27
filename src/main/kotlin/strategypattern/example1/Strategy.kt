package strategypattern.example1

interface Strategy {
    open fun nextHand(): Hand
    open fun study(win : Boolean)
}

