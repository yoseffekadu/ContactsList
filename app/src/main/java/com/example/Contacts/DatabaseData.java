package com.example.Contacts;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;


public class DatabaseData {
    private SQLiteDatabase mDb;

    public DatabaseData(SQLiteDatabase db) {
        mDb = db;
    }

    public void insertRegions(){
        insertRegion("Select Region");
        insertRegion("Amhara");
        insertRegion("Benishangul");
        insertRegion( "Gambella");
        insertRegion("Oromia");



    }



    public void insertZones(){
        // insertZone(" ","Select One");

        insertZone("Select Zone","Amhara");
        insertZone("West Gondar","Amhara");
        insertZone("Awi","Amhara");

        insertZone("Select Zone","Oromia");
        insertZone("Horo Gudro Wellega","Oromia");
        insertZone("West Guji","Oromia");

        insertZone("Select Zone","Gambella");
        insertZone("Agnuwa","Gambella");
        insertZone("Nuer","Gambella");
        insertZone("Majang","Gambella");
        insertZone("Itang Special","Gambella");
        insertZone("Gambella Town","Gambella");

        insertZone("Select Zone","Benishangul");
        insertZone("Assosa","Benishangul");
        insertZone("Kamash","Benishangul");
        insertZone("Metekel","Benishangul");
        insertZone("Mao-Komo Special","Benishangul");
    }




    public void insertDistricts(){


        insertDistrict("Select District","West Gondar");
        insertDistrict("Metema","West Gondar");
        insertDistrict("West Armacheho","West Gondar");
        insertDistrict("Quara","West Gondar");

        insertDistrict("Select District","Awi");
        insertDistrict("Jawi","Awi");

        insertDistrict("Select District","Horo Gudro Wellega");
        insertDistrict("Abay Chomen","Horo Gudro Wellega");
        insertDistrict("Abe Dengoro","Horo Gudro Wellega");
        insertDistrict("Amuru","Horo Gudro Wellega");
        insertDistrict("Jardega Jarte","Horo Gudro Wellega");

        insertDistrict("Select District","West Guji");
        insertDistrict("Abaya","West Guji");
        insertDistrict("Gelana","West Guji");
        insertDistrict("Melka Soda","West Guji");

        insertDistrict("Select District","Agnuwa");
        insertDistrict("Gambella Zuria","Agnuwa");
        insertDistrict("Gog","Agnuwa");
        insertDistrict("Abobo","Agnuwa");
        insertDistrict("Dimma","Agnuwa");
        insertDistrict("Jor","Agnuwa");

        insertDistrict("Select District","Nuer");
        insertDistrict("Akobo","Nuer");
        insertDistrict("Jikawo","Nuer");
        insertDistrict("Lare","Nuer");
        insertDistrict("Makuey","Nuer");
        insertDistrict("Wanthoa","Nuer");

        insertDistrict("Select District","Majang");
        insertDistrict("Godare","Majang");
        insertDistrict("Mengeshi","Majang");

        insertDistrict("Select District","Itang Special");
        insertDistrict("Itang Sp.","Itang Special");

        insertDistrict("Select District","Gambella Town");
        insertDistrict("Gambella Town","Gambella Town");

        insertDistrict("Select District","Assosa");
        insertDistrict("Homosha","Assosa");
        insertDistrict("Menge","Assosa");
        insertDistrict("Sherkole","Assosa");
        insertDistrict("Bambasi","Assosa");
        insertDistrict("Asosa","Assosa");
        insertDistrict("Oda Buldigidu","Assosa");
        insertDistrict("Kurmuk","Assosa");

        insertDistrict("Select District","Kamash");
        insertDistrict("Belo Jegenfoy","Kamash");
        insertDistrict("Agalo Mete","Kamash");
        insertDistrict("Kamashi","Kamash");
        insertDistrict("Yaso","Kamash");
        insertDistrict("Sedal","Kamash");

        insertDistrict("Select District","Metekel");
        insertDistrict("Mandura","Metekel");
        insertDistrict("Bullen","Metekel");
        insertDistrict("Wombera","Metekel");
        insertDistrict("Dangur","Metekel");
        insertDistrict("Dibate","Metekel");
        insertDistrict("Guba","Metekel");
        insertDistrict("Pawi","Metekel");

        insertDistrict("Select District","Mao-Komo Special");
        insertDistrict("Mao-Komo","Mao-Komo Special");



    }



