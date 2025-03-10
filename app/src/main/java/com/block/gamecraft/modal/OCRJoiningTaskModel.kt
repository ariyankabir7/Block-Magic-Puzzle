package com.block.gamecraft.modal

data class OCRJoiningTaskModel(
    val how_to_link: String, // 10
    val offer_description: String, // aasdftyguhyiu
    val offer_id: String, // 011
    val offer_link: String, // www.google.co.in
    val offer_title: String,
    val offer_coin: String,
    val offer_icon: String
) {
    companion object {
        var selectedOCRJoiningTaskModel: OCRJoiningTaskModel? = null
    }
}