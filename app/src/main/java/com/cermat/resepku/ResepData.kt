package com.cermat.resepku

import java.util.ArrayList

object ResepData {

    private val resepNames = arrayOf("Pepes Jamur Tahu",
        "Bakwan Kembang Kol",
        "Urap-Urap Lezat Sehat",
        "Steak Tempe Enak",
        "Bacon Daging Kelapa",
        "Perkedel Sayuran Lembut Gurih",
        "Bakso Tempe Tanpa Daging Enak",
        "Sate Jamur Kancing Pedas Manis",
        "Kembang Kol Goreng Saus Madu",
        "Pempek Vegetarian")

    private val bahanMemasak = arrayOf("2 kotak tahu putih\n200 gr jamur tiram, suwir-suwir \n1 butir telur \n100 ml santan kental \n5 buah cabai merah \n2 lembar daun salam \n1 sdt ketumbar \n4 butir kemiri \ngaram dan penyedap rasa secukupnya.",
        "1 bonggol kembang kol \n2 sendok teh garam \n1 sendok teh lada hitam \n2 siung bawang putih, cincang\n1 buah bawang bombay \n1 cangkir parsley cincang \n1/2 cangkir tepung terigu \n1/3 cangkir keju parmesan parut \n1 butir telur, tepung terigu untuk pelapis, minyak goreng.",
        "200 gr kepala parut \n1 ikat kacang panjang \n1 buah wortel \n1 bungkus kecambah \n3 buah cabai rawit \n3 buah cabai merah \n1 cm terasi \n1 ruas kencur \n3 lembar daun jeruk \ngula merah dan garam secukupnya \ndaun pisang secukupnya.",
        "300 gr tempe kukus \n3 siung bawang putih \n1/2 sdt merica \n1 sdt garam \n1 butir telur \ntepung terigu serba guna secukupnya \nair secukupnya \n3 sdm saus cabai \n2 sdm saus tomat \n1 sdm saus tiram \n1 buah bawang bombay, potong-potong \npotongan tomat(Optional)",
        "3 cangkir besar daging kelapa yang dikerok (bukan diparut) \n3 sendok makan kecap asin \n2 1/2 sendok makan liquid smoke (bisa dibeli di toko bahan-bahan makanan) \n1 1/2 sendok makan sirup maple",
        "4 buah kentang \nkupas dan kukus hingga matang \n3 batang daun bawang potong-potong tipis \n1 buah wortel, serut tipis \n1 butir telur \n1 sdt garam \ngula secukupnya \n2 siung bawang putih haluskan \n2 siung bawang merah haluskan.",
        "150 gr tempe \n150 gr tepung tapioka \n1 butir telur \n3 siung bawang putih, haluskan \n1/2 sdt merica bubuk \nair secukupnya \nminyak secukupnya.",
        "100 gr jamur kancing \niris tipis \n1 sdm kecap manis \n1 siung bawang putih, haluskan \n2 buah cabai rawit \n1 sdt ketumbar \n1 butir kemiri \n1 sdt margarin \n1/2 sdt merica bubuk.",
        "2 buah kembang kol potong-potong rendam dam air garam \n2 sdm tepung bumbu \n4 sdm tepung terigu \n2 sdm tepung tapioka \n1/3 sdt garam, larutkan dengan air secukupnya \n3 siung bawang putih \n2 sdm saus tomat \n2 sdm saus cabai \n3 sdm madu \n1 sdm gula \n1 sdm kecap manis \n1/2 sdt garam \n1 sdm minyak wijen \nbiji wijen sangrai \nair secukupnya",
        "125 gram tepung terigu \n250 ml air \n1 1/4 sendok teh garam \n1/2 sendok teh kaldu jamur\n2 siung bawang putih, parut \n2 butir telur, kocok lepas \n225 gram tepung sagu 500 ml minyak \nuntuk menggoreng Rumput laut kering secukupnya, gunting dan rendam (jangan menggunakan rumput laut sudah berbumbu) \n \nBahan saus cuko (rebus semua): \n600 gram gula merah, sisir halus \n1.000 ml air \n50 gram asam kandis \n4 sendok teh garam")

