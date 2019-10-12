package HomeWork7;

import java.lang.annotation.*;

@Retention(value= RetentionPolicy.RUNTIME)

public @interface SaveTo {
    String path();
    String method();
}
