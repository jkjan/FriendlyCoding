package com.mashup.friendlycoding.model

import com.mashup.friendlycoding.R

class MapDrawable(val backgroundImg : Int = R.drawable.bg_stage02, var princessImg : Int = R.drawable.princess) {
    var monsterImg = 0
    var bossBattleBackgroundImg = 0
    var itemImg = arrayListOf<Array<Any>>()
}