    private val caraMemasak   = arrayOf("1. Jamur dicuci dan diremas-remas hingga tak tersisa airnya. Hancurkan tahu dan campur dengan telur dan jamur.\n2. Campurkan adonan dengan bumbu halus dan bumbu kasar seperti serai, daun salam dan lengkuas. Tambahkan garam dan santan secukupnya\n3. Sendoki adonan dan bungkus dengan daun pisang. Kukus selama kurang lebih 30 menit, hingga matang.",
        "1. Kukus kembang kol selama 15 menit. Tumbuk dan campurkan dengan garam, lada, bawang putih, bawang bombang, parsley, tepung terigu dan telur.\n2. Bentuk adonan menjadi bulat pipih. Celupkan ke dalam tepung terigu untuk pelapis.\n3. Goreng hingga berwarna kuning keemasan dan matang kedua sisinya.",
        "1. Haluskan bumbu kelapa parut, campur dengan kelapa parut hingga rata. Bungkus dengan daun pisang. Kukus hingga matang atau kurang lebih 20 menit.\n2. Potong-potong sayur dan rebus hingga matang, sisihkan.\n3. Campur kelapa parut bumbu dengan sayuran yang sudah direbus. Sayur urap-urap siap dinikmati dengan ikan asin dan nasi hangat.",
        "1. Lumat tempe hingga hancur selagi hangat, haluskan bumbu bawang putih, merica dan garam, aduk rata dengan tempe. Bentuk bulat-bulat pipih adonan tempe.\n2. Kocok lepas telur, celupkan adonan steak dan gulung di atas tepung terigu serba guna.\n3. Goreng hingga kecokelatan atau matang.\n4. Untuk saus, tumis bawang bombay dan tomat hingga layu, masukkan semua saus biarkan agak meletup-letup, tuang sedikit air dan masak hingga saus mengental.",
        "1. Panaskan oven pada suhu 176 derajat Celcius.\n2. Lapisi loyang dengan kertas parchment.\n3. Campurkan daging kelapa dengan kecap asin, liquid smoke dan sirup maple. Aduk hingga bumbu melapisi daging kelapa dengan merata.\n4. Sebarkan daging kelapa di atas loyang dan masukkan ke dalam oven selama 12 hingga 14 menit, tergantung tingkat kerenyahan yang diinginkan. Balikkan daging kelapa dan panggang sekitar 2-4 menit lagi.\n5. Bacon daging kelapa ini akan perlahan menjadi renyah saat suhunya sudah turun.",
        "1. Hancurkan kentang kukus dan campurkan dengan bumbu halus, garam dan gula secukupnya. Aduk rata.\n2. Masukan sayuran, aduk rata. Bentuk bulatan perkedel.\n3. Kocok telur, celupkan perkedel dan goreng hingga matang.",
        "1. Kukus tempe kurang lebih 20 menit atau hingga layu. Hancurkan selagi hangat dan haluskan dalam food processor bersama dengan bawang putih, garam, merica dan telur. Bisa juga diulek jika tidak punya food processor.\n2. Setelah benar-benar halus, campur dengan tepung tapioka, beri air sedikit demi sedikit jika terlalu padat. Aduk hingga kalis dan bisa dibentuk.\n3. Rebus air hingga mendidih. Oles tangan dengan minyak agar adonan tidak lengket di tangan dan bentuk adonan jadi bulat-bulat, masukkan ke air yang mendidih.\n4. Lakukan hingga adonan habis, dan masak bakso tempe hingga mengapung, tandanya sudah matang.",
        "1. Iris tipis jamur, haluskan bumbu oles. Susun jamur pada batang sate.\n2. Lumuri sate dengan bumbu oles dan rendam kurang lebih 15 menit. Panaskan teflon dan panggang hingga meresap. \n3. Jangan terlalu lama agar jamur tidak alot. Selesai deh, siap sajikan hangat dengan saus kacang.",
        "1. Buat adonan cair dan celupkan kembang kol di dalamnya, lalu gulung di dalam adonan, goreng hingga kering dan matang. Tiriskan.\n2. Tumis bawang putih dan masukkan semua saus, kecap manis dan gula pasir. Tuang sedikit air. Larutkan, tuang minyak wijen dan madu, aduk rata dan tes rasa. \n3. Jika sudah pas, masukkan kembang kol goreng ke dalam saus. Aduk rata.",
        "1. Gunting-gunting rrumput laut kering dalam air supaya mengembang. Dengan catatatn rumput laut kering tersebut tipe yang memang bisa direndam dalam air, bukan rumput laut panggang yang digunakan untuk membuat kimbab.  \n2. Dalam panci campur tepung terigu, air, garam, dan kaldu jamur  sampai rata. Nyalakan api kompor, aduk sampai mengental.  \n3. Tuang adonan dalam baskom. Masukkan rumput laut yang sudah mengembang dan dipotong kecil-kecil. Masukkan telur. Aduk sampai rata. Tuang adonan ke atas tepung sagu, aduk lagi.  \n4. Lumuri tangan dengan tepung sagu, ambil adonan pempek, buat bentuk adonan pastel atau bentuk seperti pempek lenjer. Sisihkan.  \n5. Rebus air sampai mendidih, masukkan pempek, masak sampai pempek mengapung dan matang. Tiriskan.")

    private val resepImages = intArrayOf(R.drawable.pepes_jamur_tahu,
        R.drawable.bakwan_kembang_kol,
        R.drawable.urap_urap_lezat,
        R.drawable.steak_tempe,
        R.drawable.bacon_daging_kelapa,
        R.drawable.perkedel_sayuran,
        R.drawable.bakso_tempe,
        R.drawable.sate_jamur_kancing_pedas_manis,
        R.drawable.kembang_kol_goreng_saus_madu,
        R.drawable.pempek_vegetarian)

    val listData: ArrayList<Resep>
        get() {
            val list = arrayListOf<Resep>()
            for (position in resepNames.indices) {
                val resep = Resep()
                resep.name = resepNames[position]
                resep.bahan = bahanMemasak[position]
                resep.cara = caraMemasak[position]
                resep.photo = resepImages[position]
                list.add(resep)
            }
            return list
        }
}