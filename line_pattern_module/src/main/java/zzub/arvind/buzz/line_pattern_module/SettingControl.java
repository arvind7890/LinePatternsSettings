package zzub.arvind.buzz.line_pattern_module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class SettingControl extends LinearLayout {
    Context mcontext;
    AttributeSet mattr;
    public SettingControl(Context context) {
        super(context);
        mcontext=context;
        init();
    }

    public SettingControl(Context context, AttributeSet attrs) {
        super(context, attrs);
        mcontext=context;
        mattr=attrs;
        init();
        }

    public SettingControl(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, 0);

    }

    public SettingControl(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, 0,0);
    }
    public void init(){

        LayoutInflater inflater=LayoutInflater.from(mcontext);
        inflater.inflate(R.layout.pattern_control,this,true);



    }
}
