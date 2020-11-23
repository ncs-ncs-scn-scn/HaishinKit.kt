package com.haishinkit.flv.tag

interface FlvTag {
    var type: Int
    var dataSize: Long
    var timestamp: Long
    var timestampExtended: Int
    var streamId: Long
    var offset: Long

    companion object {
        var TYPE_AUDIO = 8
        var TYPE_VIDEO = 9
        var TYPE_DATA = 18
    }
}