    public void insertActors(){

        //Assosa
        insertActor( "Select Actor","0911111111","test@yahoo.com","Asosa");
        insertActor( "ateyib abdurahim MFP","0915931332","yoseffekadu@yahoo.com","Asosa");
        insertActor( "hunyalew wase TL","0913960268","yoseffekadu@yahoo.com","Asosa");
        insertActor( "Daniel moti TL","0913155542","yoseffekadu@yahoo.com","Asosa");
        insertActor( "Eshetu ambaw TL","0917858885","yoseffekadu@yahoo.com","Asosa");
        insertActor( "Degu desta TL","0913689383","yoseffekadu@yahoo.com","Asosa");
        insertActor( "Endale yimer EC","0917858770","yoseffekadu@yahoo.com","Asosa");
        insertActor( "Meka abdulwahid vice-Head","0910926432","yoseffekadu@yahoo.com","Asosa");
        insertActor( "molla hailu M&E","0912477875","yoseffekadu@yahoo.com","Asosa");
        insertActor( "Bederedin mussa IEC","0913507119","yoseffekadu@yahoo.com","Asosa");
        insertActor( "gudina gemju STOREKEEPER","0917622525","yoseffekadu@yahoo.com","Asosa");
        insertActor( "Michael birhanu  STORE-ASSISTANT","0917456001","yoseffekadu@yahoo.com","Asosa");
        insertActor( "geleta bekele SEASONAL-SUPERVISOR","0917851060","yoseffekadu@yahoo.com","Asosa");
        insertActor( "setemariam derese SEASONAL-SUPERVISOR","0925339192","yoseffekadu@yahoo.com","Asosa");

        //Bambasi
        insertActor( "Select Actor","0911111111","test@yahoo.com","Bambasi");
        insertActor("Ebrahim Ahmed M&E","0917178160","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Abdulmalik Dino TL","0983908354","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Essa Hojele TL","0917171516","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Abduselam Almajub Vice-Head","0965726501","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Abdulwahid Azuber IEC","0917176015","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Tadele Admasu EC","0917171598","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Wubayehu Missa MFP","0920430581","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Hamidi Ali STOREKEEPER","0917178878","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Jemal Mohamed STORE-ASSISTANT","0917710496","yoseffekadu@yahoo.com","Bambasi");
        insertActor("Desalegn Alga SEASONAL-SUPERVISOR","0910436189","yoseffekadu@yahoo.com","Bambasi");

        //Kurmuk
        insertActor( "Select Actor","0911111111","test@yahoo.com","Kurmuk");
        insertActor("SOLOMON LEMMA TL","0913367388","yoseffekadu@yahoo.com","Kurmuk");
        insertActor("ARARESA TURA IEC","0941320285","yoseffekadu@yahoo.com","Kurmuk");
        insertActor("ABDIN MUHAMED MFP","0949505636","yoseffekadu@yahoo.com","Kurmuk");
        insertActor("ZINABU TOLESSA EC","0919480375","yoseffekadu@yahoo.com","Kurmuk");
        insertActor("Mamo Tesema M&E","0936943244","yoseffekadu@yahoo.com","Kurmuk");
        insertActor("Asadik Hamid STORE-ASSISTANT","0942432773","yoseffekadu@yahoo.com","Kurmuk");
        insertActor("Mohammed Suleiman STOREKEEPER","0921840173","yoseffekadu@yahoo.com","Kurmuk");
        insertActor("Mussa Abdurehim Head","0917422148","yoseffekadu@yahoo.com","Kurmuk");

        //Homosha
        insertActor( "Select Actor","0911111111","test@yahoo.com","Homosha");
        insertActor("Salie Hamza TL","0917178442","yoseffekadu@yahoo.com","Homosha");
        insertActor("Mehammed Esmael TL","0917709948","yoseffekadu@yahoo.com","Homosha");
        insertActor("Tariku Tasisa EC","0917893617","yoseffekadu@yahoo.com","Homosha");
        insertActor("Gemechu Adamu M&E","0985019366","yoseffekadu@yahoo.com","Homosha");
        insertActor("Abedurehim Ahmed IEC","0913989570","yoseffekadu@yahoo.com","Homosha");
        insertActor("Areshd Mussa STOREKEEPER","0939821307","yoseffekadu@yahoo.com","Homosha");
        insertActor("Mehamud Edris STORE-ASSISTANT","0933215308","yoseffekadu@yahoo.com","Homosha");
        insertActor("Abdu Hussen MFP","0910111240","yoseffekadu@yahoo.com","Homosha");
        insertActor("Abdulkerim Mehammed Vice-Head","0912404644","yoseffekadu@yahoo.com","Homosha");

        //Menge
        insertActor( "Select Actor","0911111111","test@yahoo.com","Menge");
        insertActor("OMER NASIR Head","0913500616","yoseffekadu@yahoo.com","Menge");
        insertActor("MULUALEM AMBISSA MFP","0915926655","yoseffekadu@yahoo.com","Menge");
        insertActor("BULICHA WELTAJI EC","0949046410","yoseffekadu@yahoo.com","Menge");
        insertActor("GETACHEW YITAYI TL","0912652292","yoseffekadu@yahoo.com","Menge");
        insertActor("SURANI ANAZIR IEC","0913132462","yoseffekadu@yahoo.com","Menge");
        insertActor("SELEMAN MUSSA TL","0917491178","yoseffekadu@yahoo.com","Menge");
        insertActor("MUHTASIM MERKENI TL","0913313234","yoseffekadu@yahoo.com","Menge");
        insertActor("ADISA FENTAW TL","0922210569","yoseffekadu@yahoo.com","Menge");
        insertActor("TEFER GERBI M&E","0917419542","yoseffekadu@yahoo.com","Menge");
        insertActor("ADEM AJELI BELA STORE-ASSISTANT","0983458382","yoseffekadu@yahoo.com","Menge");
        insertActor("ATEYIB FILEL FETUR STOREKEEPER","0942428786","yoseffekadu@yahoo.com","Menge");

        //Oda
        insertActor( "Select Actor","0911111111","test@yahoo.com","Oda Buldigidu");
        insertActor("Awod seleman Vice-Head","0911599444","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Kelbesse Akuma MFP","0936902668","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Alhji Atyeb EC","0932273700","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Mebiratu Baly IEC","0917430374","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Walid Asamani M&E","0949504865","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Awod Ousman TL","0917890102","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Tigestu Shefa TL","0917458634","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Abdela Husen TL","0900870451","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Ashagi Ahmed STORE-ASSISTANT","","yoseffekadu@yahoo.com","Oda Buldigidu");
        insertActor("Ahmed anur STOREKEEPER","","yoseffekadu@yahoo.com","Oda Buldigidu");

        //Sherkole
        insertActor( "Select Actor","0911111111","test@yahoo.com","Sherkole");
        insertActor("Aumer Seifedin TL","0922231554","yoseffekadu@yahoo.com","Sherkole");
        insertActor( "Ashenfi Abate TL","0911369190","yoseffekadu@yahoo.com","Sherkole");
        insertActor( "Adise Feleke MFP","0917170724","yoseffekadu@yahoo.com","Sherkole");
        insertActor( "Endris Hassen EC","0928587496","yoseffekadu@yahoo.com","Sherkole");
        insertActor( "Temesgen Wedaju IEC","0910017398","yoseffekadu@yahoo.com","Sherkole");
        insertActor( "Shimels Getahun M&E","0922147734","yoseffekadu@yahoo.com","Sherkole");
        insertActor( "Muhamed Hassen Vice-Head","0902171167","yoseffekadu@yahoo.com","Sherkole");
        insertActor( "Abera Terefe STORE-ASSISTANT","0938451314","yoseffekadu@yahoo.com","Sherkole");
        insertActor( "Brhanu Gelawe STOREKEEPER","0913353015","yoseffekadu@yahoo.com","Sherkole");

        //Agalo
        insertActor( "Select Actor","0911111111","test@yahoo.com","Agalo Mete");
        insertActor("Tamiru Hambisa EC","0917045000","yoseffekadu@yahoo.com","Agalo Mete");
        insertActor("Gemechu Dessalegn Jara MFP","0946531264","yoseffekadu@yahoo.com","Agalo Mete");
        insertActor("Geneti Anbesa Kumbale STORE-ASSISTANT","0946531264","yoseffekadu@yahoo.com","Agalo Mete");
        insertActor("Demitu Wako Shibeshi STOREKEEPER","0917418699","yoseffekadu@yahoo.com","Agalo Mete");
        insertActor("Hunde Kebede Obsi IEC","0915585820","yoseffekadu@yahoo.com","Agalo Mete");
        insertActor("Limu Polino Bogale Vice-Head","0915915505","yoseffekadu@yahoo.com","Agalo Mete");
        insertActor("Shimels Abebaw Asenake TL","0996248312","yoseffekadu@yahoo.com","Agalo Mete");
        insertActor("Megerssa Melka Boso M&E","0919063100","yoseffekadu@yahoo.com","Agalo Mete");

        //Belo
        insertActor( "Select Actor","0911111111","test@yahoo.com","Belo Jegenfoy");
        insertActor("Arega Beyane Vice-Head","0913959429","yoseffekadu@yahoo.com","Belo Jegenfoy");
        insertActor("Keros Habte MFP","0900875632","yoseffekadu@yahoo.com","Belo Jegenfoy");
        insertActor("Abebech Aregata TL","0910531192","yoseffekadu@yahoo.com","Belo Jegenfoy");
        insertActor("Tamane Hambissa EC","0917418033","yoseffekadu@yahoo.com","Belo Jegenfoy");
        insertActor("Tadesse Fayissa IEC","0911585621","yoseffekadu@yahoo.com","Belo Jegenfoy");
        insertActor("Mulgeta Shiferaw STOREKEEPER","0921674767","yoseffekadu@yahoo.com","Belo Jegenfoy");
        insertActor("Shibru Mitiku STORE-ASSISTANT","0967629813","yoseffekadu@yahoo.com","Belo Jegenfoy");
        insertActor("Baweke Mengesha M&E","0911585235","yoseffekadu@yahoo.com","Belo Jegenfoy");

        //Kamashi
        insertActor( "Select Actor","0911111111","test@yahoo.com","Kamashi");
        insertActor("Firdu Melekamu Wubale EC","","yoseffekadu@yahoo.com","Kamashi");
        insertActor("Genetu Tekalegn Ferde MFP","","yoseffekadu@yahoo.com","Kamashi");
        insertActor("Gizachew Belete Awoke M&E","","yoseffekadu@yahoo.com","Kamashi");
        insertActor("Gemeches Girma Kidanie TL","","yoseffekadu@yahoo.com","Kamashi");
        insertActor("Yasesa Heka Mese Vice-Head","","yoseffekadu@yahoo.com","Kamashi");
        insertActor("Adugna Fenta Belaye IEC","","yoseffekadu@yahoo.com","Kamashi");
        insertActor("Mandi Disasa STORE-ASSISTANT","","yoseffekadu@yahoo.com","Kamashi");
        insertActor("Gemeda Abate STOREKEEPER","","yoseffekadu@yahoo.com","Kamashi");

        //Sedal
        insertActor( "Select Actor","0911111111","test@yahoo.com","Sedal");
        insertActor("Kawe Tilinti MFP","0917229316","yoseffekadu@yahoo.com","Sedal");
        insertActor("Akalu Bagdid TL","0917740587","yoseffekadu@yahoo.com","Sedal");
        insertActor("Takele Biratu IEC","0917423811","yoseffekadu@yahoo.com","Sedal");
        insertActor("Fikadu Wondimnew EC","0912840611","yoseffekadu@yahoo.com","Sedal");
        insertActor("Teshome Keno Vice-Head","0924970488","yoseffekadu@yahoo.com","Sedal");
        insertActor("Netsanet Nigatu M&E","0936357994","yoseffekadu@yahoo.com","Sedal");
        insertActor("Melka Chali STORE-ASSISTANT","0921836809","yoseffekadu@yahoo.com","Sedal");
        insertActor("Sijar Negash STOREKEEPER","0979599604","yoseffekadu@yahoo.com","Sedal");

        //Yaso
        insertActor( "Select Actor","0911111111","test@yahoo.com","Yaso");
        insertActor("Kebede Yohanis MFP","0942097083","yoseffekadu@yahoo.com","Yaso");
        insertActor("Asfaw Berasa EC","0932266405","yoseffekadu@yahoo.com","Yaso");
        insertActor("Shibabaw Adamu TL","0993702291","yoseffekadu@yahoo.com","Yaso");
        insertActor("Bekelecho Jote IEC","0917894456","yoseffekadu@yahoo.com","Yaso");
        insertActor("Niguse W/Mariam Vice-Head","0915915732","yoseffekadu@yahoo.com","Yaso");
        insertActor("Atsede Basha STOREKEEPER","0922206538","yoseffekadu@yahoo.com","Yaso");
        insertActor("Shumet Zeleke M&E","0923006988","yoseffekadu@yahoo.com","Yaso");

        //Bullen
        insertActor( "Select Actor","0911111111","test@yahoo.com","Bullen");
        insertActor("Senbeta Abebe EC","0927651743","yoseffekadu@yahoo.com","Bullen");
        insertActor("Teshale Beyene M&E","0928587291","yoseffekadu@yahoo.com","Bullen");
        insertActor("Lemessa Birehanu TL","0982980504","yoseffekadu@yahoo.com","Bullen");
        insertActor("Meberatu Beguno Vice-Head","0941784165","yoseffekadu@yahoo.com","Bullen");
        insertActor("Hika mekonnen TL","0904328164","yoseffekadu@yahoo.com","Bullen");
        insertActor("Asefa Abakara STORE-ASSISTANT","0913930042","yoseffekadu@yahoo.com","Bullen");
        insertActor("Kenaw Jaleta IEC","0921115809","yoseffekadu@yahoo.com","Bullen");
        insertActor("Kumera Fikadu STOREKEEPER","0921114359","yoseffekadu@yahoo.com","Bullen");
        insertActor("Mamo Tolesa MFP","0989427580","yoseffekadu@yahoo.com","Bullen");

        //Dangur
        insertActor( "Select Actor","0911111111","test@yahoo.com","Dangur");
        insertActor("Atinafu Aja Vice-Head","0913523062","yoseffekadu@yahoo.com","Dangur");
        insertActor("Aschale Ayana IEC","0918744343","yoseffekadu@yahoo.com","Dangur");
        insertActor("Hymanot Gebeyehu MFP","0912287739","yoseffekadu@yahoo.com","Dangur");
        insertActor("Habtie Mengesha EC","0913967259","yoseffekadu@yahoo.com","Dangur");
        insertActor("Chalachew Abdisa TL","0917182240","yoseffekadu@yahoo.com","Dangur");
        insertActor("Fikadu Teso TL","0963791284","yoseffekadu@yahoo.com","Dangur");
        insertActor("Andargachew Shibabaw M&E","0911390399","yoseffekadu@yahoo.com","Dangur");
        insertActor("Birhanu Adane STORE-ASSISTANT","0917181940","yoseffekadu@yahoo.com","Dangur");
        insertActor("Essayase Shitu STOREKEEPER","0918745127","yoseffekadu@yahoo.com","Dangur");

        //Dibate
        insertActor( "Select Actor","0911111111","test@yahoo.com","Dibate");
        insertActor("Dergu Chaltie STOREKEEPER","0927654722","yoseffekadu@yahoo.com","Dibate");
        insertActor("Ashenafi Ertiban STORE-ASSISTANT","0938848231","yoseffekadu@yahoo.com","Dibate");
        insertActor("Fufa Debelo TL","0913628038","yoseffekadu@yahoo.com","Dibate");
        insertActor("Mulugeta Tadele TL","0906285414","yoseffekadu@yahoo.com","Dibate");
        insertActor("Adugna Negash EC","0915926873","yoseffekadu@yahoo.com","Dibate");
        insertActor("Desalegn Haile M&E","0961765928","yoseffekadu@yahoo.com","Dibate");
        insertActor("Getie Assaye MFP","0917182452","yoseffekadu@yahoo.com","Dibate");
        insertActor("Habtamu Adgo IEC","0915863488","yoseffekadu@yahoo.com","Dibate");
        insertActor("Babie Anbesa Vice-Head","0921572247","yoseffekadu@yahoo.com","Dibate");

        //Guba
        insertActor( "Select Actor","0911111111","test@yahoo.com","Guba");
        insertActor("dawude endrise SEASONAL-SUPERVISOR","0918744760","yoseffekadu@yahoo.com","Guba");
        insertActor("asalfew akelilu SEASONAL-SUPERVISOR","0922229432","yoseffekadu@yahoo.com","Guba");
        insertActor("Ayele Emru SEASONAL-SUPERVISOR","0937415613","yoseffekadu@yahoo.com","Guba");
        insertActor("Juma Abdurohman SEASONAL-SUPERVISOR","0931869799","yoseffekadu@yahoo.com","Guba");

        //Mandura
        insertActor( "Select Actor","0911111111","test@yahoo.com","Mandura");
        insertActor("Ethiopia Arega M&E","0913200584","yoseffekadu@yahoo.com","Mandura");
        insertActor("Melaku Algemer Vice-Head","0911349722","yoseffekadu@yahoo.com","Mandura");
        insertActor("Muhamed Koacho IEC","0917622115","yoseffekadu@yahoo.com","Mandura");
        insertActor("Bekalu Alemnew TL","0928451996","yoseffekadu@yahoo.com","Mandura");
        insertActor("Yusuf Adem MFP","0918530783","yoseffekadu@yahoo.com","Mandura");
        insertActor("Adugna Geleta EC","0920276237","yoseffekadu@yahoo.com","Mandura");
        insertActor("Tadele Babe TL","0913110057","yoseffekadu@yahoo.com","Mandura");
        insertActor("Amare Semahegn STOREKEEPER","0921115632","yoseffekadu@yahoo.com","Mandura");
        insertActor("Adam Abebe STORE-ASSISTANT","0991879223","yoseffekadu@yahoo.com","Mandura");

        //Pawi
        insertActor( "Select Actor","0911111111","test@yahoo.com","Pawi");
        insertActor("Gizachew Laloto Vice-head ","0920159024","yoseffekadu@yahoo.com","Pawi");
        insertActor("Smeneh Sintayehu MFP","0913986637","yoseffekadu@yahoo.com","Pawi");
        insertActor("Muluken Awaro IEC", "0913849944","yoseffekadu@yahoo.com","Pawi");
        insertActor("Amsalu Bishaw EC","0921278981","yoseffekadu@yahoo.com","Pawi");
        insertActor("Fentahun Addis TL","0915926435","yoseffekadu@yahoo.com","Pawi");
        insertActor("Tesfaye Dibissa TL","","yoseffekadu@yahoo.com","Pawi");

        //Wombera
        insertActor( "Select Actor","0911111111","test@yahoo.com","Wombera");
        insertActor("Basha Tilahun TL","0945284590","yoseffekadu@yahoo.com","Wombera");
        insertActor("Gebre Temesgen TL","0921828711","yoseffekadu@yahoo.com","Wombera");
        insertActor("Abiyot lidi TL","0919641871","yoseffekadu@yahoo.com","Wombera");
        insertActor("Habtamu Deressa TL","0920771135","yoseffekadu@yahoo.com","Wombera");
        insertActor("Fasikaw Abye TL","0931159271","yoseffekadu@yahoo.com","Wombera");
        insertActor("Kumera Mamo MFP","0917141305","yoseffekadu@yahoo.com","Wombera");
        insertActor("Amsaye Ambisa STOREKEEPER","0908994622","yoseffekadu@yahoo.com","Wombera");
        insertActor("Asfaw Abebe STORE-ASSISTANT","0929273697","yoseffekadu@yahoo.com","Wombera");
        insertActor("Adisu Abose M&E","0921646546","yoseffekadu@yahoo.com","Wombera");
        insertActor("Bezabih Fufa M&E","0909453594","yoseffekadu@yahoo.com","Wombera");
        insertActor("Aschale Gesese M&E","0937697732","yoseffekadu@yahoo.com","Wombera");
        insertActor("Megertu Geleta M&E","0972499456","yoseffekadu@yahoo.com","Wombera");
        insertActor("Mulualem Amsalu M&E","0946162719","yoseffekadu@yahoo.com","Wombera");

        //Abay Chomen
        insertActor( "Select Actor","0911111111","test@yahoo.com","Abay Chomen");
        insertActor("Merga Regasa Ararso Vice-head","0923801289","yoseffekadu@yahoo.com","Abay Chomen");
        insertActor("Motuma Elias Teso MFP","0935878145","yoseffekadu@yahoo.com","Abay Chomen");
        insertActor("Gedefa Hunde Yadeta EC","0911659693","yoseffekadu@yahoo.com","Abay Chomen");
        insertActor("Silashi Mulugeta Tegegn TL","0913048437","yoseffekadu@yahoo.com","Abay Chomen");
        insertActor("Bayisa Amenu Dugasa TL","0911174963","yoseffekadu@yahoo.com","Abay Chomen");
        insertActor("Gemechu Temesgen Mekuriya M&E","0911981946","yoseffekadu@yahoo.com","Abay Chomen");
        insertActor("Garomsa Tiki Wayesa IEC","0936933197","yoseffekadu@yahoo.com","Abay Chomen");
        insertActor("Beshana Ganfure Kitila STOREKEEPER","0917100032","yoseffekadu@yahoo.com","Abay Chomen");
        insertActor("Ibsa Begna Desta STORE-ASSISTANT","0917716643","yoseffekadu@yahoo.com","Abay Chomen");

        //Abe Dengoro
        insertActor( "Select Actor","0911111111","test@yahoo.com","Abe Dengoro");
        insertActor("Mulugeta Gudeta MFP","0911388280","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Tesfaye eno IEC","0920418321","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Lamesa Tilahun EC","0926275200","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Dinaol Tiku Vice-Head","0921616916","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Duguma Wagari TL","0917842690","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Soresa Mokonin TL","0922219731","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Desaleny Tilahun TL","0972555289","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Gemechis Abdena TL","0992979401","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Alemu Kajela M&E","0993924841","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Chimdesa Gedefa STOREKEEPER","0917080065","yoseffekadu@yahoo.com","Abe Dengoro");
        insertActor("Bashir Kasahun STORE-ASSISTANT","","yoseffekadu@yahoo.com","Abe Dengoro");

        //Amuru
        insertActor( "Select Actor","0911111111","test@yahoo.com","Amuru");
        insertActor("Awelu Mohamed MFP","0913370382","yoseffekadu@yahoo.com","Amuru");
        insertActor("Tolosa Abebe TL","0922225722","yoseffekadu@yahoo.com","Amuru");
        insertActor("Nemera Belay EC","0917822571","yoseffekadu@yahoo.com","Amuru");
        insertActor("Merga Wakjira IEC","","yoseffekadu@yahoo.com","Amuru");
        insertActor("Mulugeta Adunya M&E","0910610860","yoseffekadu@yahoo.com","Amuru");
        insertActor("Moti Gobena Vice -ead","0964207739","yoseffekadu@yahoo.com","Amuru");
        insertActor("Gedefa Negash STOREKEEPER","","yoseffekadu@yahoo.com","Amuru");
        insertActor("Habtamu Desalegn STORE-ASSISTANT","0917670704","yoseffekadu@yahoo.com","Amuru");

        //Jardega Jarte
        insertActor( "Select Actor","0911111111","test@yahoo.com","Jardega Jarte");
        insertActor("Tolassa Bekana MFP","0917431758","yoseffekadu@yahoo.com","Jardega Jarte");
        insertActor("Gutu Akuma IEC","0921199194","yoseffekadu@yahoo.com","Jardega Jarte");
        insertActor("Alamayehu Wako Vice-Head","0922254925","yoseffekadu@yahoo.com","Jardega Jarte");
        insertActor("Boka Desa TL","0920021173","yoseffekadu@yahoo.com","Jardega Jarte");
        insertActor("Tessema Belay EC","0926141251","yoseffekadu@yahoo.com","Jardega Jarte");
        insertActor("Getu Tibabu M&E","0935882795","yoseffekadu@yahoo.com","Jardega Jarte");
        insertActor("wandimu Amsalu STORE-ASSISTANT","0920075417","yoseffekadu@yahoo.com","Jardega Jarte");


        // Oromia

        insertActor("Select Actor","0911111111","test@gmail.com","Abaya");
        insertActor("Getahun Zenebe MFP","0910004867","yoseffekadu@yahoo.com","Abaya");
        insertActor("Barsinet Geromu TL","0913711173","yoseffekadu@yahoo.com","Abaya");
        insertActor("Amarech Zenebe TL","0913422260","yoseffekadu@yahoo.com","Abaya");
        insertActor("Hiluf G/Tekle EC","0913027918","yoseffekadu@yahoo.com","Abaya");
        insertActor("Alemayehu Admasu IEC","0904418008","yoseffekadu@yahoo.com","Abaya");
        insertActor("Tesfaye Negasa M&E Asistant","0926038020","yoseffekadu@yahoo.com","Abaya");

        //Melka Soda

        insertActor("Select Actor","0911111111","test@yahoo.com","Melka Soda");
        insertActor("Sintayo Kore Store assistant","0993924219","yoseffekadu@yahoo.com","Melka Soda");
        insertActor("Molu Tadese Storekeeper","0916514591","yoseffekadu@yahoo.com","Melka Soda");
        insertActor("Ararso Ganale TL","0916423728","yoseffekadu@yahoo.com","Melka Soda");
        insertActor("Danbobi Borame Vice Head","0900550458","yoseffekadu@yahoo.com","Melka Soda");
        insertActor("Nuguse Urago EC","0916423728","yoseffekadu@yahoo.com","Melka Soda");
        insertActor("Tari Gololcha IEC","0926300530","yoseffekadu@yahoo.com","Melka Soda");
        insertActor("Muse Safayi M&E","0916646714","yoseffekadu@yahoo.com","Melka Soda");
        insertActor("Habtamu Balela MFP","0916431384","yoseffekadu@yahoo.com","Melka Soda");


        insertActor("Select Actor","0911111111","test@gmail.com", "Gelana");
        insertActor("Demeke Getachew EC","0912003803","yoseffekadu@yahoo.com", "Gelana");
        insertActor("Badhasa Jilo Head ","0910132473","yoseffekadu@yahoo.com", "Gelana");
        insertActor("Mohammed Aliyi IEC","0913796520","yoseffekadu@yahoo.com", "Gelana");
        insertActor("Ayele Waldayohanis M&E","0910450957","yoseffekadu@yahoo.com", "Gelana");
        insertActor("Abdulkadir Hsen MFP","0919231839","yoseffekadu@yahoo.com", "Gelana");
        insertActor("Wondimagegn Hayile Storekeeper ","0949178653","yoseffekadu@yahoo.com", "Gelana");
        insertActor("Bariso Gammade Storekeeper (Assistant)","0932682132","yoseffekadu@yahoo.com", "Gelana");
        insertActor("Diriba Debela TL","0917071080","yoseffekadu@yahoo.com", "Gelana");
        insertActor("Dedecha Dibayu TL","0916327463","yoseffekadu@yahoo.com", "Gelana");


        //Gambella

        insertActor("Select Actor","0911111111","test@gmail.com", "Makuey");
        insertActor("KHOR BAYIEK T/LEADER","0925852005","yoseffekadu@yahoo.com", "Makuey");
        insertActor("CHUOL BUOY T/LEADER","0917834440","yoseffekadu@yahoo.com", "Makuey");
        insertActor("TESLUOUCH GONY MALARIA FP","0917317243","yoseffekadu@yahoo.com", "Makuey");
        insertActor("GATLUOK THOK M&E","0934262563","yoseffekadu@yahoo.com", "Makuey");
        insertActor("PAM GATWECH HEAD","0927588180","yoseffekadu@yahoo.com", "Makuey");
        insertActor("SIMON KUANY I/E/C","0917954104","yoseffekadu@yahoo.com", "Makuey");
        insertActor("PHILIP SUNDAY E/C","0934281339","yoseffekadu@yahoo.com", "Makuey");
        insertActor("KOANG GATKUOTH Store keeper","0993630405","yoseffekadu@yahoo.com", "Makuey");
        insertActor("TING CHOUL Pump tech ","0935155231","yoseffekadu@yahoo.com", "Makuey");


        insertActor("Select Actor","0911111111","", "Jikawo");
        insertActor("Kure kale TL","0917301494","yoseffekadu@yahoo.com", "Jikawo");
        insertActor("Biyien khat MFP","0935132177","yoseffekadu@yahoo.com", "Jikawo");
        insertActor("Wendwesen fekadu M&E","0924942095","yoseffekadu@yahoo.com", "Jikawo");
        insertActor("Duol kum EC","0922252301","yoseffekadu@yahoo.com", "Jikawo");
        insertActor("Duol kuey TL","0910585266","yoseffekadu@yahoo.com", "Jikawo");
        insertActor("Hoth riek P/technician","0945041164","yoseffekadu@yahoo.com", "Jikawo");
        insertActor("Lol bith Storkeeper","0934280807","yoseffekadu@yahoo.com", "Jikawo");


        insertActor("Select Actor","0911111111","", "Wanthoa");
        insertActor("Kindu Ali Shewu MFP","0917833796","yoseffekadu@yahoo.com", "Wanthoa");
        insertActor("James Yien Ruach  EC","0964580801","yoseffekadu@yahoo.com", "Wanthoa");
        insertActor("Lam Thorow  TL","0916152677","yoseffekadu@yahoo.com", "Wanthoa");
        insertActor("Gatluak Chuaol Bagoang TL","0901792671","yoseffekadu@yahoo.com", "Wanthoa");
        insertActor("Nhial Deng thownt Head","0901791215","yoseffekadu@yahoo.com", "Wanthoa");
        insertActor("NyahokcChoap IEC","0947109825","yoseffekadu@yahoo.com", "Wanthoa");
        insertActor("khor both tut M&E","0910168190","yoseffekadu@yahoo.com", "Wanthoa");
        insertActor("nyuonPal Thich pump technician ","0993922616","yoseffekadu@yahoo.com", "Wanthoa");
        insertActor("Nyaruot Lual Muk Store keeper","0935133932","yoseffekadu@yahoo.com", "Wanthoa");


        insertActor("Select Actor","0911111111","", "Gog");
        insertActor("Okello Anoyi  Vice Head ","0934069242","yoseffekadu@yahoo.com", "Gog");
        insertActor("Omod Omod Gnigwo MFP","0993922355","yoseffekadu@yahoo.com", "Gog");
        insertActor("Omod Obang Ogud  TL","0917317754","yoseffekadu@yahoo.com", "Gog");
        insertActor("Omod Ogodo Obang  TL","0917485199","yoseffekadu@yahoo.com", "Gog");
        insertActor("Abang Kiru Omod  EC","0917748497","yoseffekadu@yahoo.com", "Gog");
        insertActor("Akango Odier  IEC","0917549984","yoseffekadu@yahoo.com", "Gog");
        insertActor("Alamo Adam  Store man ","0905156483","yoseffekadu@yahoo.com", "Gog");
        insertActor("Ojulu Obang  Store Assistance ","0917483429","yoseffekadu@yahoo.com", "Gog");
        insertActor("Abiy  Assefa  M and E","0917485364","yoseffekadu@yahoo.com", "Gog");


        insertActor("Select Actor","0911111111","", "Abobo");
        insertActor("Ojulu obang Medo vice head","0993631877","yoseffekadu@yahoo.com", "Abobo");
        insertActor("G etnet tadele mulu MFP","0918226144","yoseffekadu@yahoo.com", "Abobo");
        insertActor("Omod owar aguwa  E.C","0985284582","yoseffekadu@yahoo.com", "Abobo");
        insertActor("James omod Lero TL","0917524504","yoseffekadu@yahoo.com", "Abobo");
        insertActor("ojulu cham ojay IEC","0954603442","yoseffekadu@yahoo.com", "Abobo");
        insertActor("obang ojulu obang MNE ","0900278834","yoseffekadu@yahoo.com", "Abobo");
        insertActor("omod gora ojulu store keeper","0903007789","yoseffekadu@yahoo.com", "Abobo");
        insertActor("Afework Yayeh kassa pump tecnician","0942345930","yoseffekadu@yahoo.com", "Abobo");


        insertActor("Select Actor","0911111111","", "Gambella Town");
        insertActor("Lual Douth Head","0912686123","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Kinfe Kochito MFP","0911831929","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Zelalem Lema EC","0923034294","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Habtamu Mulugeta IEC","0901613922","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Bugn Bidet TL","0970005552","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Wakgari Deressa TL","0912322432","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Tessema Desalegn TL","0917484790","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Besha Assefa M&E Assistant","0986463469","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Solomon Girma StoreKeeper","0911993502","yoseffekadu@yahoo.com", "Gambella Town");
        insertActor("Tariku Shimeles Assi Storekeeper","0935147853","yoseffekadu@yahoo.com", "Gambella Town");


        insertActor("Select Actor","0911111111","", "Gambella Zuria");
        insertActor("Simon  oman  A/technician ","0912405156","yoseffekadu@yahoo.com", "Gambella Zuria");
        insertActor("Mohammed ASSEN  EC","0917482629","yoseffekadu@yahoo.com", "Gambella Zuria");
        insertActor("Chibi  ojulo  Head ","0993965508","yoseffekadu@yahoo.com", "Gambella Zuria");
        insertActor("Ajulo ojwato  IEC","0917483981","yoseffekadu@yahoo.com", "Gambella Zuria");
        insertActor("Yohannes  mestetu M/E Assistant ","0917112491","yoseffekadu@yahoo.com", "Gambella Zuria");
        insertActor("Ahmed Muhye MFP","0911987961","yoseffekadu@yahoo.com", "Gambella Zuria");
        insertActor("Bekalu Ataldy  Store keeper ","0932025748","yoseffekadu@yahoo.com", "Gambella Zuria");
        insertActor("Okello Nyigwo  Team leader ","0946523928","yoseffekadu@yahoo.com", "Gambella Zuria");


        insertActor("Select Actor","0911111111","", "Itang Special");
        insertActor("Ojulla oguek Vice Head","0917319186","yoseffekadu@yahoo.com", "Itang Special");
        insertActor("Gatkhat duoth MFP","0911567866","yoseffekadu@yahoo.com", "Itang Special");
        insertActor("Muken teka TL","0913298216","yoseffekadu@yahoo.com", "Itang Special");
        insertActor("Okello Ager TL","0932452118","yoseffekadu@yahoo.com", "Itang Special");
        insertActor("Mamo Abeba IEC","0912383821","yoseffekadu@yahoo.com", "Itang Special");
        insertActor("Lual Bol M and E Assis","0912786157","yoseffekadu@yahoo.com", "Itang Special");
        insertActor("Othow owar Store Keeper","0909468222","yoseffekadu@yahoo.com", "Itang Special");
        insertActor("Odiel ojulla pump Technician","0993923170","yoseffekadu@yahoo.com", "Itang Special");


        insertActor("Select Actor","0911111111","", "Lare");
        insertActor("Wichieng Gach Top Head","0931054797","yoseffekadu@yahoo.com", "Lare");
        insertActor("Lual Makuach Chol  MFP","0927560694","yoseffekadu@yahoo.com", "Lare");
        insertActor("Dobuol Deng Dol TL","0912995743","yoseffekadu@yahoo.com", "Lare");
        insertActor("Gebeyew Wodajo Dukan TL","0911817566","yoseffekadu@yahoo.com", "Lare");
        insertActor("Loang Pel Thich TL","0910053705","yoseffekadu@yahoo.com", "Lare");
        insertActor("Zoal Gatkuoth Puk EC","0967091835","yoseffekadu@yahoo.com", "Lare");
        insertActor("Duop Bading Wiw IEC","0977912414","yoseffekadu@yahoo.com", "Lare");
        insertActor("Muktap Deng Chuol M & E","0934071590","yoseffekadu@yahoo.com", "Lare");
        insertActor("Nyoch Gueng  Deng Store Keeper","0930817190","yoseffekadu@yahoo.com", "Lare");
        insertActor("Gach Gatchay  Pump Technician ","0927812707","yoseffekadu@yahoo.com", "Lare");


        insertActor("Select Actor","0911111111","", "Godare");
        insertActor("Petros Yokelo Tefera Head/Vice head","0960888098","yoseffekadu@yahoo.com", "Godare");
        insertActor("Getinet Taye Nigussie MFP","0913987625","yoseffekadu@yahoo.com", "Godare");
        insertActor("Solomon Abitew Gelito TL","0912800828","yoseffekadu@yahoo.com", "Godare");
        insertActor("Dirga Ares  Geni TL","0917300042","yoseffekadu@yahoo.com", "Godare");
        insertActor("Solomon Birhane  Kidane EC","0912432987","yoseffekadu@yahoo.com", "Godare");
        insertActor("Mewuba Ahimed Suidke IEC","0920324039","yoseffekadu@yahoo.com", "Godare");
        insertActor("Mekonon Bekele Mokonon M& E","0940642884","yoseffekadu@yahoo.com", "Godare");
        insertActor("Abiyot Hawariyat Rite Storekeeper","0911954398","yoseffekadu@yahoo.com", "Godare");
        insertActor("Minwuyelet Sitotaw Tolla Ass. Stor kp& Pump tech","0911094764","yoseffekadu@yahoo.com", "Godare");


        insertActor("Select Actor","0911111111","", "Mengeshi");
        insertActor("Getinet Etano Yewala Vice head","0917462556","yoseffekadu@yahoo.com", "Mengeshi");
        insertActor("Deme kejela Gemeda  MFP","0912744312","yoseffekadu@yahoo.com", "Mengeshi");
        insertActor("Asrat Adimassu Asefa TL","0993921510","yoseffekadu@yahoo.com", "Mengeshi");
        insertActor("Baro Fantaw Zeleke TL","0932014027","yoseffekadu@yahoo.com", "Mengeshi");
        insertActor("Tamiru Regassa Turi Ec","0917835052","yoseffekadu@yahoo.com", "Mengeshi");
        insertActor("Andinet Abayneh Gebru  IEC","0912495083","yoseffekadu@yahoo.com", "Mengeshi");
        insertActor("Tesfaye Mekonin Mohammed Storekeeper","0966886558","yoseffekadu@yahoo.com", "Mengeshi");
        insertActor("Esayas Ajira Konkoy Store assi","0934263252","yoseffekadu@yahoo.com", "Mengeshi");
        insertActor("Aklilu Ayele W/Michael M& E Assi","0901607764","yoseffekadu@yahoo.com", "Mengeshi");


        insertActor("Select Actor","0911111111","", "Dimma");
        insertActor("Nyiwagi kwot olimi  H/Head ","0920810823","yoseffekadu@yahoo.com", "Dimma");
        insertActor("Dereje Takele Tesema MFP","0911033686","yoseffekadu@yahoo.com", "Dimma");
        insertActor("Kedir Mohammed Yesuf TL","0918980439","yoseffekadu@yahoo.com", "Dimma");
        insertActor("Ageze Teshome Sulito TL","0985169443","yoseffekadu@yahoo.com", "Dimma");
        insertActor("Habtamu  Gezahagne Worku EC","0965788088","yoseffekadu@yahoo.com", "Dimma");
        insertActor("Adom Okuch Gilo IEC","0936096519","yoseffekadu@yahoo.com", "Dimma");
        insertActor("Omod Gilo Oman M/E","0917959098","yoseffekadu@yahoo.com", "Dimma");
        insertActor("Simachew Geremew Feyissa  Store man ","0923497217","yoseffekadu@yahoo.com", "Dimma");
        insertActor("Alemayehu Alemu Ageye  Store Ass.","0945660811","yoseffekadu@yahoo.com", "Dimma");


        insertActor("Select Actor","0911111111","", "Jor");
        insertActor("josefe agero vice head","0948108521","yoseffekadu@yahoo.com", "Jor");
        insertActor("romo ollok MFP","0949580355","yoseffekadu@yahoo.com", "Jor");
        insertActor("omode obono TL","917901470","yoseffekadu@yahoo.com", "Jor");
        insertActor("okelo alewu EC","0964991614","yoseffekadu@yahoo.com", "Jor");
        insertActor("Okugn zilo IEC","0993922410","yoseffekadu@yahoo.com", "Jor");
        insertActor("Omane utowu M&E","0945656672","yoseffekadu@yahoo.com", "Jor");
        insertActor("Atiye ojalo Store keeper","0909469175","yoseffekadu@yahoo.com", "Jor");
        insertActor("Oukugn aguagn pum techi","0967122746","yoseffekadu@yahoo.com", "Jor");


        // insertActor("1","Yosef","Fekadu","DBM","0911183380","yoseffekadu@yahoo.com","ASO");
    }



