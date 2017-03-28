package seoyeon.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    EditText edit_first;
    EditText edit_second;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_first = (EditText) findViewById(R.id.edit_first);
        edit_second = (EditText) findViewById(R.id.edit_second);
        //참조변수에 대입하는것

        Button butplus = (Button) findViewById(R.id.but_plus);
        Button butminus = (Button) findViewById(R.id.but_minus);
        Button but_multiply = (Button) findViewById(R.id.but_multiply);
        Button but_division = (Button) findViewById(R.id.but_division);
        textResult = (TextView) findViewById(R.id.text_result);

        butplus.setOnClickListener(this); //셋온클릭 리스너가 무조건 필요해욤~
        butminus.setOnClickListener(this);
        but_multiply.setOnClickListener(this);
        but_division.setOnClickListener(this);//위젯에 클릭이 되는지 감시하는거~
    }

    //이벤트가 발생되었을 때 감시하는 감시자, 처리하는 처리자가 있다~
        /*첫번째 방법 butplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int num1 = Integer.parseInt(edit_first.getText().toString());
                 int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult.setText("   값은 " + (num1 + num2) + "");
            }
        });
        butminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int num1 = Integer.parseInt(edit_first.getText().toString());
                 int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult.setText("   값은 " + (num1 - num2) + "");
            }
        });
        but_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int num1 = Integer.parseInt(edit_first.getText().toString());
                 int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult.setText("   값은 " + (num1 * num2) + "");
            }
        });
        but_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit_first.getText().toString());
                 int num2 = Integer.parseInt(edit_second.getText().toString());
                textResult.setText("   값은 " + (num1 / num2) + "");
            }
        });*/
}
//end oncreat
    /*@Override
    public void onClick(View view) {
        int num1 = Integer.parseInt(edit_first.getText().toString());
        int num2 = Integer.parseInt(edit_second.getText().toString());
        int result=0;
        switch(view.getId()){
            case R.id.but_plus:
                result=num1+num2;
                break;
            case R.id.but_minus:
                result=num1-num2;
                break;
            case R.id.but_multiply:
                result=num1*num2;
                break;
            case R.id.but_division:
                result=num1/num2;
                break;
        }
        textResult.setText(result+"");*/
    }
}
