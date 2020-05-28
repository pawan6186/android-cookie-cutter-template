package {{cookiecutter.package_dir.replace('/','.')}}.theme;

import android.support.annotation.StyleRes;

import {{cookiecutter.package_name}}.R;

public class BlackThemeLoader implements IThemeLoader {
        @Override
        @StyleRes
        public int getApplicationThemeId() {
            return R.style.AppTheme_Black;
        }

}
