package com.example.zhousheng.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.login_button);
        Button button1=(Button)findViewById(R.id.cancel_button);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText user_edit=(EditText)findViewById(R.id.userEdit);
                        EditText password=(EditText)findViewById(R.id.passwordEdit);
                        user_edit.getText().clear();
                        password.getText().clear();
                    }
                });
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 EditText user_edit=(EditText)findViewById(R.id.userEdit);
                 EditText password=(EditText)findViewById(R.id.passwordEdit);
                String user=user_edit.getText().toString();
                String pass=password.getText().toString();
                if(user.equals("zhou")&&pass.equals("123"))
                 {
                     AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                     dialog.setTitle("登录成功");
                     dialog.setMessage("用户名与密码吻合！");
                     dialog.setCancelable(false);
                     dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {

                         }
                     });
                     dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {

                         }
                     });
                     dialog.show();
                 }
                     else
                     {
                         AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                         dialog.setTitle("登录失败");
                         dialog.setMessage("用户名或密码错误！");
                         dialog.setCancelable(false);
                         dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {

                             }
                         });
                         dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {

                             }
                         });
                         dialog.show();
                     }

                 }



         });
    }
}
