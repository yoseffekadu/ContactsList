package com.example.Contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends AppCompatActivity {
    Spinner DivisionSP, UpozellaSP, ServiceSP,ActorSP;
    TextView FullName,Location, Position, PhoneNo;
    ImageButton Btn_Call,BtnSms;
    Button Btn_CheckList,BulkEmail,BtnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);


        DivisionSP = findViewById(R.id.regionSP);
        UpozellaSP = findViewById(R.id.zoneSP);
        ServiceSP = findViewById(R.id.districtSP);
        ActorSP = findViewById(R.id.actorSP);
        //Result = findViewById(R.id.result);

        FullName = findViewById(R.id.fullName);
        Location = findViewById(R.id.location);
        Position = findViewById(R.id.position);
        PhoneNo = findViewById(R.id.phoneNo);
        // Email = findViewById(R.id.email);

        Btn_Call = findViewById(R.id.btn_call);
        BtnSms = findViewById(R.id.btn_sms);
        Btn_CheckList = findViewById(R.id.checkList);
        BulkEmail = findViewById(R.id.bulkEmail);
        BtnInfo = findViewById(R.id.btn_info);

        //Region
        final String division[] = {"Select Region","Oromia","Gambella","Benishangul","VectorLink","DEC"};

        //Zone
        final String Oromia[] = {"Select Zone","Horo_Gudro_Wellega", "South_West_Shoa","West_Guji"};
        final String Gambella[] = {"Select Zone","Agnuwa","Nuer","Majang","Itang Special","Gambela Town"};
        final String Benishangul[] = {"Select Zone","Assosa","Kamashi","Metekel","Mao-Komo Special"};
        final String VectorLink[] = {"Select Zone","VectorLink"};
        final String DEC[] = {"Select Zone","DEC"};

        //District
        final String horoGudro[] = {"Select District","Abay Chomen", "Abe Dengoro","Amuru", "Jardega Jarte"};
        final String sourthWestShoa[] ={"Select District","Goro" ,"Ilu" ,"Waliso"};
        final String westGuji[] ={"Select District","Abaya" ,"Gelana" ,"Melka Soda"};

        final String agnuwa[] ={"Select District","Gambella Z" ,"Gog" ,"Abobo" ,"Dimma" ,"Jor"};
        final String nuer[] ={"Select District","Akobo" ,"Jikow","Lare","Makuey","Wanthoa"};
        final String majang[] ={"Select District","Godare","Mengeshi"};
        final String itangSpecial[] ={"Select District","Itang Special"};
        final String gambellaTown[] ={"Select District","Gambella Town"};

        final String assosa[] ={"Select District","Homosha","Menge","Sherkole","Bambasi","Assosa","Oda Buldigilu","Kumruk"};
        final String kamashi[] ={"Select District","Belo Jegenfoy","Agalo Mete","Kamashi","Yaso"};
        final String metekel[] ={"Select District","Mandura","Bullen","Wombera","Dangure","Dibate","Guba","Pawi Woreda"};
        final String maoKomoSpecial[] ={"Select District","Mao-Komo Special"};

        final String VectorLinkStaff[] ={"Select District","VectorLink Staff"};

        final String DECs[] ={"Select District","DEC Data Entry Cerks"};

