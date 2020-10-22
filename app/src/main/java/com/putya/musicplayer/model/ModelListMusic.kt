package com.putya.musicplayer.model

import java.io.Serializable

class ModelListMusic : Serializable {
    var strId: String? = null

    @JvmField
    var strJudulMusic: String? = null

    @JvmField
    var strNamaBand: String? = null

    @JvmField
    var strCoverLagu: String? = null
}