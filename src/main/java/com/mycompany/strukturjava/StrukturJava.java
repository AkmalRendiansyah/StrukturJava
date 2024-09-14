/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strukturjava;

import com.mycompany.strukturjava.accessmodifier.MainKelasA;
import com.mycompany.strukturjava.array.IndexOutOfBound;
import com.mycompany.strukturjava.array.InisiasiArray;
import com.mycompany.strukturjava.array.InisiasiArray2;
import com.mycompany.strukturjava.array.InisiasiArray3;
import com.mycompany.strukturjava.array.LoopingArray;
import com.mycompany.strukturjava.array.MultiDimensionalArray;
import com.mycompany.strukturjava.collection.ListPlanet;
import com.mycompany.strukturjava.collection.MapPlanet;
import com.mycompany.strukturjava.collection.SetPlanet;
import com.mycompany.strukturjava.function.CallFunction;
import com.mycompany.strukturjava.function.InputFunction;
import com.mycompany.strukturjava.function.MethodOverloading;
import com.mycompany.strukturjava.function.ReturnFunction;
import com.mycompany.strukturjava.inheritance.MainHewan1;
import com.mycompany.strukturjava.inputoutput.InputOutputFunction;
import com.mycompany.strukturjava.inputoutput.UserBufferedReader;
import com.mycompany.strukturjava.inputoutput.UserOutput;
import com.mycompany.strukturjava.kendaraan.Kereta;
import com.mycompany.strukturjava.kendaraan.Mobil;
import com.mycompany.strukturjava.kendaraan.Motor;
import com.mycompany.strukturjava.musik.Gitar;
import com.mycompany.strukturjava.objek.Elang;
import com.mycompany.strukturjava.operator.OperatorAritmatika;
import com.mycompany.strukturjava.operator.OperatorAssignment;
import com.mycompany.strukturjava.operator.OperatorConditional;
import com.mycompany.strukturjava.operator.OperatorEquality;
import com.mycompany.strukturjava.operator.OperatorUnary;
import com.mycompany.strukturjava.percabangan.IfThen;
import com.mycompany.strukturjava.percabangan.IfThenElse;
import com.mycompany.strukturjava.percabangan.IfThenElseIfThenElse;
import com.mycompany.strukturjava.percabangan.Switch;
import com.mycompany.strukturjava.percabangan.SwitchWithoutBreak;
import com.mycompany.strukturjava.perulangan.DoWhile;
import com.mycompany.strukturjava.perulangan.For;
import com.mycompany.strukturjava.perulangan.ForBersarang;
import com.mycompany.strukturjava.perulangan.While;
import com.mycompany.strukturjava.propertimetode.MainBinatang;
import java.util.Date;


/**
 *
 * @author Lenovo
 */
public class StrukturJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Gitar.bunyi();
        Kereta.tampilkanJumlahBan();
        Mobil.tampilkanJumlahBan();
        Motor.tampilkanJumlahBan();
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        OperatorAssignment.main(args);
        OperatorAritmatika.tes();
        OperatorUnary.main(args);
        OperatorEquality.main(args);
        OperatorConditional.main(args);
        InputOutputFunction.main(args);
        UserBufferedReader.main(args);
        UserOutput.main(args);
        InisiasiArray.main(args);
        InisiasiArray2.main(args);
        InisiasiArray3.main(args);
        LoopingArray.main(args);
        MultiDimensionalArray.main(args);
        IndexOutOfBound.main(args);
        IfThen.main(args);
        IfThenElse.main(args);
        IfThenElseIfThenElse.main(args);
        Switch.main(args);
        SwitchWithoutBreak.main(args);
        For.main(args);
        ForBersarang.main(args);
        ForBersarang.main(args);
        While.main(args);
        DoWhile.main(args);
        ListPlanet.main(args);
        SetPlanet.main(args);
        MapPlanet.main(args);
        Elang.main(args);
        CallFunction.cobaFungsi();
        ReturnFunction.main(args);
        InputFunction.main(args);
        MethodOverloading.main(args);
        MainBinatang.main(args);
        MainKelasA.main(args);
        MainHewan1.main(args);
        
    }
}