/*

        final List<Actor> actorListAssosa = new ArrayList<>();
        Actor actor1000 = new Actor("Select Actor",null,"", null,null);
        Actor actor1 = new Actor("ateyib abdurahim","Assosa","MFP","0915931332","yoseffekadu@yahoo.com");
        Actor actor2 = new Actor("hunyalew wase","Assosa","TL","0913960268","yoseffekadu@yahoo.com");
        Actor actor3 = new Actor("Daniel moti","Assosa","TL","0913155542","yoseffekadu@yahoo.com");
        Actor actor4 = new Actor("Eshetu ambaw","Assosa","TL","0917858885","yoseffekadu@yahoo.com");
        Actor actor5 = new Actor("Degu desta","Assosa","TL","0913689383","yoseffekadu@yahoo.com");
        Actor actor6 = new Actor("Endale yimer","Assosa","EC","0917858770","yoseffekadu@yahoo.com");
        Actor actor7 = new Actor("Meka abdulwahid","Assosa","vice Head","0910926432","yoseffekadu@yahoo.com");
        Actor actor8 = new Actor("molla hailu","Assosa","M&E","0912477875","yoseffekadu@yahoo.com");
        Actor actor9 = new Actor("Bederedin mussa","Assosa","IEC","0913507119","yoseffekadu@yahoo.com");
        Actor actor10 = new Actor("gudina gemju","Assosa","STOREKEEPER","0917622525","yoseffekadu@yahoo.com");
        Actor actor11 = new Actor("Michael birhanu ","Assosa","STORE ASSISTANT","0917456001","yoseffekadu@yahoo.com");
        Actor actor12 = new Actor("geleta bekele","Assosa","SEASONAL SUPERVISOR","0917851060","yoseffekadu@yahoo.com");
        Actor actor13 = new Actor("setemariam derese","Assosa","SEASONAL SUPERVISOR","0925339192","yoseffekadu@yahoo.com");

        final List<Actor> actorListBambasi= new ArrayList<>();
        Actor actor1001 = new Actor("Select Actor",null,"", null,null);
        Actor actor14 = new Actor("Ebrahim Ahmed","Bambasi","M&E","0917178160","yoseffekadu@yahoo.com");
        Actor actor15 = new Actor("Abdulmalik Dino","Bambasi","TL","0983908354","yoseffekadu@yahoo.com");
        Actor actor16 = new Actor("Essa Hojele","Bambasi","TL","0917171516","yoseffekadu@yahoo.com");
        Actor actor17 = new Actor("Abduselam Almajub","Bambasi","Vice Head","0965726501","yoseffekadu@yahoo.com");
        Actor actor18 = new Actor("Abdulwahid Azuber","Bambasi","IEC","0917176015","yoseffekadu@yahoo.com");
        Actor actor19 = new Actor("Tadele Admasu","Bambasi","EC","0917171598","yoseffekadu@yahoo.com");
        Actor actor20 = new Actor("Wubayehu Missa","Bambasi","MFP","0920430581","yoseffekadu@yahoo.com");
        Actor actor21 = new Actor("Hamidi Ali","Bambasi","STOREKEEPER","0917178878","yoseffekadu@yahoo.com");
        Actor actor22 = new Actor("Jemal Mohamed","Bambasi","STORE ASSISTANT","0917710496","yoseffekadu@yahoo.com");
        Actor actor23 = new Actor("Desalegn Alga Berafo","Bambasi","SEASONAL SUPERVISOR","0910436189","yoseffekadu@yahoo.com");

        final List<Actor> actorListKumruk = new ArrayList<>();
        Actor actor1002 = new Actor("Select Actor",null,"", null,null);
        Actor actor24 = new Actor("SOLOMON   LEMMA","Kurmuk","TL","0913367388","yoseffekadu@yahoo.com");
        Actor actor25 = new Actor("ARARESA     TURA","Kurmuk","IEC","0941320285","yoseffekadu@yahoo.com");
        Actor actor26 = new Actor("ABDIN MUHAMED","Kurmuk","MFP","0949505636","yoseffekadu@yahoo.com");
        Actor actor27 = new Actor("ZINABU TOLESSA","Kurmuk","EC","0919480375","yoseffekadu@yahoo.com");
        Actor actor28 = new Actor("Mamo Tesema ","Kurmuk","M&E","0936943244","yoseffekadu@yahoo.com");
        Actor actor29 = new Actor("Asadik Hamid ","Kurmuk","STORE ASSISTANT","0942432773","yoseffekadu@yahoo.com");
        Actor actor30 = new Actor("Mohammed Suleiman","Kurmuk","STOREKEEPER","0921840173","yoseffekadu@yahoo.com");
        Actor actor31 = new Actor("Mussa Abdurehim","Kurmuk","Head","0917422148","yoseffekadu@yahoo.com");

        final List<Actor> actorListHomosha = new ArrayList<>();
        Actor actor1003 = new Actor("Select Actor",null,"", null,null);
        Actor actor32 = new Actor("Salie Hamza","Homosha","TL","0917178442","yoseffekadu@yahoo.com");
        Actor actor33 = new Actor("Mehammed Esmael","Homosha","TL","0917709948","yoseffekadu@yahoo.com");
        Actor actor34 = new Actor("Tariku Tasisa","Homosha","EC","0917893617","yoseffekadu@yahoo.com");
        Actor actor35 = new Actor("Gemechu Adamu","Homosha","M&E","0985019366","yoseffekadu@yahoo.com");
        Actor actor36 = new Actor("Abedurehim Ahmed","Homosha","IEC","0913989570","yoseffekadu@yahoo.com");
        Actor actor37 = new Actor("Areshd Mussa","Homosha","STOREKEEPER","0939821307","yoseffekadu@yahoo.com");
        Actor actor38 = new Actor("Mehamud Edris ","Homosha","STORE ASSISTANT","0933215308","yoseffekadu@yahoo.com");
        Actor actor39 = new Actor("Abdu Hussen","Homosha","MFP","0910111240","yoseffekadu@yahoo.com");
        Actor actor40 = new Actor("Abdulkerim Mehammed","Homosha","Vice Head","0912404644","yoseffekadu@yahoo.com");

        final List<Actor> actorListMenge = new ArrayList<>();
        Actor actor1004 = new Actor("Select Actor",null,"", null,null);
        Actor actor41 = new Actor("OMER NASIR","Menge","Head","0913500616","yoseffekadu@yahoo.com");
        Actor actor42 = new Actor("MULUALEM AMBISSA ","Menge","MFP","0915926655","yoseffekadu@yahoo.com");
        Actor actor43 = new Actor("BULICHA WELTAJI","Menge","EC","0949046410","yoseffekadu@yahoo.com");
        Actor actor44 = new Actor("GETACHEW YITAYI","Menge","TL","0912652292","yoseffekadu@yahoo.com");
        Actor actor45 = new Actor("SURANI ANAZIR","Menge","IEC","0913132462","yoseffekadu@yahoo.com");
        Actor actor46 = new Actor("SELEMAN MUSSA","Menge","TL","0917491178","yoseffekadu@yahoo.com");
        Actor actor47 = new Actor("MUHTASIM MERKENI","Menge","TL","0913313234","yoseffekadu@yahoo.com");
        Actor actor48 = new Actor("ADISA FENTAW","Menge","TL","0922210569","yoseffekadu@yahoo.com");
        Actor actor49 = new Actor("TEFER GERBI","Menge","M&E","0917419542","yoseffekadu@yahoo.com");
        Actor actor50 = new Actor("ADEM AJELI BELA ","Menge","STORE ASSISTANT","0983458382","yoseffekadu@yahoo.com");
        Actor actor51 = new Actor("ATEYIB FILEL FETUR","Menge","STOREKEEPER","0942428786","yoseffekadu@yahoo.com");

        final List<Actor> actorListOda = new ArrayList<>();
        Actor actor1005 = new Actor("Select Actor",null,"", null,null);
        Actor actor52 = new Actor("Awod seleman","Oda Buldigilu","Vice Head","0911599444","yoseffekadu@yahoo.com");
        Actor actor53 = new Actor("Kelbesse Akuma","Oda Buldigilu","MFP","0936902668","yoseffekadu@yahoo.com");
        Actor actor54 = new Actor("Alhji Atyeb ","Oda Buldigilu","EC","0932273700","yoseffekadu@yahoo.com");
        Actor actor55 = new Actor("Mebiratu Baly","Oda Buldigilu","IEC","0917430374","yoseffekadu@yahoo.com");
        Actor actor56 = new Actor("Walid Asamani","Oda Buldigilu","M&E","0949504865","yoseffekadu@yahoo.com");
        Actor actor57 = new Actor("Awod Ousman","Oda Buldigilu","TL","0917890102","yoseffekadu@yahoo.com");
        Actor actor58 = new Actor("Tigestu Shefa","Oda Buldigilu","TL","0917458634","yoseffekadu@yahoo.com");
        Actor actor59 = new Actor("Abdela Husen","Oda Buldigilu","TL","0900870451","yoseffekadu@yahoo.com");
        Actor actor60 = new Actor("Ashagi Ahmed","Oda Buldigilu","STORE ASSISTANT","","yoseffekadu@yahoo.com");
        Actor actor61 = new Actor("Ahmed anur","Oda Buldigilu","STOREKEEPER","","yoseffekadu@yahoo.com");

        final List<Actor> actorListSherkole = new ArrayList<>();
        Actor actor1006 = new Actor("Select Actor",null,"", null,null);
        Actor actor62 = new Actor("Aumer Seifedin","Sherkole","TL","0922231554","yoseffekadu@yahoo.com");
        Actor actor63 = new Actor("Ashenfi Abate","Sherkole","TL","0911369190","yoseffekadu@yahoo.com");
        Actor actor64 = new Actor("Adise Feleke","Sherkole","MFP","0917170724","yoseffekadu@yahoo.com");
        Actor actor65 = new Actor("Endris Hassen","Sherkole","EC","0928587496","yoseffekadu@yahoo.com");
        Actor actor66 = new Actor("Temesgen Wedaju","Sherkole","IEC","0910017398","yoseffekadu@yahoo.com");
        Actor actor67 = new Actor("Shimels Getahun","Sherkole","M&E","0922147734","yoseffekadu@yahoo.com");
        Actor actor68 = new Actor("Muhamed Hassen","Sherkole","Vice Head","0902171167","yoseffekadu@yahoo.com");
        Actor actor69 = new Actor("Abera Terefe","Sherkole","STORE ASSISTANT","0938451314","yoseffekadu@yahoo.com");
        Actor actor70 = new Actor("Brhanu Gelawe","Sherkole","STOREKEEPER","0913353015","yoseffekadu@yahoo.com");

        final List<Actor> actorListAgalo = new ArrayList<>();
        Actor actor1007 = new Actor("Select Actor",null,"", null,null);
        Actor actor71 = new Actor("Tamiru Hambisa ","Agalo Mete","EC","0917045000","yoseffekadu@yahoo.com");
        Actor actor72 = new Actor("Gemechu Dessalegn Jara","Agalo Mete","MFP","0946531264","yoseffekadu@yahoo.com");
        Actor actor73 = new Actor("Geneti Anbesa Kumbale","Agalo Mete","STORE ASSISTANT","0946531264","yoseffekadu@yahoo.com");
        Actor actor74 = new Actor("Demitu Wako Shibeshi","Agalo Mete","STOREKEEPER","0917418699","yoseffekadu@yahoo.com");
        Actor actor75 = new Actor("Hunde Kebede Obsi","Agalo Mete","IEC","0915585820","yoseffekadu@yahoo.com");
        Actor actor76 = new Actor("Limu Polino Bogale","Agalo Mete","Vice Head","0915915505","yoseffekadu@yahoo.com");
        Actor actor77 = new Actor("Shimels Abebaw Asenake","Agalo Mete","TL","0996248312","yoseffekadu@yahoo.com");
        Actor actor78 = new Actor("Megerssa Melka Boso","Agalo Mete","M&E","0919063100","yoseffekadu@yahoo.com");

        final List<Actor> actorListBelo = new ArrayList<>();
        Actor actor1008 = new Actor("Select Actor",null,"", null,null);
        Actor actor79 = new Actor("Arega Beyane","Belo Jegenfoy","Vice Head","0913959429","yoseffekadu@yahoo.com");
        Actor actor80 = new Actor("Keros Habte","Belo Jegenfoy","MFP","0900875632","yoseffekadu@yahoo.com");
        Actor actor81 = new Actor("Abebech Aregata","Belo Jegenfoy","TL","0910531192","yoseffekadu@yahoo.com");
        Actor actor82 = new Actor("Tamane Hambissa","Belo Jegenfoy","EC","0917418033","yoseffekadu@yahoo.com");
        Actor actor83 = new Actor("Tadesse Fayissa","Belo Jegenfoy","IEC","0911585621","yoseffekadu@yahoo.com");
        Actor actor84 = new Actor("Mulgeta Shiferaw","Belo Jegenfoy","STOREKEEPER","0921674767","yoseffekadu@yahoo.com");
        Actor actor85 = new Actor("Shibru Mitiku","Belo Jegenfoy","STORE ASSISTANT","0967629813","yoseffekadu@yahoo.com");
        Actor actor86 = new Actor("Baweke Mengesha","Belo Jegenfoy","M&E","0911585235","yoseffekadu@yahoo.com");

        final List<Actor> actorListKamashi = new ArrayList<>();
        Actor actor1009 = new Actor("Select Actor",null,"", null,null);
        Actor actor87 = new Actor("Firdu Melekamu Wubale","Kamashi","EC","","yoseffekadu@yahoo.com");
        Actor actor88 = new Actor("Genetu Tekalegn Ferde","Kamashi","MFP","","yoseffekadu@yahoo.com");
        Actor actor89 = new Actor("Gizachew Belete Awoke","Kamashi","M&E","","yoseffekadu@yahoo.com");
        Actor actor90 = new Actor("Gemeches Girma Kidanie","Kamashi","TL","","yoseffekadu@yahoo.com");
        Actor actor91 = new Actor("Yasesa Heka Mese","Kamashi","Vice Head","","yoseffekadu@yahoo.com");
        Actor actor92 = new Actor("Adugna Fenta Belaye","Kamashi","IEC","","yoseffekadu@yahoo.com");
        Actor actor93 = new Actor("Mandi Disasa","Kamashi","STORE ASSISTANT","","yoseffekadu@yahoo.com");
        Actor actor94 = new Actor("Gemeda Abate ","Kamashi","STOREKEEPER","","yoseffekadu@yahoo.com");

        final List<Actor> actorListSedal = new ArrayList<>();
        Actor actor1010 = new Actor("Select Actor",null,"", null,null);
        Actor actor95 = new Actor("Kawe Tilinti","Sedal","MFP","0917229316","yoseffekadu@yahoo.com");
        Actor actor96 = new Actor("Akalu Bagdid","Sedal","TL","0917740587","yoseffekadu@yahoo.com");
        Actor actor97 = new Actor("Takele Biratu","Sedal","IEC","0917423811","yoseffekadu@yahoo.com");
        Actor actor98 = new Actor("Fikadu Wondimnew","Sedal","EC","0912840611","yoseffekadu@yahoo.com");
        Actor actor99 = new Actor("Teshome Keno","Sedal","Vice Head","0924970488","yoseffekadu@yahoo.com");
        Actor actor100 = new Actor("Netsanet Nigatu","Sedal","M&E","0936357994","yoseffekadu@yahoo.com");
        Actor actor101 = new Actor("Melka Chali","Sedal","STORE ASSISTANT","0921836809","yoseffekadu@yahoo.com");
        Actor actor102 = new Actor("Sijar Negash","Sedal","STOREKEEPER","0979599604","yoseffekadu@yahoo.com");

        final List<Actor> actorListYaso = new ArrayList<>();
        Actor actor1011 = new Actor("Select Actor",null,"", null,null);
        Actor actor103 = new Actor("Kebede Yohanis","Yaso","MFP","0942097083","yoseffekadu@yahoo.com");
        Actor actor104 = new Actor("Asfaw Berasa","Yaso","EC","0932266405","yoseffekadu@yahoo.com");
        Actor actor105 = new Actor("Shibabaw Adamu","Yaso","TL","0993702291","yoseffekadu@yahoo.com");
        Actor actor106 = new Actor("Bekelecho Jote","Yaso","IEC","0917894456","yoseffekadu@yahoo.com");
        Actor actor107 = new Actor("Niguse W/Mariam","Yaso","Vice Head","0915915732","yoseffekadu@yahoo.com");
        Actor actor108 = new Actor("Atsede Basha","Yaso","STOREKEEPER","0922206538","yoseffekadu@yahoo.com");
        Actor actor109 = new Actor("Shumet Zeleke","Yaso","M&E","0923006988","yoseffekadu@yahoo.com");

        final List<Actor> actorListBullen = new ArrayList<>();
        Actor actor1012 = new Actor("Select Actor",null,"", null,null);
        Actor actor110 = new Actor("Senbeta Abebe","Bullen","EC","0927651743","yoseffekadu@yahoo.com");
        Actor actor111 = new Actor("Teshale Beyene","Bullen","M&E","0928587291","yoseffekadu@yahoo.com");
        Actor actor112 = new Actor("Lemessa  Birehanu","Bullen","TL","0982980504","yoseffekadu@yahoo.com");
        Actor actor113 = new Actor("Meberatu Beguno","Bullen","Vice Head","0941784165","yoseffekadu@yahoo.com");
        Actor actor114 = new Actor("Hika mekonnen","Bullen","TL","0904328164","yoseffekadu@yahoo.com");
        Actor actor115 = new Actor("Asefa Abakara","Bullen","STORE ASSISTANT","0913930042","yoseffekadu@yahoo.com");
        Actor actor116 = new Actor("Kenaw Jaleta","Bullen","IEC","0921115809","yoseffekadu@yahoo.com");
        Actor actor117 = new Actor("Kumera Fikadu","Bullen","STOREKEEPER","0921114359","yoseffekadu@yahoo.com");
        Actor actor118 = new Actor("Mamo Tolesa","Bullen","MFP","0989427580","yoseffekadu@yahoo.com");

        final List<Actor> actorListDangur = new ArrayList<>();
        Actor actor1013 = new Actor("Select Actor",null,"", null,null);
        Actor actor119 = new Actor("Atinafu Aja","Dangur","Vice Head","0913523062","yoseffekadu@yahoo.com");
        Actor actor120 = new Actor("Aschale Ayana","Dangur","IEC","0918744343","yoseffekadu@yahoo.com");
        Actor actor121 = new Actor("Hymanot Gebeyehu","Dangur","MFP","0912287739","yoseffekadu@yahoo.com");
        Actor actor122 = new Actor("Habtie Mengesha","Dangur","EC","0913967259","yoseffekadu@yahoo.com");
        Actor actor123 = new Actor("Chalachew Abdisa","Dangur","TL","0917182240","yoseffekadu@yahoo.com");
        Actor actor124 = new Actor("Fikadu Teso","Dangur","TL","0963791284","yoseffekadu@yahoo.com");
        Actor actor125 = new Actor("Andargachew Shibabaw","Dangur","M&E","0911390399","yoseffekadu@yahoo.com");
        Actor actor126 = new Actor("Birhanu Adane","Dangur","STORE ASSISTANT","0917181940","yoseffekadu@yahoo.com");
        Actor actor127 = new Actor("Essayase Shitu","Dangur","STOREKEEPER","0918745127","yoseffekadu@yahoo.com");

        final List<Actor> actorListDibate = new ArrayList<>();
        Actor actor1014 = new Actor("Select Actor",null,"", null,null);
        Actor actor128 = new Actor("Dergu Chaltie","Dibate","STOREKEEPER","0927654722","yoseffekadu@yahoo.com");
        Actor actor129 = new Actor("Ashenafi Ertiban","Dibate","STORE ASSISTANT","0938848231","yoseffekadu@yahoo.com");
        Actor actor130= new Actor("Fufa Debelo","Dibate","TL","0913628038","yoseffekadu@yahoo.com");
        Actor actor131 = new Actor("Mulugeta Tadele","Dibate","TL","0906285414","yoseffekadu@yahoo.com");
        Actor actor132 = new Actor("Adugna Negash","Dibate","EC","0915926873","yoseffekadu@yahoo.com");
        Actor actor133 = new Actor("Desalegn Haile","Dibate","M&E","0961765928","yoseffekadu@yahoo.com");
        Actor actor134 = new Actor("Getie Assaye","Dibate","MFP","0917182452","yoseffekadu@yahoo.com");
        Actor actor135= new Actor("Habtamu Adgo","Dibate","IEC","0915863488","yoseffekadu@yahoo.com");
        Actor actor136 = new Actor("Babie Anbesa","Dibate","Vice Head","0921572247","yoseffekadu@yahoo.com");

        final List<Actor> actorListGuba = new ArrayList<>();
        Actor actor1015 = new Actor("Select Actor",null,"", null,null);
        Actor actor137 = new Actor("dawude endrise","Guba","SEASONAL SUPERVISOR","0918744760","yoseffekadu@yahoo.com");
        Actor actor138 = new Actor("asalfew akelilu","Guba","SEASONAL SUPERVISOR","0922229432","yoseffekadu@yahoo.com");
        Actor actor139 = new Actor("Ayele Emru","Guba","SEASONAL SUPERVISOR","0937415613","yoseffekadu@yahoo.com");
        Actor actor140 = new Actor("Juma Abdurohman","Guba","SEASONAL SUPERVISOR","0931869799","yoseffekadu@yahoo.com");

        final List<Actor> actorListMandurea = new ArrayList<>();
        Actor actor1016 = new Actor("Select Actor",null,"", null,null);
        Actor actor141 = new Actor("Ethiopia Arega ","Mandurea","M&E","0913200584","yoseffekadu@yahoo.com");
        Actor actor142 = new Actor("Melaku Algemer","Mandurea","Vice Head","0911349722","yoseffekadu@yahoo.com");
        Actor actor143 = new Actor("Muhamed Koacho","Mandurea","IEC","0917622115","yoseffekadu@yahoo.com");
        Actor actor144 = new Actor("Bekalu Alemnew","Mandurea","TL","0928451996","yoseffekadu@yahoo.com");
        Actor actor145 = new Actor("Yusuf Adem","Mandurea","MFP","0918530783","yoseffekadu@yahoo.com");
        Actor actor146 = new Actor("Adugna Geleta","Mandurea","EC","0920276237","yoseffekadu@yahoo.com");
        Actor actor147 = new Actor("Tadele Babe","Mandurea","TL","0913110057","yoseffekadu@yahoo.com");
        Actor actor148 = new Actor("Amare Semahegn","Mandurea","STOREKEEPER","0921115632","yoseffekadu@yahoo.com");
        Actor actor149 = new Actor("Adam Abebe","Mandurea","STORE ASSISTANT","0991879223","yoseffekadu@yahoo.com");

        final List<Actor> actorListPawe = new ArrayList<>();
        Actor actor1017 = new Actor("Select Actor",null,"", null,null);
        Actor actor150 = new Actor("Gizachew Laloto","Pawe","Vice head ","0920159024","yoseffekadu@yahoo.com");
        Actor actor151 = new Actor("Smeneh Sintayehu","Pawe","MFP","0913986637","yoseffekadu@yahoo.com");
        Actor actor152 = new Actor("Muluken Awaro","Pawe","IEC","0913849944","yoseffekadu@yahoo.com");
        Actor actor153 = new Actor("Amsalu Bishaw ","Pawe","EC","0921278981","yoseffekadu@yahoo.com");
        Actor actor154 = new Actor("Fentahun Addis","Pawe","TL","0915926435","yoseffekadu@yahoo.com");
        Actor actor155 = new Actor("Tesfaye Dibissa","Pawe","TL","","yoseffekadu@yahoo.com");

        final List<Actor> actorListWombera = new ArrayList<>();
        Actor actor1018 = new Actor("Select Actor",null,"", null,null);
        Actor actor156 = new Actor("Basha Tilahun","Wombera","TL","0945284590","yoseffekadu@yahoo.com");
        Actor actor157 = new Actor("Gebre Temesgen ","Wombera","TL","0921828711","yoseffekadu@yahoo.com");
        Actor actor158 = new Actor("Abiyot lidi","Wombera","TL","0919641871","yoseffekadu@yahoo.com");
        Actor actor159 = new Actor("Habtamu Deressa ","Wombera","TL","0920771135","yoseffekadu@yahoo.com");
        Actor actor160 = new Actor("Fasikaw Abye","Wombera","TL","0931159271","yoseffekadu@yahoo.com");
        Actor actor161 = new Actor("Kumera  Mamo ","Wombera","MFP","0917141305","yoseffekadu@yahoo.com");
        Actor actor162 = new Actor("Amsaye Ambisa","Wombera","STOREKEEPER","0908994622","yoseffekadu@yahoo.com");
        Actor actor163 = new Actor("Asfaw Abebe","Wombera","STORE ASSISTANT","0929273697","yoseffekadu@yahoo.com");
        Actor actor164 = new Actor("Adisu Abose","Wombera","M&E","0921646546","yoseffekadu@yahoo.com");
        Actor actor165 = new Actor("Bezabih Fufa","Wombera","M&E","0909453594","yoseffekadu@yahoo.com");
        Actor actor166 = new Actor("Aschale Gesese","Wombera","M&E","0937697732","yoseffekadu@yahoo.com");
        Actor actor167 = new Actor("Megertu Geleta","Wombera","M&E","0972499456","yoseffekadu@yahoo.com");
        Actor actor168 = new Actor("Mulualem Amsalu","Wombera","M&E","0946162719","yoseffekadu@yahoo.com");

        final List<Actor> actorListAbay = new ArrayList<>();
        Actor actor1019 = new Actor("Select Actor",null,"", null,null);
        Actor actor169 = new Actor("Merga Regasa Ararso","Abay_Chomen","Vice head","0923801289","yoseffekadu@yahoo.com");
        Actor actor170 = new Actor("Motuma Elias Teso","Abay_Chomen","MFP","0935878145","yoseffekadu@yahoo.com");
        Actor actor171 = new Actor("Gedefa Hunde Yadeta ","Abay_Chomen","EC","0911659693","yoseffekadu@yahoo.com");
        Actor actor172 = new Actor("Silashi Mulugeta Tegegn","Abay_Chomen","TL","0913048437","yoseffekadu@yahoo.com");
        Actor actor173 = new Actor("Bayisa Amenu Dugasa","Abay_Chomen","TL","0911174963","yoseffekadu@yahoo.com");
        Actor actor174 = new Actor("Gemechu Temesgen Mekuriya","Abay_Chomen","M&E","0911981946","yoseffekadu@yahoo.com");
        Actor actor175 = new Actor("Garomsa Tiki Wayesa","Abay_Chomen","IEC","0936933197","yoseffekadu@yahoo.com");
        Actor actor176 = new Actor("Beshana Ganfure Kitila","Abay_Chomen","STOREKEEPER","0917100032","yoseffekadu@yahoo.com");
        Actor actor177 = new Actor("Ibsa Begna Desta","Abay_Chomen","STORE ASSISTANT","0917716643","yoseffekadu@yahoo.com");

        final List<Actor> actorListAbe = new ArrayList<>();
        Actor actor1020 = new Actor("Select Actor",null,"", null,null);
        Actor actor178 = new Actor("Mulugeta Gudeta","Abe_Dengoro","MFP","0911388280","yoseffekadu@yahoo.com");
        Actor actor179 = new Actor("Tesfaye Keno","Abe_Dengoro","IEC","0920418321","yoseffekadu@yahoo.com");
        Actor actor180 = new Actor("Lamesa Tilahun","Abe_Dengoro","EC","0926275200","yoseffekadu@yahoo.com");
        Actor actor181 = new Actor("Dinaol Tiku","Abe_Dengoro","Vice Head","0921616916","yoseffekadu@yahoo.com");
        Actor actor182 = new Actor("Duguma Wagari","Abe_Dengoro","TL","0917842690","yoseffekadu@yahoo.com");
        Actor actor183 = new Actor("Soresa   Mokonin","Abe_Dengoro","TL","0922219731","yoseffekadu@yahoo.com");
        Actor actor184 = new Actor("Desaleny Tilahun","Abe_Dengoro","TL","0972555289","yoseffekadu@yahoo.com");
        Actor actor185 = new Actor("Gemechis Abdena","Abe_Dengoro","TL","0992979401","yoseffekadu@yahoo.com");
        Actor actor186 = new Actor("Alemu Kajela","Abe_Dengoro","M&E","0993924841","yoseffekadu@yahoo.com");
        Actor actor187 = new Actor("Chimdesa Gedefa","Abe_Dengoro","STOREKEEPER","0917080065","yoseffekadu@yahoo.com");
        Actor actor188 = new Actor("Bashir Kasahun","Abe_Dengoro","STORE ASSISTANT","","yoseffekadu@yahoo.com");

        final List<Actor> actorListAmuru = new ArrayList<>();
        Actor actor1021 = new Actor("Select Actor",null,"", null,null);
        Actor actor189 = new Actor("Awelu Mohamed","Amuru","MFP","0913370382","yoseffekadu@yahoo.com");
        Actor actor190 = new Actor("Tolosa Abebe","Amuru","TL","0922225722","yoseffekadu@yahoo.com");
        Actor actor191 = new Actor("Nemera Belay","Amuru","EC","0917822571","yoseffekadu@yahoo.com");
        Actor actor192 = new Actor("Merga Wakjira","Amuru","IEC","","yoseffekadu@yahoo.com");
        Actor actor193 = new Actor("Mulugeta Adunya","Amuru","M&E","0910610860","yoseffekadu@yahoo.com");
        Actor actor194 = new Actor("Moti Gobena","Amuru","Vice Head","0964207739","yoseffekadu@yahoo.com");
        Actor actor195 = new Actor("Gedefa Negash","Amuru","STOREKEEPER","","yoseffekadu@yahoo.com");
        Actor actor196 = new Actor("Habtamu Desalegn","Amuru","STORE ASSISTANT","0917670704","yoseffekadu@yahoo.com");

        final List<Actor> actorListJardega = new ArrayList<>();
        Actor actor1022 = new Actor("Select Actor",null,"", null,null);
        Actor actor197 = new Actor("Tolassa Bekana","Jardega_Jarte","MFP","0917431758","yoseffekadu@yahoo.com");
        Actor actor198 = new Actor("Gutu Akuma","Jardega_Jarte","IEC","0921199194","yoseffekadu@yahoo.com");
        Actor actor199 = new Actor("Alamayehu Wako","Jardega_Jarte","Vice Head","0922254925","yoseffekadu@yahoo.com");
        Actor actor200 = new Actor("Boka Desa","Jardega_Jarte","TL","0920021173","yoseffekadu@yahoo.com");
        Actor actor201 = new Actor("Tessema  Belay","Jardega_Jarte","EC","0926141251","yoseffekadu@yahoo.com");
        Actor actor202 = new Actor("Getu Tibabu","Jardega_Jarte","M&E","0935882795","yoseffekadu@yahoo.com");
        Actor actor204 = new Actor("wandimu Amsalu","Jardega_Jarte","STORE ASSISTANT","0920075417","yoseffekadu@yahoo.com");

        final List<Actor> actorListGoro = new ArrayList<>();
        Actor actor1023 = new Actor("Select Actor",null,"", null,null);
        Actor actor205 = new Actor("Gemmech Taye","Goro","Head","0934219157","yoseffekadu@yahoo.com");
        Actor actor206 = new Actor("Alemayehu Muleta","Goro","MFP","0910704012","yoseffekadu@yahoo.com");
        Actor actor207 = new Actor("Birhanu Alemu","Goro","IEC","0911334938","yoseffekadu@yahoo.com");
        Actor actor208 = new Actor("Ebba Kebede","Goro","EC","0945915371","yoseffekadu@yahoo.com");
        Actor actor209 = new Actor("Memberu Atomsa","Goro","M&E","0911879356","yoseffekadu@yahoo.com");
        Actor actor210 = new Actor("Teshele Dugasa","Goro","STORE ASSISTANT","0920304662","yoseffekadu@yahoo.com");
        Actor actor211 = new Actor("Melese Alemu","Goro","STOREKEEPER","0910644581","yoseffekadu@yahoo.com");

        final List<Actor> actorListIlu = new ArrayList<>();
        Actor actor1024 = new Actor("Select Actor",null,"", null,null);
        Actor actor212 = new Actor("Bekele Dinka","Ilu","MFP","0913128790","yoseffekadu@yahoo.com");
        Actor actor213 = new Actor("Bewunatu Asefa","Ilu","TL","0913911699","yoseffekadu@yahoo.com");
        Actor actor214 = new Actor("Birhane Alemu","Ilu","TL","0910715112","yoseffekadu@yahoo.com");
        Actor actor215 = new Actor("Laye Lemecha","Ilu","IEC","0911836810","yoseffekadu@yahoo.com");
        Actor actor216 = new Actor("Gelana seid","Ilu","EC","0993925741","yoseffekadu@yahoo.com");
        Actor actor217 = new Actor("Yoseph  Bogale","Ilu","STORE ASSISTANT","0912957560","yoseffekadu@yahoo.com");
        Actor actor218 = new Actor("Mekonen Dessie","Ilu","M&E","0960182384","yoseffekadu@yahoo.com");
        Actor actor219 = new Actor("Mengistu Bekana","Ilu","STORE ASSISTANT","0933039669","yoseffekadu@yahoo.com");
        Actor actor220 = new Actor("Mitiku Degefa","Ilu","Head","0912063156","yoseffekadu@yahoo.com");

        final List<Actor> actorListWaliso = new ArrayList<>();
        Actor actor1025 = new Actor("Select Actor",null,"", null,null);
        Actor actor221 = new Actor("Mekoniin Obsu","Waliso","Head","0913944687","yoseffekadu@yahoo.com");
        Actor actor222 = new Actor("Yonas  Etana","Waliso","MFP","0911334764","yoseffekadu@yahoo.com");
        Actor actor223 = new Actor("Bullo Fajii","Waliso","IEC","0911334724","yoseffekadu@yahoo.com");
        Actor actor224 = new Actor("Damise  Gamachu","Waliso","TL","0911742696","yoseffekadu@yahoo.com");
        Actor actor225 = new Actor("Emana  Lalisa","Waliso","TL","0910850687","yoseffekadu@yahoo.com");
        Actor actor226 = new Actor("Jenenus  Birasa","Waliso","EC","0947526556","yoseffekadu@yahoo.com");
        Actor actor227 = new Actor("Shiferew  Abera","Waliso","M&E","0912820798","yoseffekadu@yahoo.com");
        Actor actor228 = new Actor("Dagaga  Gemada","Waliso","STOREKEEPER","0920964512","yoseffekadu@yahoo.com");
        Actor actor229 = new Actor("Kidane  Wake","Waliso","STORE ASSISTANT","0985438625","yoseffekadu@yahoo.com");


        // Oromia


        final List<Actor> actorListAbaya = new ArrayList<>();
        Actor actor1026 = new Actor("Select Actor",null,"", null,null);
        Actor actor230 = new Actor("Getahun Zenebe","Abaya","MFP","0910004867","yoseffekadu@yahoo.com");
        Actor actor231 = new Actor("Barsinet Geromu","Abaya","TL","0913711173","yoseffekadu@yahoo.com");
        Actor actor232 = new Actor("Amarech Zenebe","Abaya","TL","0913422260","yoseffekadu@yahoo.com");
        Actor actor233 = new Actor("Hiluf G/Tekle","Abaya","EC","0913027918","yoseffekadu@yahoo.com");
        Actor actor234 = new Actor("Alemayehu Admasu","Abaya","IEC","0904418008","yoseffekadu@yahoo.com");
        Actor actor235 = new Actor("Tesfaye Negasa","Abaya","M&E Asistant","0926038020","yoseffekadu@yahoo.com");


        final List<Actor> actorListMelka = new ArrayList<>();
        Actor actor1027 = new Actor("Select Actor",null,"", null,null);
        Actor actor236 = new Actor("Sintayo Kore","Melka_Soda","Store assistant","0993924219","yoseffekadu@yahoo.com");
        Actor actor237 = new Actor("Molu Tadese","Melka_Soda","Storekeeper","0916514591","yoseffekadu@yahoo.com");
        Actor actor238 = new Actor("Ararso Ganale","Melka_Soda","TL","0916423728","yoseffekadu@yahoo.com");
        Actor actor239 = new Actor("Danbobi Borame","Melka_Soda","Vice Head","0900550458","yoseffekadu@yahoo.com");
        Actor actor240 = new Actor("Nuguse Urago","Melka_Soda","EC","0916423728","yoseffekadu@yahoo.com");
        Actor actor241 = new Actor("Tari Gololcha","Melka_Soda","IEC","0926300530","yoseffekadu@yahoo.com");
        Actor actor242 = new Actor("Muse Safayi","Melka_Soda","M&E","0916646714","yoseffekadu@yahoo.com");
        Actor actor243 = new Actor("Habtamu Balela","Melka_Soda","MFP","0916431384","yoseffekadu@yahoo.com");



        final List<Actor> actorListGelana = new ArrayList<>();
        Actor actor1028 = new Actor("Select Actor",null,"", null,null);
        Actor actor244 = new Actor("Demeke Getachew","Gelana","EC","0912003803","yoseffekadu@yahoo.com");
        Actor actor245 = new Actor("Badhasa Jilo","Gelana","Head ","0910132473","yoseffekadu@yahoo.com");
        Actor actor246 = new Actor("Mohammed Aliyi","Gelana","IEC","0913796520","yoseffekadu@yahoo.com");
        Actor actor247 = new Actor("Ayele Waldayohanis","Gelana","M&E","0910450957","yoseffekadu@yahoo.com");
        Actor actor248 = new Actor("Abdulkadir Hsen","Gelana","MFP","0919231839","yoseffekadu@yahoo.com");
        Actor actor249 = new Actor("Wondimagegn Hayile","Gelana","Storekeeper ","0949178653","yoseffekadu@yahoo.com");
        Actor actor250 = new Actor("Bariso Gammade","Gelana","Storekeeper (Assistant)","0932682132","yoseffekadu@yahoo.com");
        Actor actor251 = new Actor("Diriba Debela","Gelana","TL","0917071080","yoseffekadu@yahoo.com");
        Actor actor252 = new Actor("Dedecha Dibayu","Gelana","TL","0916327463","yoseffekadu@yahoo.com");



        //Gambella


        final List<Actor> actorListMakuey = new ArrayList<>();
        Actor actor1029 = new Actor("Select Actor",null,"", null,null);
        Actor actor253 = new Actor("KHOR BAYIEK","Makuey","T/LEADER","0925852005","yoseffekadu@yahoo.com");
        Actor actor254 = new Actor("CHUOL BUOY","Makuey","T/LEADER","0917834440","yoseffekadu@yahoo.com");
        Actor actor255 = new Actor("TESLUOUCH GONY","Makuey","MALARIA FP","0917317243","yoseffekadu@yahoo.com");
        Actor actor256 = new Actor("GATLUOK THOK","Makuey","M&E","0934262563","yoseffekadu@yahoo.com");
        Actor actor257 = new Actor("PAM GATWECH","Makuey","HEAD","0927588180","yoseffekadu@yahoo.com");
        Actor actor258 = new Actor("SIMON KUANY","Makuey","I/E/C","0917954104","yoseffekadu@yahoo.com");
        Actor actor259 = new Actor("PHILIP SUNDAY","Makuey","E/C","0934281339","yoseffekadu@yahoo.com");
        Actor actor260 = new Actor("KOANG GATKUOTH","Makuey","Store keeper","0993630405","yoseffekadu@yahoo.com");
        Actor actor261 = new Actor("TING CHOUL","Makuey","Pump tech ","0935155231","yoseffekadu@yahoo.com");

        final List<Actor> actorListJikow = new ArrayList<>();
        Actor actor1030 = new Actor("Select Actor",null,"", null,null);
        Actor actor262 = new Actor("Kure kale","Jikow","TL","0917301494","yoseffekadu@yahoo.com");
        Actor actor263 = new Actor("Biyien khat","Jikow","MFP","0935132177","yoseffekadu@yahoo.com");
        Actor actor264 = new Actor("Wendwesen fekadu","Jikow","M&E","0924942095","yoseffekadu@yahoo.com");
        Actor actor265 = new Actor("Duol kum","Jikow","EC","0922252301","yoseffekadu@yahoo.com");
        Actor actor266 = new Actor("Duol kuey","Jikow","TL","0910585266","yoseffekadu@yahoo.com");
        Actor actor267 = new Actor("Hoth riek","Jikow","P/technician","0945041164","yoseffekadu@yahoo.com");
        Actor actor268 = new Actor("Lol bith","Jikow","Storkeeper","0934280807","yoseffekadu@yahoo.com");

        final List<Actor> actorListWanthoa = new ArrayList<>();
        Actor actor1031 = new Actor("Select Actor",null,"", null,null);
        Actor actor269 = new Actor("Kindu Ali Shewu","Wanthoa","MFP","0917833796","yoseffekadu@yahoo.com");
        Actor actor270 = new Actor("James Yien Ruach ","Wanthoa","EC","0964580801","yoseffekadu@yahoo.com");
        Actor actor271 = new Actor("Lam Thorow ","Wanthoa","TL","0916152677","yoseffekadu@yahoo.com");
        Actor actor272 = new Actor("Gatluak Chuaol Bagoang","Wanthoa","TL","0901792671","yoseffekadu@yahoo.com");
        Actor actor273 = new Actor("Nhial Deng thownt","Wanthoa","Head","0901791215","yoseffekadu@yahoo.com");
        Actor actor274 = new Actor("NyahokcChoap","Wanthoa","IEC","0947109825","yoseffekadu@yahoo.com");
        Actor actor275 = new Actor("khor both tut","Wanthoa","M&E","0910168190","yoseffekadu@yahoo.com");
        Actor actor276 = new Actor("nyuonPal Thich","Wanthoa","pump technician ","0993922616","yoseffekadu@yahoo.com");
        Actor actor277 = new Actor("Nyaruot Lual Muk","Wanthoa","Store keeper","0935133932","yoseffekadu@yahoo.com");

        final List<Actor> actorListGog = new ArrayList<>();
        Actor actor1032 = new Actor("Select Actor",null,"", null,null);
        Actor actor278 = new Actor("Okello Anoyi ","Gog","Vice Head ","0934069242","yoseffekadu@yahoo.com");
        Actor actor279 = new Actor("Omod Omod Gnigwo","Gog","MFP","0993922355","yoseffekadu@yahoo.com");
        Actor actor280 = new Actor("Omod Obang Ogud ","Gog","TL","0917317754","yoseffekadu@yahoo.com");
        Actor actor281 = new Actor("Omod Ogodo Obang ","Gog","TL","0917485199","yoseffekadu@yahoo.com");
        Actor actor282 = new Actor("Abang Kiru Omod ","Gog","EC","0917748497","yoseffekadu@yahoo.com");
        Actor actor283 = new Actor("Akango Odier ","Gog","IEC","0917549984","yoseffekadu@yahoo.com");
        Actor actor284 = new Actor("Alamo Adam ","Gog","Store man ","0905156483","yoseffekadu@yahoo.com");
        Actor actor285 = new Actor("Ojulu Obang ","Gog","Store Assistance ","0917483429","yoseffekadu@yahoo.com");
        Actor actor286 = new Actor("Abiy  Assefa ","Gog","M and E","0917485364","yoseffekadu@yahoo.com");

        final List<Actor> actorListAbobo = new ArrayList<>();
        Actor actor1033 = new Actor("Select Actor",null,"", null,null);
        Actor actor287 = new Actor("Ojulu obang Medo","Abobo","vice head","0993631877","yoseffekadu@yahoo.com");
        Actor actor288 = new Actor("G etnet tadele mulu","Abobo","MFP","0918226144","yoseffekadu@yahoo.com");
        Actor actor289 = new Actor("Omod owar aguwa ","Abobo","E.C","0985284582","yoseffekadu@yahoo.com");
        Actor actor290 = new Actor("James omod Lero","Abobo","TL","0917524504","yoseffekadu@yahoo.com");
        Actor actor291 = new Actor("ojulu cham ojay","Abobo","IEC","0954603442","yoseffekadu@yahoo.com");
        Actor actor292 = new Actor("obang ojulu obang","Abobo","MNE ","0900278834","yoseffekadu@yahoo.com");
        Actor actor293 = new Actor("omod gora ojulu","Abobo","store keeper","0903007789","yoseffekadu@yahoo.com");
        Actor actor294 = new Actor("Afework Yayeh kassa","Abobo","pump tecnician","0942345930","yoseffekadu@yahoo.com");

        final List<Actor> actorListGambelaT = new ArrayList<>();
        Actor actor1034 = new Actor("Select Actor",null,"", null,null);
        Actor actor295 = new Actor("Lual Douth","Gambela_Town","Head","0912686123","yoseffekadu@yahoo.com");
        Actor actor296 = new Actor("Kinfe Kochito","Gambela_Town","MFP","0911831929","yoseffekadu@yahoo.com");
        Actor actor297 = new Actor("Zelalem Lema","Gambela_Town","EC","0923034294","yoseffekadu@yahoo.com");
        Actor actor298 = new Actor("Habtamu Mulugeta","Gambela_Town","IEC","0901613922","yoseffekadu@yahoo.com");
        Actor actor299 = new Actor("Bugn Bidet","Gambela_Town","TL","0970005552","yoseffekadu@yahoo.com");
        Actor actor300 = new Actor("Wakgari Deressa","Gambela_Town","TL","0912322432","yoseffekadu@yahoo.com");
        Actor actor301 = new Actor("Tessema Desalegn","Gambela_Town","TL","0917484790","yoseffekadu@yahoo.com");
        Actor actor302 = new Actor("Besha Assefa","Gambela_Town","M&E Assistant","0986463469","yoseffekadu@yahoo.com");
        Actor actor303 = new Actor("Solomon Girma","Gambela_Town","StoreKeeper","0911993502","yoseffekadu@yahoo.com");
        Actor actor304 = new Actor("Tariku Shimeles","Gambela_Town","Assi Storekeeper","0935147853","yoseffekadu@yahoo.com");

        final List<Actor> actorListGambelaZ = new ArrayList<>();
        Actor actor1035 = new Actor("Select Actor",null,"", null,null);
        Actor actor305 = new Actor("Simon  oman ","Gambela_Z","A/technician ","0912405156","yoseffekadu@yahoo.com");
        Actor actor306 = new Actor("Mohammed ASSEN ","Gambela_Z","EC","0917482629","yoseffekadu@yahoo.com");
        Actor actor307 = new Actor("Chibi  ojulo ","Gambela_Z","Head ","0993965508","yoseffekadu@yahoo.com");
        Actor actor308 = new Actor("Ajulo ojwato ","Gambela_Z","IEC","0917483981","yoseffekadu@yahoo.com");
        Actor actor309 = new Actor("Yohannes  mestetu","Gambela_Z","M/E Assistant ","0917112491","yoseffekadu@yahoo.com");
        Actor actor310 = new Actor("Ahmed Muhye","Gambela_Z","MFP","0911987961","yoseffekadu@yahoo.com");
        Actor actor311 = new Actor("Bekalu Ataldy ","Gambela_Z","Store keeper ","0932025748","yoseffekadu@yahoo.com");
        Actor actor312 = new Actor("Okello Nyigwo ","Gambela_Z","Team leader ","0946523928","yoseffekadu@yahoo.com");

        final List<Actor> actorListItang = new ArrayList<>();
        Actor actor1036 = new Actor("Select Actor",null,"", null,null);
        Actor actor313 = new Actor("Ojulla oguek","Itang_Special","Vice Head","0917319186","yoseffekadu@yahoo.com");
        Actor actor314 = new Actor("Gatkhat duoth","Itang_Special","MFP","0911567866","yoseffekadu@yahoo.com");
        Actor actor315 = new Actor("Muken teka","Itang_Special","TL","0913298216","yoseffekadu@yahoo.com");
        Actor actor316 = new Actor("Okello Ager","Itang_Special","TL","0932452118","yoseffekadu@yahoo.com");
        Actor actor317 = new Actor("Mamo Abeba","Itang_Special","IEC","0912383821","yoseffekadu@yahoo.com");
        Actor actor318 = new Actor("Lual Bol","Itang_Special","M and E Assis","0912786157","yoseffekadu@yahoo.com");
        Actor actor319 = new Actor("Othow owar","Itang_Special","Store Keeper","0909468222","yoseffekadu@yahoo.com");
        Actor actor320 = new Actor("Odiel ojulla","Itang_Special","pump Technician","0993923170","yoseffekadu@yahoo.com");

        final List<Actor> actorListLare = new ArrayList<>();
        Actor actor1037 = new Actor("Select Actor",null,"", null,null);
        Actor actor321 = new Actor("Wichieng Gach Top","Lare","Head","0931054797","yoseffekadu@yahoo.com");
        Actor actor322 = new Actor("Lual Makuach Chol ","Lare","MFP","0927560694","yoseffekadu@yahoo.com");
        Actor actor323 = new Actor("Dobuol Deng Dol","Lare","TL","0912995743","yoseffekadu@yahoo.com");
        Actor actor324 = new Actor("Gebeyew Wodajo Dukan","Lare","TL","0911817566","yoseffekadu@yahoo.com");
        Actor actor325 = new Actor("Loang Pel Thich","Lare","TL","0910053705","yoseffekadu@yahoo.com");
        Actor actor326 = new Actor("Zoal Gatkuoth Puk","Lare","EC","0967091835","yoseffekadu@yahoo.com");
        Actor actor327 = new Actor("Duop Bading Wiw","Lare","IEC","0977912414","yoseffekadu@yahoo.com");
        Actor actor328 = new Actor("Muktap Deng Chuol","Lare","M & E","0934071590","yoseffekadu@yahoo.com");
        Actor actor329 = new Actor("Nyoch Gueng  Deng","Lare","Store Keeper","0930817190","yoseffekadu@yahoo.com");
        Actor actor330 = new Actor("Gach Gatchay ","Lare","Pump Technician ","0927812707","yoseffekadu@yahoo.com");

        final List<Actor> actorListGodare = new ArrayList<>();
        Actor actor1038 = new Actor("Select Actor",null,"", null,null);
        Actor actor331 = new Actor("Petros Yokelo Tefera","Godare","Head/Vice head","0960888098","yoseffekadu@yahoo.com");
        Actor actor332 = new Actor("Getinet Taye Nigussie","Godare","MFP","0913987625","yoseffekadu@yahoo.com");
        Actor actor333 = new Actor("Solomon Abitew Gelito","Godare","TL","0912800828","yoseffekadu@yahoo.com");
        Actor actor334 = new Actor("Dirga Ares  Geni","Godare","TL","0917300042","yoseffekadu@yahoo.com");
        Actor actor335 = new Actor("Solomon Birhane  Kidane","Godare","EC","0912432987","yoseffekadu@yahoo.com");
        Actor actor336 = new Actor("Mewuba Ahimed Suidke","Godare","IEC","0920324039","yoseffekadu@yahoo.com");
        Actor actor337 = new Actor("Mekonon Bekele Mokonon","Godare","M& E","0940642884","yoseffekadu@yahoo.com");
        Actor actor338 = new Actor("Abiyot Hawariyat Rite","Godare","Storekeeper","0911954398","yoseffekadu@yahoo.com");
        Actor actor339 = new Actor("Minwuyelet Sitotaw Tolla","Godare","Ass. Stor kp& Pump tech","0911094764","yoseffekadu@yahoo.com");

        final List<Actor> actorListMengeshi = new ArrayList<>();
        Actor actor1039 = new Actor("Select Actor",null,"", null,null);
        Actor actor340 = new Actor("Getinet Etano Yewala","Mengeshi","Vice head","0917462556","yoseffekadu@yahoo.com");
        Actor actor341 = new Actor("Deme kejela Gemeda ","Mengeshi","MFP","0912744312","yoseffekadu@yahoo.com");
        Actor actor342 = new Actor("Asrat Adimassu Asefa","Mengeshi","TL","0993921510","yoseffekadu@yahoo.com");
        Actor actor343 = new Actor("Baro Fantaw Zeleke","Mengeshi","TL","0932014027","yoseffekadu@yahoo.com");
        Actor actor344 = new Actor("Tamiru Regassa Turi","Mengeshi","Ec","0917835052","yoseffekadu@yahoo.com");
        Actor actor345 = new Actor("Andinet Abayneh Gebru ","Mengeshi","IEC","0912495083","yoseffekadu@yahoo.com");
        Actor actor346 = new Actor("Tesfaye Mekonin Mohammed","Mengeshi","Storekeeper","0966886558","yoseffekadu@yahoo.com");
        Actor actor347 = new Actor("Esayas Ajira Konkoy","Mengeshi","Store assi","0934263252","yoseffekadu@yahoo.com");
        Actor actor348 = new Actor("Aklilu Ayele W/Michael","Mengeshi","M& E Assi","0901607764","yoseffekadu@yahoo.com");

        final List<Actor> actorListDima = new ArrayList<>();
        Actor actor1040 = new Actor("Select Actor",null,"", null,null);
        Actor actor349 = new Actor("Nyiwagi kwot olimi ","Dima","H/Head ","0920810823","yoseffekadu@yahoo.com");
        Actor actor350 = new Actor("Dereje Takele Tesema","Dima","MFP","0911033686","yoseffekadu@yahoo.com");
        Actor actor351 = new Actor("Kedir Mohammed Yesuf","Dima","TL","0918980439","yoseffekadu@yahoo.com");
        Actor actor352 = new Actor("Ageze Teshome Sulito","Dima","TL","0985169443","yoseffekadu@yahoo.com");
        Actor actor353 = new Actor("Habtamu  Gezahagne Worku","Dima","EC","0965788088","yoseffekadu@yahoo.com");
        Actor actor354 = new Actor("Adom Okuch Gilo","Dima","IEC","0936096519","yoseffekadu@yahoo.com");
        Actor actor355 = new Actor("Omod Gilo Oman","Dima","M/E","0917959098","yoseffekadu@yahoo.com");
        Actor actor356 = new Actor("Simachew Geremew Feyissa ","Dima","Store man ","0923497217","yoseffekadu@yahoo.com");
        Actor actor357 = new Actor("Alemayehu Alemu Ageye ","Dima","Store Ass.","0945660811","yoseffekadu@yahoo.com");

        final List<Actor> actorListJor = new ArrayList<>();
        Actor actor1041 = new Actor("Select Actor",null,"", null,null);
        Actor actor358 = new Actor("josefe agero","Jor","vice head","0948108521","yoseffekadu@yahoo.com");
        Actor actor359 = new Actor("romo ollok","Jor","MFP","0949580355","yoseffekadu@yahoo.com");
        Actor actor360 = new Actor("omode obono","Jor","TL","917901470","yoseffekadu@yahoo.com");
        Actor actor361 = new Actor("okelo alewu","Jor","EC","0964991614","yoseffekadu@yahoo.com");
        Actor actor362 = new Actor("Okugn zilo","Jor","IEC","0993922410","yoseffekadu@yahoo.com");
        Actor actor363 = new Actor("Omane utowu","Jor","M&E","0945656672","yoseffekadu@yahoo.com");
        Actor actor364 = new Actor("Atiye ojalo","Jor","Store keeper","0909469175","yoseffekadu@yahoo.com");
        Actor actor365 = new Actor("Oukugn aguagn","Jor","pum techi","0967122746","yoseffekadu@yahoo.com");

        final List<Actor> actorListVL = new ArrayList<>();
        Actor actor522 = new Actor("Select Actor",null,"", null,null);
        Actor actor523 = new Actor("Dr. Peter Mumba","Addis Ababa","Chief of Paryt","0929907740","yosef_tesfaye@pmivectorlink.com");
        Actor actor524 = new Actor("Dawit Teshome","Addis Ababa","Deputy Chief of Party","0911892758","yosef_tesfaye@pmivectorlink.com");
        Actor actor525 = new Actor("Dr. Meshesha Balkew","Addis Ababa","Technical Specialist/Lead Entomologist","0911914477","yosef_tesfaye@pmivectorlink.com");
        Actor actor526 = new Actor("Kassim Mohammued","Addis Ababa","Fainance &Administrative  Manager","0911413828","yosef_tesfaye@pmivectorlink.com");
        Actor actor527 = new Actor("Habtamu Berhanu","Addis Ababa","Operation Manager","0911419969","yosef_tesfaye@pmivectorlink.com");
        Actor actor528 = new Actor("Abreham Kidane","Addis Ababa","Zonal IRS Coordinators","0911712036","yosef_tesfaye@pmivectorlink.com");
        Actor actor529 = new Actor("Addis Mekasha","Addis Ababa","Zonal IRS Coordinators","0911480034","yosef_tesfaye@pmivectorlink.com");
        Actor actor530 = new Actor("Alemiye Wendmneh","Addis Ababa","Logistics Coordinator","0911405836","yosef_tesfaye@pmivectorlink.com");
        Actor actor531 = new Actor("Alemu Biru","Addis Ababa","Zonal IRS Coordinators","0910314983","yosef_tesfaye@pmivectorlink.com");
        Actor actor532 = new Actor("Anteneh Mitiku","Addis Ababa","Monitoring &Evaluation","0916820158","yosef_tesfaye@pmivectorlink.com");
        Actor actor533 = new Actor("Ephrem Abiy","Addis Ababa","Entomological  Coordinator","0913020914","yosef_tesfaye@pmivectorlink.com");
        Actor actor534 = new Actor("Efa Woyessa ","Addis Ababa","Zonal IRS Coordinators","0917418548","yosef_tesfaye@pmivectorlink.com");
        Actor actor535 = new Actor("Fikre Berhane","Addis Ababa","Incinerator Forman","0911626988","yosef_tesfaye@pmivectorlink.com");
        Actor actor536 = new Actor("Fikadu Hirpae","Addis Ababa","Zonal IRS Coordinators","0910614882","yosef_tesfaye@pmivectorlink.com");
        Actor actor537 = new Actor("Getinet Mitiku ","Addis Ababa","Zonal IRS Coordinators","0921569529","yosef_tesfaye@pmivectorlink.com");
        Actor actor538 = new Actor("Getachew Mulu","Addis Ababa","Procurement Officer","0911357188","yosef_tesfaye@pmivectorlink.com");
        Actor actor539 = new Actor("Gedeon Yohannes","Addis Ababa","Entomological  Coordinator","0911125772","yosef_tesfaye@pmivectorlink.com");
        Actor actor540 = new Actor("Gibayehu Gebreyes","Addis Ababa","Store keeper","0911633317","yosef_tesfaye@pmivectorlink.com");
        Actor actor541 = new Actor("Mengiste Melesse","Addis Ababa","IT Specialist","0913539813","yosef_tesfaye@pmivectorlink.com");
        Actor actor542 = new Actor("Misrak Gizachew","Addis Ababa","Accountant","0911196699","yosef_tesfaye@pmivectorlink.com");
        Actor actor543 = new Actor("Mulugeta Dekemo","Addis Ababa","Zonal IRS Coordinators","0911803468","yosef_tesfaye@pmivectorlink.com");
        Actor actor544 = new Actor("Solomon Beza","Addis Ababa","Monitoring & Evaluation Coordinator","0911723734","yosef_tesfaye@pmivectorlink.com");
        Actor actor545 = new Actor("Tomas Girma","Addis Ababa","Zonal IRS Coordinators","0912710141","yosef_tesfaye@pmivectorlink.com");
        Actor actor546 = new Actor("Yosef Fekadu","Addis Ababa","Database Manager","0911183380","yosef_tesfaye@pmivectorlink.com");

        final List<Actor> actorListDEC = new ArrayList<>();
        Actor actor547 = new Actor("Select Actor",null,"", null,null);
        Actor actor574 = new Actor("belay Assefa","Assosa","ASO","0917423744","yoseffekadu@yahoo.com");
        Actor actor575 = new Actor("Gashaw Alamirew","Assosa","ASO","0917459408","yoseffekadu@yahoo.com");
        Actor actor576 = new Actor("Akele Hunyalew","Assosa","ASO","0917172938","yoseffekadu@yahoo.com");
        Actor actor577 = new Actor("Girma Bekele","Assosa","ASO","0922360890","yoseffekadu@yahoo.com");
        Actor actor578 = new Actor("Elias Etana","Assosa","ASO","0921799878","yoseffekadu@yahoo.com");
        Actor actor579 = new Actor("Gutu Beka","Assosa","ASO","0917229842","yoseffekadu@yahoo.com");
        Actor actor580 = new Actor("Yonas Amare","Assosa","ASO","0934626453","yoseffekadu@yahoo.com");
        Actor actor581 = new Actor("Amanuel Kefyalew","Assosa","ASO","0918742401","yoseffekadu@yahoo.com");
        Actor actor582 = new Actor("Zelalem Chanie","Assosa","ASO","0920161257","yoseffekadu@yahoo.com");
        Actor actor583 = new Actor("Kibret belay","Assosa","ASO","0917428300","yoseffekadu@yahoo.com");
        Actor actor584 = new Actor("Kidst Yerdaw","Assosa","ASO","0922239638","yoseffekadu@yahoo.com");
        Actor actor585 = new Actor("Zekarias Aynalem","Assosa","ASO","0913225961","yoseffekadu@yahoo.com");
        Actor actor586 = new Actor("Misgana HaileMichael","Assosa","ASO","0982842085","yoseffekadu@yahoo.com");
        Actor actor587 = new Actor("Biniam Mulualem","Assosa","ASO","0928517090","yoseffekadu@yahoo.com");
        Actor actor588 = new Actor("Gemechis Tesfaye","Assosa","ASO","0909758287","yoseffekadu@yahoo.com");
        Actor actor589 = new Actor("Bereda abdisa","Assosa","ASO","0922185851","yoseffekadu@yahoo.com");
        Actor actor590 = new Actor("Milion Bayisa","Assosa","ASO","0913911373","yoseffekadu@yahoo.com");
        Actor actor591 = new Actor("Abebayehu Desalegn","Assosa","ASO","0920531575","yoseffekadu@yahoo.com");
        Actor actor592 = new Actor("Tesfaye Mulisa","Assosa","ASO","0917686281","yoseffekadu@yahoo.com");
        Actor actor593 = new Actor("Samuel Temesgen","Assosa","ASO","0911174434","yoseffekadu@yahoo.com");
        Actor actor594 = new Actor("Mulugeta Abebe","Assosa","ASO","0912891647","yoseffekadu@yahoo.com");
        Actor actor595 = new Actor("Bikila Getachew","Assosa","ASO","0915888802","yoseffekadu@yahoo.com");
        Actor actor596 = new Actor("Abebe","Assosa","ASO","0917049685","yoseffekadu@yahoo.com");
        Actor actor597 = new Actor("Tiruneh Belay","Gilgel_Beles","GLG","0941380611","yoseffekadu@yahoo.com");
        Actor actor598 = new Actor("Selam Ababu","Gilgel_Beles","GLG","0980565954","yoseffekadu@yahoo.com");
        Actor actor599 = new Actor("Negus Habtamu","Gilgel_Beles","GLG","0937400923","yoseffekadu@yahoo.com");
        Actor actor600 = new Actor("Kassim Ali","Gilgel_Beles","GLG","0911822981","yoseffekadu@yahoo.com");
        Actor actor601 = new Actor("Warb Mohammed","Gilgel_Beles","GLG","0939344291","yoseffekadu@yahoo.com");
        Actor actor602 = new Actor("Fatima Ebrahim","Gilgel_Beles","GLG","0931849986","yoseffekadu@yahoo.com");
        Actor actor603 = new Actor("Tarekegn Emiru","Shamboo","SHA","0917349771","yoseffekadu@yahoo.com");
        Actor actor604 = new Actor("Teferi Edorsa","Shamboo","SHA","0917446838","yoseffekadu@yahoo.com");
        Actor actor605 = new Actor("Biratu Gobena","Shamboo","SHA","0917141853","yoseffekadu@yahoo.com");
        Actor actor606 = new Actor("Abdisa kenate","Shamboo","SHA","0922185851","yoseffekadu@yahoo.com");
        Actor actor607 = new Actor("Merga Wakjira","Nekemte","NKT","0917841683","yoseffekadu@yahoo.com");
        Actor actor608 = new Actor("Adugna Beyena","Nekemte","NKT","0989461345","yoseffekadu@yahoo.com");
        Actor actor609 = new Actor("Bulti Haile","Nekemte","NKT","0917088382","yoseffekadu@yahoo.com");
        Actor actor610 = new Actor("wagari Tessema","Waliso","WAL","0917965284","yoseffekadu@yahoo.com");
        Actor actor611 = new Actor("Kidist Kassahun","Waliso","WAL","0985445648","yoseffekadu@yahoo.com");
        Actor actor612 = new Actor("Frehiwot Bekele","Waliso","WAL","0917140879","yoseffekadu@yahoo.com");
        Actor actor613 = new Actor("Mosisa Abdisa","Waliso","WAL","0923606955","yoseffekadu@yahoo.com");
        Actor actor548 = new Actor("Adugna","Makuye","Makuey","0989461345","yosef_tesfaye@pmivectorlink.com");
        Actor actor549 = new Actor("Mengistu","Makuye","Makuey","0917648583","yosef_tesfaye@pmivectorlink.com");
        Actor actor550 = new Actor("Eskedar","Makuye","GT","0931059423","yosef_tesfaye@pmivectorlink.com");
        Actor actor551 = new Actor("Tilahun","Makuye","Mizan","0938500269","yosef_tesfaye@pmivectorlink.com");
        Actor actor552 = new Actor("Abebe","Makuye","Makuey","0917436772","yosef_tesfaye@pmivectorlink.com");
        Actor actor553 = new Actor("Abdurazak","Makuye","Mizan","0912720006","yosef_tesfaye@pmivectorlink.com");
        Actor actor554 = new Actor("Yosef","Makuye","Mizan","0954597004","yosef_tesfaye@pmivectorlink.com");
        Actor actor555 = new Actor("Fekiru","Makuye","Mizan","0917319664","yosef_tesfaye@pmivectorlink.com");
        Actor actor556 = new Actor("Lati","Makuye","GT","0917847504","yosef_tesfaye@pmivectorlink.com");
        Actor actor557 = new Actor("Habtamu Mengesha","Makuye","GT","0922786738","yosef_tesfaye@pmivectorlink.com");
        Actor actor558 = new Actor("Kasahun Shifera","Makuye","GT","0917288360","yosef_tesfaye@pmivectorlink.com");
        Actor actor559 = new Actor("Biratu","Makuye","GT","0917141853","yosef_tesfaye@pmivectorlink.com");
        Actor actor560 = new Actor("Yeneneh","Makuye","Makuey","0917684477","yosef_tesfaye@pmivectorlink.com");
        Actor actor561 = new Actor("Gemechu","Makuye","GT","0984685882","yosef_tesfaye@pmivectorlink.com");
        Actor actor562 = new Actor("Ashenafi","Makuye","GT","0917290481","yosef_tesfaye@pmivectorlink.com");
        Actor actor563 = new Actor("Bulti","Makuye","GT","0917088382","yosef_tesfaye@pmivectorlink.com");
        Actor actor564 = new Actor("Gezahegn","Makuye","Bule Hora","0920376780","yosef_tesfaye@pmivectorlink.com");
        Actor actor565 = new Actor("Meseret","Makuye","Bule Hora","0920583442","yosef_tesfaye@pmivectorlink.com");
        Actor actor566 = new Actor("Misomsa","Makuye","Bule Hora","0913747682","yosef_tesfaye@pmivectorlink.com");
        Actor actor567 = new Actor("Roba","Makuye","Bule Hora","0916427627","yosef_tesfaye@pmivectorlink.com");
        Actor actor568 = new Actor("Duop Koang","Gambella Town","GT","0927544624","yosef_tesfaye@pmivectorlink.com");
        Actor actor569 = new Actor("Doboul Tut","Gambella Town","Makuey","0932020521","yosef_tesfaye@pmivectorlink.com");
        Actor actor570 = new Actor("Seada","Makuye","GT","0917748067","yosef_tesfaye@pmivectorlink.com");
        Actor actor571 = new Actor("Masresha","Makuye","GT","0925855941","yosef_tesfaye@pmivectorlink.com");


        final List<Actor> actorListAkobo = new ArrayList<>();
        Actor actor572 = new Actor("Select Actor",null,"", null,null);
        Actor actor573 = new Actor("John Wiyual Bol","Akobo","MFP","0923346063","yoseffekadu@yahoo.com");


        final List<Actor> actorListMaoKomo = new ArrayList<>();
*/
        // ***********************************
        // ***********************************
        // **********************************
