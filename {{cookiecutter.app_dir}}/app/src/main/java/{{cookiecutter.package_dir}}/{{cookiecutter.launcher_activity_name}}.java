package {{cookiecutter.package_dir.replace('/','.')}};

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import {{cookiecutter.package_name}}.R;

import {{cookiecutter.package_dir.replace('/','.')}}.features.HomeFragment;

public class {{cookiecutter.launcher_activity_name}} extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.{{cookiecutter.launcher_activity_layout_name}});
        getAppComponent().inject(this);
        if(savedInstanceState == null){
            swapFragment(HomeFragment.newInstance(), true, false);
        }
    }

    @Override
    protected int getContainerId() {
        return R.id.container;
    }
}