    private void insertRegion(String name) {
        ContentValues values = new ContentValues();
        values.put(ContactsDatabase.RegionInfoEntry.COLUMN_REGION_NAME,name);

        long newRowId = mDb.insert(ContactsDatabase.RegionInfoEntry.TABLE_NAME,null,values);
    }

    private void insertZone(String name, String RegionName) {
        ContentValues values = new ContentValues();
        values.put(ContactsDatabase.ZoneInfoEntry.COLUMN_ZONE_NAME,name);
        values.put(ContactsDatabase.ZoneInfoEntry.COLUMN_REGION_NAME,RegionName);

        long newRowId = mDb.insert(ContactsDatabase.ZoneInfoEntry.TABLE_NAME,null,values);

    }

    private void insertDistrict(String name, String ZoneName) {

        ContentValues values = new ContentValues();
        values.put(ContactsDatabase.DistrictInfoEntry.COLUMN_DISTRICT_NAME,name);
        values.put(ContactsDatabase.DistrictInfoEntry.COLUMN_ZONE_NAME,ZoneName);

        long newRowId = mDb.insert(ContactsDatabase.DistrictInfoEntry.TABLE_NAME,null,values);

    }

    private void insertActor(String info, String telephone, String email, String DistrictName) {

        ContentValues values = new ContentValues();
        values.put(ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_INFO,info);
        values.put(ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_PHONE,telephone);
        values.put(ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_EMAIL,email);
        values.put(ContactsDatabase.ActorInfoEntry.COLUMN_DISTRICT_NAME,DistrictName);

        long newRowId = mDb.insert(ContactsDatabase.ActorInfoEntry.TABLE_NAME,null,values);
    }



}
