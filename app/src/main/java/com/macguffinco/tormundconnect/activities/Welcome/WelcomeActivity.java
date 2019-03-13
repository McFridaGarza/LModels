package com.macguffinco.tormundconnect.activities.Welcome;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.macguffinco.tormundconnect.HomeActivity;
import com.macguffinco.tormundconnect.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);

        new ActivityTask(this).execute("", "", "");


    }
}



class ActivityTask extends AsyncTask<String, Integer, Void> {

    private Context context;
    private boolean success = false;

    public ActivityTask(Context context) {
        this.context = context;
    }

    protected Void doInBackground(String... data) {

        Intent intent = new Intent(context, HomeActivity.class);
        context.startActivity(intent);
        return null;
    }
}


/*
        try {
            for (int i=0;i<=90000;i++){
                String hola="";
                if(hola.isEmpty()){
//                    for (int k=0;k<=5000;k++){
//                      String hola2="";
//                        }
                }

            }
        }catch (Exception ex){

        }

        SharedPreferences preferences= context.getSharedPreferences("TormundStylist", Context.MODE_PRIVATE);
        String username=preferences.getString("username","");
        String pass=preferences.getString("password","");

        UserDC user= new UserDC();
        user.Email=username;
        user.password=pass;
        ArrayList<UserDC> users=TormundManager.ValidateLogin(user);

        if(!users.isEmpty()){

            for (UserDC userDC : users) {
                if(userDC.company==null /*|| userDC.user_type!=1*//*){

          /*          Intent intent= new Intent(context, LoginActivity.class);
                    context.startActivity(intent);
                }

                TormundManager.GlobalCompanyDC=userDC.company;
                EmployeeDC employeeSearch= new EmployeeDC();

                employeeSearch.user=userDC;
                ArrayList<EmployeeDC> employees=TormundManager.GetEmployee(employeeSearch);


                if(!employees.isEmpty()){
                    TormundManager.GlobalEmployeeDC=employees.get(0);
                    TormundManager.GlobalBranchDC=employees.get(0).branch;
                    TormundManager.FillCataloguesByBranch();

                }else{
                    success=false;
                    TormundManager.RestartGlobalParameters();
                }

                success=true;
            }


        }else{
           success=false;
           TormundManager.RestartGlobalParameters();

        }



        return 0L;
    }


    protected void onProgressUpdate(Integer... progress) {
        String hola="";
    }

    protected void onPostExecute(Long result) {



        if(success){

       TormundManager.goMainActivity(context);


        }else{
            Intent intent= new Intent(context, LoginActivity.class);
            context.startActivity(intent);

        }


    }
 */




