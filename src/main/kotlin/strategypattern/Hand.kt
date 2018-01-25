package strategypattern

class Hand() {
    companion object {
        //가위바위보를 0, 1, 2 로 표시
        // 변수+1 은 무조건 1 작은 쪽이 이기도록 값 설정
        val HANDVALUE_GUU:Int = 0; //주먹
        val HANDVALUE_CHO:Int = 1; //가위
        val HANDVALUE_PAA:Int = 2; //보
        val hand :Array<Hand> = arrayOf(Hand(HANDVALUE_GUU),Hand(HANDVALUE_CHO), Hand(HANDVALUE_PAA))
        val name:Array<String> = arrayOf("주먹","가위","보")

        fun getHand(handvalue:Int):Hand{
            return hand[handvalue]
        }

    }
    var handvalue:Int = 0

    constructor(handvalue:Int):this(){
        this.handvalue = handvalue
    }

    fun isStrongerThan(h : Hand):Boolean{
        return fight(h) == 1
    }

    fun isWeakerThan(h : Hand):Boolean{
        return fight(h) == -1
    }
    //0+1%3
    //1+1%3
    //2+1%3
    //3*0 + 1      7 = 3*2 +1   1%3 = 4%3 = 7%3
    //주먹 1 = 3*0 +1   나머지 1
    //가위 2 = 3*0 +2   나머지 2

    fun fight(h : Hand):Int{
        if(this == h){
            return 0
        }else if ((this.handvalue+1) % 3 == h.handvalue){
            return 1
        }else{
            return -1
        }
    }

    override fun toString():String{
        return name[handvalue]
    }

}