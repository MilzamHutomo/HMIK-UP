package com.project.hmikup

object StafData {

    private val stafNames = arrayOf(
        "Fathan Satria Anandika",
        "Redho Saputra",
        "Mohammad Milzam Kasyfillah Hutomo",
        "Revyra Phoebe Fransiska",
        "Silvia Takarina",
        "Fritz Abyatar",
        "Muhammad Alviazra Virgananda",
        "Ario Dwiponco",
        "Dwiki Ambarwanto Putra",
        "Marro Sandy Bagus Saputra",
        "Fauzi Arda Saputra",
        "Muhammad Ariq Rafly"
    )

    private val stafPhone = arrayOf(
        "(+62) 878-1234-5678",
        "(+62) 123-3324-2213",
        "(+62) 543-7891-2131",
        "(+62) 765-9906-3545",
        "(+62) 486-0098-2347",
        "(+62) 872-8990-1244",
        "(+62) 637-0092-4476",
        "(+62) 522-1221-7783",
        "(+62) 123-8823-0092",
        "(+62) 146-1923-8892",
        "(+62) 233-9761-0923",
        "(+62) 112-7781-0921"
    )

    private val stafPosition = arrayOf(
        "Ketua Umum",
        "Wakil Ketua",
        "Sekretaris Umum",
        "Sekretaris 1",
        "Bendahara Umum",
        "Bendahara 1",
        "Kepala Departemen Internal",
        "Kepala Departemen Eksternal",
        "Kepala Departemen Kewirausahaan",
        "Kepala Departemen Pendidikan",
        "Kepala Departemen IT",
        "Kepala Departemen Media Informasi"
    )

    private val stafCode = arrayOf(
        "CS-105217001-1234",
        "CS-105217002-8876",
        "CS-105217003-8334",
        "CS-105217004-2256",
        "CS-105217005-2237",
        "CS-105217006-8201",
        "CS-105217007-1235",
        "CS-105217008-5532",
        "CS-105217009-9908",
        "CS-105217010-0012",
        "CS-105217011-0190",
        "CS-105217012-1187"
    )

    private val stafPhoto = intArrayOf(
        R.drawable.fathan,
        R.drawable.redho,
        R.drawable.milzam,
        R.drawable.vibi,
        R.drawable.silvi,
        R.drawable.fritz,
        R.drawable.alvi,
        R.drawable.ponco,
        R.drawable.dwiki,
        R.drawable.sandy,
        R.drawable.fauzi,
        R.drawable.ariq
    )

    val listData: ArrayList< Staf > get(){
        val list = arrayListOf< Staf >()
        for( index in stafNames.indices ){
            val staf = Staf()
            staf.name = stafNames[ index ]
            staf.phone = stafPhone[ index ]
            staf.position = stafPosition [ index ]
            staf.photo = stafPhoto[ index ]
            staf.code = stafCode[ index ]
            list.add( staf )
        }
        return list
    }
}