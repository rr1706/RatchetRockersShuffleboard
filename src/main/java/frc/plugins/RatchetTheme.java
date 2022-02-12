package frc.plugins;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;

import java.util.List;

@Description(
    group = "frc.plugins",
    name = "RatchetThemePlugin",
    version = "2022.1.1",
    summary = "Ratchet Robotics Rockers Theme"
)
public final class RatchetTheme extends Plugin {

  private final Theme RatchetThemee = new Theme(getClass(), "Ratchet Rockers Theme", "RatchetTheme.css");

  @Override
  public List<Theme> getThemes() {
    return List.of(RatchetThemee);
  }
}
