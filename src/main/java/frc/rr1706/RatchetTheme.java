package frc.rr1706;

import edu.wpi.first.shuffleboard.api.plugin.*;
import edu.wpi.first.shuffleboard.api.theme.Theme;

import java.util.*;

//@Requires (group = "edu.wpi.first.shuffleboard", name = "Base", minVersion = "1.3.0")
@Description(group = "frc.rr1706", name = "RatchetTheme", version = "0.0.1", summary = "Ratchet Rockers Shuffleboard theme as a plugin")
public final class RatchetTheme extends Plugin {
    private final Theme myTheme = new Theme(getClass(), "Ratchet", "Ratchet.css");

    @Override 
    public List<Theme> getThemes(){
        return List.of(myTheme);
    }
}