package com.example.Contacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckList extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,Btn_Back;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);
        //Toolbar toolbar = findViewById(R.id.toolbar);


        getSupportActionBar().setTitle("Activities Checklist");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);





        tv1  = findViewById(R.id.tv1);
        tv2  = findViewById(R.id.tv2);
        tv3  = findViewById(R.id.tv3);
        tv4  = findViewById(R.id.tv4);
        tv5  = findViewById(R.id.tv5);
        tv6  = findViewById(R.id.tv6);
        //tv7  = findViewById(R.id.tv7);
       // tv8  = findViewById(R.id.tv8);
       // tv9  = findViewById(R.id.tv9);
       // tv10 = findViewById(R.id.tv10);
       // tv11  = findViewById(R.id.tv11);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
       // b7 = findViewById(R.id.button7);
       // b8 = findViewById(R.id.button8);
       // b9 = findViewById(R.id.button9);
       // b10 = findViewById(R.id.button10);
       // b11 = findViewById(R.id.button11);

        Btn_Back = findViewById(R.id.btn_back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv1.getVisibility() == View.GONE) {
                    tv1.setVisibility(View.VISIBLE);
                    tv1.setText("1. Activity one" + "\n2. Activity two" + "\n3. Activity three");
                }else{
                    tv1.setVisibility(View.GONE);
                    tv1.setText("");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getVisibility() == View.GONE) {
                    tv2.setVisibility(View.VISIBLE);
                    tv2.setTextSize(18);
                    tv2.setText("1. Keeping Green light procedures" +
                                "\n2. Taking and reporting sexual harassment problem weekly" +
                                "\n3. Keeping report of medical screening  confidential" +
                                "\n4. Take a medical check/Pregnancy  for replaced actor" +
                                "\n5. Do final Post Spray Environmental Compliance assessment" +
                                "\n6. Supervision frequency/at all level" +
                                "\n7. Mask wear during travel" +
                                "\n8. Reporting EC related reports as per the template given" +
                                "\n9. Treatment of actors who exposed during IRS" +
                                "\n10. All others will be sticking on the given checklist and framework" +
                                "\n11. Distributing worn out glove, torn coverall and neck protection, torn  to the deserved SOP before their departure" +
                                "\n12. Filling ODK checklist for nutrition status of the breakfast" +
                                "\n13. Paper based supervision count and report from each supervisor" +
                                "\n14. Bathroom effluent management");
                }else{
                    tv2.setVisibility(View.GONE);
                    tv2.setText("");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv3.getVisibility() == View.GONE) {
                    tv3.setVisibility(View.VISIBLE);
                    tv3.setTextSize(18);
                    tv3.setText("1. Are the district admin and political leader’s aware of the operation?" +
                                "\n2. Up on visiting districts in you cluster, have you checked their preparation for the cascade training? " +
                                "\n          training hall" +
                            "\n          agenda" +
                            "\n          attendance and registration sheet" +
                            "\n          availability of all the trainers" +
                            "\n          training material" +
                            "\n          water for practice" +
                            "\n          refreshment facility" +
                            "\n          Wall preparation for practical session?" +
                            "\n3. Are the supervision checklists expected from your cluster being completed and submitted per the schedule? " +
                            "\n          Morning mobilization" +
                            "\n          Spray operator transportation vehicle inspection" +
                            "\n          Home Owner preparation" +
                            "\n          End of day clean up" +
                            "\n          Store performance " +
                            "\n          DCV" +
                            "\n          Post spray closeout check list?" +
                            "\n4. At the actual operation time," +
                            "\n          Did the flow chart posted at the operation time?" +
                            "\n          Do the operation team follow the steps outlined on each day?" +
                            "\n          Are all supervisors onboard? " +
                            "\n          Is nozzle tip testing being conducted, documented and IRS progress reviewed weekly?" +
                            "\n          Is Performance tracking sheet updated on daily basis?" +
                            "\n          Is insecticide tracking going perfect?" +
                            "\n          Is the district management engaged in the operation?" +
                            "\n5. Vehicles management" +
                            "\n          Are the vehicles and drivers certified by VL?" +
                            "\n          Are all requirements from the Vehicles and Derivers still complete?" +
                            "\n          Is the log sheet signed on daily basis and submitted weekly?");
                }else{
                    tv3.setVisibility(View.GONE);
                    tv3.setText("");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv4.getVisibility() == View.GONE) {
                    tv4.setVisibility(View.VISIBLE);
                    tv4.setTextSize(18);
                    tv4.setText("IEC" +
                                "\n=============" +
                                "\n" +
                                "\n1. Make sure advocacy meetings with the DHO head, District Political Head and stake holders are conducted per district before the cascade training" +
                                "\n2. Make sure door to door mobilizers are recruited based on merits as per the calculation / assigned mobilizers per kebele" +
                                "\n3. Follow-up IRS posters are posted in locations appropriate for community observation" +
                                "\n4. Follow-up the door to door mobilization process and data collection, conduct a meeting with mobilizers, Kebele leaders and village elders in selected kebeles per district" +
                                "\n5. Check all mobilizers to attend the one day orientation and content of the orientation." +
                                "\n6. Follow-up the radio spots which will be aired one week before spray operations start and will be continued three times daily through the spray period. And take a note for feedback" +
                                "\n7. Check the number and percentage of households reporting IRS acceptance per kebele and identify the main reasons for non-acceptance, propose a solution to minimize refusals" +
                                "\n8.  Work closely with the district MFPs, IEC coordinators, and mobilizers to develop a detailed mobilization and supervision plan" +
                                "\n" +
                                "\nGENDER" +
                                "\n=============" +
                                "\n" +
                                "\n1. Make sure female seasonal workers to at least 35%, and have at least 15% in supervisory roles. From the onset of recruitment of different positions of seasonal workers" +
                                "\n2. Ensure all project recruitment advertisements explicitly state that women are strongly encouraged to apply." +
                                "\n3. Lead and supervise the hiring process and ensure that all the hiring of seasonal workers is done according to the hiring criteria and that all gender targets are met." +
                                "\n4. Identify women who have previously worked on an IRS project, and hence can be moved into supervisory roles based on competency." +
                                "\n5. Make sure sanitary pads are provided for all female seasonal workers and provide for pad disposal at all operational sites." +
                                "\n6. If there is low representation of women reserve some positions for women that do not require formal education/ reading or writing" +
                                "\n7. Make sure to implement the sexual harassment policy for all employees, including seasonal workers, to promote a respectful working environment" +
                                "\n8. The cascade training should include sexual harassment awareness training for all spray teams at the district level, and post anti-sexual harassment policy poster in the local language at all operational sites." +
                                "\n9. Try to ensure that women who drop out along the way during the campaign are replaced by women; to contribute and promote the overall increase in the gender balance of the workforce.");
                }else{
                    tv4.setVisibility(View.GONE);
                    tv4.setText("");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv5.getVisibility() == View.GONE) {
                    tv5.setVisibility(View.VISIBLE);
                    tv5.setTextSize(18);
                    tv5.setText("1. Payment requesting and necessary document arranging actors ……..mobilization orientation, cascade training, mobilization for campaign, all actors during the campaign/in 2 rounds/" +
                            "\n      All actors’ agreements with full requirements" +
                            "\n      Actors registration, attendances with formal formats/sheets/" +
                            "\n      Arrange appropriates payment modality" +
                            "\n      Requesting actual and proper working days" +
                            "\n      Submitting all those documents on 2nd days of the cascade training to finance team" +
                            "\n      Collecting & arranging the acc.numbers & identifying other if any" +
                            "\n2. Payments for refreshment & break fast" +
                            "\n      Collecting all documents …….  PO, trade licenses, TIN no. /if available/agreement, receipt, attendance sheet, types& amount of food provided." +
                            "\n      Submitting those documents to the procurement team" +
                            "\n      Collecting & arranging the acc.numbers & identifying other if any" +
                            "\n      Follow up for on time payments" +
                            "\n      Identifying and following the illegible actors for BREAKFAST." +
                            "\n      Agree on the utilization breakfast on market days" +
                            "\n3. Labor work payments" +
                            "\n      For material loading unloading like PPE" +
                            "\n      Insecticide loading unloading" +
                            "\n      Material packing in home preparation where applicable" +
                            "\n4. Stores & soak pit" +
                            "\n      Paying by staff" +
                            "\n      Payment through finance" +
                            "\n      Other means if any");
                }else{
                    tv5.setVisibility(View.GONE);
                    tv5.setText("");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv6.getVisibility() == View.GONE) {
                    tv6.setVisibility(View.VISIBLE);
                    tv6.setText("Storage " +
"\n          Well ventilated    " +
"\n          Spacious/ wide" +
"\n          Floors & walls impermeable; concrete preferred" +
"\n          Facilities to have double locks / guarded 24 Hours " +
"\n          Storekeeper keeps one pair of keys and logistician has another pair of key" +
"\n" +
"\nManagement of IRS Storage Facility" +
"\n          - First in first out - First expire first out - principle" +
"\n          Containers arranged to avoid mechanical damage / leaks" +
"\n          Uncluttered floor spaces" +
"\n          Insecticide  stacking not to exceed 2 m high" +
"\n          Store bookkeeping is up to date  " +
"\n" +
"\nIRS store Stock Control and Inventory" +
"\n          Ensure all products are appropriately and correctly labeled.  " +
"\n          Check to see if Material Safety Data Sheets (MSDS), Spill Response Plan, and Emergency Response Plan are readily available." +
"\n          Storekeeper logs receipt of boxes on stock cards.  " +
"\n          Storekeeper maintains daily accounting of Insecticide  stocks / used sachets, containers" +
"\n          Stock delivery records have dual signatures of those dispatching / delivering pesticide stocks and those receiving them" +
"\n          Storekeeper records quantity of empties from the operational IRS site. " +
"\n          Operational sites account for the supplies received by returning empty Bottles" +
"\n" +
"\nDaily Distribution of Pesticide Stocks" +
"\n          Team leader requests and signs for Bottles from storekeeper.   " +
"\n          Storekeeper writes name of team leader / number on Bottles with pen." +
"\n          Team leader writes down the number of Bottles to Spray Operators (SOs).   " +
"\n          Spray operators and team leaders keep separate Bottles daily logs." +
"\n" +
"\nEssential Equipment in IRS Store" +
"\n          Thick polyethylene sheeting on floor (if surface is not concrete or otherwise impermeable)" +
"\n          Wooden pallets" +
"\n          Ramps at entrance to contain leakage" +
"\n          Entrance door with lock to prevent unauthorized entry" +
"\n          Bars across windows and ventilators to prevent unauthorized entry" +
"\n" +
"\nResponse Kit in IRS Store" +
"\n          Shovel, absorbent sand, sawdust or dry soil" +
"\n          Long-handled brush with stiff bristles" +
"\n          Short-handled brush & pan" +
"\n          Water supply" +
"\n          Detergent" +
"\n          Fire-fighting equipment:" +
"\n          fire extinguisher" +
"\n          Emergency first aid equipment:" +
"\n          first aid box, including eyewash set" +
"\n" +
"\nIRS Vehicle Monitoring" +
"\n          Vehicle information systems enable group leaders to monitor vehicle safety and performance, and manage the vehicle" +
"\n           Basic information requirements are:" +
"\n          Vehicle condition " +
"\n          Conditions of usage (mileage, road conditions" +
"\n          The following details should be kept in each vehicle:" +
"\n          Registration number " +
"\n          Engine, chassis and plate numbers  " +
"\n          Vehicle service and repairs history " +
"\n          Insurance documentation (certified copies" +
"\n          Log book " +
"\n       " +
"\nIRS Operation closure" +
"\nMake sure " +
"\n          All IRS reusable equipment’s are keep clean " +
"\n          All IRS reusable equipment’s are back to the store." +
"\n          Stack properly all IRS remaining supplies & equipment" +
"\n          Back all rented vehicles, trucks etc. to the supplier as fast as possible." +
"\n          All Insecticide wastes are properly collected and piled  carefully" +
"\n" +
"\nReverse Logistics" +
"\n          A process of reclaiming recyclable and reusable materials, returns, and reworks from the point of consumption or sue for repair, redistribution, or disposal." +
"\nFrom Abt Vector link IRS district store: " +
"\n          Spray Pump" +
"\n          Reusable PPE / Boots, coveralls, Helmets etc." +
"\n          Tent and others" +
"\n          Empty insecticide containers, Used masks, Used gloves etc." +
"\nFrom Abt Vector link IRS management  " +
"\n           Transporting & storing  Empty insecticide containers, Used masks " +
"\n            Delivering to the concerned /Recycler as per management instruction " +
"\n" +
"\n    IRS Operation closure" +
"\nUpdate the bookkeeping of the store." +
"\n          Stock card / Bin card" +
"\n          Master ledger book" +
"\n          Insecticide trucking format" +
"\n          Undertake physical inventory");
                }else{
                    tv6.setVisibility(View.GONE);
                    tv6.setText("");
                }
            }
        });


    /*    b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv7.getVisibility() == View.GONE) {
                    tv7.setVisibility(View.VISIBLE);
                    tv7.setText("1. Activity one" + "\n2. Activity two" + "\n3. Activity three");
                }else{
                    tv7.setVisibility(View.GONE);
                    tv7.setText("");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv8.getVisibility() == View.GONE) {
                    tv8.setVisibility(View.VISIBLE);
                    tv8.setText("1. Activity one" + "\n2. Activity two" + "\n3. Activity three");
                }else{
                    tv8.setVisibility(View.GONE);
                    tv8.setText("");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv9.getVisibility() == View.GONE) {
                    tv9.setVisibility(View.VISIBLE);
                    tv9.setText("1. Activity one" + "\n2. Activity two" + "\n3. Activity three");
                }else{
                    tv9.setVisibility(View.GONE);
                    tv9.setText("");
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv10.getVisibility() == View.GONE) {
                    tv10.setVisibility(View.VISIBLE);
                    tv10.setText("1. Activity one" + "\n2. Activity two" + "\n3. Activity three");
                }else{
                    tv10.setVisibility(View.GONE);
                    tv10.setText("");
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv11.getVisibility() == View.GONE) {
                    tv11.setVisibility(View.VISIBLE);
                    tv11.setText("1. Activity one" + "\n2. Activity two" + "\n3. Activity three");
                }else{
                    tv11.setVisibility(View.GONE);
                    tv11.setText("");
                }
            }
        }); */

        Btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckList.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
