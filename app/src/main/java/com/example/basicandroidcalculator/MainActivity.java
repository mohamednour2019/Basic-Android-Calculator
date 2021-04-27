package com.example.basicandroidcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    Button num1,num2,num3,num4,num5,num6,num7,num8,num9,plus,minus,divide,num0,multiply,clear,result,erase,mod,decimalPoint,factorial;
    TextView textview;
    double finalresult,temp,first,second;
    boolean equalpressed=false;
    String temps,test="",checker;
    Vector<String>terms,backup;
    String show="",adding="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Findview();
        setActions();

    }

    public void Findview()
    {
        num1=findViewById(R.id.number1);
        num2=findViewById(R.id.number2);
        num3=findViewById(R.id.number3);
        num4=findViewById(R.id.number4);
        num5=findViewById(R.id.number5);
        num6=findViewById(R.id.number6);
        num7=findViewById(R.id.number7);
        num8=findViewById(R.id.number8);
        num9=findViewById(R.id.number9);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.divide);
        num0=findViewById(R.id.number0);
        multiply=findViewById(R.id.multiply);
        clear=findViewById(R.id.clear);
        result=findViewById(R.id.result);
        textview=findViewById(R.id.textview);
        terms=new Vector<String>();
        backup=new Vector<String>();
        erase=findViewById(R.id.erase);
        mod=findViewById(R.id.mod);
        decimalPoint=findViewById(R.id.decimalpoint);
        factorial=findViewById(R.id.factorial);



    }

    public void performMultiplyAndDivide()
    {
        for(int k=0;k<2;k++){
            for(int i=1;i<terms.size();i+=2)
            {
                if(terms.elementAt(i).equals("x"))
                {
                    first=Double.parseDouble(terms.elementAt(i-1));
                    second=Double.parseDouble(terms.elementAt(i+1));
                    temp=first*second;
                    temps=Double.toString(temp);
                    if(terms.size()>0)
                    {
                        terms.add(i-1, temps );
                        for(int j=0;j<3;j++)
                            terms.remove(i);
                    }
                    else {terms.add(temps);}
                    i=1;


                }
                else if(terms.elementAt(i).equals("/"))
                {
                    first=Double.parseDouble(terms.elementAt(i-1));
                    second=Double.parseDouble(terms.elementAt(i+1));
                    temp=first/second;
                    temps=Double.toString(temp);
                    if(terms.size()>0)
                    {
                        terms.add(i-1, temps );
                        for(int j=0;j<3;j++)
                            terms.remove(i);
                    }
                    else {terms.add(temps);}
                    i=1;
                }
                else{continue;}

            }}
    }
    public void performMod()
    {
        for(int k=0;k<2;k++){
            for(int i=1;i<terms.size();i+=2)
            {
                if(terms.elementAt(i).equals("%"))
                {
                    first=Double.parseDouble(terms.elementAt(i-1));
                    second=Double.parseDouble(terms.elementAt(i+1));
                    temp=first%second;
                    temps=Double.toString(temp);
                    if(terms.size()>0)
                    {
                        terms.add(i-1, temps );
                        for(int j=0;j<3;j++)
                            terms.remove(i);
                    }
                    else {terms.add(temps);}
                    i=1;


                }
            }}
    }
    public void performAddingAndSubtracting()
    {
        for(int k=0;k<2;k++){
            for(int i=1;i<terms.size();i+=2)
            {
                if(terms.elementAt(i).equals("+"))
                {
                    first=Double.parseDouble(terms.elementAt(i-1));
                    second=Double.parseDouble(terms.elementAt(i+1));
                    temp=first+second;
                    temps=Double.toString(temp);
                    if(terms.size()>0)
                    {
                        terms.add(i-1, temps );
                        for(int j=0;j<3;j++)
                            terms.remove(i);
                    }
                    else {terms.add(temps);}

                    i=1;
                }
                else if(terms.elementAt(i).equals("-"))
                {
                    first=Double.parseDouble(terms.elementAt(i-1));
                    second=Double.parseDouble(terms.elementAt(i+1));
                    temp=first-second;
                    temps=Double.toString(temp);
                    if(terms.size()>0)
                    {
                        terms.add(i-1, temps );
                        for(int j=0;j<3;j++)
                            terms.remove(i);
                    }
                    else {terms.add(temps);}

                    i=1;
                }
                else
                {
                    break;
                }
            }}
    }
    public void setActions()
    {


        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                show+="1";
                adding+="1";
                textview.setText(show);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="2";
                adding+="2";
                textview.setText(show);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="3";
                adding+="3";
                textview.setText(show);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="4";
                adding+="4";
                textview.setText(show);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="5";
                adding+="5";
                textview.setText(show);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="6";
                adding+="6";
                textview.setText(show);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="7";
                adding+="7";
                textview.setText(show);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="8";
                adding+="8";
                textview.setText(show);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="9";
                adding+="9";
                textview.setText(show);
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show+="0";
                adding+="0";
                textview.setText(show);
            }
        });
        decimalPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adding.length()>0){
                    if(adding.charAt(adding.length()-1)!='.'){
                        show+=".";
                        adding+=".";
                        textview.setText(show);}}
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adding.length()>0){
                    terms.add(adding);
                    adding="";
                }
                if(terms.size()>0){
                    checker=terms.lastElement();
                    if(!checker.equals("+")&&!checker.equals("-")&&!checker.equals("/")&&!checker.equals("x")&&!checker.equals("%")){
                        show+="+";
                        terms.add("+");
                        textview.setText(show);
                    }
                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(adding.length()>0){
                    terms.add(adding);
                    adding="";
                }
                if(terms.size()>0){
                    checker=terms.lastElement();
                    if(!checker.equals("+")&&!checker.equals("-")&&!checker.equals("/")&&!checker.equals("x")&&!checker.equals("%")){
                        show+="-";
                        terms.add("-");
                        textview.setText(show);
                    }
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adding.length()>0){
                    terms.add(adding);
                    adding="";
                }
                if(terms.size()>0){
                    checker=terms.lastElement();
                    if(!checker.equals("+")&&!checker.equals("-")&&!checker.equals("/")&&!checker.equals("x")&&!checker.equals("%")){
                        show+="/";
                        terms.add("/");
                        textview.setText(show);
                    }
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(adding.length()>0){
                    terms.add(adding);
                    adding="";
                }
                if(terms.size()>0){
                    checker=terms.lastElement();
                    if(!checker.equals("+")&&!checker.equals("-")&&!checker.equals("/")&&!checker.equals("x")&&!checker.equals("%")){
                        show+="x";
                        terms.add("x");
                        textview.setText(show);
                    }
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adding.length()>0){
                    terms.add(adding);
                    adding="";
                }
                if(terms.size()>0){
                    checker=terms.lastElement();
                    if(!checker.equals("+")&&!checker.equals("-")&&!checker.equals("/")&&!checker.equals("x")&&!checker.equals("%")){
                        show+="%";
                        terms.add("%");
                        textview.setText(show);
                    }
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show="";
                adding="";
                terms.clear();
                textview.setText(show);
            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(show.length()>0)
                    show=show.substring(0,show.length()-1);
                textview.setText(show);
                if(adding.length()>0)
                {
                    adding=adding.substring(0,adding.length()-1);
                }
                else if(terms.size()>0)
                {
                    checker=terms.lastElement();
                    if(checker.equals("+")||checker.equals("-")|| checker.equals("/")||checker.equals("x")||checker.equals("%"))
                    {
                        terms.remove(terms.size()-1);
                    }

                    else
                    {
                        adding="";
                        temps=terms.lastElement();
                        terms.remove(terms.size()-1);
                        adding= temps.substring(0,temps.length()-1);
                    }

                }
                else{}




            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adding.length()>0){
                    terms.add(adding);
                    adding="";
                }


                performMultiplyAndDivide();
                performMod();
                performAddingAndSubtracting();
                //performAddingAndSubtracting();


                if(terms.size()>0)
                {show=terms.elementAt(0);
                    textview.setText(show);}

            }
        });






    }

}