/*
        actorListDEC.add(actor547);
        actorListDEC.add(actor548);
        actorListDEC.add(actor549);
        actorListDEC.add(actor550);
        actorListDEC.add(actor551);
        actorListDEC.add(actor552);
        actorListDEC.add(actor553);
        actorListDEC.add(actor554);
        actorListDEC.add(actor555);
        actorListDEC.add(actor556);
        actorListDEC.add(actor557);
        actorListDEC.add(actor558);
        actorListDEC.add(actor559);
        actorListDEC.add(actor560);
        actorListDEC.add(actor561);
        actorListDEC.add(actor562);
        actorListDEC.add(actor563);
        actorListDEC.add(actor564);
        actorListDEC.add(actor565);
        actorListDEC.add(actor566);
        actorListDEC.add(actor567);
        actorListDEC.add(actor568);
        actorListDEC.add(actor569);
        actorListDEC.add(actor570);
        actorListDEC.add(actor571);

        actorListDEC.add(actor574);
        actorListDEC.add(actor575);
        actorListDEC.add(actor576);
        actorListDEC.add(actor577);
        actorListDEC.add(actor578);
        actorListDEC.add(actor579);
        actorListDEC.add(actor580);
        actorListDEC.add(actor581);
        actorListDEC.add(actor582);
        actorListDEC.add(actor583);
        actorListDEC.add(actor584);
        actorListDEC.add(actor585);
        actorListDEC.add(actor586);
        actorListDEC.add(actor587);
        actorListDEC.add(actor588);
        actorListDEC.add(actor589);
        actorListDEC.add(actor590);
        actorListDEC.add(actor591);
        actorListDEC.add(actor592);
        actorListDEC.add(actor593);
        actorListDEC.add(actor594);
        actorListDEC.add(actor595);
        actorListDEC.add(actor596);
        actorListDEC.add(actor597);
        actorListDEC.add(actor598);
        actorListDEC.add(actor599);
        actorListDEC.add(actor600);
        actorListDEC.add(actor601);
        actorListDEC.add(actor602);
        actorListDEC.add(actor603);
        actorListDEC.add(actor604);
        actorListDEC.add(actor605);
        actorListDEC.add(actor606);
        actorListDEC.add(actor607);
        actorListDEC.add(actor608);
        actorListDEC.add(actor609);
        actorListDEC.add(actor610);
        actorListDEC.add(actor611);
        actorListDEC.add(actor612);
        actorListDEC.add(actor613);

        actorListVL.add(actor522);
        actorListVL.add(actor523);
        actorListVL.add(actor524);
        actorListVL.add(actor525);
        actorListVL.add(actor526);
        actorListVL.add(actor527);
        actorListVL.add(actor528);
        actorListVL.add(actor529);
        actorListVL.add(actor530);
        actorListVL.add(actor531);
        actorListVL.add(actor532);
        actorListVL.add(actor533);
        actorListVL.add(actor534);
        actorListVL.add(actor535);
        actorListVL.add(actor536);
        actorListVL.add(actor537);
        actorListVL.add(actor538);
        actorListVL.add(actor539);
        actorListVL.add(actor540);
        actorListVL.add(actor541);
        actorListVL.add(actor542);
        actorListVL.add(actor543);
        actorListVL.add(actor544);
        actorListVL.add(actor545);
        actorListVL.add(actor546);



        actorListAssosa.add(actor1000);
        actorListBambasi.add(actor1001);
        actorListKumruk.add(actor1002);
        actorListHomosha.add(actor1003);
        actorListMenge.add(actor1004);
        actorListOda.add(actor1005);
        actorListSherkole.add(actor1006);
        actorListAgalo.add(actor1007);
        actorListBelo.add(actor1008);
        actorListKamashi.add(actor1009);
        actorListSedal.add(actor1010);
        actorListYaso.add(actor1011);
        actorListBullen.add(actor1012);
        actorListDangur.add(actor1013);
        actorListDibate.add(actor1014);
        actorListGuba.add(actor1015);
        actorListMandurea.add(actor1016);
        actorListPawe.add(actor1017);
        actorListWombera.add(actor1018);
        actorListAbay.add(actor1019);
        actorListAbe.add(actor1020);
        actorListAmuru.add(actor1021);
        actorListJardega.add(actor1022);
        actorListGoro.add(actor1023);
        actorListIlu.add(actor1024);
        actorListWaliso.add(actor1025);
        actorListAbaya.add(actor1026);
        actorListMelka.add(actor1027);
        actorListGelana.add(actor1028);
        actorListMakuey.add(actor1029);
        actorListJikow.add(actor1030);
        actorListWanthoa.add(actor1031);
        actorListGog.add(actor1032);
        actorListAbobo.add(actor1033);
        actorListGambelaT.add(actor1034);
        actorListGambelaZ.add(actor1035);
        actorListItang.add(actor1036);
        actorListLare.add(actor1037);
        actorListGodare.add(actor1038);
        actorListMengeshi.add(actor1039);
        actorListDima.add(actor1040);
        actorListJor.add(actor1041);



        actorListAssosa.add(actor1);
            actorListAssosa.add(actor2);
                actorListAssosa.add(actor3);
                        actorListAssosa.add(actor4);
                                actorListAssosa.add(actor5);
                                        actorListAssosa.add(actor6);
                                                actorListAssosa.add(actor7);
                                                        actorListAssosa.add(actor8);
                                                                actorListAssosa.add(actor9);
                                                                        actorListAssosa.add(actor10);
                                                                                actorListAssosa.add(actor11);
                                                                                        actorListAssosa.add(actor12);
                                                                                                actorListAssosa.add(actor13);
        actorListBambasi.add(actor14);
                actorListBambasi.add(actor15);
                        actorListBambasi.add(actor16);
                                actorListBambasi.add(actor17);
                                        actorListBambasi.add(actor18);
                                                actorListBambasi.add(actor19);
                                                        actorListBambasi.add(actor20);
                                                                actorListBambasi.add(actor21);
                                                                        actorListBambasi.add(actor22);
                                                                                actorListBambasi.add(actor23);
        actorListKumruk.add(actor24);
                actorListKumruk.add(actor25);
                        actorListKumruk.add(actor26);
                                actorListKumruk.add(actor27);
                                        actorListKumruk.add(actor28);
                                                actorListKumruk.add(actor29);
                                                        actorListKumruk.add(actor30);
                                                                actorListKumruk.add(actor31);
        actorListHomosha.add(actor32);
                actorListHomosha.add(actor33);
                        actorListHomosha.add(actor34);
                                actorListHomosha.add(actor35);
                                        actorListHomosha.add(actor36);
                                                actorListHomosha.add(actor37);
                                                        actorListHomosha.add(actor38);
                                                                actorListHomosha.add(actor39);
                                                                        actorListHomosha.add(actor40);
        actorListMenge.add(actor41);
                actorListMenge.add(actor42);
                        actorListMenge.add(actor43);
                                actorListMenge.add(actor44);
                                        actorListMenge.add(actor45);
                                                actorListMenge.add(actor46);
                                                        actorListMenge.add(actor47);
                                                                actorListMenge.add(actor48);
                                                                        actorListMenge.add(actor49);
                                                                                actorListMenge.add(actor50);
                                                                                        actorListMenge.add(actor51);
        actorListOda.add(actor52);
                actorListOda.add(actor53);
                        actorListOda.add(actor54);
                                actorListOda.add(actor55);
                                        actorListOda.add(actor56);
                                                actorListOda.add(actor57);
                                                        actorListOda.add(actor58);
                                                                actorListOda.add(actor59);
                                                                        actorListOda.add(actor60);
                                                                                actorListOda.add(actor61);
         actorListSherkole.add(actor62);
                 actorListSherkole.add(actor63);
                         actorListSherkole.add(actor64);
                                 actorListSherkole.add(actor65);
                                         actorListSherkole.add(actor66);
                                                 actorListSherkole.add(actor67);
                                                         actorListSherkole.add(actor68);
                                                                 actorListSherkole.add(actor69);
                                                                         actorListSherkole.add( actor70);
        actorListAgalo.add(actor71);
                actorListAgalo.add(actor72);
                        actorListAgalo.add(actor73);
                                actorListAgalo.add(actor74);
                                        actorListAgalo.add(actor75);
                                                actorListAgalo.add(actor76);
                                                        actorListAgalo.add(actor77);
                                                                actorListAgalo.add(actor78);
        actorListBelo.add(actor79);
                actorListBelo.add(actor80);
                        actorListBelo.add(actor81);
                                actorListBelo.add(actor82);
                                        actorListBelo.add(actor83);
                                                actorListBelo.add(actor84);
                                                        actorListBelo.add( actor85);
                                                                actorListBelo.add(actor86);
        actorListKamashi.add(actor87);
                actorListKamashi.add(actor88);
                        actorListKamashi.add(actor89);
                                actorListKamashi.add(actor90);
                                        actorListKamashi.add(actor91);
                                                actorListKamashi.add(actor92);
                                                        actorListKamashi.add(actor93);
                                                                actorListKamashi.add(actor94);
        actorListSedal.add(actor95);
                actorListSedal.add(actor96);
                        actorListSedal.add(actor97);
                                actorListSedal.add(actor98);
                                        actorListSedal.add(actor99);
                                                actorListSedal.add(actor100);
                                                        actorListSedal.add(actor101);
                                                                actorListSedal.add(actor102);
        actorListYaso.add(actor103);
                actorListYaso.add(actor104);
                        actorListYaso.add( actor105);
                                actorListYaso.add(actor106);

                                        actorListYaso.add(actor108);
                                                actorListYaso.add(actor109);
        actorListBullen.add(actor110);
                actorListBullen.add(actor111);
                        actorListBullen.add(actor112);
                                actorListBullen.add(actor113);
                                        actorListBullen.add(actor114);
                                                actorListBullen.add(actor115);
                                                        actorListBullen.add(actor116);
                                                                actorListBullen.add(actor117);
                                                                        actorListBullen.add(actor118);
        actorListDangur.add(actor119);
                actorListDangur.add(actor120);
                        actorListDangur.add(actor121);
                                actorListDangur.add(actor122);
                                        actorListDangur.add(actor123);
                                                actorListDangur.add(actor124);
                                                        actorListDangur.add(actor125);
                                                                actorListDangur.add(actor126);
                                                                        actorListDangur.add(actor127);
        actorListDibate.add(actor128);
                actorListDibate.add(actor129);
                        actorListDibate.add(actor130);
                                actorListDibate.add(actor131);
                                        actorListDibate.add(actor132);
                                                actorListDibate.add(actor133);
                                                        actorListDibate.add(actor134);
                                                                actorListDibate.add(actor135);
                                                                        actorListDibate.add(actor136);
        actorListGuba.add(actor137);
                actorListGuba.add(actor138);
                        actorListGuba.add(actor139);
                                actorListGuba.add(actor140);
        actorListMandurea.add(actor141);
                actorListMandurea.add(actor142);
                        actorListMandurea.add(actor143);
                                actorListMandurea.add(actor144);
                                        actorListMandurea.add(actor145);
                                                actorListMandurea.add(actor146);
                                                        actorListMandurea.add(actor147);
                                                                actorListMandurea.add(actor148);
                                                                        actorListMandurea.add(actor149);
        actorListPawe.add(actor150);
                actorListPawe.add(actor151);
                        actorListPawe.add(actor152);
                                actorListPawe.add(actor153);
                                        actorListPawe.add(actor154);
                                                actorListPawe.add(actor155);
        actorListWombera.add(actor156);
                actorListWombera.add(actor157);
                        actorListWombera.add(actor158);
                                actorListWombera.add(actor159);
                                        actorListWombera.add(actor160);
                                                actorListWombera.add(actor161);
                                                        actorListWombera.add(actor162);
                                                                actorListWombera.add(actor163);
                                                                        actorListWombera.add(actor164);
                                                                                actorListWombera.add(actor165);
                                                                                        actorListWombera.add(actor166);
                                                                                                actorListWombera.add(actor167);
                                                                                                        actorListWombera.add(actor168);
        actorListAbay.add(actor169);
                actorListAbay.add(actor170);
                        actorListAbay.add(actor171);
                                actorListAbay.add(actor172);
                                        actorListAbay.add(actor173);
                                                actorListAbay.add(actor174);
                                                        actorListAbay.add(actor175);
                                                                actorListAbay.add(actor176);
                                                                        actorListAbay.add(actor177);
        actorListAbe.add(actor178);
                actorListAbe.add(actor179);
                        actorListAbe.add(actor180);
                                actorListAbe.add(actor181);
                                        actorListAbe.add(actor182);
                                                actorListAbe.add(actor183);
                                                        actorListAbe.add(actor184);
                                                                actorListAbe.add(actor185);
                                                                        actorListAbe.add(actor186);
                                                                                actorListAbe.add(actor187);
                                                                                        actorListAbe.add(actor188);
        actorListAmuru.add(actor189);
                actorListAmuru.add(actor190);
                        actorListAmuru.add(actor191);
                                actorListAmuru.add(actor192);
                                        actorListAmuru.add(actor193);
                                                actorListAmuru.add(actor194);
                                                        actorListAmuru.add(actor195);
                                                                actorListAmuru.add(actor196);
        actorListJardega.add(actor197);
                actorListJardega.add(actor198);
                        actorListJardega.add(actor199);
                                actorListJardega.add(actor200);
                                        actorListJardega.add(actor201);
                                                actorListJardega.add(actor202);
                                                                actorListJardega.add(actor204);
        actorListGoro.add(actor205);
                actorListGoro.add(actor206);
                        actorListGoro.add(actor207);
                                actorListGoro.add(actor208);
                                        actorListGoro.add(actor209);
                                                actorListGoro.add(actor210);
                                                        actorListGoro.add(actor211);
        actorListIlu.add(actor212);
                actorListIlu.add(actor213);
                        actorListIlu.add(actor214);
                                actorListIlu.add(actor215);
                                        actorListIlu.add(actor216);
                                                actorListIlu.add(actor217);
                                                        actorListIlu.add(actor218);
                                                                actorListIlu.add(actor219);
                                                                        actorListIlu.add(actor220);
        actorListWaliso.add(actor221);
                actorListWaliso.add(actor222);
                        actorListWaliso.add(actor223);
                                actorListWaliso.add(actor224);
                                        actorListWaliso.add(actor225);
                                                actorListWaliso.add(actor226);
                                                        actorListWaliso.add(actor227);
                                                                actorListWaliso.add(actor228);
                                                                        actorListWaliso.add(actor229);
        actorListAbaya.add(actor230);
                actorListAbaya.add(actor231);
                        actorListAbaya.add(actor232);
                                actorListAbaya.add(actor233);
                                        actorListAbaya.add(actor234);
                                                actorListAbaya.add(actor235);
        actorListMelka.add(actor236);
                actorListMelka.add(actor237);
                        actorListMelka.add(actor238);
                                actorListMelka.add(actor239);
                                        actorListMelka.add(actor240);
                                                actorListMelka.add(actor241);
                                                        actorListMelka.add(actor242);
                                                                actorListMelka.add(actor243);
        actorListGelana.add(actor244);
                actorListGelana.add(actor245);
                        actorListGelana.add(actor246);
                                actorListGelana.add(actor247);
                                        actorListGelana.add(actor248);
                                                actorListGelana.add(actor249);
                                                        actorListGelana.add(actor250);
                                                                actorListGelana.add(actor251);
                                                                        actorListGelana.add(actor252);
        actorListMakuey.add(actor253);
                actorListMakuey.add(actor254);
                        actorListMakuey.add(actor255);
                                actorListMakuey.add(actor256);
                                        actorListMakuey.add(actor257);
                                                actorListMakuey.add(actor258);
                                                        actorListMakuey.add(actor259);
                                                                actorListMakuey.add(actor260);
                                                                        actorListMakuey.add(actor261);
        actorListJikow.add(actor262);
                actorListJikow.add(actor263);
                        actorListJikow.add(actor264);
                                actorListJikow.add(actor265);
                                        actorListJikow.add(actor266);
                                                actorListJikow.add(actor267);
                                                        actorListJikow.add(actor268);
        actorListWanthoa.add(actor269);
                actorListWanthoa.add(actor270);
                        actorListWanthoa.add(actor271);
                                actorListWanthoa.add(actor272);
                                        actorListWanthoa.add(actor273);
                                                actorListWanthoa.add(actor274);
                                                        actorListWanthoa.add(actor275);
                                                                actorListWanthoa.add(actor276);
                                                                        actorListWanthoa.add(actor277);
        actorListGog.add(actor278);
                actorListGog.add(actor279);
                        actorListGog.add(actor280);
                                actorListGog.add(actor281);
                                        actorListGog.add(actor282);
                                                actorListGog.add(actor283);
                                                        actorListGog.add(actor284);
                                                                actorListGog.add(actor285);
                                                                        actorListGog.add(actor286);
        actorListAbobo.add(actor287);
                actorListAbobo.add(actor288);
                        actorListAbobo.add(actor289);
                                actorListAbobo.add(actor290);
                                        actorListAbobo.add(actor291);
                                                actorListAbobo.add(actor292);
                                                        actorListAbobo.add(actor293);
                                                                actorListAbobo.add(actor294);
        actorListGambelaT.add(actor295);
                actorListGambelaT.add(actor296);
                        actorListGambelaT.add(actor297);
                                actorListGambelaT.add(actor298);
                                        actorListGambelaT.add(actor299);
                                                actorListGambelaT.add(actor300);
                                                        actorListGambelaT.add(actor301);
                                                                actorListGambelaT.add(actor302);
                                                                        actorListGambelaT.add(actor303);
                                                                                actorListGambelaT.add(actor304);
        actorListGambelaZ.add(actor305);
                actorListGambelaZ.add(actor306);
                        actorListGambelaZ.add(actor307);
                                actorListGambelaZ.add(actor308);
                                        actorListGambelaZ.add(actor309);
                                                actorListGambelaZ.add(actor310);
                                                        actorListGambelaZ.add(actor311);
                                                            actorListGambelaZ.add(actor312);
                        actorListItang.add(actor313);
                                actorListItang.add(actor314);
                                        actorListItang.add(actor315);
                                                actorListItang.add(actor316);
                                                        actorListItang.add(actor317);
                                                                actorListItang.add(actor318);
                                                                        actorListItang.add(actor319);
                                                                                actorListItang.add(actor320);

        actorListLare.add(actor321);
                actorListLare.add(actor322);
                        actorListLare.add(actor323);
                                actorListLare.add(actor324);
                                        actorListLare.add(actor325);
                                                actorListLare.add(actor326);
                                                        actorListLare.add(actor327);
                                                                actorListLare.add(actor328);
                                                                        actorListLare.add(actor329);
                                                                                actorListLare.add(actor330);
        actorListGodare.add(actor331);
                actorListGodare.add(actor332);
                        actorListGodare.add(actor333);
                                actorListGodare.add(actor334);
                                        actorListGodare.add(actor335);
                                                actorListGodare.add(actor336);
                                                        actorListGodare.add(actor337);
                                                                actorListGodare.add(actor338);
                                                                        actorListGodare.add(actor339);
        actorListMengeshi.add(actor340);
                actorListMengeshi.add(actor341);
                        actorListMengeshi.add(actor342);
                                actorListMengeshi.add(actor343);
                                        actorListMengeshi.add(actor344);
                                                actorListMengeshi.add(actor345);
                                                        actorListMengeshi.add(actor346);
                                                                actorListMengeshi.add(actor347);
                                                                        actorListMengeshi.add(actor348);
        actorListDima.add(actor349);
                actorListDima.add(actor350);
                        actorListDima.add(actor351);
                                actorListDima.add(actor352);
                                        actorListDima.add(actor353);
                                                actorListDima.add(actor354);
                                                        actorListDima.add(actor355);
                                                                actorListDima.add(actor356);
                                                                        actorListDima.add(actor357);
        actorListJor.add(actor358);
                actorListJor.add(actor359);
                        actorListJor.add(actor360);
                                actorListJor.add(actor361);
                                        actorListJor.add(actor362);
                                                actorListJor.add(actor363);
                                                        actorListJor.add(actor364);
                                                                actorListJor.add(actor365);

*/
        /*
        ******************
        * ****************
         */


        /* final List<Actor> actorListAbay = new ArrayList<>();
        Actor actor1 = new Actor("Select Actor",null,null, null,null);
        actorListAbay.add(actor1);
        Actor actor2 = new Actor("Yosef Fekadu","Abay Chomen","MFP", "0911183380","yoseffekadu@yahoo.com");
        actorListAbay.add(actor2);
        Actor actor3 = new Actor("Anteneh Mitkiku","Abay Chomen","Team Leader", "0916820158","fekaduyosef@gmail.com");
        actorListAbay.add(actor3);

        final List<Actor> actorListAbe = new ArrayList<>();
        Actor actor4 = new Actor("Select Actor",null,null, null,null);
        actorListAbe.add(actor4);
        Actor actor5 = new Actor("Tomas Alemu","Abe Dengoro","RHB", "0911183380","tomasalemu@yahoo.com");
        actorListAbe.add(actor5);
        Actor actor6 = new Actor("Adis Efa","Abe Dengoro","MFP", "0911183380","addisefa@gmail.com");
        actorListAbe.add(actor6);

        final List<Actor> actorListAmuru = new ArrayList<>();
        Actor actor7 = new Actor("Select Actor",null,null, null,null);
        actorListAmuru.add(actor7);
        Actor actor8 = new Actor("tariku bejga","Amuru","SQL", "0911183380","tarikubejiga@yahoo.com");
        actorListAmuru.add(actor8);
        Actor actor9 = new Actor("henok walelegn","Amuru","DEC", "0911183380","henokwalelegn@gmail.com");
        actorListAmuru.add(actor9);

        final List<Actor> actorListJardega = new ArrayList<>();
        Actor actor10 = new Actor("Select Actor",null,null, null,null);
        actorListJardega.add(actor10);
        Actor actor11 = new Actor("Tolosa wassie","Jardega Jarte","M&E Assistant", "0911183380","tolosaopd@yahoo.com");
        actorListJardega.add(actor11);
        Actor actor12 = new Actor("hailu esubalew","Jardega Jarte","MFP", "0911183380","esubalewh@gmail.com");
        actorListJardega.add(actor12); */



        Btn_Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 Intent intentCall = new Intent(Intent.ACTION_CALL);
                 String number = PhoneNo.getText().toString();

                 if(number.trim().isEmpty()){
                     Toast.makeText(ContactsActivity.this, "NO Phone Number is available for this actor", Toast.LENGTH_SHORT).show();
                     requestPermission();
                 }else{
                     intentCall.setData(Uri.parse("tel:"+number));


                      if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//
                            Toast.makeText(ContactsActivity.this, "Please Grant Permission", Toast.LENGTH_SHORT).show();
                        }else{
                            startActivity(intentCall);
                      }

                 }



            }
        });




       BtnSms.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String message = "Hello " + FullName.getText().toString() + ", ";
               String phoneNo = PhoneNo.getText().toString();
               //String name = FullName.getText().toString();
               if(!TextUtils.isEmpty(message) && !TextUtils.isEmpty(phoneNo)){
                   Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + phoneNo));
                   smsIntent.putExtra("sms_body",message);
                   startActivity(smsIntent);
               }
           }
       });

       Btn_CheckList.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(ContactsActivity.this, CheckList.class);
               startActivity(intent);
           }
       });

        BulkEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactsActivity.this, GroupSMS.class);
                startActivity(intent);
            }
        });

        BtnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactsActivity.this, About.class);
                startActivity(intent);
            }
        });



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,division);
        DivisionSP.setAdapter(adapter);

