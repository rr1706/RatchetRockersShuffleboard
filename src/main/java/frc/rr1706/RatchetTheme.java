package frc.rr1706;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;

@Description(group = "frc.rr1706", name = "RatchetTheme", version = "0.0.1", summary = "Ratchet Rockers Shuffleboard theme as a plugin")
public class RatchetTheme extends Plugin {
    private static final Theme myTheme = new Theme(RatchetTheme.class, "Ratchet", RatchetTheme.class.getResource("/Ratchet.css").toString());
}