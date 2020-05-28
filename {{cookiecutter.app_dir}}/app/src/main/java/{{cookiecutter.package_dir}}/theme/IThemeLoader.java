package {{cookiecutter.package_dir.replace('/','.')}}.theme;

public interface IThemeLoader {
    interface THEME {
        String BLACK = "Black";
    }

    int getApplicationThemeId();
}