/*
        DivisionSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelect = division[position];

                ServiceSP.setSelection(0);
                ActorSP.setSelection(0);

                //UpozellaSP.setTex
                if (position == 0){
                    UpozellaSP.setAdapter(null);
                    ServiceSP.setAdapter(null);
                    ActorSP.setAdapter(null);
                    FullName.setText("");
                    Location.setText("");
                    Position.setText("");
                    PhoneNo.setText("");
                    //Email.setText("");
                    //UpozellaSP.setSelection(0);
                    //ServiceSP.setSelection(0);
                    //ActorSP.setSelection(0);
                }
                if (position == 1){

                    ArrayAdapter<String> adapter1 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,Oromia);
                    UpozellaSP.setAdapter(adapter1);



                    UpozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String itemZoneSelect = Oromia[position];
                            if (position == 0){
                                ServiceSP.setAdapter(null);
                                ActorSP.setAdapter(null);
                                FullName.setText("");
                                Location.setText("");
                                Position.setText("");
                                PhoneNo.setText("");
                                //Email.setText("");
                            }
                            if (position == 1){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,horoGudro);
                                ServiceSP.setAdapter(adapter2);

                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListAbay);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListAbe);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 3){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListAmuru);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 4){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListJardega);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });

                            }else if (position == 2){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,sourthWestShoa);
                                ServiceSP.setAdapter(adapter2);


                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListGoro);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListIlu);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 3){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListWaliso);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });



                            }else if (position == 3){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,westGuji);
                                ServiceSP.setAdapter(adapter2);


                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListAbaya);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListGelana);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 3){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListMelka);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });

                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });


                }else if(position == 2){
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,Gambella);
                    UpozellaSP.setAdapter(adapter1);

                    UpozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String itemZoneSelect = Gambella[position];
                            if (position == 1){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,agnuwa);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListGambelaZ);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListGog);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 3){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListDima);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 4){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListAbobo);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 5){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListJor);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }else if (position == 2){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,nuer);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListAkobo);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListJikow);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 3){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListLare);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 4){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListMakuey);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 5){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListWanthoa);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                   // displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }else if (position == 3){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,majang);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListGodare);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListMengeshi);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }else if (position == 4){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,itangSpecial);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListItang);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    //displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }else if (position == 5){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,gambellaTown);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListGambelaT);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }else if(position == 3){

                    ArrayAdapter<String> adapter1 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,Benishangul);
                    UpozellaSP.setAdapter(adapter1);

                    UpozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String itemZoneSelect = Benishangul[position];
                            if (position == 1){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,assosa);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListHomosha);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListMenge);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 3){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListSherkole);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 4){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListBambasi);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 5){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListAssosa);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 6){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListOda);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 7){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListKumruk);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }else if (position == 2){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,kamashi);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListBelo);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListAgalo);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 3){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListKamashi);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 4){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListYaso);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }else if (position == 3){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,metekel);
                                ServiceSP.setAdapter(adapter2);

                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListMandurea);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 2){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListBullen);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 3){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListWombera);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 4){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListDangur);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 5){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListDibate);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 6){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListGuba);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }else if (position == 7){
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,actorListPawe);
                                            //adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }else if (position == 4){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,maoKomoSpecial);
                                ServiceSP.setAdapter(adapter2);

                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListMaoKomo);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }else if(position == 4) {

                    ArrayAdapter<String> adapter1 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item, VectorLink);
                    UpozellaSP.setAdapter(adapter1);

                    UpozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String itemZoneSelect = VectorLink[position];
                            if (position == 0){
                                ServiceSP.setAdapter(null);
                                ActorSP.setAdapter(null);
                                FullName.setText("");
                                Location.setText("");
                                Position.setText("");
                                PhoneNo.setText("");
                                //Email.setText("");
                            }
                            if (position == 1){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,VectorLinkStaff);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListVL);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });


                }else if(position == 5) {

                    ArrayAdapter<String> adapter1 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item, DEC);
                    UpozellaSP.setAdapter(adapter1);

                    UpozellaSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String itemZoneSelect = DEC[position];
                            if (position == 0){
                                ServiceSP.setAdapter(null);
                                ActorSP.setAdapter(null);
                                FullName.setText("");
                                Location.setText("");
                                Position.setText("");
                                PhoneNo.setText("");
                                //Email.setText("");
                            }
                            if (position == 1){
                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_dropdown_item,DECs);
                                ServiceSP.setAdapter(adapter2);
                                ServiceSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        if (position == 0){
                                            //ServiceSP.setAdapter(null);
                                            ActorSP.setAdapter(null);
                                            FullName.setText("");
                                            Location.setText("");
                                            Position.setText("");
                                            PhoneNo.setText("");
                                            //Email.setText("");
                                        }
                                        if (position == 1){
                                            //ActorSP.setSelection(0);
                                            ArrayAdapter<Actor> adapter3 = new ArrayAdapter<>(ContactsActivity.this, android.R.layout.simple_spinner_item,actorListDEC);
                                            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                            ActorSP.setAdapter(adapter3);

                                            ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                    Actor actor = (Actor)parent.getSelectedItem();
                                                    displayActorData(actor);
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
*/
    }

    private void requestPermission(){

        ActivityCompat.requestPermissions(ContactsActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
    }
    private void requestPermissionSMS(){

        ActivityCompat.requestPermissions(ContactsActivity.this, new String[]{Manifest.permission.SEND_SMS,Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);
    }
/*
    public void getSelectedActor (View v){

        Actor actor = (Actor) ActorSP.getSelectedItem();
        displayActorData(actor);

    }*/
    /*
    private void displayActorData(Actor actor){
        String name = actor.getFullName();
        String location = actor.getLocation();
        String pos = actor.getPosition();
        String phone = actor.getPhoneNumber();
        String email = actor.getMail();

        //String actorData = "Full Name:              " + name + "\nLocation:                " + location + "\nPosition:                  " + pos + "\nPhone Number:     " + phone + "\nEmail:                     " + email;
        if(name =="Select Actor"){
            FullName.setText("");
        }else{
            FullName.setText(name);
        }
       Location.setText(location);
       Position.setText(pos);
       PhoneNo.setText(phone);
       //Email.setText(email);

        //Result.setText(actorData);
        //Toast.makeText(this, actorData, Toast.LENGTH_LONG).show();
    }*/
}
