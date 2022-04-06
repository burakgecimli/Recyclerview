package com.bugcompany.kykyurtprojesi

import java.io.Serializable

data class KykModel(
    var kykName: String,
    var kykImage: Int,
    var kykAdress: String,
    var kykPhone: String
) :Serializable{
}